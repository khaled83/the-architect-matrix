$(document).ready(function() {
    bindSearchBox();
    
});

/**
Bind the logic for search box: search and select label, or add new label.
*/
function bindSearchBox()
{
    var searchBox = $("input#searchBox");
    
    // add new label
    searchBox.keydown( function(e) {
        if(e.which == 13) {
            $.ajax({
                type: "GET",
                url: "/products/new",
                dataType: "text",
                success: function( msg ) {
                    alert("Success: " + msg);
                    $("label#msg").html("Success: " + msg);
                    location.reload();
                },
                error: function( jqXHR, textStatus, errorThrown ) {
                    alert("Fail: " + jqXHR + " : " + textStatus + " : " + errorThrown );
                    $("label#msg").html("Fail: " + msg);
                }
            });
            alert("Done!");
        }
    } );
}
