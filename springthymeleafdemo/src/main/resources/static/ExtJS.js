$(function () {

    $('.loading').hide();

    $('body').on('click', '#alertBtn', function () {
        alert("Hello");
        console.log("alert");
    });

});