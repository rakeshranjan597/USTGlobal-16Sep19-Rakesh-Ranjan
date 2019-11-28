let h1Element = document.getElementById('demo')
console.log("Element:",h1Element)
console.log("Element Text:",h1Element.textContent)
h1Element.textContent="Good Evening!!!"

console.log("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
let buttonElement = document.createElement('button')
buttonElement.textContent=" Click Me!! "
console.log("Button Element",buttonElement)
document.body.appendChild(buttonElement)

let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = "JAVA"
li2Element.textContent = "SQL"
li3Element.textContent = "PYTHON"

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color='red';

function showMessage(){
    alert('Hi Welcome !!!!!')
}

function changeColor(){
    document.getElementById('changeCol').style.color='red'
}

function restoreColor(){
    document.getElementById('changeCol').style.color='black'
}

function printHello(){
    console.log('Hello')
    let userName = document.getElementById('userName').value
    document.getElementById('showUserName').innerHTML=userName
}

let name = "rakesh"
let age = 21
console.log(`name is ${name} and age is ${age}`)