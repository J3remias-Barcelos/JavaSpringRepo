package org.example;

public class Foto extends Post{
    // Atributos
    private String legenda;
    private String local;

    // Construtor
    public Foto(String autor, String conteudo, String legenda, String local) {
        super(autor, conteudo);
        this.legenda = legenda;
        this.local = local;
    }

    // Métodos
    public void curtir() {
        System.out.println("Curtiu a foto");
    }

    public void comentar(String comentario) {
        System.out.println(comentario);
    }

    public void publicarFoto() {
        System.out.println("Foto publicada");
    }
}
