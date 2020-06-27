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
            </head>
            <body>
                <jsp:include page="header.jsp"></jsp:include>
                    <form class="form-signin"action="" method="POST">

                        <div class="container">
                            <h2 class="account-in text-center">Tính BMI</h2>

                            <div class="">
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xl-12">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xl-12">
                                        <div class="jumbotron">

                                            <div class="form-group">
                                                <span>Chiều cao</span>
                                                <input class="form-control" placeholder="CM" type="text"  name="height">
                                            </div> 	
                                            <div class="form-group "> 
                                                <span class="word">Cân nặng</span>
                                                <input type="password" placeholder="KG" class="form-control" name="weight">
                                            </div>
                                            <div class="form-group"> 
                                                <span class="word form-check-inline">Giới tính</span>
                                                <div class="form-check form-check-inline">
                                                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                                                    <label class="form-check-label" for="inlineRadio1"  >Nam</label>
                                                </div>
                                                <div class="form-check form-check-inline">
                                                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                                                    <label class="form-check-label" for="inlineRadio2">Nữ</label>
                                                </div>                                             
                                            </div>
                                            <div class="text-center">
                                                <button type="submit" class="btn btn-primary btn-block ">Tính BMI</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                <jsp:include page="footer.jsp"></jsp:include>

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
