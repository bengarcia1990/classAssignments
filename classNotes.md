# Class Notes  
<br>
<br>

## Template literals are string literals that can use multiline lines
```
Console.log(“string text 1\n”
+”string text 2);
```
vs
```
Console.log(`Hello I am a string
continues on second line`)
```

## Example of concatenation
```
const name = “Jimmy”
const day = “Wednesday”
const instructor = {
	name: “Chris”,
	lesson: “ES6”,
	greet: function() {
		return Hello ${this.name}, whatever lesson is ${this.lesson}
}
}
```

~~~*Old way*~~~ 
```
console.log(“Hello”+name+”I hope you have a great day on”+day)
```  

**New Way**  
```
console.log(`Hello ${name} I hope you have a great day on ${day}`)

console.log(`Hello ${instructor.name}, whatever lesson is ${instructor.lesson}`)

console.log(instructor.greet());
```

## Hoisting 

__Var__ lets a variable get hoisted to the highest function  

```
function foo() {
	let x= true;
	if(x){
		var(v.s. let) usingVar = “I’m using let”;
}
console.log(usingVar)
}
foo();
```

__Const__- read only, cant be reassigned or redeclared. 

```
const instructors = [“jimm”, “Christ”]
instructors = [“jim”, “Christ”]

//will return type error

const instructors = [“jimm”, “Christ”]
instructors.push(“Jack”,”Jill”);  
```
<br>

## Default parameters
```
function hello(name){
	name = name || ‘Mystery Person‘;
	console.log(“Hello”+name+”!”)
	}
hello(“Bobby”); 		returns Hello Bobby!
hello(); 		returns Hello Mystery Person!

function hello(name = ‘Mystery Person’){
	name = name || ‘Mystery Person‘;
	console.log(`Hello ${namr} is it my you’re looking for`)
	}
//Mystery person will be the default return if you don’t pass a name //value when calling function
```

## Arrow Functions

```
const teacher = {

	name: “Jimmy”
	speak: function(){
		let boundFunction = function(){
			console.log(‘later my name is’ + this.name);
}.bind(this);
	//bound function will always run in bound context
	setTimeout(boundFunction, 1000);
	}
};
```

Vs

```
const teacher = {

	name: “Jimmy”,
	speak() {
		let boundFunction = () => {
			console.log(‘later my name is’ + this.name);
};
	setTimeout(boundFunction, 1000);
	}
};

teacher.speak();
```

__Lexical binding__ – binds to the scope where they are defined not where they are used  

```
let students = [
	{name: ‘Hugo’}
	{name: ‘Candace’}
	{name: ‘Taylor’}
	{name: ‘Dimitri’}
];
let names = students.map({student} => student.name);
same as (because return is implicit when on the same line in an arrow function)
let names = students.map({student} => {
return student.name
});

console.log(names);
```

REST
```
function add(){
	console.log(“arguments object:”, arguments);
	
	var numbers = Array.prototype.slice.call(arguments);
	var sum = 0;
	
numbers.forEach(function(number){
		sum+= number;
		});
return sum;
}

console.log(add(1,2,3,4,5,6,7,8));
```
__same as__

```
let add = (…numbers) => numbers.reduce((sum,number)=>sum+=number, 0);
rest is always in the function, gathers the values and stores them
… is the rest parameter (basically means pull all the args when add is called and put them in numbers var
```

## Spread
Takes a value of the items and puts them into individual elements
```
Let random = [“hello”, “world”, true, 99]
Let newArray = [1, 2, …random, 3]


console.log(newArray);
//[1,2,”hello”,”world”,true,99,3]
```

## Destructuring  
```
Var students = [“julian”, “aj”, “matt”]

How: console.log(x, y, z)
	Basic way to pull array objects out: 
	Var x = students[0];
	Var y = students[1];
	Var z = students[2];
	console.log(x, y, z);
let students = [“julian”, “aj”, “matt”];
let [x, y, z] = students;
let [ x,,z] = students; julian matt
let [x,…rest] = students;
	console.log(x, rest); julian [aj, matt]

let[x,y,y]=completedHomework();
console.log(x,y,z);

// can also work with objects

let instructor = {
	name: “jimmy”
	email: no@no.com
}

Let{name:x, email:y} = instructor;
Console.log(x);

```

## Constructor  

```
function Person (name, job){
	this.name = name;
	this.job = job;
}

Person.prototype.getName = function getName(){
	return this.name;
}

var goodGuy = new Person (“Aang”, “Airbender”)
console.log(goodGuy.getName())
```

**constructor creates template** 

**extends (class) and super (properties) allows you to inherit properties**

let student = {name:”A-aron”};
let stats = new Map();

status.set(name, “D-nice”);
status.set(“stubborn”, “churlish”);
console.log(status.length(name));
console.log(status.get(“feeling”));
