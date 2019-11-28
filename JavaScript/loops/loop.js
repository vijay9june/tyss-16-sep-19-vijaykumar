/*
//for of loop
console.log('for of loop')
var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('for a loop')
for(var element of brands){
    console.log('brand =',element)
}
console.log('...............');

//for in loop for array
console.log('for in loop')
var brands = ['kingfisher','bisleri','aqua','kinley']
for(var index in brands){
console.log('brand =',brands[index]);
}
console.log('...............');

//for in loop of object
console.log('for in loop of object')
var person = {
    name : 'sundari',
    age : 33,
    color : 'white'
}
for(var key in person){
    console.log('value =',person[key])
}
console.log('...............');

//forEach method

console.log('for each method of array')
var movies = ['sholay ','dil ','ghatak ','ghayal ']
movies.forEach(function(value,index){
    console.log('movie =',value)
    console.log('movie index =',index)
})

//using forEach

console.log('for each for items')
var items=[
    {
        item:'bangles',
        id: 1,
        price: 100
    },
    {
        item:'eyeliner',
        id: 2,
        price:200  
    },

    {
        item:'watch',
        id: 3,
        price:5000  
    },

    {
        item:'bike',
        id: 4,
        price:1000000  
    }
]
items.forEach(function(item,index){
    console.log('item =',item)
    console.log('index of item =',index)
})*/

var name;
var name ='pailwan';
name ='diljale'

//console.log(name1) //hoisting not possible
let name1;
//let name1 ='saaho' //no redeclaration
name1 ='valmiki'

//const name2; //only declaration not possible
const name2 ='jurm';
//name2 ='ajay' //not reassigning possible

for(let i=0;i<5;i++){
    console.log('inside for loop ',i)
}
console.log('outside


for loop ',i)