var woolOwners = [
    {
        "master": 1
    },
    {
        "dame": 1
    },
    {
        "little boy": 1,
        "location": "down the lane"
    }
];




var haveYouAnyWool = function () {

    for (let i = 0; i <= woolOwners.length; i++) {
        var totalBags = 0;
        totalBags = i;
    }
    return (totalBags);
};

debugger;

var bags = haveYouAnyWool();

function baabaaBlackSheep() {
    console.log("BaaBaa BlackSheep have you any wool?");
    if (bags > 0) {
        console.log("yes sir, yes sir " + bags + " bags full");
    }
}

debugger;

function oneForMy() {
    for (var i = 0; i < woolOwners.length; i++) {
        var people = Object.keys(woolOwners[i]);
        var person = people.toString();
        console.log("one for my " + person);
    }
}
debugger;
baabaaBlackSheep();

oneForMy();

const boy = Object.keys(woolOwners[2]);
const littleBoy = boy[0];


var whereHeLives = woolOwners[2].location;
console.log("one for the " + littleBoy + " that lives " + whereHeLives);