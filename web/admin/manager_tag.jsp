<%-- 
   <%@page import="model.UserAdmin"%>
<%@page import="model.Brand"%>
<%@page import="get.BrandGet"%>
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
        <title>Quản Lý Thẻ Tag</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="css/mos-style.css" rel='stylesheet' type='text/css' />

    </head>
    <body>
        <%--
        <%
           
           
       
            BrandGet brandGet = new BrandGet();
            ArrayList<Brand> listBrand = brandGet.getListBrand();
            %>
        --%>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">

                    <h3>QUẢN LÝ THẺ TAG</h3>
                    <div class="informasi">
                        Hãy chỉnh sửa dữ liệu cẩn thận nhé ^^
                    </div>
                    <form action="insert_category_tag.jsp">
                        <input type="submit"  class="button" value="Thêm loại thẻ tag">
                    </form>



                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Mã thẻ tag</th>
                            <th class="data">Tên thẻ tag</th>

                            <th class="data" width="75px">Tùy chọn</th>
                        </tr>
                    <%--  <% 
                          int count =0;
                          for(Brand brand : listBrand){
                              count++;
                          
                            %>
                    --%>
                    <tr class="data">
                        <td class="data" width="30px"><%--<%=count%>--%></td>
                        <td class="data"><%--<%=brand.getBrandID()%>--%></td>
                        <td class="data"><%--<%=brand.getBrandName()%>--%></td>

                        <td class="data" width="90px">
                    <center>
                        <a href="update_category_tag.jsp">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
                        <a href="/MusicShop/ManagerBrandServlet?command=delete&brand_id=<%--=brand.getBrandID()--%>">Xóa</a>
                    </center>
                    </td>
                    </tr>
                    <%--    <% } %>--%>
                </table>
            </div>
            <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>

    </body>
</html>