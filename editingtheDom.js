// 1. Update the 'Coffee' item to say 'Fair Trade Coffee'
// 2. Remove 'Twinkies' from the list
// 3. Add an item 'Cheese Whiz'
// 4. Clear the list and programmatically add items from the array `['protein powder', 'muscle milk', 'power bars']`
// 5. Add the class 'important' to the muscle milk item.


var list = document.getElementById("list");
var listItems = list.querySelectorAll("li");
//#1
var coffee = listItems[1];
coffee.innerHTML = "Fair Trade Coffee"
//#2
const twinkie = listItems[3];
twinkie.remove();
//#3
const cheeseWhiz = document.createElement('li');
cheeseWhiz.innerHTML = "Cheese Whiz";
list.appendChild(cheeseWhiz);
//#4
//listItems.remove();

var newList = ['protein powder', 'muscle milk', 'power bars'];

for (let i = 0; i < newList.length; i++) {
    listItems[i].remove();
    var updatedList = document.createElement('li');
    updatedList.innerHTML = newList[i];
    list.appendChild(updatedList);
}



console.log(listItems)