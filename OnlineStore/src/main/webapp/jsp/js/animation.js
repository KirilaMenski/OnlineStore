/* Animation for drop menu*/
$(document).ready(function() {
	$('#123').hover(function() {
		$(this).find('ul>li').stop().fadeToggle(300);
	});
});

/*View product photo*/
$(document).ready(function(){



	$(".thumbs a").click(function(){
	
		var largePath = $(this).attr("href");
		var largeAlt = $(this).attr("title");
		
		$("#largeImg").attr({ src: largePath, alt: largeAlt });
		
		return false;
	});
	
});