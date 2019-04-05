// Let's revisit Rock Paper Scissors...
//     Define a hands array with the values 'rock', 'paper', and 'scissors';
//     Define a function called getHand() that returns a hand from the array using parseInt(Math.random()*10)%3
//     Define two objects for two players. Each player has name and getHand() properties.
//     Define a function called playRound() that
//         Takes two player objects as arguments
//         Gets hands from each
//         Determines the winner
//         Logs the hands played and name of the winner.
//         If its a tie, log the hands played and "it's a tie".
//         Returns the winner object (null if no winner)

//     Define a function called playGame() that takes arguments player1, player2, and playUntil.
//         Play rounds until one of the players wins playUntil hands
//         When one player has won enough games, return the winning player object
//     Play a game to 5 wins
// !!!!Bonus!!!!!
//     Define a function caled playTournament()
//         Take 4 players and playUntil as arguments
//         Play a game between the first two players, and the second two players
//         Play a game between the winners of the first round.
//         Announce the tournament winner's name "[name] is the world champion";

var hands = [
    'rock',
    'paper',
    'scissors'
]

function getHands() {
    return hands[parseInt(Math.random() * 10) % 3]
}

var player1 = [
    { name: 'Ben' },
    { weapon: '' }
]
var player2 = [
    { name: 'Paulos' },
    { weapon: '' }
]

let p1win = 0;
let p2win = 0;

function playRound() {
    player1.weapon = getHands()
    player2.weapon = getHands()

    if (player1.weapon === player2.weapon) {
        console.log("It's a tie!")
    }
    else if (player1.weapon === 'rock' && player2.weapon === 'scissors' || player1.weapon === 'paper' && player2.weapon === 'rock' || player1.weapon === 'scissors' && player2.weapon === 'paper') {
        p1win++;
        console.log(player1[0].name + " " + "wins")
    }
    else if (player2.weapon === 'paper' && player1.weapon === 'rock' || player2.weapon === 'rock' && player1.weapon === 'scissors' || player2.weapon === 'scissors' && player1.weapon === 'paper') {
        p2win++;
        console.log(player2[0].name + " " + "wins")
    }

}

//Define a function called playGame() that takes arguments player1, player2, and playUntil.
//         Play rounds until one of the players wins playUntil hands
//         When one player has won enough games, return the winning player object
//     Play a game to 5 wins

function playGame(player1, player2, playUntil) {
    while (p1win < playUntil && p2win < playUntil) {
        playRound(player1, player2)
    }

    if (p1win === 5) {
        console.log(player1[0].name + " " + "wins it all!")
    }
    else { console.log(player2[0].name + " " + "wins it all!") }
}
//playRound(player1, player2);
playGame(player1, player2, 5);
