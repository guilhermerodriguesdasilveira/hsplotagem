package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/nav_area_restrita.jsp");
    _jspx_dependants.add("/banner.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/rodape.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo/estilo.css\">\n");
      out.write("       \n");
      out.write("            <link rel=\"icon\" type=\"image/png\" href=\"imagens/icon/hsplot2.png\">\n");
      out.write("         \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("                <script src=\"jquery/jquery-3.2.1.slim.min.js\" ></script>\n");
      out.write("                <script src=\"popper.js/dist/umd/popper.min.js\" ></script>\n");
      out.write("                <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <title>HS Plotagem & Desenho</title>\n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <body class=\"margem\">\n");
      out.write("        <div>\n");
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
      out.write("             \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("             \n");
      out.write("             <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\" >\n");
      out.write("                        <center>\n");
      out.write("                        <img src=\"imagens/icon/impressora3.png\" class=\"rounded-circle\" alt=\"Cinque Terre\" width=\"150\" height=\"150\" > \n");
      out.write("                        \n");
      out.write("                        <h4>Grafica Rápida </h4>\n");
      out.write("                        <p>\n");
      out.write("                            Realizamos serviços de fotocópia e impressão, produzindo desde \n");
      out.write("                            pequenas cópias a pedidos em grande escala.\n");
      out.write("                            \n");
      out.write("                        </p>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("                    <div class=\"col-md-4\" >\n");
      out.write("                        <center>\n");
      out.write("                        <img src=\"imagens/icon/arquitetura2.png\" class=\"rounded-circle\" alt=\"Cinque Terre\" width=\"150\" height=\"150\" > \n");
      out.write("                        \n");
      out.write("                        <h4>Projetos</h4>\n");
      out.write("                        <p>\n");
      out.write("                            Realizamos projeto arquitetônico podendo ainda ser aplicado à diferentes tipos de \n");
      out.write("                            ambiente e de necessidades, como residenciais, comerciais e corporativos.\n");
      out.write("                            Focando em melhoria na qualidade de vida e funcionalidade do ambiente. \n");
      out.write("                            \n");
      out.write("                        </p>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4\" >\n");
      out.write("                        <center>\n");
      out.write("                        <img src=\"imagens/icon/plotagem.png\" class=\"rounded-circle\" alt=\"Cinque Terre\" width=\"150\" height=\"150\" > \n");
      out.write("                        \n");
      out.write("                        <h4>Plotagem</h4>\n");
      out.write("                        <p>\n");
      out.write("                            Plotagem é uma impressão em tamanhos grandes, através de um \n");
      out.write("                            equipamento denominado plotter. Este equipamento possui uma grande qualidade\n");
      out.write("                            de impressão podendo imprimir em grandes áreas.\n");
      out.write("                        </p>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                 </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                 </div>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("            <hr>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3>Peça seu orçamento</h3>\n");
      out.write("                <center>\n");
      out.write("                <p>Faça seu cadastro e peça seu orçameto agora!</p>\n");
      out.write("                <p> <a href=\"form_login.jsp\" class=\"btn btn-success\">Acesse</a> </p>\n");
      out.write("                </center>\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <img height=\"150px\">  \n");
      out.write("            \n");
      out.write("        <footer id=\"contact\" class=\"footer\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                ");
      out.write("\n");
      out.write(" <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("                <script src=\"jquery/jquery-3.2.1.slim.min.js\" ></script>\n");
      out.write("                <script src=\"popper.js/dist/umd/popper.min.js\" ></script>\n");
      out.write("                <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("                \n");
      out.write(" <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $('[data-toggle=\"tooltip\"]').tooltip();   \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"alert bg-light\" >                \n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-1 left\"></div>\n");
      out.write("    \n");
      out.write("    <div class=\"col-md-5 left\">\n");
      out.write("        <h6>Endereço</h6>\n");
      out.write("        <p><small> Setor de Rádio e TV Norte  <br   > Quadra 702 Conjunto P  Sala 1118 - ED. Brasília Rádio Center </small> </p>\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-4 left\">  \n");
      out.write("            <h6>Redes sociais</h6>\n");
      out.write("            <p> <a data-toggle=\"tooltip\" title=\"Facebook! inscreva-se\" href=\"#https://www.facebook.com/groups/hsplot\"> <img src=\"imagens/icon/facebook.png\" width=\"30%\" height=\"40px\"/> </a>\n");
      out.write("                <a data-toggle=\"tooltip\" title=\"Youtube! inscreva-se\" href=\"#https://www.youtube.com/user/hsplot\"> <img src=\"imagens/icon/youtube.png\" width=\"30%\" height=\"40px\"/> </a>\n");
      out.write("                <a data-toggle=\"tooltip\" title=\"Twitter! inscreva-se\" href=\"#https://twitter.com/hsplot\"> <img src=\"imagens/icon/twitter.png\" width=\"30%\" height=\"40px\"/> </a> </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-md-3 left\">\n");
      out.write("        <br>\n");
      out.write("        <h6>Contato</h6>\n");
      out.write("        <p><small>  (61) 3326-8448  <br>\n");
      out.write("             (61) 9 8347-1766 <br>\n");
      out.write("             <a href=\"mailto:hsplot@gmail.com\">hsplot@gmail.com </a> </small></p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"col-md-2 right\">\n");
      out.write("        <div class=\"col-md-2 right\"><br><br></div>\n");
      out.write("        <p> <small>Desenvolvido por <b>Grupo G2</b> </small> </p>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("     <div class=\"row\">\n");
      out.write("         <div class=\"col-md-1 left\"></div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("             \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
