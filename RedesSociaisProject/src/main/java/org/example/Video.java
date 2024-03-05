package org.example;

public class Video extends Post{
    // Atributos
    private int duracao;
    private String legenda;
    private String local;

    // Construtor
    public Video(String autor, String conteudo, int duracao, String legenda, String local) {
        super(autor, conteudo);
        this.duracao = duracao;
        this.legenda = legenda;
        this.local = local;
    }

    // Métodos
    public void curtir() {
        System.out.println("Curtiu o vídeo");
    }

    public void comentar(String comentario) {
        System.out.println(comentario);
    }

    public void publicarVideo() {
        System.out.println("Vídeo publicado");
    }
}
