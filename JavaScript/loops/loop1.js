
console.log('for of loop')
var names = ['ajay','vijay','sumit','sanjit','ankit']
console.log('forof loop')
for(var element of names){
    console.log('name =',element)
}

var sports = ['cricket','hockey','fotball','tennis']
console.log('for of loop')
for(var element of sports){
    console.log('sports =',element)
}

var foods = ['rice','daal','puri','sabji']
console.log('for loop')
for(var element of foods){
    console.log('foods =',element)
}

var fruits = ['apple','mango','orange','pineapple']
console.log('for loop')
for(var element of fruits){
    console.log('fruits =',element)
}

var players = ['sehwag','sachin','dhoni','yuvi']
console.log('for loop')
for(var element of players){
    console.log('players =',element)
}

var subjects = ['math','science','arts','commerce']
console.log('for loop')
for(var element of subjects){
    console.log('subjects =',element)
}

var cars = ['bugatti','ferrari','range rover','bmw']
console.log('for loop')
for(var element of cars){
    console.log('cars =',element)
}

var places = ['delhi','mumbai','kolkata','bangalore']
console.log('for loop')
for(var element of places){
    console.log('places =',element)
}





console.log('for in loop for array')
var names = ['ajay','vijay','sumit','sanjit','ankit']
for(var index in names){
console.log('names =',names[index]);
}
console.log('...............');

var language = ['java','j2ee','sql','python']
for(var index in language){
console.log('names =',language[index]);
}
console.log('...............');

var sports = ['cricket','hockey','fotball','tennis']
for(var index in sports){
console.log('names =',sports[index]);
}
console.log('...............');

var players = ['sehwag','sachin','dhoni','yuvi']
for(var index in players){
console.log('player =',players[index]);
}
console.log('...............');

var fruits = ['apple','mango','orange','pineapple']
for(var index in fruits){
console.log('fruitnames =',fruits[index]);
}
console.log('...............');



//for in loop of object
console.log('for in loop of object')
var address = {
    village : 'mangrauni',
    pincode : 847211,
    dist : 'madhubani'
}
for(var key in address){
    console.log('value =',address[key])
}

console.log('for in loop of object')
var courses = {
    name : 'java',
    fee : 20000,
    institute : 'jspider'
}
for(var key in courses){
    console.log('value =',courses[key])
}

console.log('for in loop of object')
var mobile = {
    mobilename : 'oppo',
    number : 8178038728,
    model : 'k1'
}
for(var key in mobile){
    console.log('value =',mobile[key])
}

console.log('for in loop of object')
var hotel = {
    name : 'taj',
    fare : 5000,
    state : 'mumbai'
}
for(var key in hotel){
    console.log('value =',hotel[key])
}

console.log('for in loop of object')
var school = {
    student : 'aayush',
    fee : 2000,
    board : 'cbse'
}
for(var key in school){
    console.log('details =',school[key])
}



//using forEach
console.log('for each method of array')
var sports = ['cricket','hockey','fotball','tennis']
sports.forEach(function(value,index){
    console.log('sport =',value)
    console.log('sport index =',index)
})

console.log('for each method of array')
var names = ['ajay','vijay','sujit','sanjeet']
names.forEach(function(value,index){
    console.log('names =',value)
    console.log('names index =',index)
})

console.log('for each method of array')
var books = ['math','science','history','bio']
books.forEach(function(value,index){
    console.log('books =',value)
    console.log('books index =',index)
})

console.log('for each method of array')
var players = ['sehwag','sachin','dhoni','yuvi']
players.forEach(function(value,index){
    console.log('players =',value)
    console.log('players index =',index)
})


console.log('for each method of array')
var fruits = ['apple','mango','orange','pineapple']
fruits.forEach(function(value,index){
    console.log('fruits =',value)
    console.log('fruits index =',index)
})

//using forEach

console.log('for each for items')
var fruits=[
    {
        item:'apple',
        id: 1,
        price: 100
    },
    {
        item:'mango',
        id: 2,
        price:200  
    },

    {
        item:'orange',
        id: 3,
        price:300  
    },

    {
        item:'lichi',
        id: 4,
        price:120  
    }
]
fruits.forEach(function(item,index){
    console.log('item =',item)
    console.log('index of item =',index)
})

console.log('for each for items')
var persons=[
    {
        name:'ajay',
        id: 1,
        age: 31
    },
    {
        name:'vijay',
        id: 2,
        price:26  
    },

    {
        name:'sumit',
        id: 3,
        price:20  
    },

    {
        item:'sanjit',
        id: 4,
        price:17  
    }
]
persons.forEach(function(item,index){
    console.log('person =',item)
    console.log('index of person =',index)
})



console.log('for each for items')
var cars =[
    {
        name:'audi',
        id: 1,
        price: 20000000
    },
    {
        name:'bmw',
        id: 2,
        price:25000000  
    },

    {
        name:'range rover',
        id: 3,
        price:15000000 
    },

    {
        name:'hondacity',
        id: 4,
        price:1200000  
    }
]
cars.forEach(function(item,index){
    console.log('cars =',item)
    console.log('index of cars =',index)
})



