function keyPress(){
    let nameFieldArea = document.getElementById('nameArea').value;
//    console.log(nameFieldArea)
    document.getElementById('nameField').innerHTML = nameFieldArea;

    let passFieldArea = document.getElementById('passArea').value;
    document.getElementById('passField').innerHTML = passFieldArea;
}


