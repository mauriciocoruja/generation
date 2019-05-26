let formulario = document.querySelector("form");

function comparaSenha(a, b) {
  return a !== b;
}

formulario.onsubmit = function () {
  if (formulario.firstName.value == "") {
    alert("Você esqueceu de escrever seu nome");
    formulario.firstName.focus();
    return false;
  }
  if (formulario.lastName.value == "") {
    alert("Você esqueceu de escrever seu sobrenome");
    formulario.lastName.focus();
    return false;
  }
  if (formulario.emailAdress.value == "") {
    alert("Você esqueceu de escrever seu email");
    formulario.emailAdress.focus();
    return false;
  }

  let passwordOne = formulario.passwordOne.value;
  let passwordTwo = formulario.passwordTwo.value;

  if (comparaSenha(passwordOne, passwordTwo)) {
    alert("As senhas não coincidem");
    formulario.passwordOne.focus();
    return false;
  }
  if (passwordOne == "" && passwordTwo == "") {
    alert("Digite a senha");
    formulario.passwordTwo.focus();
    return false;
  }
}


let dados = [formulario.firstName.value, formulario.lastName.value, formulario.emailAdress.value]


document.querySelector('.showinfos').onclick = function mostrarDados() {
  for (i = 0; i < dados.length; i++) {
    let li = document.createElement('li');

    document.getElementById("minhaLista").appendChild(li).innerHTML = dados[i]
  }
}
  // document.getElementById("minhaLista").appendChild(li).textContent = formulario.lastName.value;
  // document.getElementById("minhaLista").appendChild(li).textContent = formulario.emailAdress.value;