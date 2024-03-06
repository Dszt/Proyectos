package com.example.Proyecto.Controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto.Services.UsuarioServicesmpl;
import com.example.Proyecto.entities.Usuario;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path ="/Usuario")
public class UsuarioController extends BaseControllermpl <Usuario, UsuarioServicesmpl> {

    
}
