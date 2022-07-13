package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Shoe Laundry Shop</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylepage.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
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
      out.write("            </div>           \n");
      out.write("            <div class=\"row-Menu\">\n");
      out.write("                <div class=\"sf-Menu\">\n");
      out.write("                    <a class=\"active\" title=\"\" href=\"home.jsp\">Home</a>\n");
      out.write("\n");
      out.write("                    <a href=\"#\">Shop</a>                    \n");
      out.write("\n");
      out.write("                    <a title=\"\" href=\"/\">Blog</a>\n");
      out.write("\n");
      out.write("                    <a title=\"\" href=\"/\">Contact</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"rowBanner\">\n");
      out.write("                <div class=\"col-md-12 banner123\">\n");
      out.write("                    <img style=\"height: 520px; width: 100%;\" class=\"img-responsive\"\n");
      out.write("                         src=\"https://scontent.fhan3-3.fna.fbcdn.net/v/t39.30808-6/244000557_10158931195767746_2433075128572636272_n.jpg?_nc_cat=101&ccb=1-5&_nc_sid=e3f864&_nc_ohc=FjRoya0CsfgAX_60AWD&_nc_ht=scontent.fhan3-3.fna&oh=00_AT8otDqAvk9Wb5bS24gGhZrBT8zTPWJswLq954EJ-YIcNw&oe=622163E6\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                    <h2 style=\"color: #f72b2f; text-transform:uppercase;\"  >New Product</h2>\n");
      out.write("                    <img style=\"width:100%;\" class=\"img-responsive\" src=\"https://store.manutd.com/content/ws/all/f9cf2ce8-409d-4b91-84db-c1a5696175b8__1250X60.png\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"service-row\">\n");
      out.write("                        <img style=\"width:100%;\" class=\"img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPNew[0].productImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        <div class=\"service-item\">\n");
      out.write("                            <h3>Beauty and Cute</h3>\n");
      out.write("                            <p>Always in style!</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"service-row\">\n");
      out.write("                        <img style=\"width:100%;\" class=\"img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPNew[1].productImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        <div class=\"service-item\">\n");
      out.write("                            <h3>Always On Top</h3>\n");
      out.write("                            <p>All eyes on you</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"service-row\">\n");
      out.write("                        <img style=\"width:100%;\" class=\"img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPNew[2].productImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        <div class=\"service-item\">\n");
      out.write("                            <h3>Look perfect.</h3>\n");
      out.write("                            <p>Discover the difference.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"service-row\">\n");
      out.write("                        <img style=\"width:100%; \"  class=\"img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPNew[3].productImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \"  />\n");
      out.write("                        <div class=\"service-item\">\n");
      out.write("                            <h3>Just Perfect</h3>\n");
      out.write("                            <p>Don't worry, we have it.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                    <h2 class=\"title\">THE BEST SELL PRODUCT</h2>\n");
      out.write("                    <p class=\"combo-header-des\">\n");
      out.write("                        Buy the best, and forget the rest!\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                    <h2 class=\"title\">THE PRODUCT IN STORE</h2>\n");
      out.write("                    <p class=\"combo-header-des\">\n");
      out.write("                        Quality belong with time!\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                    <h2>SPECIAL SALE OF FOR YOU</h2>\n");
      out.write("                    <p class=\"combo-header-des\">Limited time offer. Hurry up!</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div>\n");
      out.write("                        <img class=\"img-responsive\" src=\"https://images.milledcdn.com/2021-01-22/EhrGdVgNJWZIiH2I/qnCxAqvmzh5l.webp\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div>\n");
      out.write("                        <img class=\"img-responsive\" src=\"https://www.pngall.com/wp-content/uploads/12/Free-Delivery-PNG-Images.png\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div>\n");
      out.write("                        <img class=\"img-responsive\" src=\"https://images.milledcdn.com/2021-01-22/EhrGdVgNJWZIiH2I/qnCxAqvmzh5l.webp\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid \">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"row_footer1\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3  custom_footer custom_footer1\">\n");
      out.write("                    <h3>Menu</h3>\n");
      out.write("                    <ul class=\"list\">\n");
      out.write("                        \n");
      out.write("                        <li class=\"firstItem\"><a title=\"\" href=\"/test1.html\">Home</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a title=\"\" href=\"/collections/all\">Shop</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a title=\"\" href=\"/blogs/blog\">Blog</a></li>\n");
      out.write("\n");
      out.write("                        <li><a title=\"\" href=\"/pages/about-us\">About Us</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"lastItem\"><a title=\"\" href=\"/pages/contact-us\">Contact us</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3  custom_footer custom_footer2\">\n");
      out.write("                    \n");
      out.write("                    <h3>Collections</h3>                           \n");
      out.write("                    <ul class=\"list\">\n");
      out.write("                        \n");
      out.write("                        <li class=\" firstItem\"><a title=\"\" href=\"/collections/brands\">Fashion</a><li>\n");
      out.write("                            \n");
      out.write("                        <li><a title=\"\" href=\"/collections/kids\">Equiment</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a title=\"\" href=\"/collections/women-s\">Accessories</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a title=\"\" href=\"/collections/footwear\">Other</a></li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3  custom_footer custom_footer3\">\n");
      out.write("                    <h3>Information</h3>\n");
      out.write("                    <ul class=\"list\">\n");
      out.write("                        \n");
      out.write("                        <li class=\"firstItem\"><a title=\"\" href=\"/account\">My account</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a title=\"\" href=\"/account/addresses\">My addresses</a></li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"lastItem\"><a title=\"\" href=\"/cart\">My cart</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3  custom_footer custom_footer4\">\n");
      out.write("                    \n");
      out.write("                    <h3>Contacts</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        \n");
      out.write("                        <li class=\"firstItem\">4578 Marmora Road, Glasgow D04 89GR Tel 1(234) 567-9842</li>\n");
      out.write("                        <li class=\"lastItem\">Email: <a href=\"mailto:info@demolink.org\">shopGift@gmail.com</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listBest}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("b");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col-md-3\">\n");
          out.write("                        <div>\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.productImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" />\n");
          out.write("                            <div class=\"item\">\n");
          out.write("                                <p class=\"item-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                <p class=\"item-description\">\n");
          out.write("                                    Discount: <span style=\"font-weight: bold; margin-left: 10px\">10%</span>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    Price: \n");
          out.write("                                    <span style=\"color: #f72b2f; margin-left: 10px; font-size: 20px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $ </span>\n");
          out.write("                                    <a href=\"#\" id=\"add_cart\">Add to cart </a>\n");
          out.write("                                </p>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setEnd(7);
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col-md-3\">\n");
          out.write("                        <div>\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" />\n");
          out.write("                            <div class=\"item\">\n");
          out.write("                                <p class=\"item-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                <p class=\"item-description\">\n");
          out.write("                                    Discount: <span style=\"font-weight: bold; margin-left: 10px\">10%</span>\n");
          out.write("                                </p>\n");
          out.write("                                <p>\n");
          out.write("                                    Price: \n");
          out.write("                                    <span style=\"color: #f72b2f; margin-left: 10px; font-size: 20px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $ </span>\n");
          out.write("                                    <a href=\"#\" id=\"add_cart\">Add to cart </a>\n");
          out.write("                                </p>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
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
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}