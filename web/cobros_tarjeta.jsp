<%-- 
    Document   : productos
    Created on : 29-nov-2017, 13:49:41
    Author     : Martin
--%>



<%@page import="prg.Conexion"%>
<%@page import="prg.Metodo"%>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />  

         <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Joyeria</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <!-- Favicon -->
    <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">
    <!-- Fonts from Font Awsome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/alertify.core.css">
    <link rel="stylesheet" type="text/css" href="css/alertify.default.css">
    <!-- CSS Animate -->
    <link rel="stylesheet" href="css/animate.css">
    <!-- Custom styles for this theme -->
    <link rel="stylesheet" href="css/main.css">
    <!-- iCheck-->
    <link rel="stylesheet" href="plugins/icheck/css/_all.css">
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,900,300italic,400italic,600italic,700italic,900italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <!-- Feature detection -->
    <script src="js/modernizr-2.6.2.min.js"></script>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>
        
       
    <section id="container">
        <header id="header">
            <!--logo start-->
            <div class="brand">
                <a class="logo"><span>Joyeria</span>San</a>
                 
            </div>
            <!--logo end-->
            <div class="toggle-navigation toggle-left">
                <button type="button" class="btn btn-default" id="toggle-left" data-toggle="tooltip" data-placement="right" title="Pantalla Completa">
                    <i class="fa fa-bars"></i>
                     
                </button>
              
            </div>
            
        </header>
        <!--sidebar start-->
        <aside class="sidebar">
            <div id="leftside-navigation" class="nano">
                <ul class="nano-content">
                    
                    <li class="sub-menu">
                        <a href="javascript:void(0);"><i class="fa fa-cogs"></i><span>Menu</span><i class="arrow fa fa-angle-right pull-right"></i></a>
                        <ul>

                        </ul>
                    </li>
                 
                  
                    
                    
                   <script LANGUAGE="JavaScript">
                        function ponerMayuscula (nombre) {
                            nombre.value=nombre.value.toUpperCase();
                        }    
                    </script>
                   
                    
                </ul>
            </div>

        </aside>
        <!--sidebar end-->
        <!--main content start-->
        <section class="main-content-wrapper">
            <section id="main-content">
                <div class="row">
                    <div class="col-md-12">
                        <!--breadcrumbs start -->
                        <ul class="breadcrumb">
                            <li><a href="#">Referencial</a>
                            </li>
                            <li>Productos</li>
                         <div class="form-group">
                            <div class="col-md-6"></div>
                            <div class="col-md-4">
                                <input type="text" name="txtbuscador" id="txtbuscador" class="form-control" placeholder="Ingrese datos a buscar"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btnbuscar" type="button" class="form-control btn-primary" value="Buscar" onclick="cargar_tabla($('#txtbuscador').val());$('#txtbuscador').val('');">
                            </div>
  
                        </div>
                        </ul>
                        <!--breadcrumbs end -->
                        <h1 class="h1">Cobros en Tarjeta</h1>
                    </div>
                    
                </div>
                 
                <% 
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
                                    %>
               
                    
                      <div class="container-fluid">
            <div class="container-flat-form">
               <% 
               Conexion bd = new Conexion();
                bd.conectar();
                int id=0;
                ResultSet traerid = bd.consultar("select * from factura_venta;");
                if(traerid.next()) {
                    id = traerid.getInt("nro_factura");
                }
                %>
                
              <div class="row">
                <div class="col-md-12">

                    <form id="formulario" class="form-horizontal" role="form">
                        <div class="form-group">
                            <div class="col-md-1">
                                <label class="control-label" for="codigo">Código</label> 
                            </div>
                            <div class="col-md-1">
                         <input type="text" name="txtcodigo" id="txtcodigo" class="form-control" placeholder="&#128272; " disabled=""/>
                         <input type="hidden" value=""  name="codigo" id="codigo" class="form-control"  disabled=""/>

                            </div>
                            <div class="col-md-1">
                                <label class="control-label" for="descripcion">Apertura</label> 
                            </div>
                            <div class="col-md-2">
                         <input type="text" value="<%=fecha%>"  name="txtdescripcion" id="txtdescripcion" class="form-control" placeholder="&#128272; " disabled=""/>
                            </div>
                             <div class="col-md-1">
                                <label class="control-label" for="fecha">Fecha Cobro</label>
                            </div>
                            <div class="col-md-2">
                          <input type="text" class="form-control" name="txtfecha" id="txtfecha" value="<%= Metodo.formatoFecha(new java.util.Date())%>" disabled/>
                         <input type="hidden" class="form-control" value="<%=idapertura%>" name="cboapertura" id="cboapertura" disabled=""/>
                            </div>
                             
                        </div>
                    </form>
                      
                              
                        
                        <div class="form-group">
                            
                                <div class="col-md-1">
                                <label class="control-label" for="cobro">Tipo Cobro</label> 
                            </div>
                          <div class="col-md-2">
                 <input type="text" value="TARJETA" name="cbocobro" id="cbocobro" class="form-control" placeholder="&#128272; " disabled=""/>

            
                   
                            </div>
                                 
                                 
                                <div class="col-md-1">
                                <label class="control-label" for="sucursal">Sucursal</label> 
                            </div>
                           <div class="col-md-2">
                         <input type="text" class="form-control" value="<%=sucursales%>" name="cbosucursal" id="cbosucursal" disabled=""/>
                            </div>
                             <div class="col-md-2">
                                <input type="hidden" value="" name="txtsucursal" id="txtsucursal" class="form-control" placeholder="&#128272; " disabled=""/>
                            </div>
                       <div class="col-md-1">
                                <label class="control-label" for="usuario">Usuario</label> 
                            </div>
                          <div class="col-md-2">
                                <input type="text" value="<%=usuario%>"  name="cbousuario" id="cbousuario" class="form-control" placeholder="&#128272; " disabled=""/>
                            </div>
                             <div class="col-md-2">
                                <input type="hidden" value="" value="<%=idusuario%>" name="txtusuarioo" id="txtusuarioo" class="form-control" placeholder="&#128272; " disabled=""/>
                            </div>
                        </div>
                                 </div>
              </div>
                            
                               <div class="panel panel-primary">
                            <div class="panel-heading"><strong>Detalles Cobro Tarjeta</strong></div>
                            <div class="panel-body">
                                <div class="form-group">
                                    <div class="col-md-1">
                                        <label class="control-label" for="factura">Factura a cobrar</label>
                                    </div>
                                    <div class="col-md-5">
                                        <select class="form-control chosen-select" name="cbofactura" id="cbofactura" disabled onchange="selectfactura();">
                                             <%
                                                 int iddd=0;
                                                ResultSet rsmercaderias = bd.consultar("select * from factura_venta where idfactura_v=nro_factura");
                                                while (rsmercaderias.next()) {
                                                   iddd=rsmercaderias.getInt("idfactura_v");
                                            %>

                                            <option value="<%= rsmercaderias.getString("idfactura_v")%>"><%= rsmercaderias.getString("nro_factura")%></option>


                                            <%
                                                }
                                            %>
                                        </select>
                            <%
                    
                    
                    int idfacturaa =0;
                    
                    ResultSet traer = bd.consultar("select * from factura_venta order by idfactura_v desc limit 1");
                    if(traer.next()) {
                            idfacturaa = traer.getInt("idfactura_v");
                        
                    }
                    %>
                                   <input type="hidden" value="<%=iddd%>"  name="cbocodigo" id="cbocodigo" class="form-control" placeholder="&#128272; " disabled=""/>

                                    </div>
                                    <div class="col-md-1">
                                        <label class="control-label" for="precio">Monto a Cobrar</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="number" class="form-control" name="txtpreciov" id="txtpreciov" disabled/>
                                    </div>
                                    <div class="col-md-1">
                                        <label class="control-label" for="cantidad">Monto Pagado</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="number" class="form-control" name="txtcantidad" id="txtcantidad"/>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="hidden" class="form-control" name="txt" id="txt"/>
                                    </div>

                              
                </div>
                                    <table class="table table-hover" id="grilla">
                                    <thead>
                                        <tr class="warning">
                                            <th>Código</th> 
                                            <th>Caja</th>
                                            <th>Fecha de Cobro</th>
                                            <th>Tipo de Cobro</th>
                                            <th>Sucursal</th>
                                            <th>Usuario</th>
                                            <th>Monto Total</th>
                                            <th>Monto Recibido</th>
                                            <th>Devolucion</th>
                                        </tr>
                                    </thead>
                                    <tbody>
    

                                    </tbody>
                                    <tfoot>

                                    </tfoot>
                                </table>      
                            </div>
                 </div>
                                 
                           
                        <div class="form-group">
                            <div class="col-md-2">
                                <input id="btnagregar" type="button" class="form-control btn-primary" value="IniciarCobro" onclick="iniciarcobro();"/>
                            </div>
                            
                            <div class="col-md-2">
                                <input id="btnborrar" type="button" class="form-control btn-danger" value="Borrar" onclick="borrar();"/>
                            </div>                
            
                            <div class="col-md-2">
                                <input id="btngrabar" type="button" class="form-control btn-success" value="Grabar" disabled="" onclick="validarcantidad()"/>
                            </div>
                            <div class="col-md-2">
                                <a href="MENUP.jsp"><input id="btnsalir" type="button" class="form-control btn-default" value="Salir"></a>
                            </div>



                      </div> 
                              
                                              

                            </div>
                        </div>            
                                        
                                        
             
                                        
                </div>
     
            </div>
                 <input type="hidden" id="operacion"/>
            </div>
        </div>
       
       
    </div>
            </section>
            
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="plugins/waypoints/waypoints.min.js"></script>
    <script src="js/application.js"></script>
    <script src="plugins/icheck/js/icheck.min.js"></script>
    <script src="plugins/validation/js/jquery.validate.min.js"></script>
    <script src="js/jquery-1.12.2.min.js"></script> 
        <script src="js/alertify.js"></script> 
       <script src="cobros.js"></script> 
    
        
        </section>
                            
    </body>
</html>
