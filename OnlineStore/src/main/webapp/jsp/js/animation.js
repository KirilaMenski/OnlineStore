$(document).ready(function() {
	$('#123').hover(function() {
		$(this).find('ul>li').stop().fadeToggle(300);
	});
});