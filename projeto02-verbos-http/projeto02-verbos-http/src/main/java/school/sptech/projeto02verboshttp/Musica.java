package school.sptech.projeto02verboshttp;

import java.time.LocalDate;

public class Musica {
    // Atributos
    private String nome;
    private String artista;
    private LocalDate dataAdicao = LocalDate.now();

    // Construtor sem isso para toda vida!
    // Métodos


    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalDate getDataAdicao() {
        return dataAdicao;
    }

    public void setDataAdicao(LocalDate dataAdicao) {
        this.dataAdicao = dataAdicao;
    }

    // toString
}
