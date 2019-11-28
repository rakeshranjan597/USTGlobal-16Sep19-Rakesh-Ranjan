
function keyPress(){
    let nameKeyField = document.getElementById('nameArea').value
    nameKeyField = nameKeyField.trim()
    document.getElementById('nameField').innerHTML = nameKeyField

    let passKeyField = document.getElementById('passArea').value
    passKeyField = passKeyField.trim()    
    document.getElementById('passField').innerHTML=passKeyField
    
    if(passKeyField.length >= 6 && nameKeyField.length >= 5){
        document.getElementById('clickButton').disabled = false
        document.getElementById('clickButton').style.cursor = "pointer";
    }else{
        document.getElementById('clickButton').disabled = true
    }
}
