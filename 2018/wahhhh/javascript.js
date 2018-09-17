$(document).ready(function () {
  var $horizontal = $('#slide');
  console.log("scroll scroll");
  $(window).scroll(function () {
    var s = $(this).scrollTop(),
    d = $(document).height(),
    c = $(this).height();

  scrollPercent = (s / (d - c));

  var position = (scrollPercent * ($(document).width() - $horizontal.width()));
        
  $horizontal.css({
          'left': position
        });
    });
});

function playSound() {
  document.getElementById("sad-trombone").play();
}

function slidethetrombone() {
  document.getElementById('slide').className ='sadtrombone';
  console.log("sliding the trombone... wah wah wah wahhhh...");
  setTimeout(function(){ document.getElementById('slide').className ='hello'; }, 3000);
}
