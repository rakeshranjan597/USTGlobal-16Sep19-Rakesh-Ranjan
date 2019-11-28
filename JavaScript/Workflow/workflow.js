function first(){
    console.log("First")
}
function second(){
    console.log("Second")
}

first()
second()


function first(){
    setTimeout(function(){
        console.log("First function Executed")
    },0)
}

function second(){
    console.log("Second function Executed")
}

first()
second()