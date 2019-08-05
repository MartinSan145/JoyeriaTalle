<%-- 
    Document   : aperturacierre
    Created on : 20-jul-2018, 18:12:36
    Author     : MEC
--%>

<%@page import="prg.Sesion"%>
<%@page import="prg.Metodo"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="prg.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apertura y Cierre de Caja</title>
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
    </head>
    <body>
        
        <section id="container">
      
            <aside class="sidebar">
            <div id="leftside-navigation" class="nano">
                <ul class="nano-content">
                    <header id="header">
                    <div class="brand">
                <a class="logo"><span>Joyeria</span>San</a>
                 
            </div>
                        </header>
                    <li class="sub-menu">
                        <a href="javascript:void(0);"><i class="fa fa-cogs"></i><span>Menu</span><i class="arrow fa fa-angle-right pull-right"></i></a>
                        <ul>

                        </ul>
                    </li>
                 
                    <li class="sub-menu desactive">
                    
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>Apertura y Cierre de Caja</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                               
                            <li><a href="CIERRE.jsp"><i class=""></i>&nbsp;&nbsp; Cierre de Caja</a></li>
                            
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
            <section class="main-content-wrapper">
            <section id="main-content">
                <div class="row">
                    <div class="col-md-12">
                        <!--breadcrumbs start -->
                        <ul class="breadcrumb">
                            <li><a href="#">Referencial</a>
                            </li>
                            <li>Apertura de Caja</li>
                         
                        </ul>
                        <!--breadcrumbs end -->
                        <h1 class="h1">Apertura de Caja</h1>
                        <div class="col-md-3">
                                <input type="text" name="txtbuscador" id="txtbuscador" class="form-control" placeholder="Ingrese datos a buscar"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btnbuscar" type="button" class="form-control btn-primary" value="Buscar" onclick="cargar_tabla($('#txtbuscador').val());$('#txtbuscador').val('');">
                            </div>
                    </div>
                </div>
                 <div class="row">
                     <div class="col-md-2"></div>
                            
                        </div>
                      <div class="container-fluid">
            <div class="container-flat-form">
              
                
              <div class="row">
                <div class="col-md-12">

                    <form id="formulario" class="form-horizontal" role="form">
                        <div class="form-group">
                          <div class="col-md-1">
                                <label class="control-label" for="codigo">Código</label> 
                            </div>
                            <div class="col-md-2">
                           <input  type="text" name="txtcodigo" id="txtcodigo" class="form-control" placeholder="&#128272; Autoincrementable" disabled/>

                            </div>
                           <div class="col-md-1">
                                <label class="control-label" for="sucursal">Sucursal</label> 
                            </div>
                           <div class="col-md-3">
                                <select class="form-control chosen-select" name="cbosucursal" id="cbosucursal" disabled="" >
                                    <%
                                        Conexion cn = new Conexion();
                                        cn.conectar();
                                        ResultSet rssucursal = cn.combo("select * from sucursales order by idsucursal");
                                        while (rssucursal.next()) {
                                          
                                    %>
                                    
                                    <option value="<%= rssucursal.getString("idsucursal") %>"><%= rssucursal.getString("descripcion") %></option>     
                                  <%
                                        }
                                    %>
                                </select>
                            </div>
                                
                        </div>
                       <div class="panel panel-primary" name="hola" id="hola" for="hola">
                            <div class="panel-heading"><strong>Cierre de Caja</strong></div>
                            <div class="panel-body">
                                <div class="form-group">
                                     <div class="col-md-1">
                                        <label class="control-label" for="fechaapertura">Fecha Apertura</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="date" class="form-control" name="txtfechaapertura" id="txtfechaapertura" value="<%= Metodo.formatoFecha(new java.util.Date())%>" disabled=""/>
                                    </div>
                                    <div class="col-md-1">
                                        <label class="control-label" for="montoapertura">Monto Apertura</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="number" class="form-control" name="txtmontoapertura" id="txtmontoapertura" disabled=""/>
                                    </div>
                                    
                                   </div>
                                      <div class="form-group">
                            
                            <div class="col-md-1">
                                        <label class="control-label" for="caja">Caja</label>
                                    </div>
                                    <div class="col-md-2">
                                        <select class="form-control chosen-select" name="cbocaja" id="cbocaja" disabled>
                                            <%
                                                ResultSet rscaja = cn.consultar("select * from caja order by idcaja");
                                                while (rscaja.next()) {
                                            %>

                                            <option value="<%= rscaja.getString("idcaja")%>"><%= rscaja.getString("idcaja")%></option>

                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                 <div class="col-md-1">
                                <label class="control-label" for="ciudades">Usuario</label> 
                            </div>
                           <div class="col-md-3">
                             <input type="text" value="<%=Sesion.perfil%>" class="form-control chosen-select" name="cbousuarioo" id="cbousuarioo" disabled>
                             <input type="hidden" value="<%=Sesion.codigo_usuario%>" class="form-control chosen-select" name="cbousuario" id="cbousuario" disabled>  
                                           
                            </div>
                               
                        </div>
                                
                                </div>
                                     
                            </div>
                        </div>  
                        
                        
                        <div class="form-group">
                            <div class="col-md-1"></div>
                           <div class="col-md-2">
                                <input id="btnnuevo" type="button" class="form-control btn-primary" value="Apertura" onclick="apertura();"/>
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
                        
                      
                     
                      
                      

           
                        <input type="hidden" id="operacion"/>
                    </form>
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
    <script src="js/jquery-1.12.2.min.js"></script> 
        <script src="js/bootstrap.min.js"></script> 
        <script src="js/chosenselect.js"></script> 
        <script src="js/alertify.js"></script> 

       <script src="apertura.js"></script> 
    </body>
</html>
