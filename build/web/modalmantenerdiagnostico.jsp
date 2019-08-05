<%-- 
    Document   : modalmantenerdiagnostico
    Created on : 19/12/2018, 11:54:31 AM
    Author     : Abel Alonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <!-- Favicon -->
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- CSS Animate -->
    <link rel="stylesheet" href="css/animate.css">

    <!-- Fonts -->

    </head>
    <body>
<!-- Button trigger modal -->
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
  Cargar Detalle
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
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
                                <table class="table table-grillamodalhover" id="grillamodal">
                                    <thead>
                                        <tr class="warning">
                                            <th>Código</th> 
                                            <th>Servicio</th>
                                            <th>Repuesto</th>
                                            <th>Cantidad</th>
                                            <th>Precio U.</th>
                                            <th>Exenta</th>
                                            <th>Grav 5%</th>
                                            <th>Grav 10%</th>
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
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
        <button type="button" class="btn btn-primary">Cargar en detalle</button>
      </div>
    </div>
  </div>
</div>
            
  <script src="js/jquery-1.10.2.min.js"></script>
    <script src="plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="js/jquery-1.12.2.min.js"></script> 
        <script src="js/bootstrap.min.js"></script> 
       <script src="diagnostico.js"></script> 
    </body>
</html>
