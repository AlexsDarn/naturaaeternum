
$(document).ready(function() {
    //on ready
});
    console.log("culo");

async function registrarUsuario(){
console.log("aaa");
let datos = {};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido =document.getElementById('txtApellido').value;
    datos.email =document.getElementById('txtEmail').value;
    datos.password =document.getElementById('txtPassword').value;

    let repeatPassword =document.getElementById('txtRepeatPassword').value;

    if(repeatPassword != datos.password){
        alert('Contraseñas diferentes');
        return;
    }

    const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
        body: JSON.stringify(datos)
    });
    alert("Se creó la cuenta");
    window.location.href = 'login.html'
}