let btnClique = document.getElementById("clique");
// btnClique.onmouseover = function(){
//     alert("Tô ligado que você clicou")
// }

// let inputText = document.getElementById("texto");
// btnClique.onclick = function(){
//     inputText.style.opacity = "0"
// }

let inputText = document.getElementById("texto");
btnClique.onclick = function(){
    if(inputText.style.opacity == "0"){
        inputText.style.opacity = "100";
        inputText.style.backgroundColor = "blue";
    }else{
        inputText.style.opacity = "0";
    }
}

inputText.onkeydown = function (event) {
    let keyCode = event.keyCode;
    if (keyCode == 13) {
        alert("Apertou o enter?");
    }
}

