package com.example.Proyecto.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.Repositories.BaseRepository;
import com.example.Proyecto.Repositories.EscritoRepository;
import com.example.Proyecto.entities.Escritos;

@Service
public class EscritosServicesmpl extends BaseServicemlp<Escritos, Long> implements EscritosServices{

    @Autowired
    private EscritoRepository escritoRepository;

    public EscritosServicesmpl(BaseRepository<Escritos, Long> baseRepository) {
        super(baseRepository);
    }
    
}
