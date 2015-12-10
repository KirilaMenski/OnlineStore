/* Animation for drop menu*/
$(document).ready(function() {
	$('#123').hover(function() {
		$(this).find('ul>li').stop().fadeToggle(300);
	});
});

/* View product photo */
$(document).ready(function() {

	$(".thumbs a").click(function() {

		var largePath = $(this).attr("href");
		var largeAlt = $(this).attr("title");

		$("#largeImg").attr({
			src : largePath,
			alt : largeAlt
		});

		return false;
	});

});

/* Show enter div when clicked href log_in */
$(document).ready(function() {
	$('#log_in, #close_reg').click(function(event) {
		event.preventDefault(); // Для того чтобы при нажатии на ссылку не
		// кидало вверх
		$('#enter').slideToggle();
	});
});

/* Show registrated div when clicked href registrate */
$(document).ready(function() {
	$('#registrate, #close_reg').click(function(event) {
		event.preventDefault();
		$('#registration_block').slideToggle();
	});
});