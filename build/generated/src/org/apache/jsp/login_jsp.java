package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.Sesion;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Sesion.codigo_sucursal = "";
    Sesion.codigo_usuario = "";
    Sesion.nombre_funcionario = "";
    Sesion.nombre_sucursal = "";
    Sesion.nombre_usuario = "";
    Sesion.perfil = "";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("     <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Login |</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- favicon\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"assets/image/x-icon\" href=\"img/favicon.ico\">\n");
      out.write("    <!-- Google Fonts\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    <!-- font awesome CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("    <!-- owl.carousel CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.transitions.css\">\n");
      out.write("    <!-- animate CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("    <!-- normalize CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/normalize.css\">\n");
      out.write("    <!-- mCustomScrollbar CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/scrollbar/jquery.mCustomScrollbar.min.css\">\n");
      out.write("    <!-- wave CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/wave/waves.min.css\">\n");
      out.write("    <!-- Notika icon CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/notika-custom-icon.css\">\n");
      out.write("    <!-- main CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("    <!-- style CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/style.css\">\n");
      out.write("    <!-- responsive CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("    <!-- modernizr JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("    <!-- Login Register area Start-->\n");
      out.write("    <div class=\"login-content\">\n");
      out.write("        <!-- Login -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"nk-block toggled\" id=\"l-login\">\n");
      out.write("            <div class=\"form-top\">\n");
      out.write("\n");
      out.write("                        \t\t<div class=\"form-top-left\">\n");
      out.write("\n");
      out.write("                        \t\t\t<h3>Inicia sesion para acceder al sistema</h3>\n");
      out.write("                            \t\t\n");
      out.write("                        \t\t</div>\n");
      out.write("                        \t\t<div class=\"form-top-right\">\n");
      out.write("                        \t\t\t<i class=\"fa fa-key\"></i>\n");
      out.write("              \n");
      out.write("\n");
      out.write("                        \t\t</div>\n");
      out.write("                            </div>\n");
      out.write("           \n");
      out.write("            <form action=\"acceso\" method=\"post\">\n");
      out.write("                <div class=\"nk-form\">\n");
      out.write("                    <input class=\"input100\" type=\"hidden\" name=\"accion\" value=\"login\" id=\"accion\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon nk-ic-st-pro\"><i class=\"notika-icon notika-support\"></i></span>\n");
      out.write("                        <div class=\"nk-int-st\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"user\" name=\"user\" placeholder=\"Username\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group mg-t-15\">\n");
      out.write("                        <span class=\"input-group-addon nk-ic-st-pro\"><i class=\"notika-icon notika-edit\"></i></span>\n");
      out.write("                        <div class=\"nk-int-st\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"pass\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"btn btn-login btn-success btn-float\"><i class=\"notika-icon notika-right-arrow right-arrow-ant\"></i></button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- jquery\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("    <!-- bootstrap JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- wow JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/wow.min.js\"></script>\n");
      out.write("    <!-- price-slider JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/jquery-price-slider.js\"></script>\n");
      out.write("    <!-- owl.carousel JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("    <!-- scrollUp JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <!-- meanmenu JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/meanmenu/jquery.meanmenu.js\"></script>\n");
      out.write("   <script src=\"assets/js/scrollbar/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <!-- flot JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"assets/js/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"assets/js/flot/flot-active.js\"></script>\n");
      out.write("    <!-- knob JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/knob/jquery.knob.js\"></script>\n");
      out.write("    <script src=\"assets/js/knob/jquery.appear.js\"></script>\n");
      out.write("    <script src=\"assets/js/knob/knob-active.js\"></script>\n");
      out.write("    <!--  Chat JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/chat/jquery.chat.js\"></script>\n");
      out.write("    <!--  wave JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/wave/waves.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/wave/wave-active.js\"></script>\n");
      out.write("    <!--  todo JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/todo/jquery.todo.js\"></script>\n");
      out.write("    <!-- Login JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/login/login-action.js\"></script>\n");
      out.write("    <!-- plugins JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("    <!-- main JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("    <!-- login JS\n");
      out.write("    =============================================== -->\n");
      out.write("    <script src=\"login.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
