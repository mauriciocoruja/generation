/*var diaDaSemana = "Sexta-Feira";

if (diaDaSemana == "Domingo") {
	console.log("Dia do churrasco");
}else if (diaDaSemana == "Quarta-feira") {
	console.log("Dia de feijoada");	
}else if (diaDaSemana == "Sexta-Feira") {
	console.log("Decreto");	
}else{
	console.log("Hoje não é dia de churrasco");
}
console.log("Programa finalizado");

(diaDaSemana == "Sexta-Feira") ? console.log("Dia de ping-pong") : console.log("Dia de estudar");*/
var sintomas = prompt("Qual o sintoma? Tosse ou febre: ")
switch (sintomas){
	case "tosse":
		alert("Turbeculose");
		break;
	case "febre":
		alert("Dengue");
		break;
	default:
		alert("Virose");
}