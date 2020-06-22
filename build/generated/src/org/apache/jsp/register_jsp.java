package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    var x_timer;\n");
      out.write("                    $(\"#email\").keyup(function (e) {\n");
      out.write("                        clearTimeout(x_timer);\n");
      out.write("                        var user_name = $(this).val();\n");
      out.write("                        x_timer = setTimeout(function () {\n");
      out.write("                            check_username_ajax(user_name);\n");
      out.write("                        }, 1000);\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    function check_username_ajax(username) {\n");
      out.write("                        $(\"#user-result\").html('<img src=\"img/ajax-loader.gif\" />');\n");
      out.write("                        $.post('CheckEmailServlet', {'username': username}, function (data) {\n");
      out.write("                            $(\"#user-result\").html(data);\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                function checkPass()\n");
      out.write("                {\n");
      out.write("                    var pass1 = document.getElementById('password');\n");
      out.write("                    var pass2 = document.getElementById('repassword');\n");
      out.write("                    var message = document.getElementById('confirmMessage');\n");
      out.write("                    var goodColor = \"#66cc66\";\n");
      out.write("                    var badColor = \"#ff6666\";\n");
      out.write("                    if (pass1.value !== \"\" && pass1.value === pass2.value) {\n");
      out.write("                        pass2.style.backgroundColor = goodColor;\n");
      out.write("                        message.style.color = goodColor;\n");
      out.write("                        message.innerHTML = \"Passwords Match!\";\n");
      out.write("                    } else {\n");
      out.write("                        pass2.style.backgroundColor = badColor;\n");
      out.write("                        message.style.color = badColor;\n");
      out.write("                        message.innerHTML = \"Passwords Do Not Match!\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <form action=\"\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h2 class=\"account-in text-center\">Đăng ký</h2>\n");
      out.write("\n");
      out.write("                    <div class=\"accordion\">\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-3 col-xl-12\">\n");
      out.write("                            <div class=\"col-lg-6 col-md-6 col-sm-6 col-xl-12\">\n");
      out.write("                                <div class=\"jumbotron\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <span>Tài khoản *</span>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\"  name=\"email\" id=\"email\">\n");
      out.write("                                    </div> \t\n");
      out.write("                                    <div class=\"form-group\"> \n");
      out.write("                                        <span class=\"word\">Mật khẩu *</span>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" name=\"pass\" id=\"password\" onkeyup=\"checkPass(); return false\">\n");
      out.write("                                    </div>\t\n");
      out.write("                                    <div class=\"form-group\"> \n");
      out.write("                                        <span class=\"word\">Nhập lại mật khẩu *</span>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" name=\"repass\" id=\"repassword\" onkeyup=\"checkPass(); return false;\">\n");
      out.write("                                    </div>\t\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary  \">Đăng ký</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"./assets/js/vendor/modernizr-3.5.0.min.js\"></script>\n");
      out.write("        <!-- Jquery, Popper, Bootstrap -->\n");
      out.write("        <script src=\"./assets/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Jquery Mobile Menu -->\n");
      out.write("        <script src=\"./assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Jquery Slick , Owl-Carousel Plugins -->\n");
      out.write("        <script src=\"./assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/slick.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- One Page, Animated-HeadLin -->\n");
      out.write("        <script src=\"./assets/js/wow.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/animated.headline.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.magnific-popup.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Nice-select, sticky -->\n");
      out.write("        <script src=\"./assets/js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.sticky.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- contact js -->\n");
      out.write("        <script src=\"./assets/js/contact.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.form.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/mail-script.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Jquery Plugins, main Jquery -->\t\n");
      out.write("        <script src=\"./assets/js/plugins.js\"></script>\n");
      out.write("        <script src=\"./assets/js/main.js\"></script>\n");
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
