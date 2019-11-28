/*
const message = new Promise(function(resolve,reject){
    if (10>50){
        resolve("pass")
    }else{
        reject([1,23,5,8])
    }
})

message.then(function(msz){
    console.log(msz)
}).catch(function(err){
    console.log(err)
})
*/




const employee = new Promise(function(resolve,reject){
    if(30>10    ){
        resolve([{
            name: 'Billgate',
            age: 67
        },{
            name: 'Mark ZuckerBerg',
            age: 47
        },{
            name: 'Rakesh Ranjan',
            age: 21
        }])
    }else{
        reject("Failed")
    }
})

employee.then(function(msz){
    console.log("Success Message:",msz)
}).catch(function(err){
    console.log("Failue Message:",err)
})




/*

const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve("Success")
    }else{
        reject("Failed")
    }
})

message.then(function(msz){
    console.log("Success Message:",msz)
}).catch(function(err){
    console.log("Failue Message:",err)
})

*/