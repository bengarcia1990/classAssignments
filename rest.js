
// - Get the comments from post with id of 12 <br> *note: comments are part of a different data model, you'll need to structure your endpoint to ask for all of the comments that belong to post #12*




// - Delete the post with id of 12 and render a success message
// - Display a list of posts.
//     - When the user clicks on a post, display all the comments from that post
//     - Display a link back to all posts


// - Get all posts
// // 1) Get all posts
// $.get('http://jsonplaceholder.typicode.com/posts', function (data) {
//     console.log(data);
// });

// // 2) Get post with id of 10
// $.get('http://jsonplaceholder.typicode.com/post/10', function (data) {
//     console.log(data);
// });

// // 3) Get the comments from post with id of 12
// $.get('http://jsonplaceholder.typicode.com/post/12/comments', function (data) {
//     console.log(data);
// });

// // 4) Get all the posts from user with id of 2
// $.get('http://jsonplaceholder.typicode.com/user/2/posts', function (data) {
//     console.log(data);
// });

// // 5) Create a new post and log the id generated for it by the server
// $.post('http://jsonplaceholder.typicode.com/posts', {
//     userId: 1,
//     title: "My New Post",
//     body: "This is the body"
// }, function (data) {
//     console.log(data.id)
// })

// // 6) Replace the post with id of 12
// $.ajax({
//     method: 'PUT',
//     url: 'http://jsonplaceholder.typicode.com/posts/12',
//     data: {
//         userId: 1,
//         title: "New Post",
//         body: "New post added"
//     },
//     complete: function (response) {
//         console.log(response.responseJSON);
//     }
// })

// // 7) Update the title field of the post with id of 12
// $.ajax({
//     method: 'PATCH',
//     url: 'http://jsonplaceholder.typicode.com/posts/12',
//     data: {
//         title: "patched it"
//     },
//     complete: function (response) {
//         console.log(response.responseJSON);
//     }
// })

// // 8) Delete the post with id of 12
// $.ajax({
//     method: 'DELETE',
//     url: 'http://jsonplaceholder.typicode.com/posts/12',
//     complete: function (response) {
//         console.log(response.statusText);
//     }
// })

var list = $("#list")

$("button#all").on('click', function () {
    list.text("");
    $.get('http://jsonplaceholder.typicode.com/posts', function (data) {
        data.forEach(function (post) {
            const li = $('<li>')
            li.text('Post' + post.id + ':' + post.body)
            list.append(li);
        })
    })
});


$("button#iD10").on('click', function () {
    list.text("");
    $.get('http://jsonplaceholder.typicode.com/posts', function (data) {
        data.forEach(function (post) {
            if (post.id === 10) {
                const li = $('<li>')
                li.text('Post' + post.id + ':' + post.body)
                list.append(li);
            }
        })
    })
});

$("button#user2Posts").on('click', function () {
    list.text("");
    $.get('http://jsonplaceholder.typicode.com/posts', function (data) {
        data.forEach(function (post) {
            if (post.userId === 2) {
                console.log(post)
                const li = $('<li>')
                li.text('Post' + post.id + ":" + post.body)
                list.append(li);
            }
        })
    })
});


$("button#createPost").on('click', function () {
    $.post('http://jsonplaceholder.typicode.com/posts', {
        userId: 1,
        title: "My New Post",
        body: "This is the body"
    }, function (data) {
        console.log(data.id)
    })
});

$("button#update12Title").on('click', function () {
    $.ajax({
        method: 'PUT',
        url: 'http://jsonplaceholder.typicode.com/posts/12',
        data: {
            userId: 1,
            title: "New Post",
            body: "New post added"
        },
        complete: function (response) {
            console.log(response.responseJSON);
        }
    })
});