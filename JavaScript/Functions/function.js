/*Named Functions
function add(num1,num2){
    console.log('sum= ',num1+num2);
}
add(10,20)



//No method with same name
function add(num1,num2,num3){
    console.log('sum value= ',num1+num2+num3)
}

//Function Expression(anonymous)
var sub = function(num1,num2){
    var subValue = num1-num2;
    return subValue;
}
var value = sub(90,89)
console.log('value =',value)

//Self invoked functions
console.log('hello');
(function(num1,num2){
    console.log('value =',num1*num2);
})
(10,20)

//only named function can call function before declare variable
greeting('chandan');
function greeting(msg){
    console.log('hello ',msg);
}

//Fat arrow functions
var div=(num1,num2)=>{
    console.log('value =',num1/num2);}
    div(10,5);

greet('dinga');
var greet =function(msg){
    console.log('Hi ',msg);
}

greets('dingi');
var greets =(msg)=>{
    console.log('hi ',msg)
}*/

console.log(hoist)
var hoist=10;
function hoisting(){
    console.log(hoistingA);
    var hoistingA;
}
hoisting();


