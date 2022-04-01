$(function() {
	$('a.page-scroll').bind('click', function(event) {
		var $anchor = $(this);
		$('html, body').stop().animate({
			scrollTop: $($anchor.attr('href')).offset().top
		}, 1500, 'easeInOutExpo');
		event.preventDefault();
	});
});

$('body').scrollspy({
	target: '.navbar-fixed-top'
})

$('.navbar-collapse ul li a').click(function() {
	$('.navbar-toggle:visible').click();
});

jQuery(window).load(function() {
	$(".circle").addClass("circleHover");
	$(".text").addClass("textHover");
	$(".line1").addClass("line1Hover");
	$(".line2").addClass("line2Hover");
	$(".i1").addClass("i1Hover");
	$(".i2").addClass("i2Hover");
	$(".i3").addClass("i3Hover");
	$(".i4").addClass("i4Hover");
});

function removeClass() {
	$(".circle").removeClass("circleHover");
	$(".text").removeClass("textHover");
	$(".line1").removeClass("line1Hover");
	$(".line2").removeClass("line2Hover");
	$(".i1").removeClass("i1Hover");
	$(".i2").removeClass("i2Hover");
	$(".i3").removeClass("i3Hover");
	$(".i4").removeClass("i4Hover");
}

setTimeout(removeClass, 3000);