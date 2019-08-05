<%-- 
    Document   : presupuesto_servicio
    Created on : 29-nov-2017, 13:49:41
    Author     : Martin
--%>

<%@page import="prg.Metodo"%>
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
    <link rel="stylesheet" href="css/bootstrap.min.css">    
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
                           <li><a href="recepcion.jsp"><i class=""></i>&nbsp;&nbsp; RECEPCION</a></li>
                     <li><a href="diagnostico.jsp"><i class=""></i>&nbsp;&nbsp; DIAGNOSTICO</a></li>
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
                            <li>Presupuesto</li>
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
                        <h1 class="h1">Elaboracion de Presupuesto</h1>
                    </div>
                </div>
             
                    
                      <div class="container-fluid">
            <div class="container-flat-form">
           
                <%
                    Conexion bd = new Conexion();
                    bd.conectar();
            
                    %>
              <div class="row">
                <div class="col-md-12">
                    <form id="formulario" class="form-horizontal" role="form">
                        <div class="form-group">
                            <div class="col-md-1">
                                <label class="control-label" for="codigo">Código</label> 
                            </div>
                            <div class="col-md-1">
                           <input  type="text" name="txtcodigo" id="txtcodigo" class="form-control" placeholder="&#128272; Autoincrementable" disabled/>
                            </div>
                            <div class="col-md-1">
                                <label class="control-label" for="fecha">Fecha</label>
                            </div>
                            <div class="col-md-3">
                                <input type="date" class="form-control" name="txtfecha" id="txtfecha" value="<%=Metodo.formatoFecha(new java.util.Date())%>" disabled/>
                            </div>
                               <div class="col-md-1">
                                <label class="control-label" for="usuario">Usuario</label>
                            </div>
                             <div class="col-md-2">
                               <input type="text" class="form-control" name="cbousuario" id="cbousuario" value="" disabled/>
                            </div>
                            
                           <div class="col-md-1">
                                <label class="control-label" for="cbocliente">Cliente</label>
                            </div>
                            <div class="col-md-2">
                                <select class="form-control chosen-select" name="cbocliente" id="cbocliente" disabled>
                                    <%
                                        ResultSet rsoc = bd.consultar("select * from clientesrecepcionados order by idrecepcion");
                                        while (rsoc.next()) {
                                    %>

                                    <option value="<%= rsoc.getString("idrecepcion")%>"><%= rsoc.getString("nombre")%></option>     

                                    
                                    <%
                                        }
                                    %>
                                </select>
                            </div>
                                </div>
                                <div class="form-group">
                                           <div class="col-md-1">
                                <label class="control-label" for="codigo">Estado</label> 
                            </div>
                            <div class="col-md-2">
                           <input  type="text" value="Pendiente" name="txtestado" id="txtestado" class="form-control"  disabled/>
                            </div>
                            <div class="col-md-1">
                                <label class="control-label" for="cbodiagnostico">Orden de Diagnostico</label>
                            </div>
                            <div class="col-md-3">
                                <select class="form-control chosen-select" name="cbodiagnostico" id="cbodiagnostico" onchange="selectdiagnostico();" disabled>
                                    <option selected="true" value="">
                                        Seleccionar
                                    </option> 
                                    <%
                                        
                                        ResultSet diag = bd.consultar("select * from diagnostico where estado='Pendiente'");
                                       while (diag.next()) {
                                    %>

                                    <option value="<%= diag.getString("iddiagnostico")%>"><%= diag.getString("iddiagnostico")%></option>     

                                    <%
                                        }
                                    %>
                                </select>
                   
                            </div>
                                <button type="button" class="btn btn-primary" name="btnvisualizar" id="btnvisualizar" data-toggle="modal" data-target="#exampleModal" disabled="">
  Visualizar
</button>
                          
                                </div>
              
                        </div>
                          
                   
                
                
                        
                      
                            
                           
                            
                        </div>
                        
           
                        <input type="hidden" id="operacion"/>
                       
                      <div class="form-group">
                            <div class="col-md-2">
                                <input id="btnnuevo" type="button" class="form-control btn-primary" value="Nuevo" onclick="nuevoo();"/>
                            </div>               
                            <div class="col-md-2">
                                <input id="btncancelar" type="button" class="form-control btn-info" value="Cancelar" disabled="" onclick="cancelar();"/>
                            </div>
                            <div class="col-md-2">
                                <a href="MENUP.jsp"><input id="btnsalir" type="button" class="form-control btn-default" value="Salir"></a>
                            </div>
                        </div>
                            <div class="form-group">
                              <table class="table table-striped table-bordered" id="grilladiagnosticoo">
                                    <thead>
                                        <tr>
                                            <th>Código</th> 
                                            <th>Fecha</th> 
                                             <th>Nro. Diagnostico</th> 
                                              <th>Estado</th> 
                                            <th>Joya</th>
                                            <th>Cantidad</th>
                                            <th>Servicio</th>
                                            <th>Precio U.</th>
                                            <th>Repuesto</th>
                                            <th>Precio U.</th>>
                                            <th></th>    
                                        </tr>
                                                     
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
                          
                        </div>

                    </form>
                </div>
          
      
            </section>
      

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel"></h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <div class="panel panel-primary">
            <div class="panel-heading"><strong>Detalles Presupuesto</strong></div> 
                   
                           
                                <table class="table table-grillamodalhover-lg" id="grillamodal">
                                    <thead>
                                        <tr class="alert-warning">
                                            <th hidden>Código</th> 
                                            <th>IdJoya</th>
                                            <th>Joya</th>
                                            <th>Cantidad</th>
                                            <th>IdServicio</th>
                                            <th>Servicio</th>
                                            <th>Precio U.</th>
                                            <th>Precio Total</th>
                                            <th>Idrepuesto</th>
                                            <th>Repuesto</th>
                                            <th>Precio U.</th>
                                            <th>Precio Total</th>        
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
    

                                    </tbody>
                                    <tfoot>

                                    </tfoot>
                                </table>      
            </div>
      </div>
       
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
        <button type="button" class="btn btn-primary" onclick="guardarr()">Cargar en detalle </button>
      </div>
    </div>
  </div>
</div>
            
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
       <script src="presupuesto.js"></script> 
    </body>
</html>
