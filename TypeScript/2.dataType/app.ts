let myName : string = "rakesh ranjan"
console.log(myName, typeof(myName))

let age : number;
console.log(age, typeof(age))

let mobile = 7488320112;
console.log(mobile, typeof(mobile))

let address;
address="patna-bihar"
console.log(address, typeof(address))

//      void
let calAge = function() : void{
    console.log("age:", 21);
}
calAge();


class Person{
    constructor(public name : string , public age : number){

    }
}

let person1 = new Person('rakesh',21);
console.log(person1)

class Student extends Person{
    constructor(name : string , age : number, public rollno : number ){
        super(name , age);
    }
}

let student1 = new Student('ranjan', 20, 98)
console.log(student1)

