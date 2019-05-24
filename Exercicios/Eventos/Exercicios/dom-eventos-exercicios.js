// Exercicio 2
/*
let btnOla = document.getElementById('btnOla');
btnOla.onclick = function() {
    alert('Olá');
}
*/

// Exercicio 3

document.getElementById("corVerde");
corVerde.onclick = function() {
  document.querySelector("body").style.backgroundColor = "green";
};

// Exercicio 4
document.querySelector("#img1");
img1.onmouseover = function() {
  console.log("Estou vendo a imagem");
};

// Exercicio 5
document.querySelector("#img2").addEventListener("click", function() {
  console.log("Cliquei na imagem");
});

// Exercicio 6
let corpo = document
  .querySelector("body")
  .addEventListener("click", function() {
    return this;
  });

this.addEventListener("click", function() {
  document.querySelector("#body").style.backgroundColor = "red";
});

// Exercicio 7

let corpo = document
  .querySelector("body")
  .addEventListener("click", function() {
    return this;
  });

this.removeEventListener("click", function() {
  document.querySelector("#body").style.backgroundColor = "red";
});
