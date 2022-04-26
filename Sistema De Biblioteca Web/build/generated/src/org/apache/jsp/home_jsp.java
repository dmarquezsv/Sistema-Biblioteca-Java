package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import controladorinicio.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("* Copyright 2016 Daniel Márquez\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Inicio</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"assets/icons/book.ico\" />\r\n");
      out.write("    <script src=\"js/sweet-alert.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/sweet-alert.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\r\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"navbar-lateral full-reset\">\r\n");
      out.write("        <div class=\"visible-xs font-movile-menu mobile-menu-button\"></div>\r\n");
      out.write("        <div class=\"full-reset container-menu-movile nav-lateral-scroll\">\r\n");
      out.write("            <div class=\"logo full-reset all-tittles\">\r\n");
      out.write("                <i class=\"visible-xs zmdi zmdi-close pull-left mobile-menu-button\" style=\"line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;\"></i> \r\n");
      out.write("                sistema bibliotecario\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nav-lateral-divider full-reset\"></div>\r\n");
      out.write("            <div class=\"full-reset\" style=\"padding: 10px 0; color:#fff;\">\r\n");
      out.write("                <figure>\r\n");
      out.write("                    <img src=\"assets/img/logo.png\" alt=\"Biblioteca\" class=\"img-responsive center-box\" style=\"width:55%;\">\r\n");
      out.write("                </figure>\r\n");
      out.write("                <p class=\"text-center\" style=\"padding-top: 15px;\">Sistema Bibliotecario</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nav-lateral-divider full-reset\"></div>\r\n");
      out.write("            <div class=\"full-reset nav-lateral-list-menu\">\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                    <li><a href=\"home.jsp\"><i class=\"zmdi zmdi-home zmdi-hc-fw\"></i>&nbsp;&nbsp; Inicio</a></li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-assignment-o zmdi-hc-fw\"></i>&nbsp;&nbsp; Libros y catálogo <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu\"></i></div>\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><a href=\"Reservar.jsp\"><i class=\"zmdi zmdi-book zmdi-hc-fw\"></i>&nbsp;&nbsp; Reservar</a></li>\r\n");
      out.write("                            <li><a href=\"Busqueda.jsp\"><i class=\"zmdi zmdi-bookmark-outline zmdi-hc-fw\"></i>&nbsp;&nbsp;Busqueda</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-alarm zmdi-hc-fw\"></i>&nbsp;&nbsp; Préstamos y reservaciones <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu\"></i></div>\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><a href=\"ReporPresyReser.jsp\"><i class=\"zmdi zmdi-calendar zmdi-hc-fw\"></i>&nbsp;&nbsp; Todos los préstamos</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"Perfil.jsp\"><i class=\"zmdi zmdi-trending-up zmdi-hc-fw\"></i>&nbsp;&nbsp;Perfil</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"content-page-container full-reset custom-scroll-containers\">\r\n");
      out.write("        <nav class=\"navbar-user-top full-reset\">\r\n");
      out.write("            <ul class=\"list-unstyled full-reset\">\r\n");
      out.write("                <figure>\r\n");
      out.write("                   <img src=\"assets/img/user01.png\" alt=\"user-picture\" class=\"img-responsive img-circle center-box\">\r\n");
      out.write("                </figure>\r\n");
      out.write("                <li style=\"color:#fff; cursor:default;\">\r\n");
      out.write("                    <span class=\"all-tittles\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li  class=\"tooltips-general exit-system-button\" data-href=\"index.html\" data-placement=\"bottom\" title=\"Salir del sistema\">\r\n");
      out.write("                    <i class=\"zmdi zmdi-power\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li  class=\"tooltips-general search-book-button\" data-href=\"searchbook.html\" data-placement=\"bottom\" title=\"Buscar libro\">\r\n");
      out.write("                    <i class=\"zmdi zmdi-search\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li  class=\"tooltips-general btn-help\" data-placement=\"bottom\" title=\"Ayuda\">\r\n");
      out.write("                    <i class=\"zmdi zmdi-help-outline zmdi-hc-fw\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mobile-menu-button visible-xs\" style=\"float: left !important;\">\r\n");
      out.write("                    <i class=\"zmdi zmdi-menu\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"desktop-menu-button hidden-xs\" style=\"float: left !important;\">\r\n");
      out.write("                    <i class=\"zmdi zmdi-swap\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"page-header\">\r\n");
      out.write("              <h1 class=\"all-tittles\">Bienvenido al Sistema bibliotecario <small>Inicio</small></h1><br>\r\n");
      out.write("              <p style=\"text-align: justify; font-family: arial\">Aqui podras observar cuanto libros disponible ofrece la biblioteca y la categorización de cada libro.<br> <b>Nota:</b> Dispondras limite para hacer reservas o presetamos. En el icono podra obserar cuanto pueden ejercer el material</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <section class=\"full-reset text-center\" style=\"padding: 40px 0;\">\r\n");
      out.write("            <article class=\"tile\">\r\n");
      out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-book\"></i></div>\r\n");
      out.write("                <div class=\"tile-name all-tittles\">libros</div>\r\n");
      out.write("                <div class=\"tile-num full-reset\">77</div>\r\n");
      out.write("            </article>\r\n");
      out.write("            <article class=\"tile\">\r\n");
      out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-bookmark-outline\"></i></div>\r\n");
      out.write("                <div class=\"tile-name all-tittles\">categorías</div>\r\n");
      out.write("                <div class=\"tile-num full-reset\">11</div>\r\n");
      out.write("            </article>\r\n");
      out.write("            \r\n");
      out.write("            <article class=\"tile\">\r\n");
      out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-timer\"></i></div>\r\n");
      out.write("                <div class=\"tile-name all-tittles\">reservaciones</div>\r\n");
      out.write("                <div class=\"tile-num full-reset\">2</div>\r\n");
      out.write("            </article>\r\n");
      out.write("            <article class=\"tile\">\r\n");
      out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-calendar\"></i></div>\r\n");
      out.write("                <div class=\"tile-name all-tittles\">préstamos</div>\r\n");
      out.write("                <div class=\"tile-num full-reset\">2</div>\r\n");
      out.write("            </article>\r\n");
      out.write("           \r\n");
      out.write("        </section>\r\n");
      out.write("        <div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"ModalHelp\">\r\n");
      out.write("          <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                    <h4 class=\"modal-title text-center all-tittles\">ayuda del sistema</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    Ponerse en contacto con el soporte técnico. Llamando al siguiente teléfono 2234-1234 o por email soprteCGRB@hotmail.com\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"zmdi zmdi-thumb-up\"></i> &nbsp; De acuerdo</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer class=\"footer full-reset\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6\">\r\n");
      out.write("                        <h4 class=\"all-tittles\">Solución De Problema</h4>\r\n");
      out.write("                        <p style=\" text-align: justify; font-family: \">\r\n");
      out.write("                            Si teneis alguna duda, reclamación o sugerencia, no dudeis en acudir al bibliotecario/a responsable del servicio o a la dirección de la biblioteca. También se atenderá cualquier reclamación hecha mediante instancia presentada en el registro del Ayuntamiento.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6\">\r\n");
      out.write("                        <h4 class=\"all-tittles\">Desarrollador</h4>\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><i class=\"zmdi zmdi-check zmdi-hc-fw\"></i>&nbsp; Empresas Microtecks <i class=\"zmdi zmdi-facebook zmdi-hc-fw footer-social\"></i><i class=\"zmdi zmdi-twitter zmdi-hc-fw footer-social\"></i></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-copyright full-reset all-tittles\">© 2019 Colegio General Ramón Belloso</div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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
