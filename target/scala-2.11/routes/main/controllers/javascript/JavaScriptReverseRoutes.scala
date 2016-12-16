
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Fernando/Desktop/18655-Fall2016-Team4/conf/routes
// @DATE:Fri Dec 09 15:18:03 PST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def searchTitlesByKeyword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.searchTitlesByKeyword",
      """
        function(keyword) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyword", encodeURIComponent(keyword))})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def saveContract: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveContract",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contract"})
        }
      """
    )
  
    // @LINE:7
    def download: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.download",
      """
        function(filename) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "download/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filename", encodeURIComponent(filename))})
        }
      """
    )
  
    // @LINE:38
    def getProjectByStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProjectByStatus",
      """
        function(status) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("status", encodeURIComponent(status))})
        }
      """
    )
  
    // @LINE:17
    def getBugs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getBugs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug"})
        }
      """
    )
  
    // @LINE:37
    def reportBug: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.reportBug",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/report"})
        }
      """
    )
  
    // @LINE:33
    def publishProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.publishProject",
      """
        function(username) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/publishProject"})
        }
      """
    )
  
    // @LINE:11
    def getProjectByPublisher: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProjectByPublisher",
      """
        function(username) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/publisher/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
        }
      """
    )
  
    // @LINE:15
    def getRatingsByProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getRatingsByProject",
      """
        function(projectname) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ratings/project/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("projectname", encodeURIComponent(projectname))})
        }
      """
    )
  
    // @LINE:43
    def searchByUniversity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchByUniversity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search/university"})
        }
      """
    )
  
    // @LINE:30
    def updateProviderInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateProviderInfo",
      """
        function(username) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/providerinfo"})
        }
      """
    )
  
    // @LINE:25
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/login"})
        }
      """
    )
  
    // @LINE:26
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/register"})
        }
      """
    )
  
    // @LINE:36
    def updateServiceUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateServiceUser",
      """
        function(username) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/serviceuserinfo"})
        }
      """
    )
  
    // @LINE:18
    def getContractByProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getContractByProject",
      """
        function(project) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contract/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("project", encodeURIComponent(project))})
        }
      """
    )
  
    // @LINE:14
    def getAllProviders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getAllProviders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getAllProviders"})
        }
      """
    )
  
    // @LINE:44
    def searchByKeywords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchByKeywords",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search/keywords"})
        }
      """
    )
  
    // @LINE:40
    def updateProjectProvider: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateProjectProvider",
      """
        function(username) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/provide/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
        }
      """
    )
  
    // @LINE:13
    def getProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProjects",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/showProjects"})
          }
        
        }
      """
    )
  
    // @LINE:39
    def updateProjectStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateProjectStatus",
      """
        function(status) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/projectname/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("status", encodeURIComponent(status))})
        }
      """
    )
  
    // @LINE:10
    def getServiceUserByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getServiceUserByName",
      """
        function(username) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/serviceuserinfo"})
        }
      """
    )
  
    // @LINE:12
    def getProjectByProvider: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProjectByProvider",
      """
        function(username) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/provider/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
        }
      """
    )
  
    // @LINE:35
    def getReceivedFiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getReceivedFiles",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "allReceivedFiles"})
        }
      """
    )
  
    // @LINE:8
    def getServiceUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getServiceUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceusers"})
        }
      """
    )
  
    // @LINE:9
    def getProviderInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProviderInfo",
      """
        function(username) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/providerinfo"})
          }
        
        }
      """
    )
  
    // @LINE:45
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.upload",
      """
        function(sender,receiver) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "files/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("sender", encodeURIComponent(sender)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("receiver", encodeURIComponent(receiver))})
        }
      """
    )
  
    // @LINE:42
    def updateRating: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateRating",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ratings/update"})
        }
      """
    )
  
    // @LINE:16
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:32
    def getUserInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserInfo",
      """
        function(username) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/userinfo"})
        }
      """
    )
  
    // @LINE:41
    def deleteProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteProject",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/delete"})
        }
      """
    )
  
  }


}