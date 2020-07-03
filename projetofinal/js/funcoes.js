function login(){
    /*
    Criação da mensagem que será enviada via método POST
    */
    var mensagem = {
        email: document.getElementById("txtEmail").value,
        senha: document.getElementById("txtSenha").value
    };
    /*
    Criação de cabeçalho HTTP para envio do método post para validação de login
    */
    var cabecalho ={
        method: "POST",
        body: JSON.stringify(mensagem),
        headers: {
            "Content-Type" : "application/json"
        }
    };
    /*
    Chamada assíncrona da validação de login;
    Nesse passo é enviado um objeto Usuario;
    */
    fetch("http://localhost:8080/login", cabecalho)
        .then(res => res.json())
        .then(res =>{
                        localStorage.setItem("user",JSON.stringify(res));
                        window.location = "agente.html";
                    })
        .catch(err =>{
                        alert("E-mail/RACF ou senha inválido");
                    });
}