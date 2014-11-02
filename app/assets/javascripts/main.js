$(document).ready(function() {
	
	$("a#newItem").click( function() {
		$.ajax({
			type: 'GET',
			url: "/items/new",
			data: {
				name: 'NEW ITEM'
			},
			success: function(data) {
				location.reload();
			},
			error: function(x, y, z) {
				alert(z);
			}
		});
	});
    
});