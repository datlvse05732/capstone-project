<%-- 
   
<%@page import="model.UserAdmin"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Category"%>
<%@page import="get.CategoryGet"%>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản Lý Danh Mục Nguyên Liệu</title>

        <%--   <c:set var="root" value="${pageContext.request.contextPath}"/>--%>
        <link href="css/mos-style.css" rel='stylesheet' type='text/css' />

    </head>
    <body>
        <%--
            
            
        
            CategoryGet categoryGet = new CategoryGet();
            ArrayList<Category> listCategory = categoryGet.getListCategory();
        --%>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">

                    <h3>QUẢN LÝ LOẠI NGUYÊN LIỆU</h3>
                    <div class="informasi">
                        Hãy chỉnh sửa dữ liệu cẩn thận nhé ^^
                    </div>


                    <form action="insert_category_resources.jsp">
                        <input type="submit"  class="button" value="Thêm loại nguyên liệu">
                    </form>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Mã loại nguyên liệu</th>
                            <th class="data">Tên loại nguyên liệu</th>

                            <th class="data" width="75px">Tùy chọn</th>
                        </tr>
                    <%-- --
                      int count =0;
                      for(Category category : listCategory){
                          count++;
                      
                    --%>
                    <tr class="data">
                        <td class="data" width="30px"><%--=count--%></td>
                        <td class="data"><%--=category.getCategoryID()--%></td>
                        <td class="data"><%--=category.getCategoryName()--%></td>

                        <td class="data" width="90px">
                    <center>
                        <a href="update_category_resources.jsp">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
                        <a href="/MusicShop/ManagerCategoryServlet?command=delete&category_id==">Xóa</a>
                    </center>
                    </td>
                    </tr>
                    <%-- } --%>
                </table>
            </div>
            <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>

    </body>
</html>