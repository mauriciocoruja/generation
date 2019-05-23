let btnHello = document.getElementById("btnHello");

// btnHello.onclick =function(){
//     alert('HELLO');
// }

// Forma 1 de fazer
/*
document.getElementById('btnHello').addEventListener('click', function(){
    alert('Ai, você clicou em mim!!')
})
*/
// Forma 2 de fazer - chamando a função, armazenada numa variavel, no parametro do "addEventListener"

// let funcao = function(){
//     alert('Ai, você clicou em mim')
// }
// document.getElementById('btnHello').addEventListener('click', funcao)


//Forma 3 de fazer - Diretamente na tag HTML, chamando a função através do atributo "onclick='nomeDaFuncao'"
/*
function clicar() {
    alert('Ai, você clicou em mim');
}
*/
//Explicação do this

/*
document.getElementById('btnHello').addEventListener('click', function(){
    console.log(this);
})
*/

//Event
// btnHello.addEventListener("click", function(event){
//     console.log(event);
// })

/*Descobrir o local clicado na tela
btnHello.addEventListener("click", function(event){
    console.log(event.clientX);
    console.log(event.clientY);
});
*/

// document.getElementById('btnHello').addEventListener('click', function(event){
//     console.log(event.keyCode);
// })

// let corpo = document.querySelector("body");
// document.querySelector('body').addEventListener("keypress", function())


// let corpo = document.querySelector("body");
// document.querySelector("body").addEventListener("keypress", function(event){
// let tecla = event.keyCode;
// if (tecla == 13) {
// alert("clica mano pls");
// }

// });


btnHello.addEventListener("click", function(){
    setTimeout(function () {
        alert("Obrigado por esperar 10 segundos");      
    }, 10000);
});