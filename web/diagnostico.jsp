

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
    <link rel="stylesheet" href="css/bootstrap.min.css">
           <link rel="stylesheet" type="text/css" href="css/alertify.min.css">
    <link rel="stylesheet" type="text/css" href="css/alertify.core.css">
    <link rel="stylesheet" type="text/css" href="css/alertify.default.css">

    <link rel="stylesheet" href="css/main.css">
    <!-- iCheck-->
    <!-- Fonts -->

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
       <div class="brand">
                <a class="logo"><span>Joyeria</span>San</a>
            </div>
             <div class="brand">
                <a class="logo"><span>Joyeria</span>San</a>
            </div>
             <div class="brand">
                <a class="logo"><span>Joyeria</span>San</a>
            </div>
             <div class="brand">
                <a class="logo"><span>Joyeria</span>San</a>
            </div>
            
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
                    
                        <a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>Movimientos</span>
                            <i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                               
                    <li><a href="recepcion.html"><i class=""></i>&nbsp;&nbsp; RECEPCION</a></li>
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
                            <li><a href="#">Movimiento</a>
                            </li>
                            <li>Diagnositco</li>
                            
                         <div class="form-group">
                            <div class="col-md-4"></div>
                            
                            <div class="col-md-3">
                                <input type="text" name="txtbuscador" id="txtbuscador" class="form-control" placeholder="Ingrese datos a buscar"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btnbuscar" type="button" class="form-control btn-primary" value="Buscar" onclick="cargar_tabla($('#txtbuscador').val());$('#txtbuscador').val('');">
                            </div>
                        </div>
                        </ul>
                        <!--breadcrumbs end -->
                        <h1 class="h1">Diagnostico</h1>
                    </div>
                </div>
                <div class="row">
                       <%
                               Conexion cn = new Conexion();
                               cn.conectar();
                             
                                %>   
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

                            </div>
                               <div class="col-md-2">
                                <label class="control-label" for="estado">Estado</label> 
                            </div>
                            <div class="col-md-2">
                                <td>
               <select class="form-control chosen-select" name="cboestado" id="cboestado" disabled>
                            <option selected value="Pendiente">Pendiente</option>                          
                        </select>
                    </td>
                            </div>
                                 <div class="col-md-1">
                                <label class="control-label" for="recepcion">Recepcion</label>
                                 
                            </div>
                            <div class="col-md-3">
                                
                                <select class="form-control chosen-select"  name="cborecepcion" id="cborecepcion" disabled onchange="selectrecepcion();">
                                        <option selected="true" value="">
                                        Seleccionar
                                    </option> 
                                                                   
  
                                    <%
                                       ResultSet recepcion = cn.consultar("select * from recepcion where estado='Pendiente';");
                                        while (recepcion.next()) {
                                    %>

                                    <option value="<%= recepcion.getString("idrecepcion")%>"><%= recepcion.getString("idrecepcion")%></option>     

                                    <%
                                        }
                                    %>
                                    
                                </select>
                                  
                            </div>
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
  Visualizar
</button>
                 
                        </div>
                                 <div class="panel panel-primary">
                            <div class="panel-heading"><strong>Detalles</strong></div>
                            <div class="panel-body">
                                <div class="form-group">
                                    <div class="col-md-1">
                                        <label class="control-label" for="joya">Joya a reparar</label>
                                    </div>
                                    <div class="col-md-2">
                                        <select class="form-control chosen-select" name="cbojoyareparar" id="cbojoyareparar" disabled onchange="">
                                             <%
                                                ResultSet rsjoya = cn.consultar("select * from joyas_a_reparar order by idjoyarep");
                                                while (rsjoya.next()) {
                                            %>

                                            <option value="<%= rsjoya.getString("idjoyarep")%>"><%= rsjoya.getString("descripcion")%></option>


                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                          <div class="col-md-1">
                                <label class="control-label" for="problema">Problema</label> 
                            </div>
                            <div class="col-md-2">
                           <input  type="text" name="txtproblema" id="txtproblema" class="form-control" placeholder="" disabled/>
                            </div>   
                            <div class="col-md-1">
                                <label class="control-label" for="cantidad">Cantidad</label> 
                            </div>
                            <div class="col-md-2">
                           <input  type="number" name="txtcantidad" id="txtcantidad" class="form-control" placeholder="" disabled/>
                            </div> 
                                </div>
                                  <div class="form-group">
                                                   <div class="col-md-1">
                                        <label class="control-label" for="servicio">Servicios</label>
                                    </div>
                                    <div class="col-md-2">
                                        <select class="form-control chosen-select" name="cboservicio" id="cboservicio" disabled onchange="precioservicio();">
                                             <option selected="true" value="">
                                        Seleccionar
                                    </option>   
                                            <%
                                                ResultSet rsservicioo = cn.consultar("select * from precioservicios order by idservicio");
                                                while (rsservicioo.next()) {
                                            %>

                                            <option value="<%= rsservicioo.getString("idprecio")%>"><%= rsservicioo.getString("descripcion")%></option>


                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                    <div class="col-md-1">
                                        <label class="control-label" for="precio">Precio Servicio</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="number" class="form-control" name="txtprecios" id="txtprecios" disabled/>
                                    </div>
                            <div class="col-md-1">
                                        <label class="control-label" for="repuesto">Repuesto</label>
                                    </div>
                                    <div class="col-md-2">
                                        <select class="form-control chosen-select" name="cborepuesto" id="cborepuesto" disabled onchange="preciorepuesto();">
                                             <option selected="true" value="">
                                        Seleccionar
                                    </option>  
                                            <%
                                               
                                                ResultSet rsrepuesto = cn.consultar("select * from preciorepuestos order by idrepuesto");
                                                while (rsrepuesto.next()) {
                                                  //  idrepuesto= rsrepuesto.getInt("idrepuesto");
                                            %>

                                            <option value="<%= rsrepuesto.getString("idprecio")%>"><%= rsrepuesto.getString("descripcion")%></option>


                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                 <div class="col-md-1">
                                        <label class="control-label" for="precio">Precio Repuesto</label>
                                    </div>
                                    <div class="col-md-2">
                                        <input type="number" class="form-control" name="txtprecior" id="txtprecior" disabled/>
                                       <input type="hidden" class="form-control" name="x" id="x" disabled/>

                                    </div>
                            
               
                                
                            </div>
                                  
                                </div>
                             <div class="form-group">
                                <table class="table table-striped table-bordered" id="grilladiagnosticoo">
                                    <thead>
                                          <tr class="warning">
                                            <th>Código</th> 
                                            <th>Joya</th> 
                                            <th>Problema</th>
                                            <th>Cantidad</th>
                                            <th>idservicio</th>
                                            <th>Servicio</th>
                                            <th>Precio</th>
                                            <th>idrepuesto</th>
                                            <th>Repuesto</th>
                                            <th>Precio</th>
                                            <th></th>
                                        </tr>
                                                     
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
                                     
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
                                <input id="btncancelar" type="button" class="form-control btn-info" value="Cancelar" disabled="" onclick="cancelar();"/>
                            </div>
                            <div class="col-md-2">
                                <input id="btngrabar" type="button" class="form-control btn-success" value="Grabar" disabled="" onclick="guardar()"/>
                            </div>
                            <div class="col-md-2">
                                <a href="MENUP.jsp"><input id="btnsalir" type="button" class="form-control btn-default" value="Salir"></a>
                            </div>
                        </div>
                     
                         
                        </div>

           
                       <input type="hidden" id="operacion"/>
                    </form>
                </div>
            </div>
                
            </div>
        </div>

            </section>
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Joyas a ser Diagnosticadas</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <div class="form-group">
                                <table class="table table-striped table-bordered" id="grillamodal">
                                    <thead>
                                        <tr>
                                            <th class="warning">Orden de Recepcion</th>
                                            <th class="warning">Codigo</th>
                                            <th class="warning">Joya a reparar</th>
                                            <th class="warning">Cantidad</th>

                                        </tr>
                                                     
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
        <button type="button" class="btn btn-primary">Cargar en detalle</button>
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
                <script src="js/chosenselect.js"></script> 

        <script src="js/alertify.js"></script> 
       <script src="diagnostico.js"></script> 
    </body>
</html>
