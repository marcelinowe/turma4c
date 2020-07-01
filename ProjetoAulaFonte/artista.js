function cadastrar(){
    var data = new Date();
    var dia = data.getDate();
    var mes = data.getMonth()+1;
    var ano = data.getFullYear();

    var data = dia +"/"+mes+"/"+ano;

    var mensagem = {
        nomeArtistico: document.getElementById("txtNomeArtistico").value,
        nacionalidade: document.getElementById("txtNacionalidade").value,
        cadastro: data
    };
    var cabecalho ={
        method: "POST",
        body: JSON.stringify(mensagem),
        headers: {
            "Content-Type" : "application/json"
        }
    };

    fetch("http://localhost:8080/artista/gravar", cabecalho)
        .then(res => res.json())
        .then(res =>{
                        localStorage.setItem("artista",JSON.stringify(res));
                        alert("Artista gravado com sucesso");
                        window.location = "usuario.html";
                    })
        .catch(err =>{
                        alert("Erro!");
                    });
}