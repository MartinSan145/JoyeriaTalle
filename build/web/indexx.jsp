<%-- 
    Document   : index
    Created on : 26/09/2018, 08:49:50 PM
    Author     : Martin
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
     
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="form-1/assets/css/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="form-1/assets/css/form-elements.css">
        <link rel="stylesheet" href="form-1/assets/css/style.css">
        <link rel="shortcut icon" href="form-1/assets/ico/favicon.png">
        

    </head>
  
    <body  class="img-responsive center-box" style="width:50%;">
   
            <div class="inner-bg">
                <div class="container">
                   
                    <div class="row">
                        <div class="col-sm-5 col-sm-offset-2 text">
                           
                            <h1><strong>SYSTEMOro</strong> Acceso</h1>
                            <div class="description">
                            	<p>
	                            	Bienvenido al acceso de SYSTEMOro
                                        Sistema de Gestion de Compra, Ventas y Servicios
                                        JOYERIA SAN RAMON
                            	</p>
                    
                               
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
                                   <form  action="acceso" class="form-signin" method="post"> 
                                       <div>
                                       <label class="sr-only" for="txtusuario">Usuario</label>
                                       <input type="text" id="txtusuario" name="txtusuario" class="form-control" required placeholder="Ingrese Usuario" autofocus/></div>
                                       <div><label class="sr-only" for="txtpass">Contraseña</label>
                                           <input type="password" id="txtpass" name="txtpass" class="form-control" required placeholder="Ingrese Contraseña"/></div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button></a>


        </form>

            
        </div>
                        </div>
                    </div>
                    
                </div>
            </div>
            
        </div>
       
        
       <!-- Javascript -->
         <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/bootstrap.min_3.js"></script>
        <script src="js/jquery.backstretch.min.js"></script>
        <script src="js/scripts.js"></script>
                
        
     </center>
          
    </body>
</html>
