// create a function that takes one param and inside makes the value Uppercase
function convertToUpperCase (word) {
    if (typeof word === 'string') {
    return word.toUpperCase();
    } else {
        console.log("Incorrect data type");
    }
}

// create js function that add properties for the object, allowing only number
function addNumericProperties (obj, propName, propValue) {
    if (typeof propValue === 'number') {
        obj[propName] = propValue;
    } else {
        console.log('Property "${propName}" cannot be added, because it is not a number.');
    }
}

//create JS object with 5 different properties
const newObject = {
    name: 'Ana',
    age: 30,
    city: 'Kyiv',
    occupation: 'QA analyst',
    nationality: 'Ukrainian'
  };

// with previously created function add a new property
addNumericProperties(newObject, 'height', 175)

// check the function syntax and if some issues propose
let sum = function (a, b) {
    return a + b;
  };
