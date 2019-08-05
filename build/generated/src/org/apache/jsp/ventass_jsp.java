package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.Sesion;
import prg.Metodo;
import java.sql.ResultSet;
import prg.Conexion;

public final class ventass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>Joyeria</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/alertify.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/alertify.core.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/alertify.default.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"container\">\n");
      out.write("\n");
      out.write("            <header id=\"header\">\n");
      out.write("                <!--logo start-->\n");
      out.write("                <div class=\"brand\">\n");
      out.write("                    <a class=\"logo\"><span>Joyeria</span>San</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!--logo end-->\n");
      out.write("                <div class=\"toggle-navigation toggle-above\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" id=\"toggle-left\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Pantalla Completa\">\n");
      out.write("\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("\n");
      out.write("                    </button>\n");
      out.write("                    <img src=\"img/Captura.PNG\" border=\"0\" width=\"1050\" height=\"75\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <!--sidebar start-->\n");
      out.write("            <aside class=\"sidebar\">\n");
      out.write("                <div id=\"leftside-navigation\" class=\"nano\">\n");
      out.write("                    <ul class=\"nano-content\">\n");
      out.write("\n");
      out.write("                        <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"javascript:void(0);\"><i class=\"fa fa-cogs\"></i><span>Menu</span><i class=\"arrow fa fa-angle-right pull-right\"></i></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"ultimasfacturas.jsp\"><i class=\"\"></i>&nbsp;&nbsp; Facturas</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <script LANGUAGE=\"JavaScript\">\n");
      out.write("                            function ponerMayuscula(nombre) {\n");
      out.write("                                nombre.value = nombre.value.toUpperCase();\n");
      out.write("                            }\n");
      out.write("                        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </aside>\n");
      out.write("            <!--sidebar end-->\n");
      out.write("            <!--main content start-->\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <section class=\"main-content-wrapper\">\n");
      out.write("            <section id=\"main-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <!--breadcrumbs start -->\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Movimiento</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <h1 class=\"h1\">Factura Venta</h1>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <!--breadcrumbs end -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"container-flat-form\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <form action=\"operaciones_bd\" method=\"post\" class=\"form-horizontal\">  \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <label class=\"control-label\" for=\"codigo\">Código</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"txtcodigo\" id=\"txtcodigo\"  disabled/>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input  type=\"hidden\" value=\"PENDIENTE\" name=\"idestado\" id=\"idestado\" class=\"form-control\" placeholder=\"&#128272; Autoincrementable\" disabled/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <label class=\"control-label\" for=\"fecha\">Fecha Venta</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <input type=\"date\" class=\"form-control\" name=\"txtfecha\" id=\"txtfecha\" value=\"");
      out.print( Metodo.formatoFecha(new java.util.Date()));
      out.write("\" disabled/>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <label class=\"control-label\" for=\"nrofactura\">Nro. Factura</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                ");

                                                    Conexion cn = new Conexion();
                                                    cn.conectar();
                                                    int id = 0;
                                                    int tim = 0;

                                                    ResultSet traertim = cn.consultar("select * from timbrado where estado=TRUE");
                                                    while (traertim.next()) {
                                                        tim = traertim.getInt("descripcion");
                                                        id = traertim.getInt("idtimbrado");
                                                    }
                                                
      out.write("\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"txtnrofactura\" id=\"txtnrofactura\" placeholder=\"Autogenerado\" disabled/>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <label class=\"control-label\" for=\"timbrado\">Timbrado</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <input type=\"hidden\" value=\"");
      out.print(id);
      out.write("\" class=\"form-control\" name=\"cbotimbrado\" id=\"cbotimbrado\" disabled=\"\">\n");
      out.write("                                                <input type=\"text\" value=\"");
      out.print(tim);
      out.write("\" class=\"form-control\" name=\"timbradodescri\" id=\"timbradodescri\" disabled=\"\">\n");
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <label class=\"control-label\" for=\"cbocliente\">Cliente</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <select class=\"form-control chosen-select\" name=\"cbocliente\" id=\"cbocliente\" disabled>\n");
      out.write("                                                    ");

                                                        ResultSet rsoc = cn.consultar("select * from clientes order by idcliente");
                                                        while (rsoc.next()) {
                                                    
      out.write("\n");
      out.write("\n");
      out.write("                                                    <option value=\"");
      out.print( rsoc.getString("idcliente"));
      out.write('"');
      out.write('>');
      out.print( rsoc.getString("nombre"));
      out.write("</option>     \n");
      out.write("\n");
      out.write("                                                    ");

                                                        }
                                                    
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                                \n");
      out.write("                                            </div>\n");
      out.write("                                                <div class=\"col-md-1\"><label class=\"btn btn-sm btn-success\" onclick=\"abrir_modal()\" >Agregar</label></div>\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <label class=\"control-label\" for=\"usuario\">Usuario</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <input type=\"text\" value=\"");
      out.print(Sesion.perfil);
      out.write("\" class=\"form-control chosen-select\" name=\"cbousuarioo\" id=\"cbousuarioo\" disabled>\n");
      out.write("                                                <input type=\"hidden\" value=\"");
      out.print(Sesion.codigo_usuario);
      out.write("\" class=\"form-control chosen-select\" name=\"cbousuario\" id=\"cbousuario\" disabled>  \n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <label class=\"control-label\" for=\"cbodeposito\">Deposito</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <select class=\"form-control chosen-select\" name=\"cbodeposito\" id=\"cbodeposito\" >\n");
      out.write("                                                    ");

                                                        ResultSet dep = cn.consultar("select * from deposito order by iddeposito");
                                                        while (dep.next()) {
                                                    
      out.write("\n");
      out.write("\n");
      out.write("                                                    <option value=\"");
      out.print( dep.getString("iddeposito"));
      out.write('"');
      out.write('>');
      out.print( dep.getString("descripcion"));
      out.write("</option>     \n");
      out.write("\n");
      out.write("                                                    ");

                                                        }
                                                    
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                ");

                                                    int apertura = 0;
                                                    Conexion ap = new Conexion();
                                                    ap.conectar();
                                                    ResultSet m = ap.consultar("select * from apertura_cierre where fecha_apertura = current_date");
                                                    while (m.next()) {
                                                        apertura = m.getInt("id_apertura");
                                                    }
                                                
      out.write("\n");
      out.write("                                                <input type=\"hidden\" value=\"");
      out.print(apertura);
      out.write("\" class=\"form-control\" name=\"cboapertura\" id=\"cboapertura\" disabled=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"col-md-1\">\n");
      out.write("                                                <label class=\"control-label\" for=\"cbopedido\">Pedido</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <select class=\"form-control chosen-select\" name=\"cbopedido\" id=\"cbopedido\" disabled onchange=\"selectpedidoventa();\">\n");
      out.write("                                                    <option selected=\"true\" value=\"\">\n");
      out.write("                                                        Seleccionar\n");
      out.write("                                                    </option> \n");
      out.write("\n");
      out.write("                                                    ");

                                                        ResultSet pedido = cn.consultar("select * from pedido_venta where estado='Pendiente';");
                                                        while (pedido.next()) {
                                                    
      out.write("\n");
      out.write("\n");
      out.write("                                                    <option value=\"");
      out.print( pedido.getString("idpedido"));
      out.write('"');
      out.write('>');
      out.print( pedido.getString("idpedido"));
      out.write("</option>     \n");
      out.write("\n");
      out.write("                                                    ");

                                                        }
                                                    
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"panel panel-primary\">\n");
      out.write("                                            <div class=\"panel-heading\"><strong>Detalles</strong></div>\n");
      out.write("                                            <div class=\"panel-body\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"col-md-1\">\n");
      out.write("                                                        <label class=\"control-label\" for=\"producto\">Producto</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-5\">\n");
      out.write("                                                        <select class=\"form-control chosen-select\" name=\"cboproducto\" id=\"cboproducto\" disabled onchange=\"selectproductoss();\">\n");
      out.write("                                                            ");

                                                                ResultSet rsmercaderias = cn.consultar("select * from precioproductos order by idproducto");
                                                                while (rsmercaderias.next()) {
                                                            
      out.write("\n");
      out.write("\n");
      out.write("                                                            <option value=\"");
      out.print( rsmercaderias.getString("idprecio"));
      out.write('"');
      out.write('>');
      out.print( rsmercaderias.getString("descripcion"));
      out.write("</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            ");

                                                                }
                                                            
      out.write("\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-1\">\n");
      out.write("                                                        <label class=\"control-label\" for=\"precio\">Precio</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-2\">\n");
      out.write("                                                        <input type=\"number\" class=\"form-control\" name=\"txtpreciov\" id=\"txtpreciov\" disabled/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-1\">\n");
      out.write("                                                        <label class=\"control-label\" for=\"cantidad\">Cantidad</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-2\">\n");
      out.write("                                                        <input type=\"number\" class=\"form-control\" name=\"txtcantidad\" id=\"txtcantidad\"/>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <table class=\"table table-hover\" id=\"grilla\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr class=\"warning\">\n");
      out.write("                                                            <th>Código</th> \n");
      out.write("                                                            <th>Descripción</th>\n");
      out.write("                                                            <th>Cantidad</th>\n");
      out.write("                                                            <th>Precio U.</th>\n");
      out.write("                                                            <th>Precio T.</th>\n");
      out.write("\n");
      out.write("                                                            <th>Iva 10%</th>\n");
      out.write("                                                            <th></th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                    <tfoot>\n");
      out.write("\n");
      out.write("                                                    </tfoot>\n");
      out.write("                                                </table>      \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <input id=\"btnnuevo\" type=\"button\" class=\"form-control btn-primary\" value=\"Nuevo\" onclick=\"agregar();\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <input id=\"btnmodificar\" type=\"button\" class=\"form-control btn-warning\" value=\"Modificar\" onclick=\"modificar();\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <input id=\"btnborrar\" type=\"button\" class=\"form-control btn-danger\" value=\"Anular\" onclick=\"borrar();\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <input id=\"btncancelar\" type=\"button\" class=\"form-control btn-info\" value=\"Cancelar\" disabled=\"\" onclick=\"cancelar();\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <input id=\"btngrabar\" type=\"button\" class=\"form-control btn-success\" value=\"Grabar\" disabled=\"\" onclick=\"grabar();\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-2\">\n");
      out.write("                                                <a href=\"MENUP.jsp\"><input id=\"btnsalir\" type=\"button\" class=\"form-control btn-default\" value=\"Salir\"></a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>            \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"hidden\" id=\"operacion\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"modal fade\" id=\"modal_cliente\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h5 class=\"modal-title\" id=\"modal_cliente_title\">Agregar Cliente</h5>\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                <label class=\"control-label\" for=\"nombre\">Nombre</label> \n");
      out.write("                                \n");
      out.write("                                <input type=\"text\" name=\"txtcodigocliente\" id=\"txtcodigocliente\" class=\"form-control\"/>\n");
      out.write("\n");
      out.write("                                <input type=\"text\" name=\"txtnombre\" id=\"txtnombre\" class=\"form-control\" placeholder=\"&#128272; Ingrese Nombre\"  onblur=\"ponerMayuscula()\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <label class=\"control-label\" for=\"apellido\">Apellido</label> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"text\" name=\"txtapellido\" for=\"apellido\" id=\"txtapellido\" class=\"form-control\" placeholder=\"&#128272; Ingrese Apellido\"  onblur=\"ponerMayuscula()\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <label class=\"control-label\" for=\"cedula\">Cedula</label> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"number\" name=\"txtcedula\" id=\"txtcedula\" class=\"form-control\" placeholder=\"&#128272; Ingrese Cedula\"  onblur=\"ponerMayuscula()\"/>\n");
      out.write("\n");
      out.write("                                <label class=\"control-label\" for=\"email\">Email</label> \n");
      out.write("\n");
      out.write("                                <input  type=\"text\" name=\"txtemail\" id=\"txtemail\" class=\"form-control\" placeholder=\"&#128272; Ingrese email\" />\n");
      out.write("\n");
      out.write("                                <label class=\"control-label\" for=\"direccion\">Direccion</label> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"text\" name=\"txtdireccion\" id=\"txtdireccion\" class=\"form-control\" placeholder=\"&#128272; Ingrese direccion\"  onblur=\"ponerMayuscula()\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <label class=\"control-label\" for=\"telefono\">Telefono</label> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"number\" name=\"txttelefono\" id=\"txttelefono\" class=\"form-control\" placeholder=\"&#128272; Ingrese direccion\"  onblur=\"ponerMayuscula()\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <label class=\"control-label\" for=\"ciudad\">Ciudad</label> \n");
      out.write("\n");
      out.write("                                <select class=\"form-control chosen-select\" name=\"cbociudad\" id=\"cbociudad\">\n");
      out.write("                                    ");

                                        ResultSet rsciudades = cn.consultar("select * from ciudades order by idciudad");
                                        while (rsciudades.next()) {

                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( rsciudades.getString("idciudad"));
      out.write('"');
      out.write('>');
      out.print( rsciudades.getString("descripcion"));
      out.write("</option>     \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                \n");
      out.write("                                <label class=\"control-label\" for=\"nacionalidad\">Pais</label> \n");
      out.write("                                \n");
      out.write("                                <select class=\"form-control chosen-select\" name=\"cbonacionalidad\" id=\"cbonacionalidad\" >\n");
      out.write("                                    ");

                                        Conexion n = new Conexion();
                                        n.conectar();
                                        ResultSet rsnacio = n.consultar("select * from nacionalidad order by idnacionalidad");
                                        while (rsnacio.next()) {

                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( rsnacio.getString("idnacionalidad"));
      out.write('"');
      out.write('>');
      out.print( rsnacio.getString("descripcion"));
      out.write("</option>     \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write(" <input type=\"hidden\" id=\"operacion\"/>\n");
      out.write("                            </div>\n");
      out.write(" \n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" onclick=\"grabarclientee()\" >Grabar </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("        <script src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script src=\"plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"plugins/waypoints/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"js/application.js\"></script>\n");
      out.write("        <script src=\"plugins/icheck/js/icheck.min.js\"></script>\n");
      out.write("        <script src=\"plugins/validation/js/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"plugins/validation/js/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-1.12.2.min.js\"></script> \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("        <script src=\"js/chosenselect.js\"></script> \n");
      out.write("\n");
      out.write("        <script src=\"js/alertify.js\"></script> \n");
      out.write("        <script src=\"js/alertify.js\"></script> \n");
      out.write("\n");
      out.write("        <script src=\"grabarcliente.js\"></script> \n");
      out.write("        <script src=\"venta.js\"></script> \n");
      out.write("        <script>\n");
      out.write("                                    $(document).ready(function () {\n");
      out.write("                                        comprobarApertura();\n");
      out.write("                                    });\n");
      out.write("                                    function abrir_modal(){\n");
      out.write("                                        $(\"#modal_cliente\").modal(\"show\");\n");
      out.write("                                    }\n");
      out.write("        </script>\n");
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
