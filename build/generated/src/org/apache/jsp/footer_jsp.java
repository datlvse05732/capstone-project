package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <h1>Hello World!</h1>\n");
      out.write("                <footer>\n");
      out.write("                    <!--? Footer Start-->\n");
      out.write("                    <div class=\"footer-area footer-bg\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"footer-top footer-padding\">\n");
      out.write("                                <!-- footer Heading -->\n");
      out.write("                                <div class=\"footer-heading\">\n");
      out.write("                                    <div class=\"row justify-content-between\">\n");
      out.write("                                        <div class=\"col-xl-6 col-lg-7 col-md-10\">\n");
      out.write("                                            <div class=\"footer-tittle2\">\n");
      out.write("                                                <h4>Stay Updated</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- Form -->\n");
      out.write("                                            <div class=\"footer-form mb-50\">\n");
      out.write("                                                <div id=\"mc_embed_signup\">\n");
      out.write("                                                    <form target=\"_blank\" action=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\" method=\"get\" class=\"subscribe_form relative mail_part\" novalidate=\"true\">\n");
      out.write("                                                        <input type=\"email\" name=\"EMAIL\" id=\"newsletter-form-email\" placeholder=\" Email Address \" class=\"placeholder hide-on-focus\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Your email address'\">\n");
      out.write("                                                        <div class=\"form-icon\">\n");
      out.write("                                                            <button type=\"submit\" name=\"submit\" id=\"newsletter-submit\" class=\"email_icon newsletter-submit button-contactForm\">\n");
      out.write("                                                                Subscribe Now\n");
      out.write("                                                            </button>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"mt-10 info\"></div>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xl-5 col-lg-5\">\n");
      out.write("                                            <div class=\"footer-tittle2\">\n");
      out.write("                                                <h4>Let’s Get Social</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- Footer Social -->\n");
      out.write("                                            <div class=\"footer-social\">\n");
      out.write("                                                <a href=\"https://www.facebook.com/sai4ull\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                                <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                                <a  href=\"#\"><i class=\"fab fa-google\"></i></a>\n");
      out.write("                                                <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                                                <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Footer Menu -->\n");
      out.write("                                <div class=\"row d-flex justify-content-between\">\n");
      out.write("                                    <div class=\"col-xl-2 col-lg-3 col-md-4 col-sm-6\">\n");
      out.write("                                        <div class=\"single-footer-caption mb-50\">\n");
      out.write("                                            <div class=\"footer-tittle\">\n");
      out.write("                                                <h4>About Us</h4>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"#\">Online Learning</a></li>\n");
      out.write("                                                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Careers</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Press Center</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Become an Instructor</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xl-2 col-lg-3 col-md-4 col-sm-6\">\n");
      out.write("                                        <div class=\"single-footer-caption mb-50\">\n");
      out.write("                                            <div class=\"footer-tittle\">\n");
      out.write("                                                <h4>Campus</h4>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"#\">Our Plans</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Free Trial</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Academic Solutions</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Business Solutions</a></li>\n");
      out.write("                                                    <li><a href=\"#\"> Government Solutions</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xl-2 col-lg-3 col-md-4 col-sm-6\">\n");
      out.write("                                        <div class=\"single-footer-caption mb-50\">\n");
      out.write("                                            <div class=\"footer-tittle\">\n");
      out.write("                                                <h4>Study</h4>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"#\">Admissions Policy</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Getting Started</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Online Application</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Visa Information</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Tuition Calculator</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xl-2 col-lg-3 col-md-4 col-sm-6\">\n");
      out.write("                                        <div class=\"single-footer-caption mb-50\">\n");
      out.write("                                            <div class=\"footer-tittle\">\n");
      out.write("                                                <h4>Spport</h4>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"#\">Support</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                                                    <li><a href=\"#\">System Requirements</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Register Activation Key</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Site feedback</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Footer Bottom -->\n");
      out.write("                            <div class=\"footer-bottom\">\n");
      out.write("                                <div class=\"row d-flex align-items-center\">\n");
      out.write("                                    <div class=\"col-lg-12\">\n");
      out.write("                                        <div class=\"footer-copy-right text-center\">\n");
      out.write("                                            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Footer End-->\n");
      out.write("                </footer>\n");
      out.write("                      <script src=\"./assets/js/vendor/modernizr-3.5.0.min.js\"></script>\n");
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
