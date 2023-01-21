var readlineSync =require('readline-sync');

var callbackSucesso = function (sinal, mensagem){
    console.log(mensagem +' '+ sinal);
}

var callbackErro = function (mensagem){
    console.log(mensagem);
}
function exibirResultado(sinal, callbackSucesso, callbackErro){
    if (sinal = true){
        callbackSucesso(sinal.toString(), 'felizmente o resultado foi: ');
    }else {
        callbackErro(' Ocorreu um erro ');
    }
}

exibirResultado(true, callbackSucesso, callbackErro)
