
/*
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}


let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value:', counter)
*/


function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction()
}


console.log('Counter Value:', outerFunction(20))