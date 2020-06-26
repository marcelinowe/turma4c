function exibir() {
    window.alert("Hello World");
}
function validarNumero() {
    var numero = window.prompt("Digite um número");
    var resultado = parseInt(numero) % 2;
    if(resultado==0){
        window.alert("Numero par");
    }else{
        window.alert("Numero impar");
    }
}

function somarNumeros(valor1, valor2) {
    var resultado = parseInt(valor1) + parseInt(valor2);
    return resultado;
}

function calcular(valor1, valor2, operacao) {
    var resultado = parseInt(valor1) + parseInt(valor2);
    if(operacao == "+"){
        resultado = parseInt(valor1) + parseInt(valor2);
    }
    else if(operacao == "-"){
        resultado = parseInt(valor1) - parseInt(valor2);
    }
    else if(operacao == "*"){
        resultado = parseInt(valor1) * parseInt(valor2);
    }
    else if(operacao == "/"){
        resultado = parseInt(valor1) / parseInt(valor2);
    }
    return resultado;
}

function calculadora() {
    var operacao = document.getElementsByName("operacao");

    if(operacao[0].checked){
        document.getElementById("txtResultado").value = 
        parseInt(document.getElementById("txtValor1").value) + 
        parseInt(document.getElementById("txtValor2").value);
    }else if(operacao[1].checked){
        document.getElementById("txtResultado").value = 
        parseInt(document.getElementById("txtValor1").value) - 
        parseInt(document.getElementById("txtValor2").value);
    }else if(operacao[2].checked){
        document.getElementById("txtResultado").value = 
        parseInt(document.getElementById("txtValor1").value) * 
        parseInt(document.getElementById("txtValor2").value);
    }else if(operacao[3].checked){
        document.getElementById("txtResultado").value = 
        parseInt(document.getElementById("txtValor1").value) / 
        parseInt(document.getElementById("txtValor2").value);
    }
}