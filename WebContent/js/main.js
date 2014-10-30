$(document).ready(function() {
    
    $("table").tablesorter({
        // this will apply the bootstrap theme if "uitheme" widget is included
        theme : "bootstrap",
        widthFixed: true,
        headerTemplate : '{content} {icon}', // new in v2.7. Needed to add the bootstrap icon!
        // widget code contained in the jquery.tablesorter.widgets.js file
        widgets : [ "uitheme", "zebra" ],

    })
    
});