package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;
import play.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.*;
import play.data.format.*;
import models.*;
import java.util.*;
import java.io.*;

import static play.libs.Json.toJson;

public class Application extends Controller {
    private dbHandle db = new dbHandle();

   

    public Result index() {
        db.saveUser("admin", "admin", "admin", "admin", "admin","false");
        return ok(index.render());
    }

    public Result upload(String sender,String receiver) {
      Http.MultipartFormData body = request().body().asMultipartFormData();
      Http.MultipartFormData.FilePart picture = body.getFile("file");
      System.out.println("file upload");
      if (picture != null) {
        String fileName = picture.getFilename();
        System.out.println("file name"+fileName);
        //String contentType = picture.getContentType(); 
        
        java.io.File file = picture.getFile();

        file.renameTo(new java.io.File("files/", fileName));
        db.saveFileToServer(sender,receiver,fileName);
        return redirect("http://localhost:9000/#/allProviders");
      } else {
        System.out.println("file no name");
        flash("error", "Missing file");
        return redirect(routes.Application.index());    
      }
    }

    public Result download(String filename) {

        return ok(new java.io.File("files/"+filename));
    }

    public Result getReceivedFiles(){
        System.out.println("hereallfilw1");
        DynamicForm form = Form.form().bindFromRequest();

        String username = form.get("username");
        System.out.println("hereallfilw"+username);
        List<models.File> result=db.getFiles(username);
        return ok(toJson(result));
    }

    public Result getName() {
        return ok(index.render());
    }

    public Result loginSubmit() {

        DynamicForm form = Form.form().bindFromRequest();

        if (form.data().size() != 2) {
            return badRequest("Bad Login Request");
        } else {
            String userName = form.get("userName");
            String password = form.get("password");
            String dbPassword = db.getPassword(userName);
            if (password.equals(dbPassword)) {
                return ok("login Success");
            } else {
                return notFound("Invalid Login");
            }
        }
    }

    public Result registerUser() {
        DynamicForm form = Form.form().bindFromRequest();
        if (form.data().size() != 6) {
            System.out.println(form.data());
            return badRequest("Bad Register Request");
        } else {
            String userName = form.get("username");
            String password = form.get("password");
            String email = form.get("email");
            String question = form.get("question");
            String answer = form.get("answer");
            String anonymous = form.get("anonymous");
            try {
                boolean register = db.saveUser(userName, password, email, question, answer,anonymous);
                if (register) {
                    return ok("Register Success");
                } else {
                    return ok("User Exists");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return badRequest("Bad Register Request");
            }

        }
    }

    public Result getUserInfo(String username) {
        User user = db.getUser(username);
        return user == null ? notFound() : ok(toJson(user));
    }

    public Result getBugs() {
        List<Bug> bugs = db.getBugs();
        return (bugs == null) ? notFound() : ok(toJson(bugs));
    }

    public Result reportBug() {
        DynamicForm form = Form.form().bindFromRequest();
        if (form.data().size() != 3) {
            System.out.println(form.data());
            return badRequest("Bad report Request");
        } else {
            String bugname = form.get("bugname");
            String description = form.get("description");
            String status = form.get("status");
            try {
                boolean report = db.saveBug(bugname, description, status);
                if (report) {
                    return ok("Report Success");
                } else {
                    return ok("Bug Exists");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return badRequest("Bad Report Request");
            }

        }
    }

    public Result getProviderInfo(String username) {
        ServiceProvider provider = db.getProviderInfo(username);

        return (provider == null) ? notFound() : ok(toJson(provider));

    }

    public Result updateProviderInfo(String username) {
        DynamicForm form = Form.form().bindFromRequest();

            String credential = form.get("credential");
            String researchAreas = form.get("researchAreas");
            String publications = form.get("publications");
            String professionalServices = form.get("professionalServices");
            String university = form.get("university");
            String keyword = form.get("keyword");

            try {
                boolean register = db.updateProviderInfo(username, credential, researchAreas, publications, professionalServices, keyword, university);

                if (register) {
                    return ok("Update Success");
                } else {
                    return ok("Update Failure");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return badRequest("Bad update Request");
            }

    }

    public Result getServiceUsers() {
        List<Map<String,String>> serviceUsers = db.getServiceUsers();
        return (serviceUsers == null) ? notFound() : ok(toJson(serviceUsers));
    }

    public Result updateServiceUser(String username) {
        DynamicForm form = Form.form().bindFromRequest();
        String keywords = form.get("keywords");
        try {
            boolean update = db.updateServiceUser(username, keywords);
            if (update) {
                return ok("Update Success");
            } else {
                return ok("Update Failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return badRequest("Bad update Request");
        }
    }

    public Result publishProject(String username) {
        DynamicForm form = Form.form().bindFromRequest();
        if (form.data().size() != 7) {
            System.out.println(form.data());
            return badRequest("Bad publish length!");
        } else {
            String projectName = form.get("projectName");
            String projectDescription = form.get("projectDescription");
            String requiredExpertise = form.get("requiredExpertise");
            String begintime = form.get("begintime");
            String endtime = form.get("endtime");
            String price = form.get("price");
            String status = form.get("status");
            try {
                boolean register = db.updateProjects(projectName, username,projectDescription, requiredExpertise, begintime, endtime, price, status);
                if (register) {
                    return ok("Create Success");
                } else {
                    return ok("Create Failure");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return badRequest("Bad update Request");
            }
        }
    }

    public Result getProjects() {
        List<Map<String,String>> projects = db.getProject();
        return (projects == null) ? notFound() : ok(toJson(projects));
    }

    public Result deleteProject() {
        DynamicForm form = Form.form().bindFromRequest();
        String project = form.get("project");
        try {
            boolean delete = db.deleteProjectByName(project);
            if (delete) {
                return ok("Delete Success");
            } else {
                return ok("Delete Failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return badRequest("Bad delete Request");
        }
    }

    public Result getProjectByPublisher(String username) {

        List<Projects> project = db.getProjectByPublisher(username);
        return (project == null) ? notFound() : ok(toJson(project));
    }

    public Result getProjectByProvider(String username) {

        List<Projects> project = db.getProjectByProvider(username);
        return (project == null) ? notFound() : ok(toJson(project));
    }

    public Result getServiceUserByName(String username) {
        ServiceUser serviceUser = db.getServiceUserByName(username);
        return (serviceUser == null) ? notFound() : ok(toJson(serviceUser));
    }

    public Result getProjectByStatus(String status) {
        List<Projects> projects = db.getProjectByStatus(status);
        return (projects == null) ? notFound() : ok(toJson(projects));
    }

    public Result updateProjectProvider(String username) {
        DynamicForm form = Form.form().bindFromRequest();
        String project = form.get("project");
        try {
            boolean update = db.updateProjectProvider(username, project);
            if (update) {
                return ok("Update Success");
            } else {
                return ok("Update Failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return badRequest("Bad update Request");
        }
    }

    public Result updateProjectStatus(String status) {
        DynamicForm form = Form.form().bindFromRequest();
        String project = form.get("project");
        try {
            boolean update = db.updateProjectStatus(project, status);
            if (update) {
                return ok("Update Success");
            } else {
                return ok("Update Failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return badRequest("Bad update Request");
        }
    }

    public Result getRatingsByProject(String projectname) {
        Rates rating = db.getRatingsByProject(projectname);
        return (rating == null) ? notFound() : ok(toJson(rating));
    }

    public Result getAllProviders() {
        //List<ServiceProvider> sps = db.getProviders();
        List<List<String>> list = db.getALLProviders();
        return (list == null) ? notFound() : ok(toJson(list));
        // TODO: search
    }

    public Result updateRating() {
        DynamicForm form = Form.form().bindFromRequest();
        String project = form.get("project");
        String user = form.get("user");
        String provider = form.get("provider");
        String projectrate = form.get("projectrate");
        String providerrate = form.get("providerrate");
        String comment = form.get("comment");
        try {
            boolean update = db.updateRating(project, user, provider, Integer.parseInt(projectrate), Integer.parseInt(providerrate), comment);
            if (update) {
                return ok("Update Success");
            } else {
                return ok("Update Failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return badRequest("Bad update Request");
        }
    }

    public Result searchByKeywords() {
        DynamicForm form = Form.form().bindFromRequest();
        String keywords = form.get("keywords");

        if (keywords == null) return badRequest("Empty Search");
        String[] strs = keywords.split("\\s+");
        List<Projects> projects = db.getProjectsByKeyword(strs);
        return (projects == null) ? notFound() : ok(toJson(projects));
    }

    public Result searchByUniversity() {
        DynamicForm form = Form.form().bindFromRequest();
        String university = form.get("university");
        List<ServiceProvider> providers = db.getProvidersByUniversity(university);
        return (providers == null) ? notFound() : ok(toJson(providers));
    }

    public Result saveContract() {
        DynamicForm form = Form.form().bindFromRequest();
        if (form.data().size() != 4) {
            System.out.println(form.data());
            return badRequest("Bad report Request");
        } else {
            String project = form.get("project");
            String provider = form.get("provider");
            String user = form.get("user");
            String content = form.get("content");
            try {
                boolean contract = db.saveContract(project, provider, user, content);
                if (contract) {
                    return ok("Save Success");
                } else {
                    return ok("Contract Exists");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return badRequest("Bad Save Request");
            }
        }
    }
    public Result getContractByProject(String project) {
        Contract cc = db.getContractByProject(project);
        return (cc == null) ? notFound() : ok(toJson(cc));
    }

    public Result sendChat(String sender) {
        DynamicForm form = Form.form().bindFromRequest();
        String receiver = form.get("checkedUser");
        String message = form.get("chatMessage");

        if (receiver == null||message==null) return badRequest("null");
        db.saveChat(sender,receiver,message);
        return ok("Success");
    }

    public Result getChat(String sender, String receiver){
        List<chatMessage> chat = db.getChat(sender,receiver);
        return (chat == null) ? notFound() : ok(toJson(chat));
    }


}
