// // var students = [
// // 	{firstName: 'Cam', lastName: 'Newton'},
// // 	{firstName: 'Ted', lastName: 'Ginn'},
// // 	{firstName: 'Greg', lastName: 'Olsen'}
// // ]

// // var fullNames = students(function(student){
// // 	return student.firstName + ' ' + student.lastName;
// // })

// //fullNames === ["Cam Newton", "Ted Ginn", "Greg Olsen"]

// var superHeroes = [
//     ["batman", "Bruce Wayne"],
//     ["spiderman", "Peter Parker"],
//     ["the flash", "Barry Allen"]
// ]

// var secretIdentity = 0;

// secretIdentity = superHeroes.map(function (revealArray) {
//     return revealArray.join(" " + "is" + " ")
// })
// console.log(secretIdentity);




// // Find a player with the name 'Mike'
// // Get an array of all players with position 'RB'
// // Get an array of all the players lastNames
// // Get an array of the full names of all the runningbacks with more than 5 touchdowns
// // Get the number of touchdowns scored by Runningbacks


// var players = [
//     { firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32 },
//     { firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0 },
//     { firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12 },
//     { firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8 },
//     { firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3 },
//     { firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9 },
//     { firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2 }
// ];

// const e = players.find(function (player) {
//     return player.firstName == 'Mike';
// });

// const f = players.filter(function (rbs) {
//     return rbs.position == 'RB'
// })


// const g = players.map(function (sur) {
//     return sur.lastName
// })

// const h = players.filter(function (topRB) {
//     return topRB.touchdowns > 5 && topRB.position == 'RB'
// }).map(function (blah) {
//     return blah.firstName + " " + blah.lastName
// });

// const i = players.filter(function (areB) {
//     return areB.position == 'RB'
// }).reduce(function (sum, curr) {
//     return sum + curr.touchdowns
// }, 0);

// console.log(e)
// console.log(f)
// console.log(g)
// console.log(h)
// console.log(i)