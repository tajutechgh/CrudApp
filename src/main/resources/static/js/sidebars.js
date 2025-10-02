/* global bootstrap: false */
(function () {
  'use strict'
  var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
  tooltipTriggerList.forEach(function (tooltipTriggerEl) {
    new bootstrap.Tooltip(tooltipTriggerEl)
  })
})()

$(document).ready(function () {
  $(".nav-item a").each(function () {
    if (this.href === window.location.href) {
      $(this).addClass("active");
    }
  });
});
