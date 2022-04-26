<%-- 
    Document   : ReporPresyReser
    Created on : 06-10-2019, 05:19:31 PM
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
    
    rs = s.executeQuery("select user.IDreserva,persona.Nombre,book.Titulo, Solicitud.nombreEst, user.Canitidad,user.FechaPedido from reserva as user inner join libro as book on user.IDlibro = book.IDlibro  LEFT JOIN estadosol Solicitud on user.IDestado = Solicitud.IDestado LEFT JOIN usuarios persona  on user.IDusuario = persona.IDusuario where user.IDusuario = '"+ IDUsuarioForm +"' ");
    
    rs2= s2.executeQuery("select pres.IDprestamo , user.IDusuario , user.Nombre , book.Titulo, pres.FechaEntrega, pres.FechaDevolucion, pres.EstadoLibro,pres.Sancion from prestamo as pres inner join usuarios  as user on  pres.IDusuario = user.IDusuario LEFT JOIN libro book on pres.IDlibro = book.IDlibro where user.IDusuario = '"+ IDUsuarioForm +"' ");


%>






<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- 
* Copyright 2019 DANIEL Márquez
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
    
    <script type="text/javascript" src="js/ControlFormReserva2.js"></script>
  
    
  <link rel="stylesheet" type="text/css" href="DataTable/css/jquery.dataTables.min.css">
  <script src="DataTable/js/jquery.dataTables.min.js"></script>
  
  <script>
  
$(document).ready( function () {
    $('#tableUser').DataTable();
} );

</script>

  <script>
  
$(document).ready( function () {
    $('#tableUser2').DataTable();
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
                <p class="text-center" style="padding-top: 15px;">Colegio Ramón Belleso</p>
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
        <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">Reporte <small>Prestamos Libros</small></h1><br>
              <p style="text-align: justify; font-family: arial">Aquí podras verificar si se ha realizado tu reserva del libro o no <b>Recuerda tiene un maximo de 24 horas para ir a traerlo.</b><br> de igual forma podras ver los libros prestado y verifcar el día de devolución entre otros.</p>
              <div class="container">
            <form action="ReporPresyReser.jsp" method="POST">
                <input type="hidden" class="form-control" value="${iduser}" id="nUsuario" name="nUsuario1" >   
                <table>
                   <tr>
                       <td style="text-align: justify; font-family: arial">Presione el boton para mostrar los datos</td>     
                       <td><input type="submit" value="Actualizar Datos" class="btn btn-primary"/></td>
                   </tr>
                </table>
            </form>
            </div>
            </div>
        </div>
        <section class="full-reset text-center" style="padding: 40px 0;">
            <h3>Verificar Solicitud Prestamo</h3>
            <br>       
          <div class="container" class="table-responsive" style="padding-right: 22%;">
                <table  id="tableUser" class="display" >
                <thead>
                  <tr>
                    <th scope="col">N°Registro</th>   
                    <th scope="col">Nombre</th>
                    <th scope="col">Titulo</th>
                    <th scope="col">Estado Solicito</th>
                    <th scope="col">Cantidad Solicitado</th>
                    <th scope="col">Fecha Pedido</th>
                    <th scope="col">Elimar Registro</th>
                  </tr>
                </thead>
                <tbody>
                    <!-- Aqui vamos a mostrar todos los datos de libros -->
                    
                         <%  
                         try {
                                while(rs.next())
                                {
                                    String btnreservar = "  <a href='javascript:void(0)' data-toggle='modal' data-target='#exampleModal' class='btn btn-danger'>Eliminar</a>";
                                   out.print("<tr>"+"<td>"+rs.getInt("IDreserva")+"</td>"+"<td>" +rs.getString("Nombre")+"</td><td>"+rs.getString("Titulo")+"</td><td>"+rs.getString("nombreEst")+"</td><td>"+rs.getString("Canitidad")+"</td><td>"+rs.getString("FechaPedido")+"</td><td>"+btnreservar+"</td></tr>" );
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
                         
                         
 <!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel" style="font-family:arial">Seguro qué desea Eliminar la reserva</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
    <label>Libro Solicitado:</label> <!---Libro Solicitado-->
    <input type="text" class="form-control" id="LibroEnReserva" name="LibroEnReserva" disabled >
   
    <!-- Aqui tomamos los valores de los input que sera enviado a la base de datos -->
    <form action="EliminarReserva" method="POST">
    <div class="form-group">
    <input type="hidden" class="form-control" id="IDRegistro" name="IDRegistro2" > 
    <br>
    <input type="submit" value="Eliminar" class="btn btn-primary" id="EnviarDatos"/> 
    
   </div>
              
              
  </form>
          
          
          
          
          
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
       
      </div>
    </div>
  </div>
</div>                
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
            
            <br>
           <h3>Verificar Libros Prestado</h3>
           <br>       
          <div class="container" class="table-responsive" style="padding-right: 22%;">
                <table  id="tableUser2" class="display" >
                <thead>
                  <tr>
                    <th scope="col">Nombre</th>
                    <th scope="col">Libro</th>
                    <th scope="col">Entrega</th>
                    <th scope="col">Devolución</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Sanción</th>
                  </tr>
                </thead>
                <tbody>
                    <!-- Aqui vamos a mostrar todos los datos de libros -->
                    
                    <%  
                        
                         try {
                                while(rs2.next())
                                {
                                   out.print("<tr><td>"+rs2.getString("Nombre")+"</td><td>"+rs2.getString("Titulo")+"</td><td>"+rs2.getString("FechaEntrega")+"</td><td>"+rs2.getString("FechaDevolucion")+"</td><td>"+rs2.getString("EstadoLibro")+"</td><td>"+rs2.getString("Sancion")+"</td></tr>" );
                                } 
                             } catch (Exception e)
                             {
                                 out.print("<p>"+ e + "</p>");
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