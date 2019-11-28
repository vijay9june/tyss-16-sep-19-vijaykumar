const hobbies = ['sleeping ','cricket ','eating ','coding ','roaming']
console.log(typeof hobbies);

const isArrayorNot = Array.isArray(hobbies) //it will identify that array or not
console.log('Hobbies Array or not ',isArrayorNot)
const hasCricket =hobbies.includes('Cricket'); //it will check that following element is having or not in array
console.log('using includes method ',hasCricket)
hobbies.push('guitar ','volleyball') //it will add element in end
console.log('after push method ',hobbies)
hobbies.pop(1) //it will removed element from end
console.log('after pop method ',hobbies)

hobbies.unshift('numismatics','singing')   //it will add elements to first index 
console.log('after unshift method',hobbies)
hobbies.shift()                              //it will removed element from first index
console.log('after shift method',hobbies)

const hobbies1 = ['sleeping ','cricket ','eating ','coding ','roaming']
hobbies1.splice(1,0,'bird watching','PUBG')
console.log('after splice method ',hobbies1)
hobbies1.splice(1,2,'bird watching','PUBG')
console.log('after splice method ',hobbies1)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const indexOfCoding = hobbies1.indexOf('coding',1)
console.log('Index of coding',indexOfCoding)
const stringHobbies = hobbies1.join('01')
console.log('array as string',stringHobbies)
const numbers = [100,200,300,400]
const nums1=numbers.map(function(value,index){
let newValue=value+50
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

const items ={
    name :'earring',
    id :1,
    price :5000
}


