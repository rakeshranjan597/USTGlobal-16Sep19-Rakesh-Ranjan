var brands = ['KingFisher','Bisleri','Aqua','Kinley']
console.log("~~~~~~For of Loop Used only for Arrays~~~~~~~~")
for(var ele of brands){
    console.log(ele)
}

var brands = ['KingFisher','Bisleri','Aqua','Kinley']
console.log("~~~~~~For in Loop for Arrays~~~~~~~~")
for(var ele in brands){
    console.log(brands[ele])
}



var person = {
    name:'rakesh',
    age:20,
}
console.log("~~~~~~For in Loop for Object~~~~~~~~")
for(var ele in person){
    console.log(person[ele])
}

console.log("  ~~~~~~For Each loop: method of array~~~~~~")
var movies = ['Sholey','Mayabazar','JP','Titanic']
movies.forEach(function(val,ind){
    console.log(val)
})

console.log("~~~~~~For Each loop of ojects~~~~~~")
var items = [{
    item:'bangles',
    id:1,
    price:100
},{
    item:'eyelinear',
    id:2,
    price:500
},{
    item:'watch',
    id:3,
    price:5000
},{
    item:'bike',
    id:4,
    price:100000
}]
items.forEach(function(val,ind){
//    console.log(val)
    console.log("~~~~~~",ind,"index object ~~~~~~")
    for(var i in val){
        console.log("          ",val[i])
    }
})