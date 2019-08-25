package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Perfil;

public final class form_005fperfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/banner2.jsp");
    _jspx_dependants.add("/menu_restrito.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo/estilo.css\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"imagens/icon/hsplot2.png\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("                <script src=\"jquery/jquery-3.2.1.slim.min.js\" ></script>\n");
      out.write("                <script src=\"popper.js/dist/umd/popper.min.js\" ></script>\n");
      out.write("                <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <title>HS Plotagem & Desenho</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"margem\">\n");
      out.write("         <div>\n");
      out.write("            \n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("<img src=\"imagens/banner_restrito.jpg\" width=\"100%\" height=\"100px\"/>");
      out.write("\n");
      out.write("\n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-sm navbar-light bg-light\" >\n");
      out.write("  \n");
      out.write("    <a class=\"navbar-brand\" href=\"administracao.jsp\">HS PLOTAGEM</a>\n");
      out.write("    \n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"administracao.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"nav-item \">\n");
      out.write("          <a class=\"nav-link\" href=\"listar_func.jsp\" >\n");
      out.write("              Funcionários\n");
      out.write("          </a>\n");
      out.write("          \n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"listar_cliente.jsp\" >\n");
      out.write("              Clientes\n");
      out.write("          </a>\n");
      out.write("             \n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"nav-item \">\n");
      out.write("          <a class=\"nav-link \" href=\"listar_compra.jsp\">\n");
      out.write("            Compras\n");
      out.write("          </a>\n");
      out.write("          \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item \">\n");
      out.write("          <a class=\"nav-link \" href=\"listar_projeto.jsp\" >\n");
      out.write("            Projetos\n");
      out.write("          </a>\n");
      out.write("          \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item \">\n");
      out.write("          <a class=\"nav-link \" href=\"listar_pagamento.jsp\" >\n");
      out.write("            Pagamentos\n");
      out.write("          </a>\n");
      out.write("          \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link \" href=\"listar_perfil.jsp\" >\n");
      out.write("            Perfis \n");
      out.write("          </a>\n");
      out.write("          \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"listar_menu.jsp\">\n");
      out.write("            Menus \n");
      out.write("          </a>\n");
      out.write("          \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("     <form class=\"form-inline\">\n");
      out.write("          <a class=\"btn btn-outline-danger my-2 my-sm-0\" href=\"#\">Sair</a>  \n");
      out.write("      </form>  \n");
      out.write("  </nav>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <center> <h2> Cadastro de Perfil </h2> </center>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <form action=\"gerenciar_perfil.do\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" id=\"idperfil\" name=\"idperfil\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil.idperfil}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"perfil\" class=\"control-label\">Perfil</label>\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"perfil\" \n");
      out.write("                               name=\"perfil\" required maxlength=\"45\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil.perfil}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <button class=\"btn btn-success\">Gravar</button>\n");
      out.write("                    \n");
      out.write("                    <a href=\"listar_perfil.jsp\" class=\"btn btn-danger\">Voltar</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
