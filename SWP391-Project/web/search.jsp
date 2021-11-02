<%-- 
    Document   : viewpage
    Created on : Sep 22, 2021, 6:39:18 AM
    Author     : ADMIN
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ashion Template">
        <meta name="keywords" content="Ashion, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Ashion | Template</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Cookie&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700;800;900&display=swap"
              rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="css1/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css1/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css1/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css1/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css1/magnific-popup.css" type="text/css">
        <link rel="stylesheet" href="css1/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css1/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css1/style.css" type="text/css">
    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Offcanvas Menu Begin -->
        <div class="offcanvas-menu-overlay"></div>
        <div class="offcanvas-menu-wrapper">
            <div class="offcanvas__close">+</div>
            <ul class="offcanvas__widget">
                <li><span class="icon_search search-switch"></span></li>
                <li><a href="#"><span class="icon_heart_alt"></span>
                        <div class="tip">2</div>
                    </a></li>
                <li><a href="#"><span class="icon_bag_alt"></span>
                        <div class="tip">2</div>
                    </a></li>
            </ul>
            <div class="offcanvas__logo">
                <a href="./index.html"><img src="img1/logo.png" alt=""></a>
            </div>
            <div id="mobile-menu-wrap"></div>
            <div class="offcanvas__auth">
                <a href="#">Login</a>
                <a href="#">Register</a>
            </div>
        </div>
        <!-- Offcanvas Menu End -->

        <!-- Header Section Begin -->
        <header class="header">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xl-3 col-lg-2">
                        <div class="header__logo">
                            <a href="homepage">Rhea</a>
                        </div>
                    </div>
                    <div class="col-xl-6 col-lg-7">
                        <nav class="header__menu">
                            <ul>
                                <li><a href="homepage">Home</a></li>
                                <li><a href="#">Video</a></li>
                                <li><a href="#">Destinations</a></li>
                                <li class="active"><a href="profile">Profile</a></li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-lg-3">
                        <div class="header__right">
                            <div class="header__right__auth">
                                <a href="login">Login</a>
                                <a href="#">Register</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="canvas__open">
                    <i class="fa fa-bars"></i>
                </div>
            </div>
        </header>
        <!-- Header Section End -->



        <!-- Shop Section Begin -->
        <section class="shop spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-3">
                        <div class="shop__sidebar">
                            <form action="search" method="get">
                            <div class="sidebar__sizes">
                                <div class="section-title">
                                    <h4>Place</h4>
                                </div>
                                <div class="size__list">
                                    <input type="radio" name="place" value="1"> Đà Lạt<br>
                                    <input type="radio" name="place" value="2"> Mộc Châu<br>
                                    <input type="radio" name="place" value="3"> Sapa<br>
                                    <input type="radio" name="place" value="4"> Vũng Tàu<br>
                                    <input type="radio" name="place" value="5"> Ninh Bình<br>
                                    <input type="radio" name="place" value="6"> Cát Bà<br>
                                    <input type="radio" name="place" value="7"> Đà Nẵng<br>
                                </div>
                            </div>
                            <div class="sidebar__color">
                                <div class="section-title">
                                    <h4>Type</h4>
                                </div>
                                <div class="size__list color__list">
                                    <input type="radio" name="type" value="1"> Căn hộ<br>
                                    <input type="radio" name="type" value="2"> Homestay<br>
                                    <input type="radio" name="type" value="3"> Nhà sàn<br> 
                                    <input type="radio" name="type" value="4"> Hotel<br>
                                    <input type="radio" name="type" value="5"> Resort<br>
                                    <input type="radio" name="type" value="6"> Biệt thự<br> 
                                </div>
                            </div>
                            <div class="sidebar__color">
                                <div class="section-title">
                                    <h4>Number of Beds</h4>
                                </div>
                                <div class="size__list color__list">
                                    <input type="radio" name="numBed" value="1" checked> 1<br>
                                    <input type="radio" name="numBed" value="2"> 2<br>
                                    <input type="radio" name="numBed" value="3"> 3
                                </div>
                            </div>
                                <input type="hidden" name="page" value="1">
                                <input type="submit" name="submit" value="Search">
                            </form>
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-9">
                        <input type="text" name="text" placeholder="Search by name">
                        <input type="submit" name="search" value="search">&nbsp;&nbsp;&nbsp;&nbsp;
                        <select name="orderBy" id="country" class="bg-light" onlick>
                            &emsp;<option value="0">&emsp;------------&emsp;</option>
                            <option value="name">&emsp;By Name A->Z&emsp;</option>
                            <option value="price">&emsp;By Price ascending&emsp;</option>
                            <option value="price desc">&emsp;By Price descending&emsp;</option>
                            <option value="rating">&emsp;By Rating ascending&emsp;</option>
                            <option value="rating desc">&emsp;By Rating descending&emsp;</option>
                        </select>
                        <input type="submit" name="submit" value="Sort">
                        <br>
                        <br>
                        <div class="row">
                            <c:forEach items="${requestScope.rooms}" var="r">
                                <div class="col-lg-4 col-md-6">
                                    <div class="product__item">
                                        <div class="product__item__pic set-bg" data-setbg="rhea/public/assets/img/gallery/${r.picture}">
                                        </div>
                                        <div class="product__item__text">
                                            <h6><a href="#">${r.rName}</a></h6>

                                            <div class="product__price">${r.price}</div>
                                        </div>
                                    </div>
                                </div>   
                            </c:forEach>




                            <div class="col-lg-12 text-center">
                                <div class="pagination__option">
                                    <c:forEach begin="1" end="${requestScope.end}" var="i">

                                        <a href="search?page=${i}">${i}</a>   
                                    </c:forEach>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Shop Section End -->



        <!-- Footer Section Begin -->
        <footer class="footer">
            <div class="container">SS
                <div class="row">
                    <div class="col-lg-12">
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        <div class="footer__copyright__text">
                            <p>Copyright &copy; <script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a></p>
                        </div>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </div>
                </div>
            </div>
        </footer>
        <!-- Footer Section End -->

        <!-- Search Begin -->
        <div class="search-model">
            <div class="h-100 d-flex align-items-center justify-content-center">
                <div class="search-close-switch">+</div>
                <form class="search-model-form">
                    <input type="text" id="search-input" placeholder="Search here.....">
                </form>
            </div>
        </div>
        <!-- Search End -->

        <!-- Js Plugins -->
        <script src="js1/jquery-3.3.1.min.js"></script>
        <script src="js1/bootstrap.min.js"></script>
        <script src="js1/jquery.magnific-popup.min.js"></script>
        <script src="js1/jquery-ui.min.js"></script>
        <script src="js1/mixitup.min.js"></script>
        <script src="js1/jquery.countdown.min.js"></script>
        <script src="js1/jquery.slicknav.js"></script>
        <script src="js1/owl.carousel.min.js"></script>
        <script src="js1/jquery.nicescroll.min.js"></script>
        <script src="js1/main.js"></script>
    </body>

</html>