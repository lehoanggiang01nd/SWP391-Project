<%-- 
    Document   : UserProfile
    Created on : Oct 2, 2021, 3:23:29 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--
=========================================================
Material Dashboard - v2.1.2
=========================================================

Product Page: https://www.creative-tim.com/product/material-dashboard
Copyright 2020 Creative Tim (https://www.creative-tim.com)
Coded by Creative Tim

=========================================================
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. -->
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="../assets/img/favicon.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>
            Online Booking
        </title>
        <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
        <!-- CSS Files -->
        <link href="assets/css/material-dashboard.css?v=2.1.2" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="assets/demo/demo.css" rel="stylesheet" />
        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin-2.min.css" rel="stylesheet">
    </head>

    <body class="">
        <div class="wrapper ">
            <div class="sidebar" data-color="purple" data-background-color="white" data-image="assets/img/sidebar-1.jpg">
                <!--
                  Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"
          
                  Tip 2: you can also add an image using data-image tag
                -->
                <div class="logo"><a href="homepage" class="simple-text logo-normal">
                        Rhea
                    </a></div>
                <div class="sidebar-wrapper">
                    <ul class="nav">
                        <li class="nav-item ">
                            <a class="nav-link" href="homepage">
                                <i class="material-icons">dashboard</i>
                                <p>Home</p>
                            </a>
                        </li>
                        <li class="nav-item active  ">
                            <a class="nav-link" href="UserProfile.jsp">
                                <i class="material-icons">person</i>
                                <p>User Profile</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="booking_list?page=1">
                                <i class="material-icons">content_paste</i>
                                <p>Booking List</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="./typography.html">
                                <i class="material-icons">library_books</i>
                                <p>Message</p>
                            </a>
                        </li>

                    </ul>
                </div>
            </div>
            <div class="main-panel">
                <!-- Navbar -->
                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">
                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">${user.userName}</span>
                                <img class="img-profile rounded-circle"
                                     src="img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                 aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="profile">
                                    <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Profile
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Settings
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Activity Log
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="logout" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->
                <!-- End Navbar -->
                <div class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-1"></div>
                            <div class="col-md-9">
                                <div class="card">
                                    <div class="card-header card-header-primary">
                                        <h4 class="card-title">User Profile</h4>
                                        <p class="card-category">${requestScope.error}</p>
                                    </div>
                                    <div class="card-body">
                                        <form>
                                            
                                        </form>

                                        <form action="profile" method="post">
                                            <div class="card card-profile">
                                                <div class="card-avatar">                 
                                                    <img class="img" src="img/${user.picture}" />
                                                </div>
                                                <div class="card-body"> 
                                                    <label for="Profile Photo">Profile Photo:</label> <input
                                                        type="file" name="photo" size="50" />
                                                    <input type="submit" name="submit" value="Upload" class="btn btn-primary btn-round">
                                                </div>
                                            </div>
                                            <input type="hidden" class="form-control" name="id" value="${user.id}">
                                            <div class="row">

                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="bmd-label-floating">Username</label>
                                                        <input type="text" class="form-control" name="uname" value="${user.userName}">
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="bmd-label-floating">Email address</label>
                                                        <input type="email" class="form-control" name="email" readonly value="${user.email}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="bmd-label-floating">Fist Name</label>
                                                        <input type="text" class="form-control" name="fname" value="${user.fName}">
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="bmd-label-floating">Last Name</label>
                                                        <input type="text" class="form-control" name="lname" value="${user.lName}">
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="bmd-label-floating">Phone number</label>
                                                        <input type="phone" class="form-control" name="phone" value="${user.phone}">
                                                    </div>
                                                </div>

                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="bmd-label-floating">Role: &emsp;</label>
                                                        <select name="role" id="country" class="bg-light" name="role">
                                                            <option value="${role}" selected>${role}</option>
                                                            <option value="booker">Booker</option>
                                                            <option value="owner">Owner</option>
                                                        </select> 
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-12">
                                                </div>
                                            </div>
                                            <input type="submit" class="btn btn-primary pull-right" name="submit" value="Cancel">
                                            <input type="submit" class="btn btn-primary pull-right" name="submit" value="Update Profile">
                                            <div class="clearfix"></div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-2">

                            </div>
                        </div>
                    </div>
                </div>
                <footer class="footer">
                    <div class="container-fluid">
                        <nav class="float-left">
                            <ul>
                                <li>
                                    <a href="https://www.creative-tim.com">
                                        Creative Tim
                                    </a>
                                </li>
                                <li>
                                    <a href="https://creative-tim.com/presentation">
                                        About Us
                                    </a>
                                </li>
                                <li>
                                    <a href="http://blog.creative-tim.com">
                                        Blog
                                    </a>
                                </li>
                                <li>
                                    <a href="https://www.creative-tim.com/license">
                                        Licenses
                                    </a>
                                </li>
                            </ul>
                        </nav>
                        <div class="copyright float-right">
                            &copy;
                            <script>
                                document.write(new Date().getFullYear())
                            </script>, made with <i class="material-icons">favorite</i> by
                            <a href="https://www.creative-tim.com" target="_blank">Creative Tim</a> for a better web.
                        </div>
                    </div>
                </footer>
            </div>
        </div>

        <!--   Core JS Files   -->
        <script src="assets/js/core/jquery.min.js"></script>
        <script src="assets/js/core/popper.min.js"></script>
        <script src="assets/js/core/bootstrap-material-design.min.js"></script>
        <script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
        <!-- Plugin for the momentJs  -->
        <script src="assets/js/plugins/moment.min.js"></script>
        <!--  Plugin for Sweet Alert -->
        <script src="assets/js/plugins/sweetalert2.js"></script>
        <!-- Forms Validations Plugin -->
        <script src="assets/js/plugins/jquery.validate.min.js"></script>
        <!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->
        <script src="assets/js/plugins/jquery.bootstrap-wizard.js"></script>
        <!--	Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
        <script src="assets/js/plugins/bootstrap-selectpicker.js"></script>
        <!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->
        <script src="assets/js/plugins/bootstrap-datetimepicker.min.js"></script>
        <!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->
        <script src="assets/js/plugins/jquery.dataTables.min.js"></script>
        <!--	Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
        <script src="assets/js/plugins/bootstrap-tagsinput.js"></script>
        <!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->
        <script src="assets/js/plugins/jasny-bootstrap.min.js"></script>
        <!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->
        <script src="assets/js/plugins/fullcalendar.min.js"></script>
        <!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->
        <script src="assets/js/plugins/jquery-jvectormap.js"></script>
        <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
        <script src="assets/js/plugins/nouislider.min.js"></script>
        <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
        <!-- Library for adding dinamically elements -->
        <script src="assets/js/plugins/arrive.min.js"></script>
        <!--  Google Maps Plugin    -->
        <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
        <!-- Chartist JS -->
        <script src="assets/js/plugins/chartist.min.js"></script>
        <!--  Notifications Plugin    -->
        <script src="assets/js/plugins/bootstrap-notify.js"></script>
        <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
        <script src="assets/js/material-dashboard.js?v=2.1.2" type="text/javascript"></script>
        <!-- Material Dashboard DEMO methods, don't include it in your project! -->
        <script src="assets/demo/demo.js"></script>
        <script>
                                $(document).ready(function () {
                                    $().ready(function () {
                                        $sidebar = $('.sidebar');

                                        $sidebar_img_container = $sidebar.find('.sidebar-background');

                                        $full_page = $('.full-page');

                                        $sidebar_responsive = $('body > .navbar-collapse');

                                        window_width = $(window).width();

                                        fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();

                                        if (window_width > 767 && fixed_plugin_open == 'Dashboard') {
                                            if ($('.fixed-plugin .dropdown').hasClass('show-dropdown')) {
                                                $('.fixed-plugin .dropdown').addClass('open');
                                            }

                                        }

                                        $('.fixed-plugin a').click(function (event) {
                                            // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active
                                            if ($(this).hasClass('switch-trigger')) {
                                                if (event.stopPropagation) {
                                                    event.stopPropagation();
                                                } else if (window.event) {
                                                    window.event.cancelBubble = true;
                                                }
                                            }
                                        });

                                        $('.fixed-plugin .active-color span').click(function () {
                                            $full_page_background = $('.full-page-background');

                                            $(this).siblings().removeClass('active');
                                            $(this).addClass('active');

                                            var new_color = $(this).data('color');

                                            if ($sidebar.length != 0) {
                                                $sidebar.attr('data-color', new_color);
                                            }

                                            if ($full_page.length != 0) {
                                                $full_page.attr('filter-color', new_color);
                                            }

                                            if ($sidebar_responsive.length != 0) {
                                                $sidebar_responsive.attr('data-color', new_color);
                                            }
                                        });

                                        $('.fixed-plugin .background-color .badge').click(function () {
                                            $(this).siblings().removeClass('active');
                                            $(this).addClass('active');

                                            var new_color = $(this).data('background-color');

                                            if ($sidebar.length != 0) {
                                                $sidebar.attr('data-background-color', new_color);
                                            }
                                        });

                                        $('.fixed-plugin .img-holder').click(function () {
                                            $full_page_background = $('.full-page-background');

                                            $(this).parent('li').siblings().removeClass('active');
                                            $(this).parent('li').addClass('active');


                                            var new_image = $(this).find("img").attr('src');

                                            if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
                                                $sidebar_img_container.fadeOut('fast', function () {
                                                    $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
                                                    $sidebar_img_container.fadeIn('fast');
                                                });
                                            }

                                            if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
                                                var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');

                                                $full_page_background.fadeOut('fast', function () {
                                                    $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
                                                    $full_page_background.fadeIn('fast');
                                                });
                                            }

                                            if ($('.switch-sidebar-image input:checked').length == 0) {
                                                var new_image = $('.fixed-plugin li.active .img-holder').find("img").attr('src');
                                                var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');

                                                $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
                                                $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
                                            }

                                            if ($sidebar_responsive.length != 0) {
                                                $sidebar_responsive.css('background-image', 'url("' + new_image + '")');
                                            }
                                        });

                                        $('.switch-sidebar-image input').change(function () {
                                            $full_page_background = $('.full-page-background');

                                            $input = $(this);

                                            if ($input.is(':checked')) {
                                                if ($sidebar_img_container.length != 0) {
                                                    $sidebar_img_container.fadeIn('fast');
                                                    $sidebar.attr('data-image', '#');
                                                }

                                                if ($full_page_background.length != 0) {
                                                    $full_page_background.fadeIn('fast');
                                                    $full_page.attr('data-image', '#');
                                                }

                                                background_image = true;
                                            } else {
                                                if ($sidebar_img_container.length != 0) {
                                                    $sidebar.removeAttr('data-image');
                                                    $sidebar_img_container.fadeOut('fast');
                                                }

                                                if ($full_page_background.length != 0) {
                                                    $full_page.removeAttr('data-image', '#');
                                                    $full_page_background.fadeOut('fast');
                                                }

                                                background_image = false;
                                            }
                                        });

                                        $('.switch-sidebar-mini input').change(function () {
                                            $body = $('body');

                                            $input = $(this);

                                            if (md.misc.sidebar_mini_active == true) {
                                                $('body').removeClass('sidebar-mini');
                                                md.misc.sidebar_mini_active = false;

                                                $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();

                                            } else {

                                                $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');

                                                setTimeout(function () {
                                                    $('body').addClass('sidebar-mini');

                                                    md.misc.sidebar_mini_active = true;
                                                }, 300);
                                            }

                                            // we simulate the window Resize so the charts will get updated in realtime.
                                            var simulateWindowResize = setInterval(function () {
                                                window.dispatchEvent(new Event('resize'));
                                            }, 180);

                                            // we stop the simulation of Window Resize after the animations are completed
                                            setTimeout(function () {
                                                clearInterval(simulateWindowResize);
                                            }, 1000);

                                        });
                                    });
                                });
        </script>
        <script>
            $(document).ready(function () {
                // Javascript method's body can be found in assets/js/demos.js
                md.initDashboardPageCharts();

            });
        </script>
    </body>

</html>
