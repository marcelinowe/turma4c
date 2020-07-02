function login(){
    var mensagem = {
        email: document.getElementById("txtEmail").value,
        senha: document.getElementById("txtSenha").value
    };
    var cabecalho ={
        method: "POST",
        body: JSON.stringify(mensagem),
        headers: {
            "Content-Type" : "application/json"
        }
    };

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