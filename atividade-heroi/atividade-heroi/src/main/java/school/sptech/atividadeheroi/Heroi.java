package school.sptech.atividadeheroi;

public class Heroi {
// Atributos
    private String nome;
    private String habilidade;
    private int idade;
    private int forca;
    private boolean vivo;

// Construtor
    public Heroi(String nome, String habilidade, int idade, int forca, boolean vivo) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
        this.forca = forca;
        this.vivo = vivo;
    }

//  Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public int getIdade() {
        return idade;
    }

    public int getForca() {
        return forca;
    }

    public boolean isVivo() {
        return vivo;
    }

  // toString
    @Override
    public String toString() {
        return String.format("""
                Herois:
                Nome: %s
                Habilidade: %s
                Idade: %d
                Força: %d
                Vivo: %s
                """, nome, habilidade, idade, forca, vivo ? "Sim" : "Não");
    }
}
