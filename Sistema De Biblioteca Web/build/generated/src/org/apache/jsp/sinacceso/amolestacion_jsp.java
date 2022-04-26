package org.apache.jsp.sinacceso;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amolestacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Sin acceso al sistema</title>\n");
      out.write("    <meta name=\"description\" content=\"Demo of A Free Coming Soon Bootstrap 4 Template by TemplateFlip.com.\"/>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"styles/main.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body id=\"top\"><div class=\"site-wrapper\">\n");
      out.write("  <div class=\"site-wrapper-inner\">\n");
      out.write("    <div class=\"cover-container\">\n");
      out.write("      <div class=\"masthead clearfix\">\n");
      out.write("        <div class=\"inner\">\n");
      out.write("          <h3 class=\"masthead-brand\">Colegio Ramón Belloso</h3>\n");
      out.write("          <nav class=\"nav nav-masthead\">\n");
      out.write("            <a class=\"nav-link nav-social\" href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a class=\"nav-link nav-social\" href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a class=\"nav-link nav-social\" href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a class=\"nav-link nav-social\" href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("          </nav>\n");
      out.write("        </div>\n");
      out.write("      </div><br>      <div class=\"inner cover\">\n");
      out.write("        <h1 class=\"cover-heading\">Sin ACCESO  AL SISTEMA</h1>\n");
      out.write("        <p class=\"lead cover-copy\">Hola:  no tendras acceso al sistema debido que posee amonestación al deber un pago de libro o multa.\n");
      out.write("        Para más información visite al administrador de Biblioteca.</p>\n");
      out.write("       <a href=\"#\"> <p class=\"lead\"><button type=\"button\" class=\"btn btn-lg btn-default btn-notify\">Regresar</button></p></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mastfoot\">\n");
      out.write("        <div class=\"inner\">\n");
      out.write("          <p>&copy; Derechos Reservados<a href=\"https://templateflip.com/\" target=\"_blank\">CGRB 2019</a>.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"scripts/main.js\"></script>\n");
      out.write("  </body>\n");
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
