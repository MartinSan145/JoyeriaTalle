<%-- 
    Document   : Ciudades
    Created on : 25-nov-2017, 13:49:41
    Author     : Martin
--%>

<%@page import="prg.Sesion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
                                           
                   
                          
                  
                     
                       
                     <% if(Sesion.perfil.toUpperCase().equals("ADMINISTRADOR")){ %>
                 <li class="sub-menu desactive">
                                
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>REFERENCIAL EMPRESA</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                               
                            <li><a href="Ciudades.jsp"><i class=""></i>&nbsp;&nbsp; Ciudades</a></li>
                            <li><a href="caja.jsp"><i class=""></i>&nbsp;&nbsp; Caja</a></li>
                            <li><a href="cargos.jsp"><i class=""></i>&nbsp;&nbsp; Cargos</a></li>
                            <li><a href="deposito.jsp"><i class=""></i>&nbsp;&nbsp; Deposito</a></li>
                            <li><a href="marcatarjeta.jsp"><i class=""></i>&nbsp;&nbsp; Marca Tarjeta</a></li>
                            <li><a href="Nacionalidad.jsp"><i class=""></i>&nbsp;&nbsp; Nacionalidad</a></li>
                            <li><a href="Niveles.jsp"><i class=""></i>&nbsp;&nbsp; Niveles</a></li>
                            <li><a href="sucursal.jsp"><i class=""></i>&nbsp;&nbsp; Sucursales</a></li>
                            <li><a href="Tipo Joya.jsp"><i class=""></i>&nbsp;&nbsp; Tipo de Joya</a></li>
                            <li><a href="tiposervicio.jsp"><i class=""></i>&nbsp;&nbsp; Servicios</a></li>

 </ul>
                    </li>
                   
                     <li class="sub-menu desactive">
                                
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>PRINCIPALES</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                                     
                            <li><a href="empleados.jsp"><i class=""></i>&nbsp;&nbsp; Empleados</a></li>
                            <li><a href="clientes.jsp"><i class=""></i>&nbsp;&nbsp; Clientes</a></li>
                            <li><a href="productos.jsp"><i class=""></i>&nbsp;&nbsp; Productos</a></li>
                            <li><a href="proveedores.jsp"><i class=""></i>&nbsp;&nbsp; Proveedores</a></li>
                            <li><a href="timbrado.jsp"><i class=""></i>&nbsp;&nbsp; Timbrado</a></li>
                            <li><a href="usuario.jsp"><i class=""></i>&nbsp;&nbsp; Usuario</a></li>
                            <li><a href="banco.jsp"><i class=""></i>&nbsp;&nbsp; Banco</a></li>
                            


 </ul>
                    </li>
                    
                     <li class="sub-menu desactive">
                                
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>REPORTES</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                                     
                            <li><a href='Imprimir.jsp?condicion=productos&nombre=productos'><i class=""></i>&nbsp;&nbsp; Productos</a></li>
                            <li><a href='Imprimir.jsp?condicion=clientes&nombre=clientes'><i class=""></i>&nbsp;&nbsp; Clientes</a></li>
                            <li><a href='Imprimir.jsp?condicion=empleado&nombre=empleado'><i class=""></i>&nbsp;&nbsp; Empleados</a></li>
                            <li><a href='Imprimir.jsp?condicion=proveedores&nombre=proveedores'><i class=""></i>&nbsp;&nbsp; Proveedores</a></li>

 </ul>
                    </li>
                
                  
                 
                 
                <% } %>

                                        
                     <% if(Sesion.perfil.toUpperCase().equals("VENDEDOR")){ %>
                    
                      
                    
                      <li class="sub-menu desactive">
                    
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>Movimiento VENTAS</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                              <li><a href="pedidos_ventas.jsp"><i class=""></i>&nbsp;&nbsp; Pedidos de Ventas</a></li>
                              <li><a href="ventass.jsp"><i class=""></i>&nbsp;&nbsp; FACTURA VENTA</a></li>

                            
 </ul>
                    </li>
                     <% } %>
                     
                      <% if(Sesion.perfil.toUpperCase().equals("ENCARGADOCOMPRA")){ %>
                     <li class="sub-menu desactive">
                       
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>Movimiento COMPRAS</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                               
                           <li><a href="pedidos_compra.jsp"><i class=""></i>&nbsp;&nbsp; Pedidos</a></li>
                           <li><a href="orden_compra.jsp"><i class=""></i>&nbsp;&nbsp; Orden de Compra</a></li>
                           <li><a href="factura_compra.jsp"><i class=""></i>&nbsp;&nbsp; Factura de Compra</a></li>




 </ul>
                    </li>
                   <% } %>
                   
                   <% if(Sesion.perfil.toUpperCase().equals("TECNICO")){ %>
                    <li class="sub-menu desactive">
                       
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>Movimiento Servicios</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                                <li><a href="recepcion.jsp"><i class=""></i>&nbsp;&nbsp; Recepcion</a></li>
                           <li><a href="diagnostico.jsp"><i class=""></i>&nbsp;&nbsp; Diagnostico</a></li>
                           <li><a href="presupuesto_servicio.jsp"><i class=""></i>&nbsp;&nbsp; Presupuesto</a></li>
                           <li><a href="orden_de_trabajo.jsp"><i class=""></i>&nbsp;&nbsp; Orden de Servicio</a></li>
                           <li><a href=".jsp"><i class=""></i>&nbsp;&nbsp; Factura Servicio</a></li>


 </ul>
                    </li>
                        <% } %>
                        
                        <% if(Sesion.perfil.toUpperCase().equals("CAJERO")){ %>
                   <li class="sub-menu desactive" id="menu">
                    
                           
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>Movimiento de Cobros</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul> 
                                
                                <li><a href="aperturacierre.jsp"><i class=""></i>&nbsp;&nbsp; APERTURA DE CAJA</a></li>
                                <li><a href="cobros.jsp"><i class=""></i>&nbsp;&nbsp; CIERRE DE CAJA</a></li>
                                <li><a href="cobros.jsp"><i class=""></i>&nbsp;&nbsp; COBROS</a></li>

                           
 </ul>
                    </li>
                    <% } %>
                    
                     <li class="sub-menu">
                        <a href="login.jsp"><i class="fa fa-cogs"></i><span>Salir</span><i class="arrow fa fa-angle-right pull-right"></i></a>
                        <ul>

                        </ul>
                    </li>
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
                            <li><a href="MENUP.jsp">MENU</a>
                            </li>
                            <li>BIENVENIDO</li>
                        
                        </ul>
                        <!--breadcrumbs end -->
                        
                        <div class="full-reset" >
                            <center>
                              
                            <figure>
                                <center>
                                <img src="img/joyeriasan.jpg" alt="Biblioteca" class="img-responsive center-box" style="width:100%;">
                                </center>
                                </figure>
                            </center>
                <p class="text-center" style="padding-top: 15px;">SystemOro</p>
            </div>
                    </div>
                </div>
             
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
    <script src="plugins/validation/js/jquery.validate.min.js"></script>
    <script src="js/jquery-1.12.2.min.js"></script> 
        <script src="js/bootstrap.min.js"></script> 
        <script src="js/alertify.js"></script> 
       
    </body>
</html>
