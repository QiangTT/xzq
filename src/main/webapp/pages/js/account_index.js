$(function () {
   $("#check_year").click(function () {
       var pathIndex = window.location.pathname.substring(1).indexOf("/");
       var pathName = window.location.pathname.substring(0,pathIndex+1);
      location.href=pathName+"/accountyQuery"
   });
    $("#check_month").click(function () {
        var pathIndex = window.location.pathname.substring(1).indexOf("/");
        var pathName = window.location.pathname.substring(0,pathIndex+1);
        location.href=pathName+"/accountMQuery"
    })
});
