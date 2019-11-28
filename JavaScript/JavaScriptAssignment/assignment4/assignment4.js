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


const states = ['bihar ','u.p ','bangal ','Punjab ']
console.log('nameof states');

const isArrayorNot = Array.isArray(states) //it will identify that array or not
console.log('states Array or not ',isArrayorNot)
const hasPunjab =states.includes('Punjab',1); //it will check that following element is having or not in array
console.log('using includes method ',hasPunjab)
states.push('haryana ','m.p') //it will add element in end
console.log('after push method ',states)
states.pop() //it will removed element from end
console.log('after pop method ',states)

states.unshift('j$k','utrakhand')   //it will add elements to first index 
console.log('after unshift method',states)
states.shift()                              //it will removed element from first index
console.log('after shift method',states)

const games = ['cricket ','fotball ','hockey ','wrestling ']
games.splice(1,0,'kabaddi','badminton')
console.log('after splice method ',games)
games.splice(1,2,'kabaddi','badminton')
console.log('after splice method ',games)
const afterSlice=games.slice(2,5)
console.log('after slice method',games)
console.log('after slice method',afterSlice)
const indexOfHockey = games.indexOf('hockey',1)
console.log('Index of indexOfHockey',indexOfHockey)
const stringGames = games.join('-')
console.log('array as string',stringGames)
const numbers = [50,200,500,400]
const nums1=numbers.map(function(value,index){
let newValue=value+100
return newValue
})
console.log('after map method',nums1)
const nums2 = numbers.map(value=>value+500)
console.log('after map arrow function',nums2)

const filterNum=
numbers.filter(function(value,index){
if(value>200){
    return true
}else{
    return false
}
}
)
console.log('after filter method',filterNum)
const filterNumArrow = 
numbers.filter(value=>value>200)
console.log('after filter method using arrow',filterNumArrow)
filterNumArrow




/*const updatedItem = items.map(function(item,index){
    item.price = item.price + 300
    return item
})

const itemsArrow = items.map((value)=>{
    value.price = value.price + 300
    return value
})*/

//const filterItems = items.filter((item)=>item.price>1000)