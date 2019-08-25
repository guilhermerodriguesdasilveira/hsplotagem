package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Usuario;

public final class form_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/nav_area_restrita.jsp");
    _jspx_dependants.add("/banner.jsp");
    _jspx_dependants.add("/menu.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo/estilo.css\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"imagens/icon/hsplot2.png\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("                <script src=\"jquery/jquery-3.2.1.slim.min.js\" ></script>\n");
      out.write("                <script src=\"popper.js/dist/umd/popper.min.js\" ></script>\n");
      out.write("                <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>HS Plotagem & Desenho</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"margem\">\n");
      out.write("        <div >\n");
      out.write("            \n");
      out.write("             ");
      out.write("\n");
      out.write("<div class=\"form-group mb-2\">\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-light\" style=\"background-color: #e3f2fd; \">\n");
      out.write("        <a class=\"navbar-brand\">HS PLOTAGEM</a>\n");
      out.write("        <form class=\"form-inline\">      \n");
      out.write("            <a class=\"btn btn-warning my-2 my-sm-0\" href=\"form_login.jsp\">\n");
      out.write("                <img src=\"imagens/icon/Login.png\" class=\"rounded-circle\" alt=\"Cinque Terre\" width=\"30\" height=\"30\" > \n");
      out.write("                Login\n");
      out.write("            </a>\n");
      out.write("               \n");
      out.write("            <p> \n");
      out.write("        </form>    \n");
      out.write("</nav>\n");
      out.write("</div>");
      out.write("\n");
      out.write("            \n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("<img src=\"imagens/banner123.jpg\" width=\"100%\" height=\"200px\"/>");
      out.write("\n");
      out.write("                \n");
      out.write("             ");
      out.write("\n");
      out.write("<div class=\"menu_index\">\n");
      out.write("<ul class=\"nav nav-pills nav-fill\">\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link active\"  href=\"index.jsp\">Home</a>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link active\"  href=\"quem_somos.jsp\">Quem Somos</a>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("   <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link active\" href=\"servicos.jsp\">Serviços</a>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link active\" href=\"contato.jsp\">Contato</a>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");

                String mensagem = (String)request.getSession().getAttribute("mensagem");
                if(mensagem != null){
                    request.getSession().removeAttribute("mensagem");
                
            
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div clas=\"alert alert-info\">");
      out.print(mensagem);
      out.write("</div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("           \n");
      out.write("            <div class=\"container\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <div class=\"row\">\n");
      out.write("                     \n");
      out.write("                     <div class=\"col-3\"></div>\n");
      out.write("                 \n");
      out.write("                    <div class=\"col-6\">\n");
      out.write("                        <form action=\"gerenciar_login.do\" method=\"post\">\n");
      out.write("                        <h1 class=\"h1 mb-3 font-weight-normal\">Login</h1>\n");
      out.write("\n");
      out.write("                        <label for=\"inputLogin\" class=\"control-label\">Login</label>\n");
      out.write("                        <input type=\"text\" id=\"login\" class=\"form-control\" \n");
      out.write("                               name=\"login\" placeholder=\"Login\" required autofocus/>\n");
      out.write("\n");
      out.write("                        <label for=\"inputSenha\" class=\"control-label\">Senha</label>\n");
      out.write("                        <input type=\"password\" id=\"inputSenha\" class=\"form-control\" \n");
      out.write("                               name=\"senha\" placeholder=\"Senha\" required/>\n");
      out.write("\n");
      out.write("                        <div class=\"checkbox mb-3\">\n");
      out.write("                          <label>\n");
      out.write("                            <input type=\"checkbox\" required> Não sou robo\n");
      out.write("                          </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-lg btn-success btn-block\" type=\"submit\">Entrar</button>\n");
      out.write("                        <br>\n");
      out.write("                        <a href=\"inserir_cliente.jsp\" class=\"btn btn-lg btn-primary btn-block\" > Não sou cadastro</a>\n");
      out.write("\n");
      out.write("                        <p class=\"mt-5 mb-3 text-muted\">&copy; 2017-2018</p>       \n");
      out.write("                   \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                      \n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
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
