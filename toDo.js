var list = document.getElementById("list");
const button = document.getElementById("startList");


button.addEventListener('click', function () {
    let a = document.getElementById("newDo").value;
    let b = document.getElementById("inputForm");

    if (a !== '') {
        list.appendChild(document.createElement('li'));

        let newItem = list.children[list.children.length - 1];

        newItem.innerHTML = a;
        b.reset();
        newItem.addEventListener('click', function () {
            newItem.remove();
        });
    }
    else { alert("Please enter a valid to-do") }
});




console.log(button);
