
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lfmendivelso/Documentos/Desarrollo/ExampleHerokuCircleCI/conf/routes
// @DATE:Tue Jul 04 13:51:51 COT 2017


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
