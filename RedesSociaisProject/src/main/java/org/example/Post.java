package org.example;

import java.util.Date;

public abstract class Post implements Postavel{
    // Atributos
    private String autor;
    private Date dataCriação;
    private String conteudo;

    // Construtor
    public Post(String autor, Date dataCriação, String conteudo) {
        this.autor = autor;
        this.dataCriação = dataCriação;
        this.conteudo = conteudo;
    }

    public Post(String autor, String conteudo) {
    }

    public Post() {

    }

    // Métodos
}
