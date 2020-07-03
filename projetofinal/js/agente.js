function carregaAgente(){
    var usuarioLogado = localStorage.getItem("user");

    if(!usuarioLogado){
        window.location = "login.html";
    }
    else{
        var usuarioJson = JSON.parse(usuarioLogado);
        document.getElementById("perfil").innerHTML =
        "<h5>"+usuarioJson.nome+"("+usuarioJson.email+")</h5>"

        document.getElementById("fotoUsuario").innerHTML = 
        "<img width = '20%' src=images/"+usuarioJson.foto+">"

        exibirAgentes();
    }
}
function logoff(){
    localStorage.removeItem("user");
    window.location = "login.html";
}

function exibirAgentes(){
    fetch("http://localhost:8080/agentes").then(res=>res.json()).then(res=>popula(res));
}

function popula(lista){
    var dropAgente = 
    '<div class="input-group mb-3">'+
    '<div class="input-group-prepend">'+
      '<label class="input-group-text" for="inputGroupSelect01">Agente</label>'+
    '</div>'+
    '<select class="custom-select" id="inputGroupSelect01">'+
      '<option selected>Escolha o agente financeiro</option>';
      for(i=0;i<lista.length;i++){
        dropAgente+='<option value="'+lista[i].id+'">'+lista[i].nomeAgente+'</option>';
      }
      dropAgente+='</select></div>';

      document.getElementById("agentes").innerHTML = dropAgente;
}