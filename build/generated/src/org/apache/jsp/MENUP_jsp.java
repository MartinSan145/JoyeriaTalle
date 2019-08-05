package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.Sesion;

public final class MENUP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Joyeria</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Fonts from Font Awsome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/alertify.core.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/alertify.default.css\">\n");
      out.write("    <!-- CSS Animate -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    <!-- Custom styles for this theme -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("    <!-- iCheck-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/icheck/css/_all.css\">\n");
      out.write("    <!-- Fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,900,300italic,400italic,600italic,700italic,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("    <!-- Feature detection -->\n");
      out.write("    <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"assets/js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"assets/js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body>\n");
      out.write("    <section id=\"container\">\n");
      out.write("        <header id=\"header\">\n");
      out.write("            <!--logo start-->\n");
      out.write("            <div class=\"brand\">\n");
      out.write("                <a class=\"logo\"><span>Joyeria</span>San</a>\n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("            <!--logo end-->\n");
      out.write("            <div class=\"toggle-navigation toggle-left\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" id=\"toggle-left\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Pantalla Completa\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                     \n");
      out.write("                </button>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("        <!--sidebar start-->\n");
      out.write("        <aside class=\"sidebar\">\n");
      out.write("            <div id=\"leftside-navigation\" class=\"nano\">\n");
      out.write("                \n");
      out.write("                <ul class=\"nano-content\">\n");
      out.write("                                           \n");
      out.write("                   \n");
      out.write("                          \n");
      out.write("                  \n");
      out.write("                     \n");
      out.write("                       \n");
      out.write("                     ");
 if(Sesion.perfil.toUpperCase().equals("ADMINISTRADOR")){ 
      out.write("\n");
      out.write("                 <li class=\"sub-menu desactive\">\n");
      out.write("                                \n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa fa-tasks\"></i><span>REFERENCIAL EMPRESA</span>\n");
      out.write("                            <i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                            <ul>\n");
      out.write("                               \n");
      out.write("                            <li><a href=\"Ciudades.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Ciudades</a></li>\n");
      out.write("                            <li><a href=\"caja.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Caja</a></li>\n");
      out.write("                            <li><a href=\"cargos.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Cargos</a></li>\n");
      out.write("                            <li><a href=\"deposito.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Deposito</a></li>\n");
      out.write("                            <li><a href=\"marcatarjeta.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Marca Tarjeta</a></li>\n");
      out.write("                            <li><a href=\"Nacionalidad.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Nacionalidad</a></li>\n");
      out.write("                            <li><a href=\"Niveles.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Niveles</a></li>\n");
      out.write("                            <li><a href=\"sucursal.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Sucursales</a></li>\n");
      out.write("                            <li><a href=\"Tipo Joya.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Tipo de Joya</a></li>\n");
      out.write("                            <li><a href=\"tiposervicio.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Servicios</a></li>\n");
      out.write("\n");
      out.write(" </ul>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                     <li class=\"sub-menu desactive\">\n");
      out.write("                                \n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa fa-tasks\"></i><span>PRINCIPALES</span>\n");
      out.write("                            <i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                            <ul>\n");
      out.write("                                     \n");
      out.write("                            <li><a href=\"empleados.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Empleados</a></li>\n");
      out.write("                            <li><a href=\"clientes.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Clientes</a></li>\n");
      out.write("                            <li><a href=\"productos.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Productos</a></li>\n");
      out.write("                            <li><a href=\"productos.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Proveedores</a></li>\n");
      out.write("                            <li><a href=\"timbrado.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Timbrado</a></li>\n");
      out.write("                            <li><a href=\"usuario.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Usuario</a></li>\n");
      out.write("                            <li><a href=\"banco.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Banco</a></li>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("\n");
      out.write(" </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"sub-menu desactive\">\n");
      out.write("                                \n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa fa-tasks\"></i><span>REPORTES</span>\n");
      out.write("                            <i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                            <ul>\n");
      out.write("                                     \n");
      out.write("                            <li><a href='Imprimir.jsp?condicion=productos&nombre=productos'><i class=\"\"></i>&nbsp;&nbsp; Productos</a></li>\n");
      out.write("                            <li><a href='Imprimir.jsp?condicion=clientes&nombre=clientes'><i class=\"\"></i>&nbsp;&nbsp; Clientes</a></li>\n");
      out.write("                            <li><a href='Imprimir.jsp?condicion=ciudad&nombre=ciudad'><i class=\"\"></i>&nbsp;&nbsp; Ciudad</a></li>\n");
      out.write("\n");
      out.write(" </ul>\n");
      out.write("                    </li>\n");
      out.write("                \n");
      out.write("                  \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                        \n");
      out.write("                     ");
 if(Sesion.perfil.toUpperCase().equals("VENDEDOR")){ 
      out.write("\n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("                      <li class=\"sub-menu desactive\">\n");
      out.write("                    \n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa fa-tasks\"></i><span>Movimiento VENTAS</span>\n");
      out.write("                            <i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                            <ul>\n");
      out.write("                              <li><a href=\"pedidos_ventas.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Pedidos de Ventas</a></li>\n");
      out.write("                              <li><a href=\"ventass.jsp\"><i class=\"\"></i>&nbsp;&nbsp; FACTURA VENTA</a></li>\n");
      out.write("\n");
      out.write("                            \n");
      out.write(" </ul>\n");
      out.write("                    </li>\n");
      out.write("                     ");
 } 
      out.write("\n");
      out.write("                     \n");
      out.write("                      ");
 if(Sesion.perfil.toUpperCase().equals("ENCARGADOCOMPRA")){ 
      out.write("\n");
      out.write("                     <li class=\"sub-menu desactive\">\n");
      out.write("                       \n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa fa-tasks\"></i><span>Movimiento COMPRAS</span>\n");
      out.write("                            <i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                            <ul>\n");
      out.write("                               \n");
      out.write("                           <li><a href=\"pedidos_compra.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Pedidos</a></li>\n");
      out.write("                           <li><a href=\"orden_compra.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Orden de Compra</a></li>\n");
      out.write("                           <li><a href=\"factura_compra.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Factura de Compra</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" </ul>\n");
      out.write("                    </li>\n");
      out.write("                   ");
 } 
      out.write("\n");
      out.write("                   \n");
      out.write("                   ");
 if(Sesion.perfil.toUpperCase().equals("TECNICO")){ 
      out.write("\n");
      out.write("                    <li class=\"sub-menu desactive\">\n");
      out.write("                       \n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa fa-tasks\"></i><span>Movimiento Servicios</span>\n");
      out.write("                            <i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                            <ul>\n");
      out.write("                               \n");
      out.write("                           <li><a href=\"diagnostico.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Diagnostico</a></li>\n");
      out.write("                           <li><a href=\"presupuesto_servicio.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Presupuesto</a></li>\n");
      out.write("                           <li><a href=\"orden_de_trabajo.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Orden de Servicio</a></li>\n");
      out.write("                           <li><a href=\".jsp\"><i class=\"\"></i>&nbsp;&nbsp; Factura Servicio</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write(" </ul>\n");
      out.write("                    </li>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        \n");
      out.write("                        ");
 if(Sesion.perfil.toUpperCase().equals("CAJERO")){ 
      out.write("\n");
      out.write("                   <li class=\"sub-menu desactive\" id=\"menu\">\n");
      out.write("                    \n");
      out.write("                           \n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa fa-tasks\"></i><span>Movimiento de Cobros</span>\n");
      out.write("                            <i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                            <ul> \n");
      out.write("                                \n");
      out.write("                                <li><a href=\"aperturacierre.jsp\"><i class=\"\"></i>&nbsp;&nbsp; APERTURA DE CAJA</a></li>\n");
      out.write("                                <li><a href=\"cobros.jsp\"><i class=\"\"></i>&nbsp;&nbsp; CIERRE DE CAJA</a></li>\n");
      out.write("                                <li><a href=\"cobros.jsp\"><i class=\"\"></i>&nbsp;&nbsp; COBROS</a></li>\n");
      out.write("\n");
      out.write("                           \n");
      out.write(" </ul>\n");
      out.write("                    </li>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    \n");
      out.write("                     <li class=\"sub-menu\">\n");
      out.write("                        <a href=\"indexx.jsp\"><i class=\"fa fa-cogs\"></i><span>Salir</span><i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </aside>\n");
      out.write("        <!--sidebar end-->\n");
      out.write("        <!--main content start-->\n");
      out.write("        <section class=\"main-content-wrapper\">\n");
      out.write("            <section id=\"main-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <!--breadcrumbs start -->\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"MENUP.jsp\">MENU</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>BIENVENIDO</li>\n");
      out.write("                         <h1 class=\"h1\">JOYERIA SAN RAMON</h1>\n");
      out.write("                        </ul>\n");
      out.write("                        <!--breadcrumbs end -->\n");
      out.write("                        \n");
      out.write("                        <div class=\"full-reset\" >\n");
      out.write("                            <center>\n");
      out.write("                            <figure>\n");
      out.write("                                <center>\n");
      out.write("                                <img src=\"assets/icons/joy.jpg\" alt=\"Biblioteca\" class=\"img-responsive center-box\" style=\"width:55%;\">\n");
      out.write("                                </center>\n");
      out.write("                                </figure>\n");
      out.write("                            </center>\n");
      out.write("                <p class=\"text-center\" style=\"padding-top: 15px;\">SystemOro</p>\n");
      out.write("            </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("    <script src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script src=\"plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"plugins/waypoints/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"js/application.js\"></script>\n");
      out.write("    <script src=\"plugins/icheck/js/icheck.min.js\"></script>\n");
      out.write("    <script src=\"plugins/validation/js/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"plugins/validation/js/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-1.12.2.min.js\"></script> \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("        <script src=\"js/alertify.js\"></script> \n");
      out.write("       \n");
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
