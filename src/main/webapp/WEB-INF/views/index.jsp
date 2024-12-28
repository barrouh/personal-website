<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Php  javascript MySql MsSql Asp Html Css Html5 Css3">
    <meta name="author" content="Mohamed Barrouh">
    <title>${persone.firstName} ${persone.lastName}</title>
    <spring:url value="/resources/img/java.png" var="iconImg" />
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
    <link href="${fontawesomeCss}" rel="stylesheet">
    <link href="${starjediCss}" rel="stylesheet" />
    <!-- Custom jS -->
    <spring:url value="/resources/js/jquery.min.js" var="jqueryJs" />
    <spring:url value="/resources/js/circle-progress.min.js" var="circleprogressJs" />
    <script src="${jqueryJs}"></script>
    <script src="${circleprogressJs}"></script>
    <!-- Custom Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet'>
    <!-- html5shiv respond -->
    <!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body id="page-top" class="index">
        <div class="starsstyle">
            <div class="stars"></div>
            <div class="stars2"></div>
            <div class="stars3"></div>
            <div class="col-md-12 text-center">
                <div class="wrap">
                    <div class="circle">
                        <em class="icon i1 fa fa-terminal"></em>
                        <em class="icon i2 fa fa-code-fork"></em>
                        <em class="icon i3 fa fa-keyboard-o"></em>
                        <em class="icon i4 fa fa-code"></em>
                        <div class="line1"></div>
                        <div class="line2"></div>
                    </div>
                </div>
                <div class="homeCenter">
                    <div class="centerStars">
                        <div class="tiny-stars"></div>
                        <div class="tiny-stars middle-stars"></div>
                    </div>
                </div>
                <p class="alphalogo">
                    <strong>${persone.welcomeQuote}</strong>
                </p>
                <!-- Navigation -->
                <nav class="navbar navbar-default navbar-fixed-top">
                    <div class="container">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header page-scroll">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand page-scroll" href="#page-top">${persone.firstName} ${persone.lastName}</a>
                        </div>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="hidden"><a href="#page-top"></a></li>
                                <li><a class="page-scroll" href="#about">About</a></li>
                                <li><a class="page-scroll" href="#Skills">Skills</a></li>
                                <li><a class="page-scroll" href="#contact">Contact</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
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
                                    <c:set var="secCount" value="1" scope="page" />
                                    <c:set var="cssClass" value="" scope="page" />
                                    <c:forEach items="${persone.stories}" var="story">
                                        <c:set var="secCount" value="${secCount + 1}" scope="page" />
                                        <c:if test="${secCount%2==0}">
                                            <c:set var="cssClass" value="timeline-inverted" scope="page" />
                                        </c:if>
                                        <c:if test="${secCount%2!=0}">
                                            <c:set var="cssClass" value="" scope="page" />
                                        </c:if>
                                        <c:choose>
                                            <c:when test="${ not empty story.date}">
                                                <li class="${cssClass}">
                                                    <div class="timeline-image">
	                                                    <spring:url value="/resources/img/${story.image}" var="Img" />
	                                                    <img class="img-circle img-responsive" src="${Img}" alt="${story.title}">
                                                    </div>
                                                    <div class="timeline-panel righttext">
                                                        <div class="timeline-heading">
                                                            <h4>${story.date}</h4>
                                                            <h4 class="subheading">${story.title}</h4>
                                                        </div>
                                                        <div class="timeline-body">
                                                            <p class="text-muted">${story.discription}</p>
                                                        </div>
                                                    </div>
                                                </li>
                                            </c:when>
                                            <c:otherwise>
                                                <li class="timeline-inverted">
                                                    <div class="timeline-image">
                                                        <h4>${story.discription}</h4>
                                                    </div>
                                                </li>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </section>
                <div class="WhiteLine"></div>
                <!-- Skills Section -->
                <section id="Skills">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12 text-center">
                                <h2 class="section-heading">Skills</h2>
                            </div>
                        </div>
                        <c:forEach items="${persone.skills}" var="skill">
                            <div class="col-md-4 col-sm-6 portfolio-item">
                                <div class="portfolio-caption">
                                    <h4>${skill.name}: ${skill.progress * 100}%</h4>
                                    <div id="${fn:replace(skill.name,' ','')}Id"></div>
                                    <script>
                                      $('#${fn:replace(skill.name,' ','')}Id').circleProgress({
                                         value: '${skill.progress}',
                                         size: 150,
                                         fill: {color: "${skill.color}"}
                                       });
                                    </script>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </section>
                <div class="WhiteLine"></div>
                <!-- Contact Section -->
                <section id="contact">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12 text-center">
                                <h2 class="section-heading">Contact</h2>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="row">
                                    <div class="col-md-4">
                                    </div>
                                    <div class="col-md-4">
                                        <h4 class="contact-heading">Find Me on Social Media</h4>
                                        <ul class="list-inline  social-buttons">
                                            <li>
                                                <a class="github" target="_blank" href="${persone.githubLink}">
                                                    <em class="fa fa-github"></em>
                                                </a>
                                            </li>
                                            <li>
                                                <a class="linkedin" target="_blank" href="${persone.linkedinLink}">
                                                    <em class="fa fa-linkedin"></em>
                                                </a>
                                            </li>
                                            <li>
                                                <a class="facebook" target="_blank" href="${persone.facebookLink}">
                                                    <em class="fa fa-facebook"></em>
                                                </a>
                                            </li>
                                            <li>
                                                <a class="instagram" target="_blank" href="${persone.instagramLink}">
                                                    <em class="fa fa-instagram"></em>
                                                </a>
                                            </li>
                                        </ul>
                                        <h4 class="contact-heading">Phone Number</h4>
                                        <p class="emailAndPhone">${persone.phoneNumber}</p>
                                        <h4 class="contact-heading">Email</h4>
                                        <a class="linkedin" target="_blank" href="mailto:${persone.email}">${persone.email}</a>
                                    </div>
                                    <div class="col-md-4">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                </br>
                </br>
                </br>
                <!-- Footer -->
                <div class="WhiteLine"></div>
                <footer>
                    <div class="container">
                        <div class="row">
                            <div class="footer">
                                <div class="copy text-center">
                                    <p class="link">
                                        <span>Made With<span class="heart-beat"><em class='fa fa-heart'></em></span>in Morocco By ${persone.firstName} ${persone.lastName} &copy; 2016</span>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <!-- Google Analytics -->
		<script async src="https://www.googletagmanager.com/gtag/js?id=UA-130645093-1"></script>
		<script>
		  window.dataLayer = window.dataLayer || [];
		  function gtag(){dataLayer.push(arguments);}
		  gtag('js', new Date());
		  gtag('config', 'UA-130645093-1');
		</script>
        <!-- JS -->
        <spring:url value="/resources/js/jquery.easing.min.js" var="easingJs" />
        <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
        <spring:url value="/resources/js/classie.js" var="classieJs" />
        <spring:url value="/resources/js/cbp-animated-header.min.js" var="cbpAnimatedHeaderJs" />
        <spring:url value="/resources/js/main.js" var="mainJs" />
        <script src="${easingJs}"></script>
        <script src="${bootstrapJs}"></script>
        <script src="${classieJs}"></script>
        <script src="${cbpAnimatedHeaderJs}"></script>
        <script src="${mainJs}"></script>
    </body>
</html>