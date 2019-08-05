<%-- 
    Document   : aperturacierre
    Created on : 20-jul-2018, 18:12:36
    Author     : MEC
--%>


<%@page import="prg.Conexion"%>
<%@page import="java.sql.ResultSet"%>
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
                            <li>Cierre de Caja</li>
                         
                        </ul>
                        <!--breadcrumbs end -->
                        <h1 class="h1">Cierre de Caja</h1>
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
                              <%
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
                                          
                                    %>
                              
                              <div class="col-md-2">
                                        <input type="hidden" class="form-control" value="<%=idapertura%>" name="txtcodigo" id="txtcodigo" disabled=""/>
                                    </div>
                                    <label class="control-label" for="fechaapertura" >Fecha Apertura</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="text" class="form-control" value="<%=fechaapertura%>" name="txtfechaapertura" id="txtfechaapertura" disabled=""/>
                                    </div>
                                    <div class="col-md-1">
                                        <label class="control-label" for="montoapertura">Monto Apertura</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="number" class="form-control" value="<%=montoapertura%>" name="txtmontoapertura" id="txtmontoapertura" disabled=""/>
                                    </div>
                           <div class="col-md-1">
                                <label class="control-label" for="sucursal">Sucursal</label> 
                            </div>
                           <div class="col-md-3">
                                <select class="form-control chosen-select" name="cbosucursal" id="cbosucursal" disabled="" >
                                    <%
                                        
                                        ResultSet rssucursal = cn.consultar("select * from sucursales order by idsucursal");
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
                                        <label class="control-label" for="fechacierre">Fecha Cierre</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="date" class="form-control" name="txtfechacierre" id="txtfechacierre" disabled=""/>
                                    </div>
                                   <%
                                        int mocierre=0;
                                        ResultSet rscierre = cn.consultar("select * from totalporapertura");
                                        if (rscierre.next()) {
                                            mocierre=rscierre.getInt("total");
                                        }
                                        %>
                                    <div class="col-md-1">
                                        <label class="control-label" for="montocierre">Monto Cierre</label>
                                   </div>
                                    <div class="col-md-2">
                                        <input type="number" class="form-control" value="<%=mocierre%>" name="txtmontocierre" id="txtmontocierre" disabled=""/>
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
                                                    String vse="";
                                                    if(idcaja == rscaja.getInt("idcaja")){
                                                        vse = "selected";
                                                    }else vse = "";
                                            %>

                                            <option <%out.println(vse);%> value="<%= rscaja.getString("idcaja")%>"><%= rscaja.getString("descripcion")%></option>

                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                 <div class="col-md-1">
                                <label class="control-label" for="ciudades">Usuario</label> 
                            </div>
                           <div class="col-md-3">
                                <select class="form-control chosen-select" name="cbousuario" id="cbousuario" disabled="">
                                    <%
                                        
                                        ResultSet rsusuario = cn.consultar("select * from usuario order by idusuario");
                                        while (rsusuario.next()) {
                                          String vse="";
                                                    if(idusuario == rsusuario.getInt("idusuario")){
                                                        vse = "selected";
                                                    }else vse = "";
                                    %>
                                    
                                    <option <%out.println(vse);%> value="<%= rsusuario.getString("idusuario") %>"><%= rsusuario.getString("usuario") %></option>     
                                  <%
                                        }
                                    %>
                                </select>
                            </div>
                                 <div class="col-md-1">
                                <label class="control-label" for="estado">Estado</label> 
                            </div>
                            <div class="col-md-2">
                                <td>
               <select class="form-control chosen-select" name="cestado" id="cestado" disabled>

                            <option selected value="true">Activo</option>
                            <option value="false">Inactivo</option>
                        </select>
                    </td>
                            </div>
                        </div>
                                
                                </div>
                                     
                            </div>
                        </div>  
                        
                        
                        <div class="form-group">
                            <div class="col-md-1"></div>
                           
                            <div class="col-md-2">
                                <input id="btncierre" type="button" class="form-control btn-warning" value="Cierre" onclick="cierre();"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btncancelar" type="button" class="form-control btn-info" value="Cancelar" disabled="" onclick="cancelar();"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btngrabar" type="button" class="form-control btn-success" value="Grabar" disabled="" onclick="grabaar()"/>     
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

       <script src="cierre.js"></script> 
    </body>
</html>
