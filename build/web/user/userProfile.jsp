<%-- 
    Document   : userProfile
    Created on : Jun 24, 2020, 9:33:22 PM
    Author     : DATLV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title> Thông tin tài khoản </title>
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
            <link rel="stylesheet" href="assets/css/userProfile.css">   

            </head>
            <body>
                <jsp:include page="header.jsp"></jsp:include>

                    <div class="container">
                        <div class="row justify-content-sm-center">
                            <div class="col-md-9 ">
                                <div class="card">
                                    <div class="card-body text-center">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <h4>Thông tin cá nhân</h4>
                                                <hr>
                                            </div>
                                        </div>
                                        <div class="row ">
                                            <div class="col-md-12">
                                                <form>
                                                    <div class="form-group row">
                                                        <label for="username" class="col-4 col-form-label">Tên tài khoản*</label> 
                                                        <div class="col-8">
                                                            <input id="username" name="username" placeholder="Username" class="form-control here" required="required" type="text">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <label for="name" class="col-4 col-form-label">Tên</label> 
                                                        <div class="col-8">
                                                            <input id="name" name="name" placeholder="Name" class="form-control here" type="text">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <label for="email" class="col-4 col-form-label">Email*</label> 
                                                        <div class="col-8">
                                                            <input id="email" name="email" placeholder="Email" class="form-control here" required="required" type="text">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <label for="email" class="col-4 col-form-label">Chỉ số BMI</label> 
                                                        <div class="col-8">
                                                            <input id="email" name="bmi" placeholder="BMI" class="form-control here" required="required" type="text">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <label for="website" class="col-4 col-form-label">Địa chỉ</label> 
                                                        <div class="col-8">
                                                            <input id="website" name="address" placeholder="Địa chỉ" class="form-control here" type="text">
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <label for="publicinfo" class="col-4 col-form-label">Public Info</label> 
                                                        <div class="col-8">
                                                            <textarea id="publicinfo" name="publicinfo" cols="40" rows="4" class="form-control"></textarea>
                                                        </div>
                                                    </div>
                                                    <div class="form-group row">
                                                        <label for="newpass" class="col-4 col-form-label">Mật khẩu mới</label> 
                                                        <div class="col-8">
                                                            <input id="newpass" name="newpass" placeholder="" class="form-control here" type="text">
                                                        </div>
                                                    </div> 
                                                    <div class="form-group row">
                                                        <div class="offset-4 col-8">
                                                            <button name="submit" type="submit" class="btn btn-primary">Thay đổi thông tin</button>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
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
