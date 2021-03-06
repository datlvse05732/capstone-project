package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> Thông tin tài khoản </title>\n");
      out.write("            <meta name=\"description\" content=\"\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
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
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/login.css\">   \n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/userProfile.css\">   \n");
      out.write("\n");
      out.write("            </head>\n");
      out.write("            <body>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row justify-content-sm-center\">\n");
      out.write("                            <div class=\"col-md-9 \">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body text-center\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-12\">\n");
      out.write("                                                <h4>Thông tin cá nhân</h4>\n");
      out.write("                                                <hr>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row \">\n");
      out.write("                                            <div class=\"col-md-12\">\n");
      out.write("                                                <form>\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"username\" class=\"col-4 col-form-label\">Tên tài khoản*</label> \n");
      out.write("                                                        <div class=\"col-8\">\n");
      out.write("                                                            <input id=\"username\" name=\"username\" placeholder=\"Username\" class=\"form-control here\" required=\"required\" type=\"text\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"name\" class=\"col-4 col-form-label\">Tên</label> \n");
      out.write("                                                        <div class=\"col-8\">\n");
      out.write("                                                            <input id=\"name\" name=\"name\" placeholder=\"Name\" class=\"form-control here\" type=\"text\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"email\" class=\"col-4 col-form-label\">Email*</label> \n");
      out.write("                                                        <div class=\"col-8\">\n");
      out.write("                                                            <input id=\"email\" name=\"email\" placeholder=\"Email\" class=\"form-control here\" required=\"required\" type=\"text\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"email\" class=\"col-4 col-form-label\">Chỉ số BMI</label> \n");
      out.write("                                                        <div class=\"col-8\">\n");
      out.write("                                                            <input id=\"email\" name=\"bmi\" placeholder=\"BMI\" class=\"form-control here\" required=\"required\" type=\"text\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"website\" class=\"col-4 col-form-label\">Địa chỉ</label> \n");
      out.write("                                                        <div class=\"col-8\">\n");
      out.write("                                                            <input id=\"website\" name=\"address\" placeholder=\"Địa chỉ\" class=\"form-control here\" type=\"text\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"publicinfo\" class=\"col-4 col-form-label\">Public Info</label> \n");
      out.write("                                                        <div class=\"col-8\">\n");
      out.write("                                                            <textarea id=\"publicinfo\" name=\"publicinfo\" cols=\"40\" rows=\"4\" class=\"form-control\"></textarea>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"newpass\" class=\"col-4 col-form-label\">Mật khẩu mới</label> \n");
      out.write("                                                        <div class=\"col-8\">\n");
      out.write("                                                            <input id=\"newpass\" name=\"newpass\" placeholder=\"\" class=\"form-control here\" type=\"text\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div> \n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <div class=\"offset-4 col-8\">\n");
      out.write("                                                            <button name=\"submit\" type=\"submit\" class=\"btn btn-primary\">Thay đổi thông tin</button>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
