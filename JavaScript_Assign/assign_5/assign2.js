
function keyPress(){
    let nameKeyField = document.getElementById('nameArea').value
//    document.getElementById('nameField').innerHTML = nameKeyField
    nameKeyField = nameKeyField.trim()

    let passKeyField = document.getElementById('passArea').value
//    document.getElementById('passField').innerHTML=passKeyField
    passKeyField = passKeyField.trim()    
    if(passKeyField.length >= 6 && nameKeyField.length >= 5){
        document.getElementById('clickButton').disabled = false
        document.getElementById('clickButton').style.cursor = "pointer";
        document.getElementById('clickButton').style.backgroundColor = "green";
        document.getElementById('clickButton').style.color = "white";
    }else{
        document.getElementById('clickButton').disabled = true
    }
}

function checkBoxFun(){
    var checkBox = document.getElementById("passArea")
    if (checkBox.type === "password"){
        checkBox.type = "text";
    }else{
        checkBox.type = "password";
    }
}