// let x = 0;

// for (x; x <= 100; x++) {
//     if (x % 3 === 0) {
//         console.log("what", x);
//     }
//     if (x % 5 === 0) {
//         console.log("up", x);
//     }
//     if (x % 3 === 0 && x % 5 === 0) {
//         console.log("what up", x);
//     }
// }

// const myvar = "c";

// switch (myvar) {
//     case "a": console.log("hey");
//         break;
//     case "b": console.log("foo");
//     case "c": console.log("bar");
// }

var score1 = 0;
var score2 = 0;
var weapons = ["rock", "paper", "scissors"];
var p1weapon = null;
var p2weapon = null;

let p1 = " ";
let p2 = "Skynet";

function getNames() {
    p1 = window.prompt("What is your name?")
    return p1;
}

getNames();

// function player1Weapon() {
//     p1weapon = window.prompt("Choose your weapon, human - rock paper or scissors (lowercase please)")
// }

// player1Weapon(); 

while (score1 < 3 && score2 < 3) {

    p1weapon = window.prompt("rock, paper or scissors?");
    p2weapon = weapons[Math.floor(Math.random() * weapons.length)];
    document.getElementById("roundHand1").innerHTML = (p1 + ": " + p1weapon);
    document.getElementById("roundHand2").innerHTML = (p2 + ": " + p2weapon);

    if (p1weapon === p2weapon) {
        document.getElementById("roundSummary").innerHTML = ("No winner this round!");
    }
    else if (p1weapon == "rock" && p2weapon == "scissors" || p1weapon == "paper" && p2weapon == "rock" || p1weapon == "scissors" && p2weapon == "paper") {
        score1++;
        document.getElementById("roundSummary").innerHTML = (p1 + ": " + score1 + " and " + p2 + ": " + score2);

    }
    else { score2++ , document.getElementById("roundSummary").innerHTML = (p1 + " : " + score1 + " and " + p2 + ": " + score2) }

}
function announceWinner() {
    return score1 === 3 ? p1 + " " + "wins!" : p2 + " " + "wins!"
}

console.log(announceWinner())
document.getElementById("victor").innerHTML = announceWinner();