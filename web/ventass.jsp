<%-- 
    Document   : ventas
    Created on : 28-nov-2017, 13:49:41
    Author     : Martin
--%>

<%@page import="prg.Sesion"%>
<%@page import="prg.Metodo"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="prg.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

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
                <div class="toggle-navigation toggle-above">
                    <button type="button" class="btn btn-default" id="toggle-left" data-toggle="tooltip" data-placement="right" title="Pantalla Completa">

                        <i class="fa fa-bars"></i>

                    </button>
                    <img src="img/Captura.PNG" border="0" width="1050" height="75">
                </div>

            </header>

            <!--sidebar start-->
            <aside class="sidebar">
                <div id="leftside-navigation" class="nano">
                    <ul class="nano-content">

                        <li class="sub-menu">
                            <a href="javascript:void(0);"><i class="fa fa-cogs"></i><span>Menu</span><i class="arrow fa fa-angle-right pull-right"></i></a>
                            <ul>
                                <li><a href="ultimasfacturas.jsp"><i class=""></i>&nbsp;&nbsp; Facturas</a></li>

                            </ul>
                        </li>



                        <script LANGUAGE="JavaScript">
                            function ponerMayuscula(nombre) {
                                nombre.value = nombre.value.toUpperCase();
                            }
                        </script>


                    </ul>
                </div>

            </aside>
            <!--sidebar end-->
            <!--main content start-->

        </section>
        <section class="main-content-wrapper">
            <section id="main-content">
                <div class="row">
                    <div class="col-md-12">
                        <!--breadcrumbs start -->
                        <ul class="breadcrumb">
                            <li><a href="#">Movimiento</a>
                            </li>

                            <h1 class="h1">Factura Venta</h1>

                        </ul>
                        <!--breadcrumbs end -->

                    </div>
                </div>
                <div class="row">

                    <div class="container-fluid">
                        <div class="container-flat-form">


                            <div class="row">
                                <div class="col-md-12">
                                    <form action="operaciones_bd" method="post" class="form-horizontal">  
                                        <div class="form-group">
                                            <div class="col-md-1">
                                                <label class="control-label" for="codigo">Código</label>
                                            </div>
                                            <div class="col-md-1">
                                                <input type="text" class="form-control" name="txtcodigo" id="txtcodigo"  disabled/>
                                            </div>
                                            <input  type="hidden" value="PENDIENTE" name="idestado" id="idestado" class="form-control" placeholder="&#128272; Autoincrementable" disabled/>


                                            <div class="col-md-1">
                                                <label class="control-label" for="fecha">Fecha Venta</label>
                                            </div>
                                            <div class="col-md-2">
                                                <input type="date" class="form-control" name="txtfecha" id="txtfecha" value="<%= Metodo.formatoFecha(new java.util.Date())%>" disabled/>

                                            </div>
                                            <div class="col-md-1">
                                                <label class="control-label" for="nrofactura">Nro. Factura</label>
                                            </div>
                                            <div class="col-md-2">
                                                <%
                                                    Conexion cn = new Conexion();
                                                    cn.conectar();
                                                    int id = 0;
                                                    int tim = 0;

                                                    ResultSet traertim = cn.consultar("select * from timbrado where estado=TRUE");
                                                    while (traertim.next()) {
                                                        tim = traertim.getInt("descripcion");
                                                        id = traertim.getInt("idtimbrado");
                                                    }
                                                %>
                                                <input type="text" class="form-control" name="txtnrofactura" id="txtnrofactura" placeholder="Autogenerado" disabled/>
                                            </div>
                                            <div class="col-md-1">
                                                <label class="control-label" for="timbrado">Timbrado</label>
                                            </div>
                                            <div class="col-md-2">
                                                <input type="hidden" value="<%=id%>" class="form-control" name="cbotimbrado" id="cbotimbrado" disabled="">
                                                <input type="text" value="<%=tim%>" class="form-control" name="timbradodescri" id="timbradodescri" disabled="">

                                                </select>
                                            </div>

                                        </div>

                                        <div class="form-group">
                                            <div class="col-md-1">
                                                <label class="control-label" for="cbocliente">Cliente</label>
                                            </div>
                                            <div class="col-md-2">
                                                <select class="form-control chosen-select" name="cbocliente" id="cbocliente" disabled>
                                                    <%
                                                        ResultSet rsoc = cn.consultar("select * from clientes order by idcliente");
                                                        while (rsoc.next()) {
                                                    %>

                                                    <option value="<%= rsoc.getString("idcliente")%>"><%= rsoc.getString("nombre")%></option>     

                                                    <%
                                                        }
                                                    %>
                                                </select>
                                                
                                            </div>
                                                <div class="col-md-1"><label class="btn btn-sm btn-success" onclick="abrir_modal()" >Agregar</label></div>
                                            <div class="col-md-1">
                                                <label class="control-label" for="usuario">Usuario</label>
                                            </div>
                                            <div class="col-md-3">
                                                <input type="text" value="<%=Sesion.perfil%>" class="form-control chosen-select" name="cbousuarioo" id="cbousuarioo" disabled>
                                                <input type="hidden" value="<%=Sesion.codigo_usuario%>" class="form-control chosen-select" name="cbousuario" id="cbousuario" disabled>  
                                            </div>

                                            <div class="col-md-1">
                                                <label class="control-label" for="cbodeposito">Deposito</label>
                                            </div>
                                            <div class="col-md-3">
                                                <select class="form-control chosen-select" name="cbodeposito" id="cbodeposito" >
                                                    <%
                                                        ResultSet dep = cn.consultar("select * from deposito order by iddeposito");
                                                        while (dep.next()) {
                                                    %>

                                                    <option value="<%= dep.getString("iddeposito")%>"><%= dep.getString("descripcion")%></option>     

                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </div>
                                            <div class="col-md-2">
                                                <%
                                                    int apertura = 0;
                                                    Conexion ap = new Conexion();
                                                    ap.conectar();
                                                    ResultSet m = ap.consultar("select * from apertura_cierre where fecha_apertura = current_date");
                                                    while (m.next()) {
                                                        apertura = m.getInt("id_apertura");
                                                    }
                                                %>
                                                <input type="hidden" value="<%=apertura%>" class="form-control" name="cboapertura" id="cboapertura" disabled="">


                                            </div>
                                        </div>
                                        <div class="form-group">


                                            <div class="col-md-1">
                                                <label class="control-label" for="cbopedido">Pedido</label>
                                            </div>
                                            <div class="col-md-3">
                                                <select class="form-control chosen-select" name="cbopedido" id="cbopedido" disabled onchange="selectpedidoventa();">
                                                    <option selected="true" value="">
                                                        Seleccionar
                                                    </option> 

                                                    <%
                                                        ResultSet pedido = cn.consultar("select * from pedido_venta where estado='Pendiente';");
                                                        while (pedido.next()) {
                                                    %>

                                                    <option value="<%= pedido.getString("idpedido")%>"><%= pedido.getString("idpedido")%></option>     

                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </div>




                                        </div>
                                        <div class="panel panel-primary">
                                            <div class="panel-heading"><strong>Detalles</strong></div>
                                            <div class="panel-body">
                                                <div class="form-group">
                                                    <div class="col-md-1">
                                                        <label class="control-label" for="producto">Producto</label>
                                                    </div>
                                                    <div class="col-md-5">
                                                        <select class="form-control chosen-select" name="cboproducto" id="cboproducto" disabled onchange="selectproductoss();">
                                                            <%
                                                                ResultSet rsmercaderias = cn.consultar("select * from precioproductos order by idproducto");
                                                                while (rsmercaderias.next()) {
                                                            %>

                                                            <option value="<%= rsmercaderias.getString("idprecio")%>"><%= rsmercaderias.getString("descripcion")%></option>


                                                            <%
                                                                }
                                                            %>
                                                        </select>
                                                    </div>
                                                    <div class="col-md-1">
                                                        <label class="control-label" for="precio">Precio</label>
                                                    </div>
                                                    <div class="col-md-2">
                                                        <input type="number" class="form-control" name="txtpreciov" id="txtpreciov" disabled/>
                                                    </div>
                                                    <div class="col-md-1">
                                                        <label class="control-label" for="cantidad">Cantidad</label>
                                                    </div>
                                                    <div class="col-md-2">
                                                        <input type="number" class="form-control" name="txtcantidad" id="txtcantidad"/>
                                                    </div>

                                                </div>

                                                <table class="table table-hover" id="grilla">
                                                    <thead>
                                                        <tr class="warning">
                                                            <th>Código</th> 
                                                            <th>Descripción</th>
                                                            <th>Cantidad</th>
                                                            <th>Precio U.</th>
                                                            <th>Precio T.</th>

                                                            <th>Iva 10%</th>
                                                            <th></th>
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
                                                <input id="btnnuevo" type="button" class="form-control btn-primary" value="Nuevo" onclick="agregar();"/>
                                            </div>
                                            <div class="col-md-2">
                                                <input id="btnmodificar" type="button" class="form-control btn-warning" value="Modificar" onclick="modificar();"/>
                                            </div>
                                            <div class="col-md-2">
                                                <input id="btnborrar" type="button" class="form-control btn-danger" value="Anular" onclick="borrar();"/>
                                            </div>
                                            <div class="col-md-2">
                                                <input id="btncancelar" type="button" class="form-control btn-info" value="Cancelar" disabled="" onclick="cancelar();"/>
                                            </div>
                                            <div class="col-md-2">
                                                <input id="btngrabar" type="button" class="form-control btn-success" value="Grabar" disabled="" onclick="grabar();"/>
                                            </div>
                                            <div class="col-md-2">
                                                <a href="MENUP.jsp"><input id="btnsalir" type="button" class="form-control btn-default" value="Salir"></a>
                                            </div>


                                        </div> 



                                </div>
                            </div>            




                        </div>
 <div class="form-group">
                                <table class="table table-striped table-bordered" id="grilla2">
                                    <thead>
                                        <tr>
                                            <th class="warning">Código</th>
                                            <th class="warning">Fecha</th>
                                            <th class="warning">Nro Factura</th>
                                            <th class="warning">Cliente</th>
                                            <th class="warning">Caja</th>
                                           
                                        </tr>
                                                     
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
                    </div>
                    <input type="hidden" id="operacion"/>
                </div>



                <div class="modal fade" id="modal_cliente" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="modal_cliente_title">Agregar Cliente</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>

                            <div class="modal-body">

                                <label class="control-label" for="nombre">Nombre</label> 
                                
                                <input type="text" name="txtcodigocliente" id="txtcodigocliente" class="form-control"/>

                                <input type="text" name="txtnombre" id="txtnombre" class="form-control" placeholder="&#128272; Ingrese Nombre"  onblur="ponerMayuscula()"/>


                                <label class="control-label" for="apellido">Apellido</label> 


                                <input type="text" name="txtapellido" for="apellido" id="txtapellido" class="form-control" placeholder="&#128272; Ingrese Apellido"  onblur="ponerMayuscula()"/>


                                <label class="control-label" for="cedula">Cedula</label> 


                                <input type="number" name="txtcedula" id="txtcedula" class="form-control" placeholder="&#128272; Ingrese Cedula"  onblur="ponerMayuscula()"/>

                                <label class="control-label" for="email">Email</label> 

                                <input  type="text" name="txtemail" id="txtemail" class="form-control" placeholder="&#128272; Ingrese email" />

                                <label class="control-label" for="direccion">Direccion</label> 


                                <input type="text" name="txtdireccion" id="txtdireccion" class="form-control" placeholder="&#128272; Ingrese direccion"  onblur="ponerMayuscula()"/>


                                <label class="control-label" for="telefono">Telefono</label> 


                                <input type="number" name="txttelefono" id="txttelefono" class="form-control" placeholder="&#128272; Ingrese direccion"  onblur="ponerMayuscula()"/>


                                <label class="control-label" for="ciudad">Ciudad</label> 

                                <select class="form-control chosen-select" name="cbociudad" id="cbociudad">
                                    <%
                                        ResultSet rsciudades = cn.consultar("select * from ciudades order by idciudad");
                                        while (rsciudades.next()) {

                                    %>

                                    <option value="<%= rsciudades.getString("idciudad")%>"><%= rsciudades.getString("descripcion")%></option>     
                                    <%
                                        }
                                    %>
                                </select>
                                
                                <label class="control-label" for="nacionalidad">Pais</label> 
                                
                                <select class="form-control chosen-select" name="cbonacionalidad" id="cbonacionalidad" >
                                    <%
                                        Conexion n = new Conexion();
                                        n.conectar();
                                        ResultSet rsnacio = n.consultar("select * from nacionalidad order by idnacionalidad");
                                        while (rsnacio.next()) {

                                    %>

                                    <option value="<%= rsnacio.getString("idnacionalidad")%>"><%= rsnacio.getString("descripcion")%></option>     
                                    <%
                                        }
                                    %>
                                </select>

 <input type="hidden" id="operacion"/>
                            </div>
 
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                <button type="button" class="btn btn-primary" onclick="grabarclientee()" >Grabar </button>
                            </div>
                        </div>
                    </div>
                </div>


            </section>
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
        <script src="js/chosenselect.js"></script> 

        <script src="js/alertify.js"></script> 
        <script src="js/alertify.js"></script> 

        <script src="grabarcliente.js"></script> 
        <script src="venta.js"></script> 
        <script>
                                    $(document).ready(function () {
                                        comprobarApertura();
                                    });
                                    function abrir_modal(){
                                        $("#modal_cliente").modal("show");
                                    }
        </script>
    </body>
</html>
