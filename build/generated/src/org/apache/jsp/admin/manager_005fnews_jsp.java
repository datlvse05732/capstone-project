package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager_005fnews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quản lý bài viết</title>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"css/mos-style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"rightContent\">\n");
      out.write("                    <h3>QUẢN LÝ BÀI VIẾT</h3>\n");
      out.write("                    <div class=\"informasi\">\n");
      out.write("                        Hãy chỉnh sửa dữ liệu cẩn thận nhé ^^\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <table class=\"data\">\n");
      out.write("                        <tr class=\"data\">\n");
      out.write("                            <input type=\"submit\" class=\"button\" value=\"Thêm bài viết\">\n");
      out.write("                        </tr>\n");
      out.write("                        <tr class=\"data\">\n");
      out.write("                            <th class=\"data\" width=\"30px\">STT</th>\n");
      out.write("                            <th class=\"data\">Mã bài viết</th>\n");
      out.write("                            <th class=\"data\">Loại tag</th>\n");
      out.write("                            <th class=\"data\">Tiêu đề</th>\n");
      out.write("                            <th class=\"data\">Nội dung</th>\n");
      out.write("\n");
      out.write("                            <th class=\"data\">Tác Giả</th>\n");
      out.write("                            <th class=\"data\">Ngày đăng</th>\n");
      out.write("                            <th class=\"data\" width=\"75px\">Tùy chọn</th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">1</td>\n");
      out.write("                        <td class=\"data\"></td>\n");
      out.write("                        <td class=\"data\"></td>\n");
      out.write("                        <td class=\"data\"></td>\n");
      out.write("                        <td class=\"data\"></td>\n");
      out.write("                        <td class=\"data\"></td>\n");
      out.write("                        <td class=\"data\"></td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\">Sửa </a>&nbsp;&nbsp; | &nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\">Xoá</a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
}
