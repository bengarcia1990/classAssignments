
let username = $('#enteredName');
var submit = $('#enter')
const message = $('p#selection');


// var p = function getUserByName(username) {
//     return new Promise(function (resolve, reject) {
//         $.get('http://jsonplaceholder.typicode.com/users?username=' + username, function (users) {
//             if (users.length) resolve(users[0])
//             else reject('User with ' + username + ' not found')

//         });

//     })
// };



submit.on('click', function () {

})
});


function getUserPosts(user) {
    return new Promise(function (resolve) {
        $.get('http://jsonplaceholder.typicode.com/posts?userid=' + user.Id, function (posts) {
            resolve(posts)
        })
    })
}

function postViewing(posts) {
    return new Promise(function (resolve) {


    })
}


