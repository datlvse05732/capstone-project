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

                    <main>
                        <!--? slider Area Start-->
                        <div class="slider-area ">
                            <div class="slider-active">
                                <!-- Single Slider -->
                                <div class="single-slider slider-height d-flex align-items-center">
                                    <div class="container">
                                        <div class="row align-items-center">
                                            <div class="col-xl-6 col-lg-7 col-md-8">
                                                <div class="hero__caption">
                                                    <span data-animation="fadeInLeft" data-delay=".2s">Có sức khoẻ là có tất cả</span>
                                                    <h1 data-animation="fadeInLeft" data-delay=".4s">HEALTH IS WEALTH</h1>
                                                    <!-- Hero-btn -->
                                                    <div class="hero__btn">
                                                        <a href="industries.html" class="btn hero-btn"  data-animation="fadeInLeft" data-delay=".8s">Tìm hiểu thêm</a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6 col-lg-5">
                                                <div class="hero-man d-none d-lg-block f-right" data-animation="jello" data-delay=".4s">
                                                    <img src="assets/img/hero/heroman.png" alt="">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- Single Slider -->
                                <div class="single-slider slider-height d-flex align-items-center">
                                    <div class="container">
                                        <div class="row align-items-center">
                                            <div class="col-xl-6 col-lg-7 col-md-8">
                                                <div class="hero__caption">
                                                    <span data-animation="fadeInLeft" data-delay=".2s">Popular Online Courses</span>
                                                    <h1 data-animation="fadeInLeft" data-delay=".4s">The New Way To Learn Properly in With Us!</h1>
                                                    <!-- Hero-btn -->
                                                    <div class="hero__btn">
                                                        <a href="industries.html" class="btn hero-btn"  data-animation="fadeInLeft" data-delay=".8s">Get Started</a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6 col-lg-5">
                                                <div class="hero-man d-none d-lg-block f-right" data-animation="jello" data-delay=".4s">
                                                    <img src="assets/img/hero/heroman.png" alt="">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- slider Area End-->
                        
                        <!-- Count Down End -->
                        <!--? Popular Course Start -->
                        <div class="popular-course section-padding30">
                            <div class="container">
                                <div class="row justify-content-sm-center">
                                    <div class="cl-xl-7 col-lg-8 col-md-10">
                                        <!-- Section Tittle -->
                                        <div class="section-tittle text-center mb-70">
                                           
                                            <h2>Tin Tức Nổi Bật</h2>
                                        </div> 
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xl-4 col-lg-4 col-md-6">
                                        <!-- Single course -->
                                        <div class="single-course mb-40">
                                            <div class="course-img">
                                                <img src="assets/img/gallery/popular_sub1.png" alt="">
                                            </div>
                                            <div class="course-caption">
                                                <div class="course-cap-top">
                                                    <h4><a href="#">Graphic Design</a></h4>
                                                </div>
                                                <div class="course-cap-mid d-flex justify-content-between">
                                                    <div class="course-ratting">
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                    </div>
                                                    <ul><li>52 Review</li></ul>
                                                </div>
                                                <div class="course-cap-bottom d-flex justify-content-between">
                                                    <ul>
                                                        <li><i class="ti-user"></i> 562</li>
                                                        <li><i class="ti-heart"></i> 562</li>
                                                    </ul>
                                                    <span>Free</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-4 col-lg-4 col-md-6">
                                        <!-- Single course -->
                                        <div class="single-course mb-40">
                                            <div class="course-img">
                                                <img src="assets/img/gallery/popular_sub2.png" alt="">
                                            </div>
                                            <div class="course-caption">
                                                <div class="course-cap-top">
                                                    <h4><a href="#">Web Development</a></h4>
                                                </div>
                                                <div class="course-cap-mid d-flex justify-content-between">
                                                    <div class="course-ratting">
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                    </div>
                                                    <ul><li>52 Review</li></ul>
                                                </div>
                                                <div class="course-cap-bottom d-flex justify-content-between">
                                                    <ul>
                                                        <li><i class="ti-user"></i> 562</li>
                                                        <li><i class="ti-heart"></i> 562</li>
                                                    </ul>
                                                    <span>Free</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-4 col-lg-4 col-md-6">
                                        <!-- Single course -->
                                        <div class="single-course mb-40">
                                            <div class="course-img">
                                                <img src="assets/img/gallery/popular_sub3.png" alt="">
                                            </div>
                                            <div class="course-caption">
                                                <div class="course-cap-top">
                                                    <h4><a href="#">Digital Marketing</a></h4>
                                                </div>
                                                <div class="course-cap-mid d-flex justify-content-between">
                                                    <div class="course-ratting">
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                    </div>
                                                    <ul><li>52 Review</li></ul>
                                                </div>
                                                <div class="course-cap-bottom d-flex justify-content-between">
                                                    <ul>
                                                        <li><i class="ti-user"></i> 562</li>
                                                        <li><i class="ti-heart"></i> 562</li>
                                                    </ul>
                                                    <span>Free</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- Section Button -->
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="browse-btn2 text-center mt-50">
                                            <a href="courses.html" class="btn">Find More Courses</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Popular Course End -->
                        <!--? Team Ara Start -->
                        <div class="team-area pt-160 pb-160 section-bg" data-background="assets/img/gallery/section_bg02.png">
                            <div class="container">
                                <div class="row justify-content-center">
                                    <div class="cl-xl-7 col-lg-8 col-md-10">
                                        <!-- Section Tittle -->
                                        <div class="section-tittle section-tittle2 text-center mb-70">
                                            <span>More About Our Faculty</span>
                                            <h2>Our Best Teachers</h2>
                                        </div> 
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-3 col-md-6 col-sm-6">
                                        <div class="single-team mb-30">
                                            <div class="team-img">
                                                <img src="assets/img/gallery/team1.png" alt="">
                                                <!-- Blog Social -->
                                                <ul class="team-social">
                                                    <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                                                    <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                                                    <li><a href="#"><i class="fas fa-globe"></i></a></li>
                                                </ul>
                                            </div>
                                            <div class="team-caption">
                                                <h3><a href="instructor.html">Alexa Janathon</a></h3>
                                                <p>Faculty</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-6 col-sm-6">
                                        <div class="single-team mb-30">
                                            <div class="team-img">
                                                <img src="assets/img/gallery/team2.png" alt="">
                                                <!-- Blog Social -->
                                                <ul class="team-social">
                                                    <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                                                    <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                                                    <li><a href="#"><i class="fas fa-globe"></i></a></li>
                                                </ul>
                                            </div>
                                            <div class="team-caption">
                                                <h3><a href="instructor.html">Janathon Smith</a></h3>
                                                <p>Faculty</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-6 col-sm-6">
                                        <div class="single-team mb-30">
                                            <div class="team-img">
                                                <img src="assets/img/gallery/team3.png" alt="">
                                                <!-- Blog Social -->
                                                <ul class="team-social">
                                                    <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                                                    <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                                                    <li><a href="#"><i class="fas fa-globe"></i></a></li>
                                                </ul>
                                            </div>
                                            <div class="team-caption">
                                                <h3><a href="instructor.html">Alexa MacCalum</a></h3>
                                                <p>Faculty</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-6 col-sm-6">
                                        <div class="single-team mb-30">
                                            <div class="team-img">
                                                <img src="assets/img/gallery/team4.png" alt="">
                                                <!-- Blog Social -->
                                                <ul class="team-social">
                                                    <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                                                    <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                                                    <li><a href="#"><i class="fas fa-globe"></i></a></li>
                                                </ul>
                                            </div>
                                            <div class="team-caption">
                                                <h3><a href="instructor.html">Alexa j Watson</a></h3>
                                                <p>Faculty</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- Section Button -->
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="browse-btn2 text-center mt-70">
                                            <a href="instructor.html" class="btn white-btn">View All Faculty</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Team Ara End -->
                        <!--? About Law Start-->
                        <div class="about-area section-padding2">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-6 col-md-12">
                                        <div class="about-caption mb-50">
                                            <!-- Section Tittle -->
                                            <div class="section-tittle mb-35">
                                                <span>More About Our Company</span>
                                                <h2>Want to know more</h2>
                                            </div>
                                            <p>There arge many variations ohf passages of sorem gpsum ilable, but the majority have suffered alteration in some form, by ected humour, or randomised words whi.</p>
                                            <ul>
                                                <li><span class="flaticon-business"></span> Creative ideas base</li>
                                                <li><span class="flaticon-communications-1"></span> Assages of sorem gpsum ilable</li>
                                                <li><span class="flaticon-graduated"></span> Have suffered alteration in so</li>
                                                <li><span class="flaticon-tools-and-utensils"></span> Randomised words whi</li>
                                            </ul>
                                            <a href="about.html" class="btn">More About Us</a>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-12">
                                        <!-- about-img -->
                                        <div class="about-img ">
                                            <div class="about-font-img d-none d-lg-block">
                                                <img src="assets/img/gallery/about2.png" alt="">
                                            </div>
                                            <div class="about-back-img ">
                                                <img src="assets/img/gallery/about1.png" alt="">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- About Law End-->
                        <!--? Testimonial Start -->
                        <div class="testimonial-area fix pt-180 pb-180 section-bg" data-background="assets/img/gallery/section_bg03.png">
                            <div class="container">
                                <div class="row justify-content-center">
                                    <div class="col-xl-8 col-lg-9 col-md-9">
                                        <div class="h1-testimonial-active">
                                            <!-- Single Testimonial -->
                                            <div class="single-testimonial pt-65">
                                                <!-- Testimonial tittle -->
                                                <div class="testimonial-icon mb-45">
                                                    <img src="assets/img/gallery/testimonial.png" class="ani-btn " alt="">
                                                </div>
                                                <!-- Testimonial Content -->
                                                <div class="testimonial-caption text-center">
                                                    <p>You can’t succeed if you just do what others do and 
                                                        follow the well-worn path. You need to create a new and 
                                                        original path for yourself.</p>
                                                    <!-- Rattion -->
                                                    <div class="testimonial-ratting">
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                    </div>
                                                    <div class="rattiong-caption">
                                                        <span>Clifford Frazier<span> - Colorlib Themes</span> </span>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Single Testimonial -->
                                            <div class="single-testimonial pt-65">
                                                <!-- Testimonial tittle -->
                                                <div class="testimonial-icon mb-45">
                                                    <img src="assets/img/gallery/testimonial.png" class="ani-btn " alt="">
                                                </div>
                                                <!-- Testimonial Content -->
                                                <div class="testimonial-caption text-center">
                                                    <p>You can’t succeed if you just do what others do and 
                                                        follow the well-worn path. You need to create a new and 
                                                        original path for yourself. </p>
                                                    <!-- Rattion -->
                                                    <div class="testimonial-ratting">
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                        <i class="fas fa-star"></i>
                                                    </div>
                                                    <div class="rattiong-caption">
                                                        <span>Clifford Frazier<span> - Colorlib Themes</span> </span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Testimonial End -->
                        <!--? Blog Area Start -->
                        <div class="home-blog-area section-padding30">
                            <div class="container">
                                <!-- Section Tittle -->
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="section-tittle text-center mb-50">
                                            <span>Our Latest News From Our Blog</span>
                                            <h2>Latest News From Blog</h2>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xl-6 col-lg-6 col-md-6">
                                        <div class="home-blog-single mb-30">
                                            <div class="blog-img-cap">
                                                <div class="blog-img">
                                                    <img src="assets/img/gallery/home-blog1.png" alt="">
                                                    <!-- Blog date -->
                                                    <div class="blog-date text-center">
                                                        <span>24</span>
                                                        <p>Now</p>
                                                    </div>
                                                </div>
                                                <div class="blog-cap">
                                                    <p>|   Properties</p>
                                                    <h3><a href="blog_details.html">Footprints in Time is perfect House in Kurashiki</a></h3>
                                                    <a href="blog_details.html" class="more-btn">Read more »</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6 col-lg-6 col-md-6">
                                        <div class="home-blog-single mb-30">
                                            <div class="blog-img-cap">
                                                <div class="blog-img">
                                                    <img src="assets/img/gallery/home-blog2.png" alt="">
                                                    <!-- Blog date -->
                                                    <div class="blog-date text-center">
                                                        <span>24</span>
                                                        <p>Now</p>
                                                    </div>
                                                </div>
                                                <div class="blog-cap">
                                                    <p>|   Properties</p>
                                                    <h3><a href="blog_details.html">Footprints in Time is perfect House in Kurashiki</a></h3>
                                                    <a href="blog_details.html" class="more-btn">Read more »</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Blog Area End -->
                    </main>

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
