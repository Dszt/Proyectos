package com.example.Proyecto.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto.Services.EscritosServicesmpl;
import com.example.Proyecto.entities.Escritos;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="/Escritos")

public class EscritosController extends BaseControllermpl<Escritos, EscritosServicesmpl> {
    
}
 