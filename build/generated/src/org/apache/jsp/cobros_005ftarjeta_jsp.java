package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.Conexion;
import prg.Metodo;
import java.sql.ResultSet;

public final class cobros_005ftarjeta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" />  \n");
      out.write("\n");
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
      out.write("        \n");
      out.write("       \n");
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
      out.write("                <ul class=\"nano-content\">\n");
      out.write("                    \n");
      out.write("                    <li class=\"sub-menu\">\n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa-cogs\"></i><span>Menu</span><i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   <script LANGUAGE=\"JavaScript\">\n");
      out.write("                        function ponerMayuscula (nombre) {\n");
      out.write("                            nombre.value=nombre.value.toUpperCase();\n");
      out.write("                        }    \n");
      out.write("                    </script>\n");
      out.write("                   \n");
      out.write("                    \n");
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
      out.write("                            <li><a href=\"#\">Referencial</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>Productos</li>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-md-6\"></div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <input type=\"text\" name=\"txtbuscador\" id=\"txtbuscador\" class=\"form-control\" placeholder=\"Ingrese datos a buscar\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btnbuscar\" type=\"button\" class=\"form-control btn-primary\" value=\"Buscar\" onclick=\"cargar_tabla($('#txtbuscador').val());$('#txtbuscador').val('');\">\n");
      out.write("                            </div>\n");
      out.write("  \n");
      out.write("                        </div>\n");
      out.write("                        </ul>\n");
      out.write("                        <!--breadcrumbs end -->\n");
      out.write("                        <h1 class=\"h1\">Cobros en efectivo</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                  ");
 
                            Conexion ci = new Conexion();
                                       ci.conectar();
                                    int idusuario=0; 
                                    String usuario="";
                                    int idsucursal=0;
                                    int idapertura=0;
                                    String sucursales=""; 
                                    String fecha="";
                                    ResultSet rstraer = ci.consultar("select * from veraperturas order by id_apertura desc limit 1");
                                    if(rstraer.next()) {
                                    usuario = rstraer.getString("usuario");
                                    idusuario = rstraer.getInt("idusuario"); 
                                    sucursales = rstraer.getString("sucursal");
                                    idsucursal = rstraer.getInt("idsucursal"); 
                                    fecha = rstraer.getString("caja");
                                    idapertura = rstraer.getInt("id_apertura"); 
                                    }
                                    
      out.write("\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                      <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container-flat-form\">\n");
      out.write("               ");
 
               Conexion bd = new Conexion();
                bd.conectar();
                int id=0;
                ResultSet traerid = bd.consultar("select * from factura_venta;");
                if(traerid.next()) {
                    id = traerid.getInt("nro_factura");
                }
                
      out.write("\n");
      out.write("                \n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                    <form id=\"formulario\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"codigo\">Código</label> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-1\">\n");
      out.write("                         <input type=\"text\" name=\"txtcodigo\" id=\"txtcodigo\" class=\"form-control\" placeholder=\"&#128272; \" disabled=\"\"/>\n");
      out.write("                         <input type=\"hidden\" value=\"\"  name=\"codigo\" id=\"codigo\" class=\"form-control\"  disabled=\"\"/>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"descripcion\">Apertura</label> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                         <input type=\"text\" value=\"");
      out.print(fecha);
      out.write("\"  name=\"txtdescripcion\" id=\"txtdescripcion\" class=\"form-control\" placeholder=\"&#128272; \" disabled=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"fecha\">Fecha Cobro</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" name=\"txtfecha\" id=\"txtfecha\" value=\"");
      out.print( Metodo.formatoFecha(new java.util.Date()));
      out.write("\" disabled/>\n");
      out.write("                         <input type=\"hidden\" class=\"form-control\" value=\"");
      out.print(idapertura);
      out.write("\" name=\"cboapertura\" id=\"cboapertura\" disabled=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                             \n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                      \n");
      out.write("                              \n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            \n");
      out.write("                                <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"cobro\">Tipo Cobro</label> \n");
      out.write("                            </div>\n");
      out.write("                          <div class=\"col-md-2\">\n");
      out.write("                 <input type=\"text\" value=\"TARJETA\" name=\"cbocobro\" id=\"cbocobro\" class=\"form-control\" placeholder=\"&#128272; \" disabled=\"\"/>\n");
      out.write("\n");
      out.write("            \n");
      out.write("                   \n");
      out.write("                            </div>\n");
      out.write("                                 \n");
      out.write("                                 \n");
      out.write("                                <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"sucursal\">Sucursal</label> \n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-md-2\">\n");
      out.write("                         <input type=\"text\" class=\"form-control\" value=\"");
      out.print(sucursales);
      out.write("\" name=\"cbosucursal\" id=\"cbosucursal\" disabled=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"col-md-2\">\n");
      out.write("                                <input type=\"hidden\" value=\"\" name=\"txtsucursal\" id=\"txtsucursal\" class=\"form-control\" placeholder=\"&#128272; \" disabled=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                       <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"usuario\">Usuario</label> \n");
      out.write("                            </div>\n");
      out.write("                          <div class=\"col-md-2\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.print(usuario);
      out.write("\"  name=\"cbousuario\" id=\"cbousuario\" class=\"form-control\" placeholder=\"&#128272; \" disabled=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"col-md-2\">\n");
      out.write("                                <input type=\"hidden\" value=\"\" value=\"");
      out.print(idusuario);
      out.write("\" name=\"txtusuarioo\" id=\"txtusuarioo\" class=\"form-control\" placeholder=\"&#128272; \" disabled=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                                 </div>\n");
      out.write("              </div>\n");
      out.write("                            \n");
      out.write("                               <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\"><strong>Detalles Cobro Tarjeta</strong></div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"factura\">Factura a cobrar</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <select class=\"form-control chosen-select\" name=\"cbofactura\" id=\"cbofactura\" disabled onchange=\"selectfactura();\">\n");
      out.write("                                             ");

                                                 int iddd=0;
                                                ResultSet rsmercaderias = bd.consultar("select * from factura_venta where idfactura_v=nro_factura");
                                                while (rsmercaderias.next()) {
                                                   iddd=rsmercaderias.getInt("idfactura_v");
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <option value=\"");
      out.print( rsmercaderias.getString("idfactura_v"));
      out.write('"');
      out.write('>');
      out.print( rsmercaderias.getString("nro_factura"));
      out.write("</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                            ");

                    
                    
                    int idfacturaa =0;
                    
                    ResultSet traer = bd.consultar("select * from factura_venta order by idfactura_v desc limit 1");
                    if(traer.next()) {
                            idfacturaa = traer.getInt("idfactura_v");
                        
                    }
                    
      out.write("\n");
      out.write("                                   <input type=\"hidden\" value=\"");
      out.print(iddd);
      out.write("\"  name=\"cbocodigo\" id=\"cbocodigo\" class=\"form-control\" placeholder=\"&#128272; \" disabled=\"\"/>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"precio\">Monto a Cobrar</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" name=\"txtpreciov\" id=\"txtpreciov\" disabled/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"cantidad\">Monto Pagado</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" name=\"txtcantidad\" id=\"txtcantidad\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"hidden\" class=\"form-control\" name=\"txt\" id=\"txt\"/>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                              \n");
      out.write("                </div>\n");
      out.write("                                    <table class=\"table table-hover\" id=\"grilla\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr class=\"warning\">\n");
      out.write("                                            <th>Código</th> \n");
      out.write("                                            <th>Caja</th>\n");
      out.write("                                            <th>Fecha de Cobro</th>\n");
      out.write("                                            <th>Tipo de Cobro</th>\n");
      out.write("                                            <th>Sucursal</th>\n");
      out.write("                                            <th>Usuario</th>\n");
      out.write("                                            <th>Monto Total</th>\n");
      out.write("                                            <th>Monto Recibido</th>\n");
      out.write("                                            <th>Devolucion</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("    \n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                    <tfoot>\n");
      out.write("\n");
      out.write("                                    </tfoot>\n");
      out.write("                                </table>      \n");
      out.write("                            </div>\n");
      out.write("                 </div>\n");
      out.write("                                 \n");
      out.write("                           \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btnagregar\" type=\"button\" class=\"form-control btn-primary\" value=\"IniciarCobro\" onclick=\"iniciarcobro();\"/>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btnborrar\" type=\"button\" class=\"form-control btn-danger\" value=\"Borrar\" onclick=\"borrar();\"/>\n");
      out.write("                            </div>                \n");
      out.write("            \n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btngrabar\" type=\"button\" class=\"form-control btn-success\" value=\"Grabar\" disabled=\"\" onclick=\"validarcantidad()\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <a href=\"MENUP.jsp\"><input id=\"btnsalir\" type=\"button\" class=\"form-control btn-default\" value=\"Salir\"></a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                      </div> \n");
      out.write("                              \n");
      out.write("                                              \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>            \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("             \n");
      out.write("                                        \n");
      out.write("                </div>\n");
      out.write("     \n");
      out.write("            </div>\n");
      out.write("                 <input type=\"hidden\" id=\"operacion\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("    <script src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script src=\"plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"plugins/waypoints/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"js/application.js\"></script>\n");
      out.write("    <script src=\"plugins/icheck/js/icheck.min.js\"></script>\n");
      out.write("    <script src=\"plugins/validation/js/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-1.12.2.min.js\"></script> \n");
      out.write("        <script src=\"js/alertify.js\"></script> \n");
      out.write("       <script src=\"cobros.js\"></script> \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        </section>\n");
      out.write("                            \n");
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