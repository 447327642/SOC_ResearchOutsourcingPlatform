
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Fernando/Desktop/18655-Fall2016-Team4/conf/routes
// @DATE:Fri Dec 09 15:18:03 PST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:19
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def searchTitlesByKeyword(keyword:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "json/" + implicitly[PathBindable[String]].unbind("keyword", dynamicString(keyword)))
    }
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def saveContract(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "contract")
    }
  
    // @LINE:7
    def download(filename:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "download/" + implicitly[PathBindable[String]].unbind("filename", dynamicString(filename)))
    }
  
    // @LINE:38
    def getProjectByStatus(status:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[String]].unbind("status", dynamicString(status)))
    }
  
    // @LINE:17
    def getBugs(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bug")
    }
  
    // @LINE:37
    def reportBug(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "bug/report")
    }
  
    // @LINE:33
    def publishProject(username:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/publishProject")
    }
  
    // @LINE:11
    def getProjectByPublisher(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "projects/publisher/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
    // @LINE:15
    def getRatingsByProject(projectname:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ratings/project/" + implicitly[PathBindable[String]].unbind("projectname", dynamicString(projectname)))
    }
  
    // @LINE:43
    def searchByUniversity(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "search/university")
    }
  
    // @LINE:30
    def updateProviderInfo(username:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/providerinfo")
    }
  
    // @LINE:25
    def loginSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/login")
    }
  
    // @LINE:26
    def registerUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/register")
    }
  
    // @LINE:36
    def updateServiceUser(username:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/serviceuserinfo")
    }
  
    // @LINE:18
    def getContractByProject(project:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contract/" + implicitly[PathBindable[String]].unbind("project", dynamicString(project)))
    }
  
    // @LINE:14
    def getAllProviders(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/getAllProviders")
    }
  
    // @LINE:44
    def searchByKeywords(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "search/keywords")
    }
  
    // @LINE:40
    def updateProjectProvider(username:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "projects/provide/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
    // @LINE:13
    def getProjects(): Call = {
    
      () match {
      
        // @LINE:13
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "users/showProjects")
      
      }
    
    }
  
    // @LINE:39
    def updateProjectStatus(status:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "projects/projectname/" + implicitly[PathBindable[String]].unbind("status", dynamicString(status)))
    }
  
    // @LINE:10
    def getServiceUserByName(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/serviceuserinfo")
    }
  
    // @LINE:12
    def getProjectByProvider(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "projects/provider/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
    // @LINE:35
    def getReceivedFiles(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "allReceivedFiles")
    }
  
    // @LINE:8
    def getServiceUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "serviceusers")
    }
  
    // @LINE:9
    def getProviderInfo(username:String): Call = {
    
      (username: @unchecked) match {
      
        // @LINE:9
        case (username)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/providerinfo")
      
      }
    
    }
  
    // @LINE:45
    def upload(sender:String, receiver:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "files/" + implicitly[PathBindable[String]].unbind("sender", dynamicString(sender)) + "/" + implicitly[PathBindable[String]].unbind("receiver", dynamicString(receiver)))
    }
  
    // @LINE:42
    def updateRating(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ratings/update")
    }
  
    // @LINE:16
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:32
    def getUserInfo(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/userinfo")
    }
  
    // @LINE:41
    def deleteProject(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "projects/delete")
    }
  
  }


}