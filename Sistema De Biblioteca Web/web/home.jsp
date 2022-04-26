<%-- 
    Document   : home
    Created on : 06-10-2019, 05:16:50 PM
    Author     : Daniel_Márquez
--%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="controladorinicio.*"%>
<%
    response.setContentType("text/html;charset=UTF-8");
    //PrintWriter out=response.getWriter();
   
    Class.forName("com.mysql.jdbc.Driver");
    ResultSet rs = null; // Libro
    Connection conexion = null;// Libro
    conexion = DriverManager.getConnection("jdbc:mysql://localhost/bibli", "root", "");
    Statement s = conexion.createStatement(); // Libro
    rs = s.executeQuery("select count(*) AS 'Cantidad' from libro");
   

    ResultSet rs2 = null;
    Connection conexion2 = null;
    conexion2 = DriverManager.getConnection("jdbc:mysql://localhost/bibli", "root", "");
    Statement s2 = conexion2.createStatement();
    rs2= s2.executeQuery("select count(*) AS 'Bibliotecario' from usuarios where IDroles = 1");



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
                            <li><a href="Busqueda.jsp"><i class="zmdi zmdi-bookmark-outline zmdi-hc-fw"></i>&nbsp;&nbsp;Busqueda</a></li>
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
                <li  class="tooltips-general exit-system-button" data-href="index.html" data-placement="bottom" title="Salir del sistema">
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
              <h1 class="all-tittles">Bienvenido al Sistema bibliotecario <small>Inicio</small></h1><br>
              <p style="text-align: justify; font-family: arial"> <b>Bienvido ${usuario}</b> : Estamos para servir a tus necesidades. No dudes en consultar nuestro disponibilidad de los libros,
                  <br> ademas podras reservar un libro ahora bien. lo primero debes estar solvente  y no estar multado caso de lo contraio tu solicitud <br> estara <b>Rechazada y NO TENDRAS ACCESO AL SISTEMA</b>. Para verifcar tu estado puedes  verificar en tu perfil.
              
              </p>
            
            </div>
        </div>
             
        <section class="full-reset text-center" style="padding: 40px 0;">
          
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-book"></i></div>
                <div class="tile-name all-tittles">libros</div>
                <div class="tile-num full-reset"> 
                    <% 
                   try {
                               
                           while(rs.next())
                                {     
                          out.print("<p>"+rs.getString("Cantidad")+"</p>");
                                }
                             } catch (Exception e)
                             {
                                 out.print("<p>"+ e + "</p>");
                             }
                       finally
                         {
                           
                         }
                    
                    
                    %> </div>
            </article>
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-accounts"></i></div>
                <div class="tile-name all-tittles">estudiantes</div>
                <div class="tile-num full-reset">
            
                   +100
       
                </div>
            </article>
            
            
            
            
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-male-female"></i></div>
                <div class="tile-name all-tittles" style="width: 90%;">personal administrativo</div>
                <div class="tile-num full-reset">5</div>
            </article>
            
            
            
            
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-timer"></i></div>
                <div class="tile-name all-tittles">Servicio</div>
                <div class="tile-num full-reset">24 Horas</div>
            </article>
           
             <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-male-alt"></i></div>
                <div class="tile-name all-tittles">docentes</div>
                <div class="tile-num full-reset">25</div>
            </article>
            
            
            
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-face"></i></div>
                <div class="tile-name all-tittles">administradores</div>
                <div class="tile-num full-reset">2</div>
            </article>
            
            
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