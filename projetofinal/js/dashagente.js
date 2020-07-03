function carregaDash(){
    var id =  localStorage.getItem("agente");
    if(!id){
        window.location = "login.html";
    }
    else{
        fetch("http://localhost:8080/agente/"+id)
        .then(res => res.json())
        .then(res =>{
                    document.getElementById("divparceiro").innerHTML = 
                    '<h5 class="card-title">Parceiro</h5>'+
                    '<p class="card-text">'+res.nomeAgente+'</p>'+
                    '<p class="card-text">Volume: R$ '+res.volumeTransacional+'</p>';

                    document.getElementById("divsucesso").innerHTML = 
                    '<h5 class="card-title">Transações com sucesso</h5>'+
                    '<p class="card-text">'+res.totalsucesso+'</p>';

                    document.getElementById("divfalha").innerHTML = 
                    '<h5 class="card-title">Transações com falha</h5>'+
                    '<p class="card-text">'+res.totalfalha+'</p>';

                    document.getElementById("divfraude").innerHTML = 
                    '<h5 class="card-title">Transações com fraude</h5>'+
                    '<p class="card-text">'+res.totalfraude+'</p>';

                    })
        .catch(err =>{
                        alert("ERRRROOOOOOOOO");
                    });
    }
}

function logoff(){
    localStorage.removeItem("user");
    localStorage.removeItem("agente");

    window.location = "login.html";
}
