let num1 = parseInt(prompt("enter the first number"));
let num2 = parseInt(prompt("enter the second number"));
console.log("before the swapping",num1);
console.log("before the swapping",num2);
num1 = num1+num2;
num2 = num1-num2;
num1 = num1-num2;
console.log("after the swapping",num1);
console.log("after the swapping",num2);