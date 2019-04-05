let x = 0;

for (x; x <= 100; x++) {
    if (x % 3 === 0) {
        console.log("what", x);
    }
    if (x % 5 === 0) {
        console.log("up", x);
    }
    if (x % 3 === 0 && x % 5 === 0) {
        console.log("what up", x);
    }
}

const myvar = "c";

switch (myvar) {
    case "a": console.log("hey");
        break;
    case "b": console.log("foo");
    case "c": console.log("bar");
}


const p1 = "player 1 ";
const p2 = "player 2 ";
var score1 = 0;
var score2 = 0;
var weapons = ["rock", "paper", "scissors"];
var p1weapon = null;
var p2weapon = null;

while (score1 < 3 && score2 < 3) {

    p1weapon = weapons[Math.floor(Math.random() * weapons.length)];
    p2weapon = weapons[Math.floor(Math.random() * weapons.length)];

    if (p1weapon === p2weapon) {
        console.log(p1 + p1weapon);
        console.log(p2 + p2weapon);
        console.log("No winner this round!");
    }
    else if (p1weapon == "rock" && p2weapon == "scissors" || p1weapon == "paper" && p2weapon == "rock" || p1weapon == "scissors" && p2weapon == "paper") {
        console.log(p1 + p1weapon);
        console.log(p2 + p2weapon);
        score1++;
        console.log(p1 + ": " + score1 + " and " + p2 + ": " + score2);

    }
    else if (p2weapon == "rock" && p1weapon == "scissors" || p2weapon == "paper" || p1weapon == "rock" || p2weapon == "scissors" && p1weapon == "paper") {
        console.log(p1 + p1weapon);
        console.log(p2 + p2weapon);
        score2++;
        console.log(p1 + ": " + score1 + " and " + p2 + ": " + score2);
    }

}
if (score1 === 3) {
    console.log("Player 1 wins!")
}
else if (score2 === 3) {
    console.log("Player 2 wins!")
}
