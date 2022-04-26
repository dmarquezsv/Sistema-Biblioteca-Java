package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class Busqueda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    response.setContentType("text/html;charset=UTF-8");
    //PrintWriter out=response.getWriter();
    ResultSet rs = null;
    ResultSet rs2 = null;
    Connection conexion = null;
    Class.forName("com.mysql.jdbc.Driver");

    conexion = DriverManager.getConnection("jdbc:mysql://localhost/bibli", "root", "");
    Statement s = conexion.createStatement();
    rs = s.executeQuery("SELECT * FROM libro");


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- \n");
      out.write("* Copyright 2019 Daniel Márquez\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <title>Inicio</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"assets/icons/book.ico\" />\n");
      out.write("    <script src=\"js/sweet-alert.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/sweet-alert.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"DataTable/css/jquery.dataTables.min.css\">\n");
      out.write("  \n");
      out.write("  <script src=\"DataTable/js/jquery.dataTables.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("  \n");
      out.write("$(document).ready( function () {\n");
      out.write("    $('#tableUser').DataTable();\n");
      out.write("} );\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"navbar-lateral full-reset\">\n");
      out.write("        <div class=\"visible-xs font-movile-menu mobile-menu-button\"></div>\n");
      out.write("        <div class=\"full-reset container-menu-movile nav-lateral-scroll\">\n");
      out.write("            <div class=\"logo full-reset all-tittles\">\n");
      out.write("                <i class=\"visible-xs zmdi zmdi-close pull-left mobile-menu-button\" style=\"line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;\"></i> \n");
      out.write("                sistema bibliotecario\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-lateral-divider full-reset\"></div>\n");
      out.write("            <div class=\"full-reset\" style=\"padding: 10px 0; color:#fff;\">\n");
      out.write("                <figure>\n");
      out.write("                    <img src=\"assets/img/logo.png\" alt=\"Biblioteca\" class=\"img-responsive center-box\" style=\"width:55%;\">\n");
      out.write("                </figure>\n");
      out.write("                <p class=\"text-center\" style=\"padding-top: 15px;\">Sistema Bibliotecario</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-lateral-divider full-reset\"></div>\n");
      out.write("            <div class=\"full-reset nav-lateral-list-menu\">\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"home.jsp\"><i class=\"zmdi zmdi-home zmdi-hc-fw\"></i>&nbsp;&nbsp; Inicio</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-assignment-o zmdi-hc-fw\"></i>&nbsp;&nbsp; Libros y catálogo <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu\"></i></div>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"Reservar.jsp\"><i class=\"zmdi zmdi-book zmdi-hc-fw\"></i>&nbsp;&nbsp; Reservar</a></li>\n");
      out.write("                            <li><a href=\"Busqueda.jsp\"><i class=\"zmdi zmdi-bookmark-outline zmdi-hc-fw\"></i>&nbsp;&nbsp; busqueda</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-alarm zmdi-hc-fw\"></i>&nbsp;&nbsp; Préstamos y reservaciones <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu\"></i></div>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"ReporPresyReser.jsp\"><i class=\"zmdi zmdi-calendar zmdi-hc-fw\"></i>&nbsp;&nbsp; Todos los préstamos</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"Perfil.jsp\"><i class=\"zmdi zmdi-trending-up zmdi-hc-fw\"></i>&nbsp;&nbsp;Perfil</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content-page-container full-reset custom-scroll-containers\">\n");
      out.write("        <nav class=\"navbar-user-top full-reset\">\n");
      out.write("            <ul class=\"list-unstyled full-reset\">\n");
      out.write("                <figure>\n");
      out.write("                   <img src=\"assets/img/user01.png\" alt=\"user-picture\" class=\"img-responsive img-circle center-box\">\n");
      out.write("                </figure>\n");
      out.write("                <li style=\"color:#fff; cursor:default;\">\n");
      out.write("                    <span class=\"all-tittles\">Admin Name</span>\n");
      out.write("                </li>\n");
      out.write("                <li  class=\"tooltips-general exit-system-button\" data-href=\"../Login/index.jsp\" data-placement=\"bottom\" title=\"Salir del sistema\">\n");
      out.write("                    <i class=\"zmdi zmdi-power\"></i>\n");
      out.write("                </li>\n");
      out.write("                <li  class=\"tooltips-general search-book-button\" data-href=\"searchbook.html\" data-placement=\"bottom\" title=\"Buscar libro\">\n");
      out.write("                    <i class=\"zmdi zmdi-search\"></i>\n");
      out.write("                </li>\n");
      out.write("                <li  class=\"tooltips-general btn-help\" data-placement=\"bottom\" title=\"Ayuda\">\n");
      out.write("                    <i class=\"zmdi zmdi-help-outline zmdi-hc-fw\"></i>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mobile-menu-button visible-xs\" style=\"float: left !important;\">\n");
      out.write("                    <i class=\"zmdi zmdi-menu\"></i>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"desktop-menu-button hidden-xs\" style=\"float: left !important;\">\n");
      out.write("                    <i class=\"zmdi zmdi-swap\"></i>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("              <h1 class=\"all-tittles\">Busqueda de libro <small>Catalogo</small></h1><br>\n");
      out.write("              <p style=\"text-align: justify; font-family: arial\">Aqui podras observar cuanto libros disponible ofrece la biblioteca y la categorización de cada libro.<br> <b>Nota:</b> Dispondras limite para hacer reservas o presetamos. En el icono podra obserar cuanto pueden ejercer el material</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <section class=\"full-reset text-center\" style=\"padding: 40px 0;\">\n");
      out.write("          \n");
      out.write("           \n");
      out.write("                <div class=\"container\" style=\"padding-right: 22%;\">\n");
      out.write("                <table  id=\"tableUser\" class=\"display\" >\n");
      out.write("                <thead>\n");
      out.write("                  <tr>\n");
      out.write("                    <th scope=\"col\">ID Libro</th>\n");
      out.write("                    <th scope=\"col\">Titulo</th>\n");
      out.write("                    <th scope=\"col\">Categoria</th>\n");
      out.write("                    <th scope=\"col\">Autor</th>\n");
      out.write("                    <th scope=\"col\">Disponible</th>\n");
      out.write("                    <th scope=\"col\">Dias Prestamo</th>\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <!-- Aqui vamos a mostrar todos los datos de libros -->\n");
      out.write("                    \n");
      out.write("                         ");
  
                         try {
                                while(rs.next())
                                {
                                   out.print("<tr><td>"+rs.getInt("IDlibro")+"</td><td>"+rs.getString("Titulo")+"</td><td>"+rs.getString("Categoria")+"</td><td>"+rs.getString("Autor")+"</td><td>"+rs.getString("Cantidad")+"</td><td>"+rs.getInt("DiasPrestamos")+"</td></tr>");
                                } 
                             } catch (Exception e)
                             {
                                 out.print("<p>"+ e + "</p>");
                             }
                         finally
                         {
                             rs.close();
                         }

                         
      out.write("\n");
      out.write("                    \n");
      out.write("                                       \n");
      out.write(" \n");
      out.write("  \n");
      out.write("               </tbody>\n");
      out.write("              </table>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("           \n");
      out.write("         \n");
      out.write("           \n");
      out.write("        </section>\n");
      out.write("        <div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"ModalHelp\">\n");
      out.write("          <div class=\"modal-dialog modal-lg\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                    <h4 class=\"modal-title text-center all-tittles\">ayuda del sistema</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    Ponerse en contacto con el soporte técnico. Llamando al siguiente teléfono 2234-1234 o por email soprteCGRB@hotmail.com\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"zmdi zmdi-thumb-up\"></i> &nbsp; De acuerdo</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"footer full-reset\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("                        <h4 class=\"all-tittles\">Solución De Problema</h4>\n");
      out.write("                        <p style=\" text-align: justify; font-family: \">\n");
      out.write("                            Si teneis alguna duda, reclamación o sugerencia, no dudeis en acudir al bibliotecario/a responsable del servicio o a la dirección de la biblioteca. También se atenderá cualquier reclamación hecha mediante instancia presentada en el registro del Ayuntamiento.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("                        <h4 class=\"all-tittles\">Desarrollador</h4>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><i class=\"zmdi zmdi-check zmdi-hc-fw\"></i>&nbsp; Empresas Microtecks <i class=\"zmdi zmdi-facebook zmdi-hc-fw footer-social\"></i><i class=\"zmdi zmdi-twitter zmdi-hc-fw footer-social\"></i></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright full-reset all-tittles\">© 2019 Colegio General Ramón Belloso</div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
