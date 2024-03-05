package org.example;

public class TestRedeSocial {
    public static void main(String[] args) {
        System.out.println("Rede Social");
        System.out.println("===============================\n");
        // Instanciando um objeto do tipo Foto
        Foto foto = new Foto("João", "Foto de um pôr do sol", "Pôr do sol", "Praia");

        // Chamando o método publicarFoto
        foto.publicarFoto();

        // Chamando o método curtir
        foto.curtir();

        // Chamando o método comentar
        foto.comentar("Que lindo!");

        System.out.println("===============================\n");
        // Instanciando um objeto do tipo Texto
        Texto texto = new Texto("Maria", "Texto sobre a pandemia", "Pandemia");

        // Chamando o método publicarTexto
        texto.publicarTexto();

        // Chamando o método curtir
        texto.curtir();

        // Chamando o método comentar
        texto.comentar("sei lá só estou comentando");

        System.out.println("===============================\n");
        // Instanciando um objeto do tipo Video
        Video video = new Video("José", "Vídeo de um show", 120, "Show", "Teatro");

        // Chamando o método publicarVideo
        video.publicarVideo();

        // Chamando o método curtir
        video.curtir();

        // Chamando o método comentar
        video.comentar("Que video legal!");
    }
}