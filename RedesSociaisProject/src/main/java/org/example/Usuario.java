package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{
    // Atributo que será uma List
    private List amigos = new ArrayList();


    // Construtor
    public Usuario(List amigos) {
        this.amigos = amigos;
    }

    // Métodos
    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public void removerAmigo(Usuario amigo) {
        amigos.remove(amigo);
    }

    // Método que vai publicar o post independente do tipo e mostrar o Usuario/Amigo que publicou
    public void publicarPost(String post) {
        System.out.println(post);
    }
}
