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
document.getElementById('copyright');
console.log(copyright.attributes);

// Exercicio 2
let tt = document.querySelector(".fa-twitter");
tt.getAttribute('href');
console.log(tt);

// Exerrcicio 3

let fb = document.querySelector(".fa-facebook");
fb.getAttribute('href');
console.log(fb);