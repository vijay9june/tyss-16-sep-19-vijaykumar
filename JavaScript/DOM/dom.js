let h1Element = document.getElementById('demo')
console.log('Element ',h1Element)
console.log('Element Text = ',h1Element.textContent)
h1Element.textContent = 'Test Yantra'
console.log('----------')
let buttonElement = document.createElement('Button')
buttonElement.textContent = 'Click ME!!!!!'
console.log('Button Element',buttonElement)

document.body.appendChild(buttonElement);
let u1Element = document.createElement('u1')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = 'Java'
li2Element.textContent = 'Sql'
li3Element.textContent = 'JaveScript'

u1Element.appendChild(li1Element)
u1Element.appendChild(li2Element)
u1Element.appendChild(li3Element)
document.body.appendChild(u1Element)

h1Element.style.color = 'green'
h1Element.style.fontSize = '50px'

function showMessage(){
    alert('Hi Hello Welcome!!!!!')
}

function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'red'
}

function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = "black"
}

function printHello(){
    //console.log('Hello')
    let userName = document.getElementById('username').value
    document.getElementById('showusername').textContent = userName;
}
let name = 'rakesh'
let age = 21
let phoneno = 9797989999
console.log('Name is '+name + 'Age is '+age + 'Phone no '+phoneno)
console.log('Nmae is ${name} Age is ${age} Phone no is ${phoneno}' )
console.log('2 + 2 = ${2+2}' )

//document.getElementById('b1').disabled = false






