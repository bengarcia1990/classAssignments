
// function upperCaser(input) {
//     return input.toUpperCase();
// }

// module.exports = upperCaser

// function repeat(operation, num) {

//     for (i = 0; i < num; i++) {
//         operation();
//     }

// }

// // Do not remove the line below
// module.exports = repeat

// function doubleAll(numbers) {
//     // SOLUTION GOES HERE
//     var arr = numbers.map(function (n) { return n * 2 })

//     return arr
// }

// module.exports = doubleAll

// function getShortMessages(messages) {
//   // SOLUTION GOES HERE
//   return messages.filter(function (a) {
//     return a.message.length <= 50
//   }).map(function (b) {
//     return b.message
//   })
// }

// module.exports = getShortMessages

function checkUsersValid(goodUsers) {
  return function allUsersValid(submittedUsers) {
    // SOLUTION GOES HERE
    if (goodUsers.some(submittedUsers) === true) {
      var x = goodUsers.every(submittedUsers);
      return x
    }
    else {
      return false
    }
  };
}

module.exports = checkUsersValid