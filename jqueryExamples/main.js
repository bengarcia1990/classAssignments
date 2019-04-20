$('#circle').click(function () {
    alert('Clicked');
});


$('#circle').hover(function () {
    $('p').html('We changed the text!')
});


$(".square").click(function () {
    $(this).css("background-color", "blue");
})
