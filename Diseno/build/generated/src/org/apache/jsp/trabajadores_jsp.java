package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trabajadores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Solemne 2</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("           <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css\" />\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("     <script src=\"http://code.jquery.com/jquery-1.9.1.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.10.1/jquery-ui.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.dropdown a.test').on(\"click\", function (e) {\n");
      out.write("                    $(this).next('ul').toggle();\n");
      out.write("                    e.stopPropagation();\n");
      out.write("                    e.preventDefault();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#fecha\").datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style type=text/css media=screen>\n");
      out.write("\n");
      out.write("            #headercontainer{\n");
      out.write("                background-color: #2c4959;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                background-image: url(http://localhost:8080/Solemne2v2.0/images/logo_2.png) ;\n");
      out.write("\n");
      out.write("                background-position: center center;\n");
      out.write("\n");
      out.write("\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("\n");
      out.write("\n");
      out.write("                background-attachment: fixed;\n");
      out.write("\n");
      out.write("\n");
      out.write("                background-size: 45%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <nav id=\"headercontainer\" class=\"navbar navbar-inverse\" >\n");
      out.write("                        <div id=\"headercontainer\" class=\"container-fluid\" style=\"    margin-bottom: 10px;\" >\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <a class=\"navbar-brand\" style=\" padding-top: 5px;\" href=\"menu.jsp\">\n");
      out.write("                                    <img src=\"http://localhost:8080/Solemne2v2.0/images/logo_4.png\" alt=\"Logo UNAB\" style=\"height:50px ; width:50px ; margin-left: 25px ;  ; padding-bottom: 0px \" >\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li><a href=\"empleado.jsp\" > <font size=\"3\"> Empleado </font></a></li>\n");
      out.write("                                <li><a href=\"cargo.jsp\"> <font size=\"3\"> Cargo </font></a></li>\n");
      out.write("\n");
      out.write("                                <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"> <font size=\"3\">Informe </font><span class=\"caret\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a tabindex=\"-1\" href=\"Control_cargo?action=infoE\">Bono general</a></li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"test\" tabindex=\"-1\" href=\"#\">Informe por Departamento<span class=\"caret\"></span></a>\n");
      out.write("                                            <ul class=\"dropdown-menu\">\n");
      out.write("                                                <li><a tabindex=\"-1\" href=\"Control_cargo?action=infoD2&dpto=administracion\">Informe por administración</a></li>\n");
      out.write("                                                <li><a tabindex=\"-1\" href=\"Control_cargo?action=infoD2&dpto=logistica\">Informe por Logistica</a></li>\n");
      out.write("                                                <li><a tabindex=\"-1\" href=\"Control_cargo?action=infoD2&dpto=gestion\">Informe por Gestion</a></li>\n");
      out.write("                                                <li><a tabindex=\"-1\" href=\"Control_cargo?action=infoD\">Informe Total</a></li>\n");
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>       \n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"col-xs-12 col-lg-7 aside\">\n");
      out.write("            <div class=\"well row\">\n");
      out.write("                <center>\n");
      out.write("                    <h3>Agregar Trabajador</h3>     \n");
      out.write("                    <div class=\"col-sm-4 col-lg-6\">                \n");
      out.write("                        <form name=\"form\" method=\"post\" action=\"Control_empl\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"rut\">Rut:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"rut\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"nombre\">Nombre:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"nombre\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"apellido\">Apellido:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"apellido\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"direccion\">Direccion:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"direccion\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"fono\">Fono:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"fono\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"email\">E-Mail</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"fecha\">Fecha de nacimiento:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"fecha\" name=\"fecha\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                                <label for=\"licencia\">Licencia de Conducir</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"licencia\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </center>   \n");
      out.write("\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-block \" name=\"enviar\" value=\"enviar\"> \n");
      out.write("                    <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span>  Agregar</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
