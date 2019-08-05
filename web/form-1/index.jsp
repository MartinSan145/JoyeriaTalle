<%-- 
    Document   : index
    Created on : 22-ago-2018, 17:41:42
    Author     : MEC
--%>

<%@page import="prg.Sesion"%>
<%
    Sesion.codigo_sucursal = "";
    Sesion.codigo_usuario = "";
    Sesion.nombre_funcionario = "";
    Sesion.nombre_sucursal = "";
    Sesion.nombre_usuario = "";
    Sesion.perfil = "";
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SOFTWARE SYSTEMOro</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                   
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>SYSTEMOro</strong> Acceso</h1>
                            <div class="description">
                            	<p>
                                        
                                        Sistema de Gestion de Compra, Ventas y Servicios
                                        JOYERIA SAN RAMON                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Inicia sesion para acceder al sistema</h3>
                            		<p>Ingresa su usuario y contraseña</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-key"></i>
                        		</div>
                            </div>
                          
                               <div class="form-bottom">
                                   <form action="acceso" class="form-signin" method="post">
                <label class="sr-only" for="txtusuario">Usuario</label>
                <input type="text" id="txtusuario" name="txtusuario" class="form-control" required placeholder="Ingrese Usuario" autofocus/>
                <label class="sr-only" for="txtpass">Contraseña</label>
                <input type="password" id="txtpass" name="txtpass" class="form-control" required placeholder="Ingrese Contraseña"/>
               <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button></a>


        </form>

            
        </div>
                        </div>
                    </div>
                    
                </div>
            </div>
            
        </div>


        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>
                <script src="js/bootstrap.min.js"></script>

                <script src="js/jquery-1.12.2.min.js"></script>

        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>