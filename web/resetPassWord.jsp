<%-- 
    Document   : login
    Created on : Jun 21, 2020, 8:31:23 PM
    Author     : DATLV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title> Restaurant |    <title> Education | Template </title>
            <meta name="description" content="">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

            <!-- CSS here -->
            <link rel="stylesheet" href="assets/css/userProfile.css">  
            <link rel="stylesheet" href="assets/css/bootstrap.min.css">
            <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
            <link rel="stylesheet" href="assets/css/slicknav.css">
            <link rel="stylesheet" href="assets/css/animate.min.css">
            <link rel="stylesheet" href="assets/css/magnific-popup.css">
            <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
            <link rel="stylesheet" href="assets/css/themify-icons.css">
            <link rel="stylesheet" href="assets/css/slick.css">
            <link rel="stylesheet" href="assets/css/nice-select.css">
            <link rel="stylesheet" href="assets/css/style.css">
            <link rel="stylesheet" href="assets/css/login.css">
            <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
            <script type="text/javascript">
                $(document).ready(function () {
                    var x_timer;
                    $("#email").keyup(function (e) {
                        clearTimeout(x_timer);
                        var user_name = $(this).val();
                        x_timer = setTimeout(function () {
                            check_username_ajax(user_name);
                        }, 1000);
                    });

                    function check_username_ajax(username) {
                        $("#user-result").html('<img src="img/ajax-loader.gif" />');
                        $.post('CheckEmailServlet', {'username': username}, function (data) {
                            $("#user-result").html(data);
                        });
                    }
                });
                function checkPass()
                {
                    var pass1 = document.getElementById('password');
                    var pass2 = document.getElementById('repassword');
                    var message = document.getElementById('confirmMessage');
                    var goodColor = "#66cc66";
                    var badColor = "#ff6666";
                    if (pass1.value !== "" && pass1.value === pass2.value) {
                        pass2.style.backgroundColor = goodColor;
                        message.style.color = goodColor;
                        message.innerHTML = "Passwords Match!";
                    } else {
                        pass2.style.backgroundColor = badColor;
                        message.style.color = badColor;
                        message.innerHTML = "Passwords Do Not Match!";
                    }
                }
            </script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <form class="form-signin"action="" method="POST">

                <div class="container">
                    <h2 class="account-in text-center">Đổi mật khẩu</h2>


                    <div class="col-lg-3 col-md-3 col-sm-3 col-xl-12">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xl-12">
                            <div class="jumbotron">
                                <div class="form-group"> 
                                    <span class="word">Mật khẩu cũ</span>
                                    <input type="password" class="form-control" name="oldPass" id="oldPassword" >
                                </div>	

                                <div class="form-group"> 
                                    <span class="word">Mật khẩu mới</span>
                                    <input type="password" class="form-control" name="pass" id="password" onkeyup="checkPass(); return false">
                                </div>	
                                <div class="form-group"> 
                                    <span class="word">Nhập lại mật khẩu mới*</span>
                                    <input type="password" class="form-control" name="repass" id="repassword" onkeyup="checkPass(); return false;">
                                </div>	
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary  ">Đăng ký</button>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </form>
            <br/>
        <jsp:include page="footer.jsp"></jsp:include>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="./assets/js/vendor/modernizr-3.5.0.min.js"></script>
        <!-- Jquery, Popper, Bootstrap -->
        <script src="./assets/js/vendor/jquery-1.12.4.min.js"></script>
        <script src="./assets/js/popper.min.js"></script>
        <script src="./assets/js/bootstrap.min.js"></script>
        <!-- Jquery Mobile Menu -->
        <script src="./assets/js/jquery.slicknav.min.js"></script>

        <!-- Jquery Slick , Owl-Carousel Plugins -->
        <script src="./assets/js/owl.carousel.min.js"></script>
        <script src="./assets/js/slick.min.js"></script>

        <!-- One Page, Animated-HeadLin -->
        <script src="./assets/js/wow.min.js"></script>
        <script src="./assets/js/animated.headline.js"></script>
        <script src="./assets/js/jquery.magnific-popup.js"></script>

        <!-- Nice-select, sticky -->
        <script src="./assets/js/jquery.nice-select.min.js"></script>
        <script src="./assets/js/jquery.sticky.js"></script>

        <!-- contact js -->
        <script src="./assets/js/contact.js"></script>
        <script src="./assets/js/jquery.form.js"></script>
        <script src="./assets/js/jquery.validate.min.js"></script>
        <script src="./assets/js/mail-script.js"></script>
        <script src="./assets/js/jquery.ajaxchimp.min.js"></script>

        <!-- Jquery Plugins, main Jquery -->	
        <script src="./assets/js/plugins.js"></script>
        <script src="./assets/js/main.js"></script>
    </body>
</html>
