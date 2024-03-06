package com.example.Proyecto.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.Repositories.BaseRepository;
import com.example.Proyecto.Repositories.UsuarioRepository;
import com.example.Proyecto.entities.Usuario;

@Service
public class UsuarioServicesmpl extends BaseServicemlp <Usuario, Long> implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioServicesmpl(BaseRepository <Usuario, Long >baseRepository){
        super(baseRepository);
    }

    
}
