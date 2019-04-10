// 1. Get the header element
// 2. Get all the section elements
// 3. Get the section element with class="current"
// 4. Get the section that comes after the current section
// 5. Get the h2 node from the section before the 'current' section
// 6. Get the div that contains the section that has an h2 with a class of 'highlight'
// 8. Get all the sections that contain an H2 (using a single statement)


const anchor = document.querySelector("li.selected");
//1
const first = anchor.parentElement.parentElement;
//2
const second = anchor.parentElement.parentElement.nextSibling.nextSibling.querySelectorAll("section");
//3
const third = anchor.parentElement.parentElement.nextSibling.nextSibling.querySelector("section.current");
//4
const fourth = third.nextElementSibling;
//5
const fifth = third.previousElementSibling.querySelector("h2");
//6
const sixth = third.parentElement;
//8
const seven = anchor.parentElement.parentElement.nextSibling.nextSibling.querySelectorAll("h2")


console.log(seven);