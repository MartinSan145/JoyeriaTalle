package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.Sesion;

public final class indexx_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Sesion.codigo_sucursal = "";
    Sesion.codigo_usuario = "";
    Sesion.nombre_funcionario = "";
    Sesion.nombre_sucursal = "";
    Sesion.nombre_usuario = "";
    Sesion.perfil = "";

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>SOFTWARE SYSTEMOro</title>       \n");
      out.write("     \n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"form-1/assets/css/font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"form-1/assets/css/form-elements.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"form-1/assets/css/style.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"form-1/assets/ico/favicon.png\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("  \n");
      out.write("    <body  class=\"img-responsive center-box\" style=\"width:50%;\">\n");
      out.write("   \n");
      out.write("            <div class=\"inner-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                   \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-5 col-sm-offset-2 text\">\n");
      out.write("                           \n");
      out.write("                            <h1><strong>SYSTEMOro</strong> Acceso</h1>\n");
      out.write("                            <div class=\"description\">\n");
      out.write("                            \t<p>\n");
      out.write("\t                            \tBienvenido al acceso de SYSTEMOro\n");
      out.write("                                        Sistema de Gestion de Compra, Ventas y Servicios\n");
      out.write("                                        JOYERIA SAN RAMON\n");
      out.write("                            \t</p>\n");
      out.write("                    \n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>                   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-sm-offset-3 form-box\">\n");
      out.write("                        \t<div class=\"form-top\">\n");
      out.write("\n");
      out.write("                        \t\t<div class=\"form-top-left\">\n");
      out.write("\n");
      out.write("                        \t\t\t<h3>Inicia sesion para acceder al sistema</h3>\n");
      out.write("                            \t\t<p>Ingresa su usuario y contraseña</p>\n");
      out.write("                        \t\t</div>\n");
      out.write("                        \t\t<div class=\"form-top-right\">\n");
      out.write("                        \t\t\t<i class=\"fa fa-key\"></i>\n");
      out.write("              \n");
      out.write("\n");
      out.write("                        \t\t</div>\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("                               <div class=\"form-bottom\">\n");
      out.write("                                   <form  action=\"acceso\" class=\"form-signin\" method=\"post\"> \n");
      out.write("                                       <div>\n");
      out.write("                                       <label class=\"sr-only\" for=\"txtusuario\">Usuario</label>\n");
      out.write("                                       <input type=\"text\" id=\"txtusuario\" name=\"txtusuario\" class=\"form-control\" required placeholder=\"Ingrese Usuario\" autofocus/></div>\n");
      out.write("                                       <div><label class=\"sr-only\" for=\"txtpass\">Contraseña</label>\n");
      out.write("                                           <input type=\"password\" id=\"txtpass\" name=\"txtpass\" class=\"form-control\" required placeholder=\"Ingrese Contraseña\"/></div>\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Ingresar</button></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("       <!-- Javascript -->\n");
      out.write("         <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min_3.js\"></script>\n");
      out.write("        <script src=\"js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("     </center>\n");
      out.write("          \n");
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
