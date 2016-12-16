
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Fernando/Desktop/18655-Fall2016-Team4/conf/routes
// @DATE:Fri Dec 09 15:18:03 PST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_1: controllers.Application,
  // @LINE:19
  SearchController_2: controllers.SearchController,
  // @LINE:22
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_1: controllers.Application,
    // @LINE:19
    SearchController_2: controllers.SearchController,
    // @LINE:22
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, SearchController_2, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, SearchController_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """download/$filename<[^/]+>""", """controllers.Application.download(filename:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """serviceusers""", """controllers.Application.getServiceUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/$username<[^/]+>/providerinfo""", """controllers.Application.getProviderInfo(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/$username<[^/]+>/serviceuserinfo""", """controllers.Application.getServiceUserByName(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/publisher/$username<[^/]+>""", """controllers.Application.getProjectByPublisher(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/provider/$username<[^/]+>""", """controllers.Application.getProjectByProvider(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/showProjects""", """controllers.Application.getProjects()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getAllProviders""", """controllers.Application.getAllProviders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ratings/project/$projectname<[^/]+>""", """controllers.Application.getRatingsByProject(projectname:String)"""),
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bug""", """controllers.Application.getBugs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contract/$project<[^/]+>""", """controllers.Application.getContractByProject(project:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/$keyword<[^/]+>""", """controllers.SearchController.searchTitlesByKeyword(keyword:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/login""", """controllers.Application.loginSubmit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/register""", """controllers.Application.registerUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/$username<[^/]+>/providerinfo""", """controllers.Application.getProviderInfo(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/$username<[^/]+>/providerinfo""", """controllers.Application.updateProviderInfo(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/$username<[^/]+>/userinfo""", """controllers.Application.getUserInfo(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/$username<[^/]+>/publishProject""", """controllers.Application.publishProject(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/showProjects""", """controllers.Application.getProjects()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allReceivedFiles""", """controllers.Application.getReceivedFiles()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/$username<[^/]+>/serviceuserinfo""", """controllers.Application.updateServiceUser(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bug/report""", """controllers.Application.reportBug()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/$status<[^/]+>""", """controllers.Application.getProjectByStatus(status:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/projectname/$status<[^/]+>""", """controllers.Application.updateProjectStatus(status:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/provide/$username<[^/]+>""", """controllers.Application.updateProjectProvider(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/delete""", """controllers.Application.deleteProject()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ratings/update""", """controllers.Application.updateRating()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/university""", """controllers.Application.searchByUniversity()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/keywords""", """controllers.Application.searchByKeywords()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """files/$sender<[^/]+>/$receiver<[^/]+>""", """controllers.Application.upload(sender:String, receiver:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contract""", """controllers.Application.saveContract()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_download0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("download/"), DynamicPart("filename", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_download0_invoker = createInvoker(
    Application_1.download(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "download",
      Seq(classOf[String]),
      "GET",
      """ Home page""",
      this.prefix + """download/$filename<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_getServiceUsers1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("serviceusers")))
  )
  private[this] lazy val controllers_Application_getServiceUsers1_invoker = createInvoker(
    Application_1.getServiceUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getServiceUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """serviceusers"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_getProviderInfo2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("username", """[^/]+""",true), StaticPart("/providerinfo")))
  )
  private[this] lazy val controllers_Application_getProviderInfo2_invoker = createInvoker(
    Application_1.getProviderInfo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProviderInfo",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """users/$username<[^/]+>/providerinfo"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_getServiceUserByName3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("username", """[^/]+""",true), StaticPart("/serviceuserinfo")))
  )
  private[this] lazy val controllers_Application_getServiceUserByName3_invoker = createInvoker(
    Application_1.getServiceUserByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getServiceUserByName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """users/$username<[^/]+>/serviceuserinfo"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_getProjectByPublisher4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/publisher/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getProjectByPublisher4_invoker = createInvoker(
    Application_1.getProjectByPublisher(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProjectByPublisher",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """projects/publisher/$username<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_getProjectByProvider5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/provider/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getProjectByProvider5_invoker = createInvoker(
    Application_1.getProjectByProvider(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProjectByProvider",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """projects/provider/$username<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_getProjects6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/showProjects")))
  )
  private[this] lazy val controllers_Application_getProjects6_invoker = createInvoker(
    Application_1.getProjects(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProjects",
      Nil,
      "GET",
      """""",
      this.prefix + """users/showProjects"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_getAllProviders7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getAllProviders")))
  )
  private[this] lazy val controllers_Application_getAllProviders7_invoker = createInvoker(
    Application_1.getAllProviders(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getAllProviders",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getAllProviders"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_getRatingsByProject8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ratings/project/"), DynamicPart("projectname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getRatingsByProject8_invoker = createInvoker(
    Application_1.getRatingsByProject(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getRatingsByProject",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ratings/project/$projectname<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index9_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_getBugs10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bug")))
  )
  private[this] lazy val controllers_Application_getBugs10_invoker = createInvoker(
    Application_1.getBugs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getBugs",
      Nil,
      "GET",
      """""",
      this.prefix + """bug"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_getContractByProject11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contract/"), DynamicPart("project", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getContractByProject11_invoker = createInvoker(
    Application_1.getContractByProject(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getContractByProject",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """contract/$project<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_SearchController_searchTitlesByKeyword12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/"), DynamicPart("keyword", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SearchController_searchTitlesByKeyword12_invoker = createInvoker(
    SearchController_2.searchTitlesByKeyword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "searchTitlesByKeyword",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """json/$keyword<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map the JS resource paths""",
      this.prefix + """$file<.+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_loginSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/login")))
  )
  private[this] lazy val controllers_Application_loginSubmit14_invoker = createInvoker(
    Application_1.loginSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """users/login"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_registerUser15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_Application_registerUser15_invoker = createInvoker(
    Application_1.registerUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registerUser",
      Nil,
      "POST",
      """""",
      this.prefix + """users/register"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_getProviderInfo16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("username", """[^/]+""",true), StaticPart("/providerinfo")))
  )
  private[this] lazy val controllers_Application_getProviderInfo16_invoker = createInvoker(
    Application_1.getProviderInfo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProviderInfo",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """users/$username<[^/]+>/providerinfo"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_updateProviderInfo17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("username", """[^/]+""",true), StaticPart("/providerinfo")))
  )
  private[this] lazy val controllers_Application_updateProviderInfo17_invoker = createInvoker(
    Application_1.updateProviderInfo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateProviderInfo",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """users/$username<[^/]+>/providerinfo"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_getUserInfo18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("username", """[^/]+""",true), StaticPart("/userinfo")))
  )
  private[this] lazy val controllers_Application_getUserInfo18_invoker = createInvoker(
    Application_1.getUserInfo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserInfo",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """users/$username<[^/]+>/userinfo"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_publishProject19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("username", """[^/]+""",true), StaticPart("/publishProject")))
  )
  private[this] lazy val controllers_Application_publishProject19_invoker = createInvoker(
    Application_1.publishProject(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "publishProject",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """users/$username<[^/]+>/publishProject"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_getProjects20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/showProjects")))
  )
  private[this] lazy val controllers_Application_getProjects20_invoker = createInvoker(
    Application_1.getProjects(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProjects",
      Nil,
      "GET",
      """""",
      this.prefix + """users/showProjects"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_getReceivedFiles21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allReceivedFiles")))
  )
  private[this] lazy val controllers_Application_getReceivedFiles21_invoker = createInvoker(
    Application_1.getReceivedFiles(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getReceivedFiles",
      Nil,
      "POST",
      """""",
      this.prefix + """allReceivedFiles"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_updateServiceUser22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("username", """[^/]+""",true), StaticPart("/serviceuserinfo")))
  )
  private[this] lazy val controllers_Application_updateServiceUser22_invoker = createInvoker(
    Application_1.updateServiceUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateServiceUser",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """users/$username<[^/]+>/serviceuserinfo"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_reportBug23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bug/report")))
  )
  private[this] lazy val controllers_Application_reportBug23_invoker = createInvoker(
    Application_1.reportBug(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "reportBug",
      Nil,
      "POST",
      """""",
      this.prefix + """bug/report"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_getProjectByStatus24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("status", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getProjectByStatus24_invoker = createInvoker(
    Application_1.getProjectByStatus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProjectByStatus",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """projects/$status<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_updateProjectStatus25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/projectname/"), DynamicPart("status", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateProjectStatus25_invoker = createInvoker(
    Application_1.updateProjectStatus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateProjectStatus",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """projects/projectname/$status<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Application_updateProjectProvider26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/provide/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateProjectProvider26_invoker = createInvoker(
    Application_1.updateProjectProvider(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateProjectProvider",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """projects/provide/$username<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Application_deleteProject27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/delete")))
  )
  private[this] lazy val controllers_Application_deleteProject27_invoker = createInvoker(
    Application_1.deleteProject(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteProject",
      Nil,
      "POST",
      """""",
      this.prefix + """projects/delete"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Application_updateRating28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ratings/update")))
  )
  private[this] lazy val controllers_Application_updateRating28_invoker = createInvoker(
    Application_1.updateRating(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateRating",
      Nil,
      "POST",
      """""",
      this.prefix + """ratings/update"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Application_searchByUniversity29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/university")))
  )
  private[this] lazy val controllers_Application_searchByUniversity29_invoker = createInvoker(
    Application_1.searchByUniversity(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchByUniversity",
      Nil,
      "POST",
      """""",
      this.prefix + """search/university"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Application_searchByKeywords30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/keywords")))
  )
  private[this] lazy val controllers_Application_searchByKeywords30_invoker = createInvoker(
    Application_1.searchByKeywords(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchByKeywords",
      Nil,
      "POST",
      """""",
      this.prefix + """search/keywords"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Application_upload31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("files/"), DynamicPart("sender", """[^/]+""",true), StaticPart("/"), DynamicPart("receiver", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_upload31_invoker = createInvoker(
    Application_1.upload(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "upload",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """files/$sender<[^/]+>/$receiver<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Application_saveContract32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contract")))
  )
  private[this] lazy val controllers_Application_saveContract32_invoker = createInvoker(
    Application_1.saveContract(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveContract",
      Nil,
      "POST",
      """""",
      this.prefix + """contract"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_download0_route(params) =>
      call(params.fromPath[String]("filename", None)) { (filename) =>
        controllers_Application_download0_invoker.call(Application_1.download(filename))
      }
  
    // @LINE:8
    case controllers_Application_getServiceUsers1_route(params) =>
      call { 
        controllers_Application_getServiceUsers1_invoker.call(Application_1.getServiceUsers())
      }
  
    // @LINE:9
    case controllers_Application_getProviderInfo2_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_getProviderInfo2_invoker.call(Application_1.getProviderInfo(username))
      }
  
    // @LINE:10
    case controllers_Application_getServiceUserByName3_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_getServiceUserByName3_invoker.call(Application_1.getServiceUserByName(username))
      }
  
    // @LINE:11
    case controllers_Application_getProjectByPublisher4_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_getProjectByPublisher4_invoker.call(Application_1.getProjectByPublisher(username))
      }
  
    // @LINE:12
    case controllers_Application_getProjectByProvider5_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_getProjectByProvider5_invoker.call(Application_1.getProjectByProvider(username))
      }
  
    // @LINE:13
    case controllers_Application_getProjects6_route(params) =>
      call { 
        controllers_Application_getProjects6_invoker.call(Application_1.getProjects())
      }
  
    // @LINE:14
    case controllers_Application_getAllProviders7_route(params) =>
      call { 
        controllers_Application_getAllProviders7_invoker.call(Application_1.getAllProviders())
      }
  
    // @LINE:15
    case controllers_Application_getRatingsByProject8_route(params) =>
      call(params.fromPath[String]("projectname", None)) { (projectname) =>
        controllers_Application_getRatingsByProject8_invoker.call(Application_1.getRatingsByProject(projectname))
      }
  
    // @LINE:16
    case controllers_Application_index9_route(params) =>
      call { 
        controllers_Application_index9_invoker.call(Application_1.index())
      }
  
    // @LINE:17
    case controllers_Application_getBugs10_route(params) =>
      call { 
        controllers_Application_getBugs10_invoker.call(Application_1.getBugs())
      }
  
    // @LINE:18
    case controllers_Application_getContractByProject11_route(params) =>
      call(params.fromPath[String]("project", None)) { (project) =>
        controllers_Application_getContractByProject11_invoker.call(Application_1.getContractByProject(project))
      }
  
    // @LINE:19
    case controllers_SearchController_searchTitlesByKeyword12_route(params) =>
      call(params.fromPath[String]("keyword", None)) { (keyword) =>
        controllers_SearchController_searchTitlesByKeyword12_invoker.call(SearchController_2.searchTitlesByKeyword(keyword))
      }
  
    // @LINE:22
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:25
    case controllers_Application_loginSubmit14_route(params) =>
      call { 
        controllers_Application_loginSubmit14_invoker.call(Application_1.loginSubmit())
      }
  
    // @LINE:26
    case controllers_Application_registerUser15_route(params) =>
      call { 
        controllers_Application_registerUser15_invoker.call(Application_1.registerUser())
      }
  
    // @LINE:28
    case controllers_Application_getProviderInfo16_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_getProviderInfo16_invoker.call(Application_1.getProviderInfo(username))
      }
  
    // @LINE:30
    case controllers_Application_updateProviderInfo17_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_updateProviderInfo17_invoker.call(Application_1.updateProviderInfo(username))
      }
  
    // @LINE:32
    case controllers_Application_getUserInfo18_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_getUserInfo18_invoker.call(Application_1.getUserInfo(username))
      }
  
    // @LINE:33
    case controllers_Application_publishProject19_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_publishProject19_invoker.call(Application_1.publishProject(username))
      }
  
    // @LINE:34
    case controllers_Application_getProjects20_route(params) =>
      call { 
        controllers_Application_getProjects20_invoker.call(Application_1.getProjects())
      }
  
    // @LINE:35
    case controllers_Application_getReceivedFiles21_route(params) =>
      call { 
        controllers_Application_getReceivedFiles21_invoker.call(Application_1.getReceivedFiles())
      }
  
    // @LINE:36
    case controllers_Application_updateServiceUser22_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_updateServiceUser22_invoker.call(Application_1.updateServiceUser(username))
      }
  
    // @LINE:37
    case controllers_Application_reportBug23_route(params) =>
      call { 
        controllers_Application_reportBug23_invoker.call(Application_1.reportBug())
      }
  
    // @LINE:38
    case controllers_Application_getProjectByStatus24_route(params) =>
      call(params.fromPath[String]("status", None)) { (status) =>
        controllers_Application_getProjectByStatus24_invoker.call(Application_1.getProjectByStatus(status))
      }
  
    // @LINE:39
    case controllers_Application_updateProjectStatus25_route(params) =>
      call(params.fromPath[String]("status", None)) { (status) =>
        controllers_Application_updateProjectStatus25_invoker.call(Application_1.updateProjectStatus(status))
      }
  
    // @LINE:40
    case controllers_Application_updateProjectProvider26_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_updateProjectProvider26_invoker.call(Application_1.updateProjectProvider(username))
      }
  
    // @LINE:41
    case controllers_Application_deleteProject27_route(params) =>
      call { 
        controllers_Application_deleteProject27_invoker.call(Application_1.deleteProject())
      }
  
    // @LINE:42
    case controllers_Application_updateRating28_route(params) =>
      call { 
        controllers_Application_updateRating28_invoker.call(Application_1.updateRating())
      }
  
    // @LINE:43
    case controllers_Application_searchByUniversity29_route(params) =>
      call { 
        controllers_Application_searchByUniversity29_invoker.call(Application_1.searchByUniversity())
      }
  
    // @LINE:44
    case controllers_Application_searchByKeywords30_route(params) =>
      call { 
        controllers_Application_searchByKeywords30_invoker.call(Application_1.searchByKeywords())
      }
  
    // @LINE:45
    case controllers_Application_upload31_route(params) =>
      call(params.fromPath[String]("sender", None), params.fromPath[String]("receiver", None)) { (sender, receiver) =>
        controllers_Application_upload31_invoker.call(Application_1.upload(sender, receiver))
      }
  
    // @LINE:46
    case controllers_Application_saveContract32_route(params) =>
      call { 
        controllers_Application_saveContract32_invoker.call(Application_1.saveContract())
      }
  }
}