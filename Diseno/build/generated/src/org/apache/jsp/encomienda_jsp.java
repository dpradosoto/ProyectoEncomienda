package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class encomienda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Encomienda</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
      out.write("        <style type=text/css media=screen>\n");
      out.write("\n");
      out.write("            #headercontainer{\n");
      out.write("                width: 100%;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("            <div id=\"headercontainer\" class=\"container\" >\n");
      out.write("                <div  class=\"row\">\n");
      out.write("              \n");
      out.write("\n");
      out.write("                    <nav   class=\"navbar navbar-inverse navbar-cutom-menu\">\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                         \n");
      out.write("                           \n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("                               \n");
      out.write("                                <a  href=\"index.jsp\" class=\"navbar-brand brand \" style=\"padding-top: 0px\" >\n");
      out.write("                                    <img src=\"images/pepa.webp\" alt=\"Logo UNAB\" style=\"height:50px ; width:50px ; margin-left: 5px ;  ; padding-bottom: 0px \" >\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                          \n");
      out.write("                            <div  class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\" style=\"padding-bottom: 10px\">\n");
      out.write("                                      \n");
      out.write("\n");
      out.write("                                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                    <li><a href=\"encomienda.jsp\">Encomienda</a></li>\n");
      out.write("                                    <li><a href=\"#\">Traking</a></li>\n");
      out.write("                                    <li class=\"dropdown\">\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Servicios <span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li><a href=\"#\">Servicio A</a></li>\n");
      out.write("                                            <li><a href=\"#\">Servicio B</a></li>\n");
      out.write("                                            <li><a href=\"#\">Servicio C</a></li>\n");
      out.write("                                            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                            <li><a href=\"#\">Todos los servicios</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    <li><a href=\"#\">Contacto</a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\" container\">          \n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("\n");
      out.write("                <iframe  width=\"600\" height=\"550\"  class=\"embed-responsive-item col-sm-5 col-xs-12 \" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1664.771855116723!2d-70.61586352953265!3d-33.4351384863393!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x54cf17d9cfb58729!2sUNAB+-+Campus+Antonio+Varas!5e0!3m2!1ses!2ses!4v1499227659550\" style=\"border:0; margin-bottom: 13px; margin-top: 10px;\" allowfullscreen></iframe>\n");
      out.write("\n");
      out.write("            </div>       \n");
      out.write("\n");
      out.write("            <div class=\"col-xs-12 col-lg-7 aside\">\n");
      out.write("                <div class=\"well row\">\n");
      out.write("                    <center>\n");
      out.write("                        <h3>Caracterisicas de la Encomienda</h3>     \n");
      out.write("                        <div class=\"col-sm-4 col-lg-6\">                \n");
      out.write("                            <form name=\"form\" method=\"post\" action=\"Control_empl\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"Tipo\">Tipo Encomienda</label>\n");
      out.write("                                    <div>\n");
      out.write("                                        <select class=\"form-control\" name=\"departamento\">\n");
      out.write("                                            <option value=\"\">Seleccione Tipo</option>\n");
      out.write("                                            <option value=\"Sobre\">Sobre</option>\n");
      out.write("                                            <option value=\"Caja\">Caja</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"well row\">\n");
      out.write("                                    <h5>Tamaño (Cm.)</h5> \n");
      out.write("                                    <div class=\"form-group \">\n");
      out.write("                                        <label for=\"rut\">Base:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"base\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"nombre\">Altura:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"altura\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"direccion\">Peso:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"peso\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"Sbase\">Direccion Retiro:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"Dretiro\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </center>   \n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-8 col-lg-6\">            \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"Sbase\">Direccion Envío:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"Dretiro\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"Sbase\">Nombre Receptor:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"Dretiro\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <label for=\"carga\">Metodo de Pago</label>\n");
      out.write("                            <div>\n");
      out.write("                                <select class=\"form-control\" name=\"cargo\">\n");
      out.write("                                    <option value=\"\">Eliga un Metodo</option>\n");
      out.write("                                    <option value=\"basica\">Khipu</option>\n");
      out.write("                                    <option value=\"media\">Web Pay</option>\n");
      out.write("                                    <option value=\"superior\">Paypal</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block \" name=\"enviar\" value=\"enviar\"> \n");
      out.write("                                    <span class=\"glyphicon glyphicon-send\" aria-hidden=\"true\"></span>  Enviar Solicitud</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
