
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>My AngularJS App</title>
  <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.53*/routes/*6.59*/.Assets.versioned("img/favicon.png")),format.raw/*6.95*/("""">
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
  <script
          src="https://code.jquery.com/jquery-3.1.1.min.js"
          integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
          crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

  <link rel="stylesheet" href=""""),_display_(/*16.33*/routes/*16.39*/.Assets.versioned("css/app.css")),format.raw/*16.71*/("""">
  <script data-main=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("js/main.js")),format.raw/*17.60*/("""" src=""""),_display_(/*17.68*/routes/*17.74*/.Assets.versioned("lib/requirejs/require.js")),format.raw/*17.119*/(""""></script>
</head>
<body class = "body-sec">
    <div class="page-header">
      <h1 class = "title" >Research Outsourcing Platform</h1>
      <p class = "subTitle">Empower research experience</p>
        <!--<ul class="nav nav-tabs">-->
          <!--<li role="presentation" class="active"><a href="#/register">Register</a></li>-->
          <!--<li role="presentation"><a href="#/login">Login</a></li>-->
        <!--</ul>-->
    </div>


  <div ng-view></div>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Nov 17 16:30:47 PST 2016
                  SOURCE: /Users/Fernando/Desktop/18655-Fall2016-Team4/app/views/index.scala.html
                  HASH: a6eee07a21aa2e4031e52d8d42ae0384ae99ec1e
                  MATRIX: 827->0|1004->151|1018->157|1074->193|1999->1091|2014->1097|2067->1129|2119->1154|2134->1160|2186->1191|2221->1199|2236->1205|2303->1250
                  LINES: 32->1|37->6|37->6|37->6|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17
                  -- GENERATED --
              */
          