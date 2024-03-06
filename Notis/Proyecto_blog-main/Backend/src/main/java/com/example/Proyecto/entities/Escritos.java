package com.example.Proyecto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="Escritos")
public class Escritos extends Base {
    @Column(unique = true, nullable = false)
    private String autor;
    private String biografia;
    private String genero_escrito;
    private int cantidad_paginas;
    private String titulo;
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getBiografia() {
        return biografia;
    }
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    public String getGenero_escrito() {
        return genero_escrito;
    }
    public void setGenero_escrito(String genero_escrito) {
        this.genero_escrito = genero_escrito;
    }
    public int getCantidad_paginas() {
        return cantidad_paginas;
    }
    public void setCantidad_paginas(int cantidad_paginas) {
        this.cantidad_paginas = cantidad_paginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    
}
