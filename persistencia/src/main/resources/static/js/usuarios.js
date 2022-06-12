$(document).ready(function() {

    cargarUsuarios();
  $('#usuarios').DataTable();
});
    console.log("culo");

async function cargarUsuarios(){
    const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }
    });
    const usuarios = await request.json();
    let listadoHtml = '';
    for(let usuario of usuarios){
        let botonEliminar = '<a href="#" onclick="eliminarUsuario('+usuario.id+')" class="btn btn-danger btn-circle btn-lg"><i class="fas fa-trash"></i></a>';
        let telefonoTexto = usuario.telefono == null ? '-' : usuario.telefono;

        let usuarioHTML = '<tr></tr><td>'+ usuario.id +'</td><td>'+ usuario.nombre +' '+ usuario.apellido +'</td><td>'
        + usuario.email +'</td><td>'+telefonoTexto
        +'</td><td>'+ botonEliminar +'</td></tr>';
        listadoHtml+= usuarioHTML;
    }
    document.querySelector('#usuarios tbody').outerHTML = listadoHtml;
}

async function eliminarUsuario(id){
    if(!confirm('Esta seguro?')){
        return;
    }

    const request = await fetch('api/usuarios/'+ id, {
    method: 'DELETE',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }
    });

    location.reload();
}