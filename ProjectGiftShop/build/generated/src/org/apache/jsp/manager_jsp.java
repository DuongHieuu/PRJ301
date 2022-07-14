package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Manager</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylepage.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/dropdownstyle.css\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/managerStyle.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12 col-lg-3 logo_wrap\">\n");
      out.write("                    <a id=\"logo\" href=\"home.jsp\">\n");
      out.write("\n");
      out.write("                        <b>GiftShop</b>\n");
      out.write("\n");
      out.write("                        <span>Gift & Accessories</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 col-lg-5\">\n");
      out.write("                    <div class=\"header_row-12\"></div>\n");
      out.write("                    <div class=\"header_row-2-search\">\n");
      out.write("                        <!-- HEADER SEARCH -->\n");
      out.write("                        <div class=\"header_search\">\n");
      out.write("\n");
      out.write("                            <form action=\"/search\" method=\"get\" >\n");
      out.write("                                <div class=\"col-xs-9  col-lg-8 \">\n");
      out.write("\n");
      out.write("                                    <input id=\"search-field\" name=\"q\" type=\"search\" placeholder=\"Search store...\"\n");
      out.write("                                           />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-3 col-lg-4 \">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">                                       \n");
      out.write("                                        Search\n");
      out.write("                                    </button>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 header_row-both\">\n");
      out.write("\n");
      out.write("                    <div class=\"header_user\">\n");
      out.write("\n");
      out.write("                        <!-- USER MENU -->\n");
      out.write("\n");
      out.write("                        <a href=\"login.jsp\" id=\"customer_login_link\">Log in</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"signup.jsp\" id=\"customer_register_link\">Create an account</a>\n");
      out.write("\n");
      out.write("                        <a href=\"#\" id=\"customer_manager_link\">Manager</a>\n");
      out.write("\n");
      out.write("                        <!-- HEADER CART -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a class=\"header_cart\" href=\"#\" id=\"customer_cart_link\"><b>Cart</b><span\n");
      out.write("                                class=\"cart-items\"></span></a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row-Menu\">\n");
      out.write("                <div class=\"clearfix\" id=\"navigation\">\n");
      out.write("                    <ul class=\"sf-menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"active firstItem\">\n");
      out.write("                            <a  href=\"#\">Home</a>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"\">\n");
      out.write("                            <a  href=\"shopController\">Shop</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a  href=\"#\">About Us</a>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"last lastItem\">\n");
      out.write("                            <a  href=\"#\">Contact us</a>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"manager_bannerSet\">\n");
      out.write("                <div class=\"manager_left\">\n");
      out.write("                    <b>Manager System</b> \n");
      out.write("                    <a href=\"#\">AddProduct</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"managet_product\">\n");
      out.write("                <table class=\"table bordered 3px \">\n");
      out.write("                    <thead >\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>ID</b></td>\n");
      out.write("                            <td><b>Name</b></td>\n");
      out.write("                            <td><b>IMG</b></td>\n");
      out.write("                            <td><b>Price</b></td>\n");
      out.write("                            <td><b>Action</b></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid \">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row_footer1\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3  custom_footer custom_footer1\">\n");
      out.write("                    <h3>Menu</h3>\n");
      out.write("                    <ul class=\"list\">\n");
      out.write("\n");
      out.write("                        <li class=\"firstItem\"><a title=\"\" href=\"homePageController\">Home</a></li>\n");
      out.write("\n");
      out.write("                        <li><a title=\"\" href=\"/collections/all\">Shop</a></li>\n");
      out.write("\n");
      out.write("                        <li><a title=\"\" href=\"/blogs/blog\">Blog</a></li>\n");
      out.write("\n");
      out.write("                        <li><a title=\"\" href=\"/pages/about-us\">About Us</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"lastItem\"><a title=\"\" href=\"/pages/contact-us\">Contact us</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3  custom_footer custom_footer2\">\n");
      out.write("                    <h3>Collections</h3>\n");
      out.write("                    <ul class=\"list\">\n");
      out.write("\n");
      out.write("                        <li class=\" firstItem\"><a title=\"\" href=\"/collections/brands\">Fashion</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li><a title=\"\" href=\"/collections/kids\">Equiment</a></li>\n");
      out.write("\n");
      out.write("                        <li><a title=\"\" href=\"/collections/women-s\">Accessories</a></li>\n");
      out.write("\n");
      out.write("                        <li><a title=\"\" href=\"/collections/footwear\">Other</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3  custom_footer custom_footer3\">\n");
      out.write("                    <h3>Information</h3>\n");
      out.write("                    <ul class=\"list\">\n");
      out.write("\n");
      out.write("                        <li class=\"firstItem\"><a title=\"\" href=\"/account\">My account</a></li>\n");
      out.write("\n");
      out.write("                        <li><a title=\"\" href=\"/account/addresses\">My addresses</a></li>\n");
      out.write("\n");
      out.write("                        <li class=\"lastItem\"><a title=\"\" href=\"/cart\">My cart</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3  custom_footer custom_footer4\">\n");
      out.write("                    <h3>Contacts</h3>\n");
      out.write("                    <ul>\n");
      out.write("\n");
      out.write("                        <li class=\"firstItem\">4578 Marmora Road, Glasgow D04 89GR Tel 1(234) 567-9842\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"lastItem\">Email: <a href=\"mailto:info@demolink.org\">shopGift@gmail.com</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td> <img style=\"width:180px;\"\n");
          out.write("                                      src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                      class=\"img-responsive\" /></td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$</td>\n");
          out.write("                            <td><a href=\"updateController?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" id=\"bt_update\">\n");
          out.write("                                    <img style=\"width:30px;\"\n");
          out.write("                                         src=\"images/editIcon.png\"\n");
          out.write("                                         class=\"img-responsive\" />\n");
          out.write("                                </a>\n");
          out.write("                                <a href=\"#\" id=\"bt_delete\" onclick=\"confirmDelete(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">\n");
          out.write("                                    <img style=\"width:30px;\"\n");
          out.write("                                         src=\"images/deleteIcon.png\" /></a>\n");
          out.write("                            </td>\n");
          out.write("\n");
          out.write("                        </tr>\n");
          out.write("                    ");
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
}
