package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <title>Inicio de sesión</title>\n");
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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"login-container full-cover-background\">\n");
      out.write("    <div class=\"form-container\">\n");
      out.write("        <p class=\"text-center\" style=\"margin-top: 17px;\">\n");
      out.write("           <i class=\"zmdi zmdi-account-circle zmdi-hc-5x\"></i>\n");
      out.write("       </p>\n");
      out.write("       <h4 class=\"text-center all-tittles\" style=\"margin-bottom: 30px;\">inicia sesión con tu cuenta</h4>\n");
      out.write("       <form action=\"GeneraSesion\" method=\"POST\">\n");
      out.write("            <div class=\"group-material-login\">\n");
      out.write("                <input type=\"text\" name=\"carnet\" class=\"material-login-control\" required=\"\" maxlength=\"70\">\n");
      out.write("              <span class=\"highlight-login\"></span>\n");
      out.write("              <span class=\"bar-login\"></span>\n");
      out.write("              <label><i class=\"zmdi zmdi-account\"></i> &nbsp; Nombres</label>\n");
      out.write("            </div><br>\n");
      out.write("            <div class=\"group-material-login\">\n");
      out.write("                <input type=\"password\" name=\"contra\" class=\"material-login-control\" required=\"\" maxlength=\"70\">\n");
      out.write("              <span class=\"highlight-login\"></span>\n");
      out.write("              <span class=\"bar-login\"></span>\n");
      out.write("              <label><i class=\"zmdi zmdi-lock\"></i> &nbsp; Contraseña</label>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <button class=\"btn-login\" type=\"submit\" value=\"Enviar\" name=\"Enviar\">Ingresar al sistema &nbsp; <i class=\"zmdi zmdi-arrow-right\"></i></button>\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </div>   \n");
      out.write("  </div>\n");
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
