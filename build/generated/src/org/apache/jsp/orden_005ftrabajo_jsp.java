package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import prg.Conexion;
import prg.Metodo;
import java.util.Date;

public final class orden_005ftrabajo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Orden de Servicio</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"assets/icons/book.ico\" />\n");
      out.write("    <script src=\"js/sweet-alert.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/sweet-alert.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    \n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/alertify.core.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/alertify.default.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"plugins/icheck/css/_all.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("         <div class=\"navbar-lateral full-reset\">\n");
      out.write("        <div class=\"visible-xs font-movile-menu mobile-menu-button\"></div>\n");
      out.write("        <div class=\"full-reset container-menu-movile custom-scroll-containers\">\n");
      out.write("            <div class=\"logo full-reset all-tittles\">\n");
      out.write("                <i class=\"visible-xs zmdi zmdi-close pull-left mobile-menu-button\" style=\"line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;\"></i> \n");
      out.write("JoyeriaSAN            </div>\n");
      out.write("            <div class=\"full-reset\" style=\"background-color:#2B3D51; padding: 10px 0; color:#fff;\">\n");
      out.write("                <figure>\n");
      out.write("                    <img src=\"assets/icons/joy.jpg\" alt=\"Biblioteca\" class=\"img-responsive center-box\" style=\"width:55%;\">\n");
      out.write("                </figure>\n");
      out.write("                <p class=\"text-center\" style=\"padding-top: 15px;\">SystemOro</p>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"full-reset nav-lateral-list-menu\">\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"menuprinc.html\"><i class=\"zmdi zmdi-home zmdi-hc-fw\"></i>&nbsp;&nbsp; Inicio</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown-menu-button\">\n");
      out.write("                            <i class=\"zmdi zmdi-case zmdi-hc-fw\"></i>&nbsp;&nbsp; Movimientos <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw\"></i></div>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            \n");
      out.write("                         <li><a href=\"presupuesto.jsp\"><i class=\"\"></i>&nbsp;&nbsp; PRESUPUESTO</a></li>\n");
      out.write("                            <li><a href=\"servicios.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Servicios</a></li>\n");
      out.write("                            <li><a href=\"tipo_servicio.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Tipo de Servicio</a></li>\n");
      out.write("                            <li><a href=\"repuestos.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Repuestos</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("       \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"content-page-container full-reset custom-scroll-containers\">\n");
      out.write("        \n");
      out.write("   \n");
      out.write("      \n");
      out.write("        <div class=\"container-fluid\"  style=\"margin: 10px 0;\">\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("         <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                <form action=\"operaciones_bd\" method=\"post\" class=\"form-horizontal\">  \n");
      out.write("                   \n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"codigo\">Código</label>\n");
      out.write("                            </div>\n");
      out.write("                          <div class=\"col-md-1\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtcodigo\" id=\"txtcodigo\"  disabled/>\n");
      out.write("                            </div>\n");
      out.write("                          <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"fecha\">Fecha</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                          <input type=\"date\" class=\"form-control\" name=\"txtfecha\" id=\"txtfecha\" value=\"");
      out.print( Metodo.formatoFecha(new java.util.Date()));
      out.write("\" disabled/>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                          <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"observacion\">Observacion</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtobservacion\" id=\"txtobservacion\" placeholder=\"Autogenerado\" disabled/>\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("                            <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"estado\">Estado</label> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <td>\n");
      out.write("               <select class=\"form-control chosen-select\" name=\"cboestado\" id=\"cboestado\" disabled>\n");
      out.write("\n");
      out.write("                            <option selected value=\"true\">Activo</option>\n");
      out.write("                            <option value=\"false\">Inactivo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                          ");

                          Conexion cn = new Conexion();
                          cn.conectar();
                          int presupuesto=0;
                          ResultSet rspresupuesto = cn.combo("select presu_total from presupuesto order by idpresupuesto desc limit 1");
                          if (rspresupuesto.next()) {
                          presupuesto = rspresupuesto.getInt("presu_total");
                          }
                          
      out.write(" \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"presupuesto\">Presupuesto</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.print(presupuesto);
      out.write("\" name=\"cbopresupuesto\" id=\"cbopresupuesto\" disabled=\"\">     \n");
      out.write("                            </div>\n");
      out.write("                                ");

                                String cliente ="";
                                ResultSet rscliente = cn.combo("select * from verrecepcion order by idrecepcion desc limit 1"); 
                                if(rscliente.next())
                                    cliente = rscliente.getString("cliente");
                                
      out.write("\n");
      out.write("                            <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"cbocliente\">Cliente</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.print(cliente);
      out.write("\" name=\"cbocliente\" id=\"cbocliente\" disabled>\n");
      out.write("                            </div>\n");
      out.write("                                 <div class=\"col-md-1\">\n");
      out.write("                                <label class=\"control-label\" for=\"usuario\">Usuario</label>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"col-md-3\">\n");
      out.write("                                <select class=\"form-control chosen-select\" name=\"cbousuario\" id=\"cbousuario\" disabled>\n");
      out.write("                                    ");

                                        ResultSet rusu = cn.consultar("select * from usuario order by idusuario");
                                        while (rusu.next()) {
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( rusu.getString("idusuario"));
      out.write('"');
      out.write('>');
      out.print( rusu.getString("usuario"));
      out.write("</option>     \n");
      out.write("\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("               \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                                    ");

                                        String servicio="";
                                        ResultSet rsservicio = cn.combo("select * from verdiagnostico order by iddiagnostico desc limit 1");
                                      if(rsservicio.next())
                                          servicio = rsservicio.getString("servicio");
                                    
      out.write("\n");
      out.write("                              <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\"><strong>Detalles</strong></div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"servicio\">Servicios</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <select class=\"form-control chosen-select\" name=\"cboservicio\" id=\"cboservicio\" disabled onchange=\"selectservicio();\">\n");
      out.write("                                             ");

                                                ResultSet rsservicioo = cn.consultar("select * from precioservicios order by idservicio");
                                                while (rsservicioo.next()) {
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <option value=\"");
      out.print( rsservicioo.getString("idprecio"));
      out.write('"');
      out.write('>');
      out.print( rsservicioo.getString("descripcion"));
      out.write("</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                        <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"precio\">Precio</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" name=\"txtpreciov\" id=\"txtpreciov\" disabled/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-1\">\n");
      out.write("                                        <label class=\"control-label\" for=\"cantidad\">Cantidad</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" name=\"txtcantidad\" id=\"txtcantidad\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                        \n");
      out.write("                                <table class=\"table table-hover\" id=\"grilla\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr class=\"warning\">\n");
      out.write("                                            <th>Código</th> \n");
      out.write("                                            <th>Descripción</th>\n");
      out.write("                                            <th>Cantidad</th>\n");
      out.write("                                            <th>Precio U.</th>\n");
      out.write("                                            <th>Total</th>\n");
      out.write("                                            <th></th>\n");
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
      out.write("                           <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btnnuevo\" type=\"button\" class=\"form-control btn-primary\" value=\"Nuevo\" onclick=\"agregar();\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btnmodificar\" type=\"button\" class=\"form-control btn-warning\" value=\"Modificar\" onclick=\"modificar();\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btnborrar\" type=\"button\" class=\"form-control btn-danger\" value=\"Anular\" onclick=\"borrar();\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btncancelar\" type=\"button\" class=\"form-control btn-info\" value=\"Cancelar\" disabled=\"\" onclick=\"cancelar();\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input id=\"btngrabar\" type=\"button\" class=\"form-control btn-success\" value=\"Grabar\" disabled=\"\" onclick=\"grabar();\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <a href=\"MENUP.jsp\"><input id=\"btnsalir\" type=\"button\" class=\"form-control btn-default\" value=\"Salir\"></a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div> \n");
      out.write("                               <div class=\"panel panel-success\" id=\"panelBuscador\">\n");
      out.write("                            <div class=\"panel-heading\"><strong>Ultimas Facturas</strong></div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"txtbuscador\" placeholder=\"Igrese datos a buscar\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <input id=\"btnBuscar\" type=\"button\" class=\"form-control btn-success\" value=\"Buscar\" onclick=\"get_datoss($('#txtbuscador').val());\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <table class=\"table table-hover\" id=\"grillabuscador\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr class=\"warning\">\n");
      out.write("                                            <th>Código</th>\n");
      out.write("                                            <th>Fecha</th>\n");
      out.write("                                            <th>Nro Factura</th>\n");
      out.write("                                            <th class=\"hidden\">id timbrado</th>\n");
      out.write("                                            <th>Timbrado</th>\n");
      out.write("                                            <th class=\"hidden\">id usuario</th>\n");
      out.write("                                            <th>Usuario</th>\n");
      out.write("                                            <th class=\"hidden\">id cliente</th>\n");
      out.write("                                            <th>Cliente</th>\n");
      out.write("                                            <th class=\"hidden\">id deposito</th>\n");
      out.write("                                            <th>Deposito</th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                       \n");
      out.write("                            </div>\n");
      out.write("                        </div>            \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                      \n");
      out.write("             \n");
      out.write("                </div>\n");
      out.write("                      \n");
      out.write("            </div>\n");
      out.write("                            <input type=\"hidden\" id=\"operacion\"/>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <script src=\"js/jquery-1.12.2.min.js\"></script> \n");
      out.write("<script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("<script src=\"js/alertify.js\"></script> \n");
      out.write("<script src=\"js/chosenselect.js\"></script> \n");
      out.write("<script src=\"orden_trabajo.js\"></script> \n");
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
