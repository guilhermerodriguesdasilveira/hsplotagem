package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005fmenu_005fperfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/banner2.jsp");
    _jspx_dependants.add("/menu_restrito.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo/estilo.css\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"imagens/icon/hsplot2.png\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("                <script src=\"jquery/jquery-3.2.1.slim.min.js\" ></script>\n");
      out.write("                <script src=\"popper.js/dist/umd/popper.min.js\" ></script>\n");
      out.write("                <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("                \n");
      out.write("                <title>HS Plotagem & Desenho</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function confirmarExclusao(idmenu, nome, idperfil){\n");
      out.write("                if(confirm('Deseja desvincular o menu ' +nome+ '?')){\n");
      out.write("                    location.href='gerenciar_menu_perfil.do?acao=desvincular&idperfil='+idperfil+'&idmenu='+idmenu;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>  \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
      out.write("            <h1>Gerenciamento de Menu e Perfil</h1>\n");
      out.write("            <form action=\"gerenciar_menu_perfil.do\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" id=\"idperfil\" name=\"idperfil\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil.idperfil}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"perfil\" class=\"control-label\">Perfil: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil.perfil}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"idmenu\" class=\"control-label\">Menu</label>\n");
      out.write("                        <select id=\"idmenu\" name=\"idmenu\" class=\"form-control\" required>\n");
      out.write("                            <option value=\"\">Selecione o Menu</option>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <button class=\"btn btn-success\">Gravar</button>\n");
      out.write("                    <a href=\"listar_perfil.jsp\" class=\"btn btn-warning\">Voltar</a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("                        \n");
      out.write("            <h2> Menus Vinculados </h2>\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Menu</th>\n");
      out.write("                    <th>Link</th>\n");
      out.write("                    <th>Desvincular</th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 \n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                 ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("            </table>    \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("m");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil.naoMenus}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.idmenu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.menu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("m");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil.menus}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                \n");
          out.write("                 <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.idmenu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.menu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.link}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    \n");
          out.write("                    <td>\n");
          out.write("                        <button class=\"btn btn-danger\" onclick=\"confirmarExclusao(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.idmenu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.menu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfilv.idperfil}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">\n");
          out.write("                            AQUI\n");
          out.write("                        </button>    \n");
          out.write("                    </td>\n");
          out.write("                 </tr>   \n");
          out.write("               ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("c");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${compra.listar}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                \n");
          out.write("                 <tr>\n");
          out.write("                    <td>aqui21 ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.idcompra}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    \n");
          out.write("                    aqui21\n");
          out.write("                    \n");
          out.write("                 </tr>   \n");
          out.write("               ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
