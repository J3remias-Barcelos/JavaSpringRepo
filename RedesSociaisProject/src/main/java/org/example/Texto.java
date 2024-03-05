package org.example;

public class Texto extends Post{
    // Atributos
    private String idioma;
    private String legenda;
    private String local;

    // Construtor
    public Texto(String autor, String conteudo, String idioma, String legenda, String local) {
        super(autor, conteudo);
        this.idioma = idioma;
        this.legenda = legenda;
        this.local = local;
    }

    public Texto(String maria, String textoSobreAPandemia, String pandemia) {
        super();
    }

    // Métodos
    public void curtir() {
        System.out.println("Curtiu o texto");
    }

    public void comentar(String comentario) {
        System.out.println(comentario);
    }

    public void publicarTexto() {
        System.out.println("Texto publicado");
    }
}
