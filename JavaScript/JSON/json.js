const person = {
    name: 'Sundra',
    age: 35,
    color: 'white',
    address: {
            city: 'Bijapur',
            state: 'Karanataka',
            pincode: 591115
    },
    hobbies: ['coding','bird watching','singing']
}
console.log('JavaScript person Object:',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person Object:',jsonObject)

const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('JavaScript person object after parse',javaScriptPersonObject)

localStorage.setItem('email','rakeshranjan597@gmail.com')

const emailId = localStorage.getItem('email')
console.log('Email Id:',emailId)
localStorage.clear()
