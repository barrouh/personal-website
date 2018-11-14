<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="Php  javascript MySql MsSql Asp Html Css Html5 Css3">
      <meta name="author" content="Mohamed Barrouh">
      <title>Mohamed Barrouh</title>
      <spring:url value="/resources/img/ico.png" var="iconImg" />
      <link rel="icon" href="${iconImg}">
	  <spring:url value="/resources/css/main.css" var="coreCss" />
	  <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
	  <spring:url value="/resources/css/theme.css" var="themeCss" />
	  <spring:url value="/resources/css/stars.css" var="starsCss" />
      <spring:url value="/resources/css/font-awesome.min.css" var="fontawesomeCss" />
      <spring:url value="/resources/css/star-jedi.css" var="starjediCss" />
	  <!-- Custom CSS -->
	  <link href="${bootstrapCss}" rel="stylesheet" />
      <link href="${themeCss}" rel="stylesheet">
      <link href="${starsCss}" rel="stylesheet">
      <link href="${coreCss}" rel="stylesheet" />
      <link href="${fontawesomeCss}" rel="stylesheet" >
      <link href="${starjediCss}" rel="stylesheet" />
      <!-- Custom jS -->
      <spring:url value="/resources/js/jquery.js" var="jqueryJs" />
      <spring:url value="/resources/js/circle-progress.js" var="circleprogressJs" />
      <script src="${jqueryJs}"></script>
      <script src="${circleprogressJs}"></script>
      <!-- Custom Fonts -->
      <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
      <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' >
      <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' >
      <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet'>
	  <!-- html5shiv respond -->
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
</head>
<body>
 <body id="page-top" class="index">
      <div class="starsstyle">
         <div class="stars"></div>
         <div class="stars2"></div>
         <div class="stars3"></div>
         <div class="col-md-12 text-center">
            <div class="wrap">
               <div class="circle">
                  <i class="icon i1 fa fa-terminal"></i>
                  <i class="icon i2 fa fa-code-fork"></i>
                  <i class="icon i3 fa fa-keyboard-o"></i>
                  <i class="icon i4 fa fa-code"></i>
                  <div class="line1"></div>
                  <div class="line2"></div>
               </div>
            </div>
           <div class="homeCenter">
                <div class="centerStars">
                    <div class="tiny-stars">
                        <img class="imgsvg"  src="/resources/img/stars2.svg">
                    </div>
                    <div class="tiny-stars middle-stars">
                        <img class="imgsvg" src="/resources/img/stars3.svg">
                    </div>
                </div>
            </div>
            <p class="alphalogo">
                <strong >Welcome to my universe</strong>
            </p>
            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-fixed-top">
               <div class="container">
                  <!-- Brand and toggle get grouped for better mobile display -->
                  <div class="navbar-header page-scroll">
                     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                     <span class="sr-only">Toggle navigation</span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                     </button>
                     <a class="navbar-brand page-scroll" href="#page-top">MohameD BarrouH</a>
                  </div>
                  <!-- Collect the nav links, forms, and other content for toggling -->
                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                     <ul class="nav navbar-nav navbar-right">
                        <li class="hidden">
                           <a href="#page-top"></a>
                        </li>
                        <li>
                           <a class="page-scroll" href="#Skills">Skills</a>
                        </li>
                        <li>
                           <a class="page-scroll" href="#about">About</a>
                        </li>
                        <li>
                           <a class="page-scroll" href="#contact">Contact</a>
                        </li>
                     </ul>
                  </div>
               </div>
            </nav>
            <div class="WhiteLine"></div>
            <!-- Skills Section -->
            <section id="Skills">
               <div class="container">
                  <div class="row">
                     <div class="col-lg-12 text-center">
                        <h2 class="section-heading">Skills</h2>
                     </div>
                  </div>
                  <div class="row">
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4>C Sharp :80% </h4>
                           <div id="circle1"></div>
                           <script>
                              $('#circle1').circleProgress({
                               value: 0.80,
                                  size: 150,
                                  fill: {
                                  color: "#00C853"
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4>MsSql : 80%</h4>
                           <div id="circle2"></div>
                           <script>
                              $('#circle2').circleProgress({
                               value: 0.80,
                                  size: 150,
                                  fill: {
                                    color: "#A1887F"
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4>Asp : 90%</h4>
                           <div id="circle3"></div>
                           <script>
                              $('#circle3').circleProgress({
                               value: 0.90,
                                  size: 150,
                                  fill: {
                                     color: "#1565C0"
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4>Html: 95%</h4>
                           <div id="circle4"></div>
                           <script>
                              $('#circle4').circleProgress({
                               value: 0.95,
                                  size: 150,
                                  fill: {
                                     color: "#F57F17"
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4> Css : 90%</h4>
                           <div id="circle5"></div>
                           <script>
                              $('#circle5').circleProgress({
                               value: 0.90,
                                  size: 150,
                                  fill: {
                                  gradient: ["#FFEA00","#4A148C","#EF5350","#D81B60","#1565C0","#F57F17","#304FFE","#00C853"]
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4>Javascript : 30%</h4>
                           <div id="circle6"></div>
                           <script>
                              $('#circle6').circleProgress({
                               value: 0.30,
                                  size: 150,
                                  fill: {
                                     color: "#D81B60"
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4>jQuery : 10%</h4>
                           <div id="circle7"></div>
                           <script>
                              $('#circle7').circleProgress({
                               value: 0.10,
                                  size: 150,
                                  fill: {
                                  color: "#EF5350"
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4>Php : 40%</h4>
                           <div id="circle8"></div>
                           <script>
                              $('#circle8').circleProgress({
                               value: 0.4,
                                  size: 150,
                                  fill: {
                                   color: "#4A148C"
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6 portfolio-item">
                        <div class="portfolio-caption">
                           <h4>MySql : 50 %</h4>
                           <div id="circle9"></div>
                           <script>
                              $('#circle9').circleProgress({
                               value: 0.5,
                                  size: 150,
                                  fill: {
                                  color: "#FFEA00"
                                  }
                              });
                                
                           </script>
                        </div>
                     </div>
                  </div>
               </div>
            </section>
            <div class="WhiteLine"></div>
            <!-- About Section -->
            <section id="about">
               <div class="container">
                  <div class="row">
                     <div class="col-lg-12 text-center">
                        <h2 class="section-heading">About</h2>
                     </div>
                  </div>
                  <div class="row">
                     <div class="col-lg-12">
                        <ul class="timeline">
                           <li>
                              <div class="timeline-image">
                                 <img class="img-circle img-responsive" src="/resources/img/logo.jpg" alt="">
                              </div>
                              <div class="timeline-panel righttext">
                                 <div class="timeline-heading">
                                    <h4>1995</h4>
                                    <h4 class="subheading">Birth</h4>
                                 </div>
                                 <div class="timeline-body">
                                    <p class="text-muted">I was born in one of the villages on the outskirts of Chefchaouen -Morocco with great ambition.</p>
                                 </div>
                              </div>
                           </li>
                           <li class="timeline-inverted">
                              <div class="timeline-image">
                                 <img class="img-circle img-responsive" src="/resources/img/ico.png" alt="">
                              </div>
                              <div class="timeline-panel">
                                 <div class="timeline-heading">
                                    <h4>2013</h4>
                                    <h4 class="subheading">Graduation from high school</h4>
                                 </div>
                                 <div class="timeline-body">
                                    <p class="text-muted">I graduated from high school with a baccalaureate in the natural sciences.</p>
                                 </div>
                              </div>
                           </li>
                           <li>
                              <div class="timeline-image">
                                 <img class="img-circle img-responsive" src="/resources/img/prog.png" alt="">
                              </div>
                              <div class="timeline-panel righttext">
                                 <div class="timeline-heading">
                                    <h4>2014</h4>
                                    <h4 class="subheading">beginning study programming</h4>
                                 </div>
                                 <div class="timeline-body">
                                    <p class="text-muted">began studying programming in specialist institute of  offshoring jobs.</p>
                                 </div>
                              </div>
                           </li>
                           <li class="timeline-inverted">
                              <div class="timeline-image">
                                 <h4>Be Part
                                    <br>Of My
                                    <br>Story!
                                 </h4>
                              </div>
                           </li>
                        </ul>
                     </div>
                  </div>
               </div>
            </section>
            <div class="WhiteLine"></div>
            <!-- Contact Section -->
            <section id="contact">
               <div class="container">
                  <div class="row">
                     <div class="col-lg-12 text-center">
                        <h2 class="section-heading">Contact Me</h2>
                     </div>
                  </div>
                  <div class="row">
                     <div class="col-lg-12">
                        <div class="row">
                           <div class="col-md-8">
                              <form id="contactForm" method="post" action="/Contact" autocomplete="off" >
                                 <div class="form-group">
                                    <div class="col-md-12 inputGroupContainer">
                                       <div class="input-group">
                                          <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                          <input type="text" class="form-control" autocomplete="off" placeholder="Your Name" id="name" required data-validation-required-message="Please enter your name.">
                                       </div>
                                    </div>
                                 </div>
                                 <!-- Text input-->
                                 <div class="form-group">
                                    <div class="col-md-12 inputGroupContainer">
                                       <div class="input-group">
                                          <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                          <input type="email" class="form-control" placeholder="Your Email" id="email" required data-validation-required-message="Please enter your email address.">
                                       </div>
                                    </div>
                                 </div>
                                 <!-- Text input-->
                                 <div class="form-group">
                                    <div class="col-md-12 inputGroupContainer">
                                       <div class="input-group">
                                          <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                          <input type="tel" class="form-control" placeholder="Your Phone" id="phone" required data-validation-required-message="Please enter your phone number.">
                                       </div>
                                    </div>
                                 </div>
                                 <!-- Text area -->
                                 <div class="form-group">
                                    <div class="col-md-12 inputGroupContainer">
                                       <div class="input-group">
                                          <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                          <textarea class="form-control" placeholder="Your Message" id="message" required data-validation-required-message="Please enter a message."></textarea>
                                       </div>
                                    </div>
                                 </div>
                                 <!-- Success message -->
                                 <div class="clearfix"></div>
                                 <div id="success"></div>
                                 <!-- Button -->
                                 <div class="form-group">
                                    <label class="col-md-4 control-label"></label>
                                    <div class="col-md-4">
                                       <button type="submit" class="btn btn-warning" >Send <span class="glyphicon glyphicon-send"></span></button>
                                    </div>
                                 </div>
                              </form>
                           </div>
                           <div class="col-md-4">
                              <h4 class="contact-heading">Find Me on Social Media</h4>
                              <ul class="list-inline  social-buttons">
                                <li><a class="github" target="_blank" href="https://www.github.com/barrouh"><i class="fa fa-github"></i></a>
                                </li>
                                <li><a class="linkedin" target="_blank" href="https://www.linkedin.com/in/barrouh"><i class="fa fa-linkedin"></i></a>
                                </li>
                                <li><a class="facebook" target="_blank" href="https://www.facebook.com/barrouuh"><i class="fa fa-facebook"></i></a>
                                </li>
                                 <li><a class="instagram" target="_blank" href="https://www.instagram.com/barrouh"><i class="fa fa-instagram"></i></a>
                                 </li>
                              </ul>
                              <h4 class="contact-heading">Phone Number </h4>
                              <p class="emailAndPhone">+212643696584</p>
                              <h4 class="contact-heading">Email </h4>
                              <p class="emailAndPhone">mohamed.barrouh@gmail.com</p>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </section>
            <!-- Footer -->
            <div class="WhiteLine"></div>
            <footer>
               <div class="container">
                  <div class="row">
                     <div class="footer">
                        <div class="copy text-center">
                           <p class="link"><span>Made in Morocco © By <span>Mohamed BarrouH</span></p>
                        </div>
                     </div>
                  </div>
               </div>
            </footer>
         </div>
      </div>
      <!-- Google Analytics -->
      <!-- JS -->
      <spring:url value="/resources/js/jquery.easing.min.js" var="easingJs" />
      <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
      <spring:url value="/resources/js/classie.js" var="classieJs" />
      <spring:url value="/resources/js/cbpAnimatedHeader.min.js" var="cbpAnimatedHeaderJs" />
      <spring:url value="/resources/js/jqBootstrapValidation.js" var="jqBootstrapValidationJS" />
      <spring:url value="/resources/js/contact_me.js" var="contact_meJs" />
      <spring:url value="/resources/js/main.js" var="mainJs" />
      
      <script src="${easingJs}"></script>
      <script src="${bootstrapJs}"></script>
      <script src="${classieJs}"></script>
      <script src="${cbpAnimatedHeaderJs}"></script>
      <script src="${jqBootstrapValidationJS}"></script>
      <script src="${contact_meJs}"></script>
      <script src="${mainJs}"></script>
</body>
</html>
