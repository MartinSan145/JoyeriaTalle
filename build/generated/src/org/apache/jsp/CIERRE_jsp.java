package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.Conexion;
import java.sql.ResultSet;

public final class CIERRE_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Apertura y Cierre de Caja</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <section id=\"container\">\n");
      out.write("      \n");
      out.write("            <aside class=\"sidebar\">\n");
      out.write("            <div id=\"leftside-navigation\" class=\"nano\">\n");
      out.write("                <ul class=\"nano-content\">\n");
      out.write("                    <header id=\"header\">\n");
      out.write("                    <div class=\"brand\">\n");
      out.write("                <a class=\"logo\"><span>Joyeria</span>San</a>\n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("                        </header>\n");
      out.write("                    <li class=\"sub-menu\">\n");
      out.write("                        <a href=\"javascript:void(0);\"><i class=\"fa fa-cogs\"></i><span>Menu</span><i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("                     <script LANGUAGE=\"JavaScript\">\n");
      out.write("                        function ponerMayuscula (nombre) {\n");
      out.write("                            nombre.value=nombre.value.toUpperCase();\n");
      out.write("                        }    \n");
      out.write("                    </script>\n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </aside>\n");
      out.write("            <section class=\"main-content-wrapper\">\n");
      out.write("            <section id=\"main-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <!--breadcrumbs start -->\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Referencial</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>Cierre de Caja</li>\n");
      out.write("                         \n");
      out.write("                        </ul>\n");
      out.write("                        <!--breadcrumbs end -->\n");
      out.write("                        <h1 class=\"h1\">Cierre de Caja</h1>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                                <input type=\"text\" name=\"txtbuscador\" id=\"txtbuscador\" class=\"form-control\" placeholder=\"Ingrese datos a buscar\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btnbuscar\" type=\"button\" class=\"form-control btn-primary\" value=\"Buscar\" onclick=\"cargar_tabla($('#txtbuscador').val());$('#txtbuscador').val('');\">\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"row\">\n");
      out.write("                     <div class=\"col-md-2\"></div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                      <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container-flat-form\">\n");
      out.write("              \n");
      out.write("                \n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                    <form id=\"formulario\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <div class=\"col-md-1\">\n");
      out.write("                              ");

                                        Conexion cn = new Conexion();
                                        cn.conectar();
                                        int idapertura= 0;
                                        int idsucursal=0, idcaja=0, idusuario=0, montoapertura=0;
                                        String fechaapertura = "";
                                        ResultSet rsapertura = cn.consultar("select * from apertura_cierre where fecha_cierre is null");
                                       if(rsapertura.next()){
                                           idapertura = rsapertura.getInt("id_apertura");
                                           idsucursal = rsapertura.getInt("idsucursal");
                                           idcaja = rsapertura.getInt("idcaja");
                                           idusuario = rsapertura.getInt("idusuario");
                                           montoapertura = rsapertura.getInt("monto_apertura");
                                           fechaapertura = rsapertura.getString("fecha_apertura");
                                       }
                                          
                                    
      out.write("\n");
      out.write("                              \n");
      out.write("                              <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"hidden\" class=\"form-control\" value=\"");
      out.print(idapertura);
      out.write("\" name=\"txtcodigo\" id=\"txtcodigo\" disabled=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <label class=\"control-label\" for=\"fechaapertura\" >Fecha Apertura</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print(fechaapertura);
      out.write("\" name=\"txtfechaapertura\" id=\"txtfechaapertura\" disabled=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"montoapertura\">Monto Apertura</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" value=\"");
      out.print(montoapertura);
      out.write("\" name=\"txtmontoapertura\" id=\"txtmontoapertura\" disabled=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                           <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"sucursal\">Sucursal</label> \n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-md-3\">\n");
      out.write("                                <select class=\"form-control chosen-select\" name=\"cbosucursal\" id=\"cbosucursal\" disabled=\"\" >\n");
      out.write("                                    ");

                                        
                                        ResultSet rssucursal = cn.consultar("select * from sucursales order by idsucursal");
                                        while (rssucursal.next()) {
                                          
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <option value=\"");
      out.print( rssucursal.getString("idsucursal") );
      out.write('"');
      out.write('>');
      out.print( rssucursal.getString("descripcion") );
      out.write("</option>     \n");
      out.write("                                  ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                        </div>\n");
      out.write("                       <div class=\"panel panel-primary\" name=\"hola\" id=\"hola\" for=\"hola\">\n");
      out.write("                            <div class=\"panel-heading\"><strong>Cierre de Caja</strong></div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    \n");
      out.write("                                     <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"fechacierre\">Fecha Cierre</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" name=\"txtfechacierre\" id=\"txtfechacierre\" disabled=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                   ");

                                        int mocierre=0;
                                        ResultSet rscierre = cn.consultar("select sum (costo) from detalle_factura order by idfactura_v desc limit 1");
                                        if (rscierre.next()) {
                                            mocierre=rscierre.getInt("costo");
                                        }
                                        
      out.write("\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"montocierre\">Monto Cierre</label>\n");
      out.write("                                   </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" value=\"");
      out.print(mocierre);
      out.write("\" name=\"txtmontocierre\" id=\"txtmontocierre\" disabled=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                   </div>\n");
      out.write("                                      <div class=\"form-group\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"caja\">Caja</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <select class=\"form-control chosen-select\" name=\"cbocaja\" id=\"cbocaja\" disabled>\n");
      out.write("                                            ");

                                                ResultSet rscaja = cn.consultar("select * from caja order by idcaja");
                                                while (rscaja.next()) {
                                                    String vse="";
                                                    if(idcaja == rscaja.getInt("idcaja")){
                                                        vse = "selected";
                                                    }else vse = "";
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <option ");
out.println(vse);
      out.write(" value=\"");
      out.print( rscaja.getString("idcaja"));
      out.write('"');
      out.write('>');
      out.print( rscaja.getString("descripcion"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                 <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"ciudades\">Usuario</label> \n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-md-3\">\n");
      out.write("                                <select class=\"form-control chosen-select\" name=\"cbousuario\" id=\"cbousuario\" disabled=\"\">\n");
      out.write("                                    ");

                                        
                                        ResultSet rsusuario = cn.consultar("select * from usuario order by idusuario");
                                        while (rsusuario.next()) {
                                          String vse="";
                                                    if(idusuario == rsusuario.getInt("idusuario")){
                                                        vse = "selected";
                                                    }else vse = "";
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <option ");
out.println(vse);
      out.write(" value=\"");
      out.print( rsusuario.getString("idusuario") );
      out.write('"');
      out.write('>');
      out.print( rsusuario.getString("usuario") );
      out.write("</option>     \n");
      out.write("                                  ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                                 <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"estado\">Estado</label> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <td>\n");
      out.write("               <select class=\"form-control chosen-select\" name=\"cestado\" id=\"cestado\" disabled>\n");
      out.write("\n");
      out.write("                            <option selected value=\"true\">Activo</option>\n");
      out.write("                            <option value=\"false\">Inactivo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                                \n");
      out.write("                                </div>\n");
      out.write("                                     \n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-md-1\"></div>\n");
      out.write("                           \n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btncierre\" type=\"button\" class=\"form-control btn-warning\" value=\"Cierre\" onclick=\"cierre();\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btncancelar\" type=\"button\" class=\"form-control btn-info\" value=\"Cancelar\" disabled=\"\" onclick=\"cancelar();\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btngrabar\" type=\"button\" class=\"form-control btn-success\" value=\"Grabar\" disabled=\"\" onclick=\"grabaar()\"/>     \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"hidden\" id=\"operacion\"/>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script src=\"plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"plugins/waypoints/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"js/application.js\"></script>\n");
      out.write("    <script src=\"plugins/icheck/js/icheck.min.js\"></script>\n");
      out.write("    <script src=\"plugins/validation/js/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-1.12.2.min.js\"></script> \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("        <script src=\"js/chosenselect.js\"></script> \n");
      out.write("        <script src=\"js/alertify.js\"></script> \n");
      out.write("\n");
      out.write("       <script src=\"cierre.js\"></script> \n");
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
