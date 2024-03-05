package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    // Classe que implementa a Interface Bonus como uma Agregação
    // Atributo
    private List<Bonus> bonusList = new ArrayList<>();

    // Construtor
    public ControleBonus() {
        this.bonusList = bonusList;
    }


    // Métodos
    public void adicionarNaLista(Bonus bonus) {
        bonusList.add(bonus);
    }

    public void exibirConteudo() {
        for (Bonus bonus : bonusList) {
            System.out.println(bonus.getValorBonus());
        }
    }

    public Double calcularQtdBonus() {
        Double total = 0.0;
        for (Bonus bonus : bonusList) {
            total += bonus.getValorBonus();
        }
        return total;
    }

    // toString
    @Override
    public String toString() {
        return String.format("""
                 Controle De Bônus: %s,
                 Funcionários: %s
                """, bonusList);
    }

}
