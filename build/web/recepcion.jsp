<%-- 
    Document   : recepcion
    Created on : 06-dic-2017, 10:26:41
    Author     : Martin
--%>

<%@page import="prg.Metodo"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="prg.Conexion"%>
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
                    
                    <li class="sub-menu">
                        <a href="javascript:void(0);"><i class="fa fa-cogs"></i><span>Menu</span><i class="arrow fa fa-angle-right pull-right"></i></a>
                        <ul>

                        </ul>
                    </li>
                 
                    <li class="sub-menu desactive">
                    
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>Referenciales</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                               
                            <li><a href="diagnostico.jsp"><i class=""></i>&nbsp;&nbsp; DIAGNOSTICO</a></li>
                             <li><a href="presupuesto.jsp"><i class=""></i>&nbsp;&nbsp; PRESUPUESTO</a></li>
                            <li><a href="servicios.jsp"><i class=""></i>&nbsp;&nbsp; Servicios</a></li>
                            <li><a href="tipo_servicio.jsp"><i class=""></i>&nbsp;&nbsp; Tipo de Servicio</a></li>
                            <li><a href="repuestos.jsp"><i class=""></i>&nbsp;&nbsp; Repuestos</a></li>
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
                            <li>Recepcion</li>
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
                        <h1 class="h1">Recepcion</h1>
                    </div>
                </div>
                <div class="row">
                    
                      <div class="container-fluid">
            <div class="container-flat-form">
              
                
              <div class="row">
                <div class="col-md-12">

                    <form id="formulario" class="form-horizontal" role="form">
                        <div class="form-group">
                            <div class="col-md-1">
                                <label class="control-label" for="codigo">Código</label> 
                            </div>
                            <div class="col-md-1">
                           <input  type="text" name="txtcodigo" id="txtcodigo" class="form-control" placeholder="&#128272; Autoincrementable" disabled/>
                              <input  type="hidden" name="txtcod" id="txtcod" class="form-control" placeholder="&#128272; Autoincrementable" disabled/>
                            </div>
                            <div class="col-md-1">
                                <label class="control-label" for="fecha">Fecha</label>
                            </div>
                            <div class="col-md-3">
                                <input type="date" class="form-control" name="txtfecha" id="txtfecha" value="<%= Metodo.formatoFecha(new java.util.Date())%>" disabled/>
                            </div>
                             <div class="col-md-1">
                                <label class="control-label" for="cliente">Cliente</label> 
                            </div>
                           <div class="col-md-2">
                                <select class="form-control" name="cbocliente" id="cbocliente" disabled="" >
                                    <%
                                        Conexion cn = new Conexion();
                                        cn.conectar();
                                        ResultSet rscliente = cn.combo("select * from clientes order by idcliente");
                                        while (rscliente.next()) {
                                          
                                    %>
                                    
                                    <option value="<%= rscliente.getString("idcliente") %>"><%= rscliente.getString("nombre") %></option>     
                                  <%
                                        }
                                    %>
                                </select>
                            </div> 
                        </div>
                          
                                       <div class="panel panel-primary">
                            <div class="panel-heading"><strong>Recepcion de Joyas a Reparar</strong></div>
                            <div class="panel-body">
                                <div class="form-group">
                                      <div class="col-md-1">
                                        <label class="control-label" for="producto">Producto</label>
                                    </div>
                                    <div class="col-md-5">
                                        <select class="form-control chosen-select" name="cbojoyareparar" id="cbojoyareparar" disabled onchange="">
                                             <%
                                                ResultSet rsmercaderias = cn.consultar("select * from joyas_a_reparar order by idjoyarep");
                                                while (rsmercaderias.next()) {
                                            %>

                                        <option value="<%= rsmercaderias.getString("idjoyarep")%>"><%= rsmercaderias.getString("descripcion")%></option> 


                                            <%
                                               }
                                            %>
                                        </select>
                                    </div>
                                    
                                    <div class="col-md-1">
                                        <label class="control-label" for="cantidad">Cantidad</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="number" class="form-control" name="txtcantidad" id="txtcantidad"/>
                                       <input type="hidden" class="form-control" name="txt" id="txt"/>
                                    </div>
                               
                                </div>
                                       <table class="table table-hover" id="grilladetalle1">
                                    <thead>
                                        <tr class="warning">
                                            <th>Código</th> 
                                            <th>Joya a reparar</th>
                                            <th>Cantidad</th>                                          
                                            <th></th>
                                        </tr>
                                    </thead>
                                    
                                    <tbody>
                                        
                                    </tbody>
                               
                                </table>   
                                     
                            </div>
                 </div>
                   </div>   
                    
                        <div class="form-group">
                            
                            <div class="col-md-2">
                                <input id="btnnuevo" type="button" class="form-control btn-primary" value="Nuevo" onclick="Nuevo();"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btnmodificar" type="button" class="form-control btn-warning" value="Modificar" onclick="modificar();"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btnborrar" type="button" class="form-control btn-danger" value="Borrar" onclick="borrar();"/>
                            </div>                
                            <div class="col-md-2">
                                <input id="btncancelar" type="button" class="form-control btn-info" value="Cancelar" disabled="" onclick="cancelar();"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btngrabar" type="button" class="form-control btn-success" value="Grabar" disabled="" onclick="grabar()"/>
                            </div>
                            <div class="col-md-2">
                                <a href="MENUP.jsp"><input id="btnsalir" type="button" class="form-control btn-default" value="Salir"></a>
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
        <script src="js/bootstrap.min.js"></script> 
          <script src="js/chosenselect.js"></script> 
        <script src="js/alertify.js"></script> 
       <script src="recepcion.js"></script> 
    </body>
</html>
