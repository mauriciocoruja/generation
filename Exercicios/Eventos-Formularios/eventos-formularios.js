// Exercicio 1

function comparaSenha(a, b) {
  return a !== b;
}

let formulario = document.querySelector("form");


formulario.onsubmit = function() {
  if (formulario.nome.value == "") {
    alert("Você esqueceu de escrever seu nome");
    formulario.nome.focus();
    return false;
  }
  if (formulario.email.value == "") {
    alert("Você esqueceu de escrever seu email");
    formulario.email.focus();
    return false;
  }

  let senhaUm = formulario.senhaUm.value;
  let senhaDois = formulario.senhaDois.value;
  
  if (comparaSenha(senhaUm, senhaDois)) {
    alert("As senhas não coincidem");
    formulario.senhaUm.focus();
    return false;
  }
  if (senhaUm == "" && senhaDois == "") {
    alert("Digite a senha");
    formulario.senhaDois.focus();
    return false;
  }
};

// Exercicio 2
