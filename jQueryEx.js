const a = $("header");
const b = $("section").find("*");
let current = $(".current");
current.next();
current.prev().find("h2")[0];
// $(".highlight").parent().parent();
// let allH2 = Array.from($("section").find("h2"));

console.log(current);