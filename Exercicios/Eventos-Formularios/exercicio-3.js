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

// document.querySelector('.showinfos').onclick = function mostrarDados() {
//   let formulario = document.querySelector("form");
//   let dados = [formulario.firstName.value, formulario.lastName.value, formulario.emailAdress.value];
  
//   let ul = document.createElement('ul');
//   document.querySelector('body').appendChild(ul);

//  for (i = 0; i < dados.length; i++) {
//     let li = document.createElement('li');
//     ul.appendChild(li).innerHTML = dados[i];
//   }
//   formulario.style.display = 'none';
// }

document.querySelector('.showinfos').onclick = () => {

  let formulario = document.querySelector("form");

  let ul = document.createElement('ul');
  let dados = [formulario.firstName.value, formulario.lastName.value, formulario.emailAdress.value];

  dados.forEach((dado) => {
    let li = document.createElement('li');
    ul.appendChild(li).innerHTML = dado;
  });

  document.querySelector('body').appendChild(ul);
  formulario.style.display = 'none';
}
