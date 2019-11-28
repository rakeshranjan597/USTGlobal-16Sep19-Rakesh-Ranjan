// Named Function
function add(num1,num2){
    console.log(num1+num2)
}
add(21,12)


// Function Expression(Anonymous)
var sub=function(num1,num2){
    return num1-num2
}
var val=sub(100,90)
console.log(val)



//  Self Invoked Functions
(function(num1,num2){
    console.log("Value: ",num1*num2)
})(10,20)


//  Fat Arrow Functions
var div=(num1,num2)=> {
    console.log("Value: ",num1/num2)
}
div(50,10)

//  For single Parameter
var div = num1=>{
    console.log("Value:",num1)
}

var x=1452
var sum=0
while(x!=0){
    console.log(x%10)
//    console.log(r)
//    sum+=r
    x=x/10
}
console.log(sum)
