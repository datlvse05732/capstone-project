package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title> Restaurant |    <title> Education | Template </title>\n");
      out.write("            <meta name=\"description\" content=\"\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("\n");
      out.write("            <!-- CSS here -->\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/slicknav.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/animate.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/fontawesome-all.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("            </head>\n");
      out.write("            <body>\n");
      out.write("<header>\n");
      out.write("      <!-- Header Start -->\n");
      out.write("      <div class=\"header-area\">\n");
      out.write("          <div class=\"main-header \">\n");
      out.write("              <div class=\"header-top d-none d-lg-block\">\n");
      out.write("                  <!-- Left Social -->\n");
      out.write("                  <div class=\"header-left-social\">\n");
      out.write("                      <ul class=\"header-social\">    \n");
      out.write("                          <li><a href=\"#\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                          <li><a href=\"https://www.facebook.com/sai4ull\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                          <li><a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a></li>\n");
      out.write("                          <li> <a href=\"#\"><i class=\"fab fa-google-plus-g\"></i></a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"container\">\n");
      out.write("                      <div class=\"col-xl-12\">\n");
      out.write("                          <div class=\"row d-flex justify-content-between align-items-center\">\n");
      out.write("                              <div class=\"header-info-left\">\n");
      out.write("                                  <ul>     \n");
      out.write("                                      <li>needhelp@gmail.com</li>\n");
      out.write("                                      <li>666 7475 25252</li>\n");
      out.write("                                  </ul>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"header-info-right\">\n");
      out.write("                                  <ul>    \n");
      out.write("                                      <li><a href=\"#\"><i class=\"ti-user\"></i>Đăng nhập</a></li>\n");
      out.write("                                      <li><a href=\"#\"><i class=\"ti-lock\"></i>Đăng ký</a></li>\n");
      out.write("                                  </ul>\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"header-bottom header-sticky\">\n");
      out.write("                  <!-- Logo -->\n");
      out.write("                  <div class=\"logo d-none d-lg-block\">\n");
      out.write("                      <a href=\"index.html\"><img src=\"assets/img/logo/logo_1.png\" alt=\"\"></a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"container\">\n");
      out.write("                      <div class=\"menu-wrapper\">\n");
      out.write("                          <!-- Logo -->\n");
      out.write("                          <div class=\"logo logo2 d-block d-lg-none\">\n");
      out.write("                              <a href=\"index.html\"><img src=\"assets/img/logo/logo.png\" alt=\"\"></a>\n");
      out.write("                          </div>\n");
      out.write("                          <!-- Main-menu -->\n");
      out.write("                          <div class=\"main-menu d-none d-lg-block\">\n");
      out.write("                              <nav>\n");
      out.write("                                  <ul id=\"navigation\">                                                                                          \n");
      out.write("                                      <li><a href=\"index.html\">Trang chủ</a></li>\n");
      out.write("                                      <li><a href=\"about.html\">Tin tức</a>\n");
      out.write("                                      <ul class=\"submenu\">\n");
      out.write("                                              <li><a href=\"blog.html\">cate1</a></li>\n");
      out.write("                                              <li><a href=\"blog_details.html\">cate 2</a></li>\n");
      out.write("                                              <li><a href=\"elements.html\">cate 3</a></li>\n");
      out.write("                                          </ul>\n");
      out.write("                                      </li>\n");
      out.write("                                     \n");
      out.write("                                      \n");
      out.write("                                      <li><a href=\"blog.html\">Tính chỉ số</a>\n");
      out.write("                                          <ul class=\"submenu\">\n");
      out.write("                                              <li><a href=\"blog.html\">BMI</a></li>\n");
      out.write("                                              <li><a href=\"blog_details.html\">BMI</a></li>\n");
      out.write("                                              <li><a href=\"elements.html\">BMI</a></li>\n");
      out.write("                                          </ul>\n");
      out.write("                                      </li>\n");
      out.write("                                      <li><a href=\"contact.html\">Liên hệ</a></li>\n");
      out.write("                                  </ul>\n");
      out.write("                              </nav>\n");
      out.write("                          </div>\n");
      out.write("                          <!-- Header-btn -->\n");
      out.write("                          <div class=\"header-search d-none d-lg-block\">\n");
      out.write("                              <form action=\"#\" class=\"form-box f-right \">\n");
      out.write("                                  <input type=\"text\" name=\"Search\" placeholder=\"Tìm kiếm\">\n");
      out.write("                                  <div class=\"search-icon\">\n");
      out.write("                                      <i class=\"fas fa-search special-tag\"></i>\n");
      out.write("                                  </div>\n");
      out.write("                              </form>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- Mobile Menu -->\n");
      out.write("                      <div class=\"col-12\">\n");
      out.write("                          <div class=\"mobile_menu d-block d-lg-none\"></div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Header End -->\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <script src=\"./assets/js/vendor/modernizr-3.5.0.min.js\"></script>\n");
      out.write("                <!-- Jquery, Popper, Bootstrap -->\n");
      out.write("                <script src=\"./assets/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("                <script src=\"./assets/js/popper.min.js\"></script>\n");
      out.write("                <script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write("                <!-- Jquery Mobile Menu -->\n");
      out.write("                <script src=\"./assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Jquery Slick , Owl-Carousel Plugins -->\n");
      out.write("                <script src=\"./assets/js/owl.carousel.min.js\"></script>\n");
      out.write("                <script src=\"./assets/js/slick.min.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- One Page, Animated-HeadLin -->\n");
      out.write("                <script src=\"./assets/js/wow.min.js\"></script>\n");
      out.write("                <script src=\"./assets/js/animated.headline.js\"></script>\n");
      out.write("                <script src=\"./assets/js/jquery.magnific-popup.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Nice-select, sticky -->\n");
      out.write("                <script src=\"./assets/js/jquery.nice-select.min.js\"></script>\n");
      out.write("                <script src=\"./assets/js/jquery.sticky.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- contact js -->\n");
      out.write("                <script src=\"./assets/js/contact.js\"></script>\n");
      out.write("                <script src=\"./assets/js/jquery.form.js\"></script>\n");
      out.write("                <script src=\"./assets/js/jquery.validate.min.js\"></script>\n");
      out.write("                <script src=\"./assets/js/mail-script.js\"></script>\n");
      out.write("                <script src=\"./assets/js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Jquery Plugins, main Jquery -->\t\n");
      out.write("                <script src=\"./assets/js/plugins.js\"></script>\n");
      out.write("                <script src=\"./assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("            </body>\n");
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
