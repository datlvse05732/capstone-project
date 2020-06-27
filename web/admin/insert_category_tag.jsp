
<%--
<%@page import="model.UserAdmin"%>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm loại tag</title>

        <%--    <c:set var="root" value="${pageContext.request.contextPath}"/>--%>
        <link href="css/mos-style.css" rel='stylesheet' type='text/css' />

    </head>
    <body>
        <%--
        <%
            String error = "";
            if(request.getParameter("error")!=null){
                error = (String) request.getParameter("error");
            }
           
            
       
        %>
        --%>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">
                    <h3>Thông tin loại tag</h3>

                    <div class="informasi">
                        Hãy chỉnh sửa dữ liệu cẩn thận nhé ^^
                    </div>


                    <div class="sukses">
                        Cập nhật danh mục mới sẽ làm phong phú sản phẩm
                    </div>
                    <form action="/MusicShop/ManagerCategoryServlet" method="post">
                        <table width="95%">
                            <tr>
                                <td style="float: right"><b>Mã thẻ tag</b></td>
                                <td><input type="text" class="sedang" name="tagId"><%--<%=error%>--%></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Tên thẻ tag</b></td>
                            <td><input type="text" class="sedang" name="tag_name"><%--<%=error%>--%></td>
                        </tr>
                        <tr><td></td><td>
                                <input type="hidden" name="command" value="insert">        
                                <input type="submit" class="button" value="Lưu dữ liệu">

                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>


    </body>
</html>

