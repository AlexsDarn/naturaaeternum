package com.reddscript.dao;

import com.reddscript.models.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }
}
