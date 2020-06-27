

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản Lý Loại Bài Viết</title>

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

                    <h3>QUẢN LÝ LOẠI BÀI VIẾT</h3>
                    <div class="informasi">
                        Hãy chỉnh sửa dữ liệu cẩn thận nhé ^^
                    </div>


                    <form action="insert_category_news.jsp">
                           <input type="submit"  class="button" value="Thêm loại bài viết">
                    </form>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Mã loại bài viết</th>
                            <th class="data">Tên loại bài viết</th>

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
                        <a href="update_category_news.jsp">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
                        <a href="">Xóa</a>
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
