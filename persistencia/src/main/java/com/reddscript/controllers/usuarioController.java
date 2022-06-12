package com.reddscript.controllers;

import com.reddscript.dao.UsuarioDao;
import com.reddscript.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class usuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
 @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Hugo");
        usuario.setApellido("Pachicha");
        usuario.setEmail("hugoalcohol@gmail.com");
        usuario.setTelefono("3209685743");
        return usuario;
    }

    @RequestMapping(value="api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
     return usuarioDao.getUsuarios();
    }

    @RequestMapping(value="api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }

   @RequestMapping(value="usuario45")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Hugo");
        usuario.setApellido("Pachicha");
        usuario.setEmail("hugoalcohol@gmail.com");
        usuario.setTelefono("3209685743");
        return usuario;
    }

    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value="usuario123")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Hugo");
        usuario.setApellido("Pachicha");
        usuario.setEmail("hugoalcohol@gmail.com");
        usuario.setTelefono("3209685743");
        return usuario;
    }
}
