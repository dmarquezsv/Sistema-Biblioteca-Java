<%-- 
    Document   : Perfil
    Created on : 06-10-2019, 05:17:45 PM
    Author     : Daniel_Márquez
--%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="controladorinicio.*"%>

<%
    response.setContentType("text/html;charset=UTF-8");
    //PrintWriter out=response.getWriter();

    ResultSet rs = null;
    ResultSet rs2 = null;
    
     Connection conexion = null;
     Connection conexion2 = null;
  
    Class.forName("com.mysql.jdbc.Driver");
    String IDUsuarioForm = request.getParameter("nUsuario1");
    
    conexion = DriverManager.getConnection("jdbc:mysql://localhost/bibli", "root", "");
    conexion2 = DriverManager.getConnection("jdbc:mysql://localhost/bibli", "root", "");
   
    Statement s = conexion.createStatement();
   Statement s2 = conexion2.createStatement();
    
    rs = s.executeQuery("select user.IDusuario,user.IDroles,user.Nombre, estado.Nombre AS 'Estatus' , cargo.Nombre AS 'Tipo' from usuarios as user inner join servicio as estado on user.IDservicio = estado.IDservicio left join roles as cargo on user.IDroles = cargo.IDroles where user.IDusuario = '"+ IDUsuarioForm +"'");
    
    rs2= s2.executeQuery("select multa.IDregistro, user.IDusuario ,user.Nombre, multa.Multa, multa.Tipo ,multa.Estado from registromulta as multa inner join usuarios as user on multa.IDusuario = user.IDusuario where user.IDusuario = '"+ IDUsuarioForm +"'");


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- 
* Copyright 2016 Daniel Márquez
-->
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Inicio</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/book.ico" />
    <script src="js/sweet-alert.min.js"></script>
    <link rel="stylesheet" href="css/sweet-alert.css">
    <link rel="stylesheet" href="css/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
    <script src="js/modernizr.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/main.js"></script>
    
   <link rel="stylesheet" type="text/css" href="DataTable/css/jquery.dataTables.min.css">
  <script src="DataTable/js/jquery.dataTables.min.js"></script>
  
  <script>
  
$(document).ready( function () {
    $('#tableUser').DataTable();
} );

</script>
    
    
</head>
<body>
    <div class="navbar-lateral full-reset">
        <div class="visible-xs font-movile-menu mobile-menu-button"></div>
        <div class="full-reset container-menu-movile nav-lateral-scroll">
            <div class="logo full-reset all-tittles">
                <i class="visible-xs zmdi zmdi-close pull-left mobile-menu-button" style="line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;"></i> 
                sistema bibliotecario
            </div>
            <div class="nav-lateral-divider full-reset"></div>
            <div class="full-reset" style="padding: 10px 0; color:#fff;">
                <figure>
                    <img src="assets/img/logo.png" alt="Biblioteca" class="img-responsive center-box" style="width:55%;">
                </figure>
                <p class="text-center" style="padding-top: 15px;">Colegio Ramón Belloso</p>
            </div>
            <div class="nav-lateral-divider full-reset"></div>
            <div class="full-reset nav-lateral-list-menu">
                <ul class="list-unstyled">
                    <li><a href="home.jsp"><i class="zmdi zmdi-home zmdi-hc-fw"></i>&nbsp;&nbsp; Inicio</a></li>
                    <li>
                        <div class="dropdown-menu-button"><i class="zmdi zmdi-assignment-o zmdi-hc-fw"></i>&nbsp;&nbsp; Libros y catálogo <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="Reservar.jsp"><i class="zmdi zmdi-book zmdi-hc-fw"></i>&nbsp;&nbsp; Reservar</a></li>
                            <li><a href="Busqueda.jsp"><i class="zmdi zmdi-bookmark-outline zmdi-hc-fw"></i>&nbsp;&nbsp; busqueda</a></li>
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button"><i class="zmdi zmdi-alarm zmdi-hc-fw"></i>&nbsp;&nbsp; Préstamos y reservaciones <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ReporPresyReser.jsp"><i class="zmdi zmdi-calendar zmdi-hc-fw"></i>&nbsp;&nbsp; Todos los préstamos</a></li>
                            
                        </ul>
                    </li>
                    <li><a href="Perfil.jsp"><i class="zmdi zmdi-trending-up zmdi-hc-fw"></i>&nbsp;&nbsp;Perfil</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="content-page-container full-reset custom-scroll-containers">
        <nav class="navbar-user-top full-reset">
            <ul class="list-unstyled full-reset">
                <figure>
                   <img src="assets/img/user01.png" alt="user-picture" class="img-responsive img-circle center-box">
                </figure>
                <li style="color:#fff; cursor:default;">
                    <span class="all-tittles">${usuario}</span>
                </li>
                <li  class="tooltips-general exit-system-button" data-href="index.jsp" data-placement="bottom" title="Salir del sistema">
                    <i class="zmdi zmdi-power"></i>
                </li>
                
                <li  class="tooltips-general btn-help" data-placement="bottom" title="Ayuda">
                    <i class="zmdi zmdi-help-outline zmdi-hc-fw"></i>
                </li>
                <li class="mobile-menu-button visible-xs" style="float: left !important;">
                    <i class="zmdi zmdi-menu"></i>
                </li>
                <li class="desktop-menu-button hidden-xs" style="float: left !important;">
                    <i class="zmdi zmdi-swap"></i>
                </li>
            </ul>
        </nav>
        
        <section class="full-reset text-center" style="padding: 40px 0;">
          
            <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified" role="tablist">
                <li role="presentation" class="active"><a href="#statistics" aria-controls="statistics" role="tab" data-toggle="tab">Perfil</a></li>
                <li role="presentation"><a href="#bitacora" aria-controls="bitacora" role="tab" data-toggle="tab"></a></li>
                <li role="presentation"><a href="#reports" aria-controls="reports" role="tab" data-toggle="tab"></a></li>
            </ul>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane fade in active" id="statistics">
                    <div class="container-fluid"  style="margin: 50px 0;">
                        <h1 class="all-tittles">Datos Generales <small>Usuario</small></h1><br>
                        <div class="row">
                            <div class="col-xs-12 col-sm-4 col-md-3">
                                <img src="images/perfil.png" alt="chart" class="img-responsive center-box" style="max-width: 120px;">
                            </div>
                            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead" style="text-align: justify; font-family: arial">
                                Bienvenido al área del perfil, aquí puedes ver las diferentes estadísticas de multas , pagos de libros y tus datos generales.   
                            </div>
                            <br><br><br><br
                             <div class="container">
            <form action="Perfil.jsp" method="POST">
                <input type="hidden" class="form-control" value="${iduser}" id="nUsuario" name="nUsuario1" >   
                <table>
                   <tr>
                       <td style="text-align: justify; font-family: arial">Presione el boton para mostrar los datos</td>     
                       <td><input type="submit" value="Mostrar" class="btn btn-primary" id="EnviarDatos"/></td>
                   </tr>
                </table>
            </form>
            </div>
                        </div>
           
                              
                    </div>
                    <div class="container-fluid">
                        <div class="page-header">
                          <h2 class="all-tittles">Datos <small>en general</small></h2>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">                          
                                <h3 class="text-center all-tittles">Datos Administrativos</h3>
                                <div class="table-responsive">
                                    <table class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">Tipo usuario</th>
                                                <th class="text-center">Estado</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                             <%  
                         try {
                                while(rs.next())
                                {
                                   out.print("<tr><td>"+rs.getString("Nombre")+"</td><td>"+rs.getString("Tipo")+"</td><td>"+rs.getString("Estatus")+"</td></tr>");
                                } 
                             } catch (Exception e)
                             {
                                 out.print("<p>"+ e + "</p>");
                             }
                         finally
                         {
                             rs.close();
                         }

                         %>
                                        </tbody>
                                    </table>
                                </div>
                               
                            </div>
                        </div>
                        <div class="page-header">
                          <h2 class="all-tittles">Registros<small> de Multas</small></h2>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">registros de multa por no entregar a tiempo libro o Perdida</h3>
                                <div class="table-responsive">
                                   
                                </div>
                                
                            </div>
                        </div>
                        
                        
                    </div>
                </div>
            </div>
                                        
                                        
                <div class="container" class="table-responsive" style="padding-right: 22%;">
                <table  id="tableUser" class="display" >
                <thead>
                  <tr>
                    <th scope="col">Nombre</th>
                    <th scope="col">Costo</th>
                    <th scope="col">Tipo Multa</th>
                    <th scope="col">Estado</th>
                  </tr>
                </thead>
                <tbody>
                    <!-- Aqui vamos a mostrar todos los datos de libros -->
                   
                     <%  
                         try {
                                while(rs2.next())
                                {
                                   out.print("<tr><td>"+rs2.getString("Nombre")+"</td><td>"+rs2.getString("Multa")+"</td><td>"+rs2.getString("Tipo")+"</td><td>"+rs2.getString("Estado")+"</td></tr>");
                                } 
                             } catch (Exception f)
                             {
                                 out.print("<p>"+ f + "</p>");
                             }
                         finally
                         {
                             rs2.close();
                         }

                         %>
                                       
 
  
               </tbody>
              </table>
              </div>
            
           
        </section>
        <div class="modal fade" tabindex="-1" role="dialog" id="ModalHelp">
          <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title text-center all-tittles">ayuda del sistema</h4>
                </div>
                <div class="modal-body">
                    Ponerse en contacto con el soporte técnico. Llamando al siguiente teléfono 2234-1234 o por email soprteCGRB@hotmail.com

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="zmdi zmdi-thumb-up"></i> &nbsp; De acuerdo</button>
                </div>
            </div>
          </div>
        </div>
        <footer class="footer full-reset">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12 col-sm-6">
                        <h4 class="all-tittles">Solución De Problema</h4>
                        <p style=" text-align: justify; font-family: ">
                            Si teneis alguna duda, reclamación o sugerencia, no dudeis en acudir al bibliotecario/a responsable del servicio o a la dirección de la biblioteca. También se atenderá cualquier reclamación hecha mediante instancia presentada en el registro del Ayuntamiento.
                        </p>
                    </div>
                    <div class="col-xs-12 col-sm-6">
                        <h4 class="all-tittles">Desarrollador</h4>
                        <ul class="list-unstyled">
                            <li><i class="zmdi zmdi-check zmdi-hc-fw"></i>&nbsp; Empresas Microtecks <i class="zmdi zmdi-facebook zmdi-hc-fw footer-social"></i><i class="zmdi zmdi-twitter zmdi-hc-fw footer-social"></i></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="footer-copyright full-reset all-tittles">© 2019 Colegio General Ramón Belloso</div>
        </footer>
    </div>
</body>
</html>