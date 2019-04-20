var littleOne = [];
var howTheyMarch = ["one by one", "two by two", "three by three", "four by four", "five by five", "six by six", "seven by seven", "eight by eight", "nine by nine", "ten by ten"];

littleOne[0] = "The little one stops to suck her thumb";
littleOne[1] = "The little one stops to tie his shoe";
littleOne[2] = "The little one stops to climb a tree";
littleOne[3] = "The little one stops to shut the door";
littleOne[4] = "The little one stops to take a dive";
littleOne[5] = "The little one stops to pick up sticks";
littleOne[6] = "The little one stops to pray to heaven";
littleOne[7] = "The little one stops to roll a skate";
littleOne[8] = "The little one stops to check the time";
littleOne[9] = "The little one stops to shut The End";


function howManyByHowMany() {
    for (let i = 0; i < howTheyMarch.length; i++) {
        var numbers = howTheyMarch[i];
        var hurrah = " hurrah, hurrah \n";
        var march = "The ants go marching " + numbers;
        debugger
        console.log(march + hurrah + march + hurrah + march);
        console.log(littleOne[i]);
        console.log("And they all go marching down to the ground to get out of the rain, BOOM! BOOM! BOOM!");
    }
}

function theAntsGoMarching() {
    howManyByHowMany();
}
theAntsGoMarching();

//what was wrong with the original code:
//little ones arrays and howManyByHowMany were below theAntsGoMarching function
//code in theAntsGoMarching was unnessary, should all be condensed into howManybyHowMany for execution simplicity/clarity
//howManybyHowMany's numbers argument was unnecessary when code was condensed 
//howTheyMarch array was missing brackets to allow for incrementation
//not sure what debugger was meant to accomplish here but my IDE's debugger said there were no probs with the function
