package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Compra;

public final class form_005fcompra_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/banner2.jsp");
    _jspx_dependants.add("/menu_restrito.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.release();
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
      out.write("         \n");
      out.write("        <div>\n");
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
      out.write("        \n");
      out.write("        <li class=\"nav-item \">\n");
      out.write("          <a class=\"nav-link \" href=\"listar_usuario.jsp\" >\n");
      out.write("            Usuários\n");
      out.write("          </a>\n");
      out.write("          \n");
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
      out.write("            <center> <h2> Registro de Compra</h2> </center>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <form action=\"gerenciar_compra.do\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" id=\"idcompra\" name=\"idcompra\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${compra.idcompra}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"notafiscal\" class=\"control-label\">Nº da Nota Fiscal</label>\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"notafiscal\" \n");
      out.write("                               name=\"notafiscal\" required maxlength=\"45\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${compra.notafiscal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"datacompra\" class=\"control-label\">Data da Compra</label>\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"datacompra\" \n");
      out.write("                               name=\"datacompra\" required maxlength=\"45\" value=\"");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"valor\" class=\"control-label\">Valor</label>\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"valor\" \n");
      out.write("                               name=\"valor\" required maxlength=\"45\" value=\"");
      if (_jspx_meth_fmt_formatNumber_0(_jspx_page_context))
        return;
      out.write("\"/> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <button class=\"btn btn-success\">Gravar</button>\n");
      out.write("                    \n");
      out.write("                    <a href=\"listar_compra.jsp\" class=\"btn btn-danger\">Voltar</a>\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${compra.datacompra}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent(null);
    _jspx_th_fmt_formatNumber_0.setPattern("#,##0.00");
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${compra.valor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }
}
