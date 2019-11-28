console.log("Window Object",window);
console.log('This Keyword',this)
console.log('This Keyword',this===window)

// alert('Welcome to JS')

// let del = confirm("Want to delete")  // return true/false
// console.log(del);

// let userName = prompt("What\'s your name? ", 'rakesh')
// console.log('User Name: ',userName)

const person = {
    firstName: 'Alia',
    age: 26,
    lastName: 'kapoor',
    getName: function(){
        console.log(this)
        return this.firstName + ' ' + this.lastName
    }
}
let fullName = person.getName()
console.log("Full Name:",fullName)