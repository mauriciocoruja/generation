// Exercicio 1
document.getElementById('cabecalho').style.display = "none";

// Exercicio 2
document.querySelector('#lechuza').style.filter = "grayscale(100%)";

// Exercicio 3

let entradas = document.querySelectorAll("input, textarea");
for (var i = 0; i < entradas.length; i++) {
	entradas[i].style.backgroundColor = "red";
}

// SELETORES E ATRIBUTOS


// Exercicio 1
console.log(document.getElementById('copyright').attributes);

// Exercicio 2
let tt = document.querySelector(".fa-twitter");
tt.getAttribute('href');
console.log(tt);

// Exercicio 3

let fb = document.querySelector(".fa-facebook");
fb.getAttribute('href');
console.log(fb);

// Exercicio 4
let yt = document.querySelector(".fa-youtube");
yt.setAttribute('href','https://youtube.com/channel/UCRQdwmWMhTcqDFjPT4UPZYA');
yt.setAttribute('target','_blank');

// Exercicio 5

console.log(document.querySelector('form').hasAttribute('action'));

// Exericio 6

// let formulario = querySelector(".formulario");
// formulario.setAttribute("action", formulario.getAttribute("url"));
// formulario.removeAttribute("url");

// function rename (){

// }

// Exercicio 7 
document.querySelectorAll("h2").forEach(function(h2){
	h2.style.color = "red";
});

// Exercicio 8 
document.querySelectorAll(".icon").forEach(function(icon){
	icon.style.backgroundColor = "white";
});

// 

document.querySelector('#lechuza').addEventListener("click",function(){
	alert("Ai, você clicou em mim!");
})

// 