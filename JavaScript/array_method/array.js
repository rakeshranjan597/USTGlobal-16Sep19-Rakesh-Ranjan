const  hobbies = ['sleeping','cricket','eating','coding','raoming']
var x = Array.isArray(hobbies)
var z = hobbies.includes('eating',0)  // 0 start searching from 0 ind
hobbies.push('play','sing')
hobbies.pop()
hobbies.unshift('fighting','cooking')
hobbies.shift()
//hobbies.splice(1,0,'bird watching','PUBG')


// i don't pass any parameter.. this do nothing
// if pass single para then remove all element from that index

// return removed element
// first Para - start index
// Second para - remove no. of elem
// third para - adding element and can can no of elem for add

hobbies.splice(1,2,'bird watching','PUBG')
var newHobby = hobbies.slice(1,3)
var ind = hobbies.indexOf('eating',0)
//  if element not present return -1 else index value
//  2nd para is optional which is used to start searching from index

var newJoin = hobbies.join(' - ')
//  join return new array they don't modify the array

console.log(ind)
console.log(newJoin)
console.log(newHobby)
console.log(hobbies)

const arr = [100,200,300,400]
const new_arr = arr.map(function(v){return v+50})
// can pass 3 para
const newArr = arr.map(val=> val+50)    // Fat Arrow
console.log(new_arr)
console.log(newArr)
console.log("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

const arr2 = [15,26,61,8,2,54]
//arr2.sort((val,ind)=>val-ind)             // Sorting Ascending
const arr3 = arr2.sort((val,ind)=>ind-val)  // Sorting Descending
console.log(arr3)
console.log("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

const arr4 = [15,24,61,6,16,55,35,46]
const newArr4 = arr4.filter(function(val){ return val>30})
console.log(newArr4)
const newARR = arr4.filter(val=> val>30)    // Fat Arrow
console.log(newARR)

const items = [{
    name:'Earring',
    id:1,
    price:5000
},{
    name:'Kajal',
    id:2,
    price:3000
},{
    name:'Trimmer',
    id:3,
    price:4000
},{
    name:'Wallet',
    id:4,
    price:1500
}]
console.log(items)


 let str = "Rakesh Ranjan"
 str = str.toUpperCase()
 str = str.toLowerCase()
 let va = str.charAt(2)
 let ind = str.search('kesh')   // if first return the first index of elem
