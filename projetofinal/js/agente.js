function exibirUsuario(){
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
    }
}
function logoff(){
    localStorage.removeItem("user");
    window.location = "login.html";
}