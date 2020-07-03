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
        exibirAgentesTop10();
    }
}
function logoff(){
    localStorage.removeItem("user");
    localStorage.removeItem("agente");
    window.location = "login.html";
}

function exibirAgentes(){
    fetch("http://localhost:8080/agentes").then(res=>res.json()).then(res=>populaDrop(res));
}

function exibirAgentesTop10(){
    fetch("http://localhost:8080/agentestop10").then(res=>res.json()).then(res=>populaTable(res));
}

function populaDrop(lista){
    var dropAgente = 
    '<div class="input-group mb-3">'+
    '<div class="input-group-prepend">'+
      '<label class="input-group-text" for="inputGroupSelect01">Agente</label>'+
    '</div>'+
    '<select id="listagente" class="custom-select" id="inputGroupSelect01" onchange="dashAgente()">'+
      '<option selected>Escolha o agente financeiro</option>';
      for(i=0;i<lista.length;i++){
        dropAgente+='<option value="'+lista[i].id+'">'+lista[i].nomeAgente+'</option>';
      }
      dropAgente+='</select></div>';

      document.getElementById("agentes").innerHTML = dropAgente;
}

function populaTable(lista){
    var listaAgentes=
    '<table class="table table-dark" align="center" width="90%" border="1" cellpadding="10" cellspacing="15">'+
    '<tr>'+
        '<th scope="col">Parceiro</th>'+
        '<th scope="col">Volume Transacional</th>'+
    '</tr>';
    for(i=0;i<lista.length;i++){
        listaAgentes += '<tr align="center"><td >'+lista[i].nomeAgente+'</td><td>R$ '+lista[i].volumeTransacional.toLocaleString('pt-BR')+'</td></tr>';
    }
    listaAgentes +='</table>';

    document.getElementById("listatop10").innerHTML = listaAgentes;
}

function dashAgente()
{
    var id = document.getElementById("listagente").value;
    localStorage.setItem("agente",id);
    window.location="dashagente.html"
};

