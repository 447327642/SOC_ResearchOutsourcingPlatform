
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Fernando/Desktop/18655-Fall2016-Team4/conf/routes
// @DATE:Fri Dec 09 15:18:03 PST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
