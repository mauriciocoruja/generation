// Exercicio 1

function comparaSenha(senhaUm, senhadois) {
  return senhaUm !== senhadois;
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
  if (comparaSenha(formulario.senhaUm.value, formulario.senhaDois.value)) {
    alert("As senhas não coincidem");
    formulario.senha.focus();
    return false;
  }
  if (formulario.senhaUm.value == "" && formulario.senhaDois.value == "") {
    alert("Digite a senha");
    formulario.senha.focus();
    return false;
  }
};

// Exercicio 2
