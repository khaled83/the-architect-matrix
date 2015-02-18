$(document).ready(function() {
    
    // label highlight
    $(".label.tag").click(function(){
        $(this).toggleClass("label-default");
        $(this).toggleClass("label-success");
    });
    
    // search box placehoalder
    var searchBox = $("input#searchBox");
    var placeholderText = searchBox.attr("placeholder");
    searchBox.focusin( function() {
        searchBox.attr("placeholder", "");
    } );
    searchBox.focusout( function() {
        searchBox.attr("placeholder", placeholderText);
    } );
    
    // products table
    $("table").tablesorter({
        // this will apply the bootstrap theme if "uitheme" widget is included
        theme : "bootstrap",
        widthFixed: true,
        headerTemplate : '{content} {icon}', // new in v2.7. Needed to add the bootstrap icon!
        // widget code contained in the jquery.tablesorter.widgets.js file
        widgets : [ "uitheme", "zebra" ]
    });
    
    
    
});