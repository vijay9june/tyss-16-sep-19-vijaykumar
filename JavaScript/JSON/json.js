const person = {
    name : 'sundara',
    age : 100,
    color : 'white',
    address : {
                city : 'Bijapur',
                state : 'karnataka',
                pincode : 591115
              },
    hobbies : ['coding','Bird Watching','singing']
            }
console.log('JavaScript person object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person object',jsonObject)
const JavaScriptPersonObject = JSON.parse(jsonObject) 
console.log('javaScript person object after parse',JavaScriptPersonObject)

localStorage.setItem('email','billgates@gmail.com')
const emailId = localStorage.getItem('email')
console.log('Email Id',emailId)
localStorage.clear();

