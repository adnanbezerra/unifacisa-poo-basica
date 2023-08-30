package classes;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    String timeFavorito;
    String ocupacao;
    ArrayList<Pessoa> amigos;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void envelhecer(int quantidade) {
        idade += quantidade;
    }

    public void ganharPeso(double quantidade) {
        peso += quantidade;
    }

    public void perderPeso(double quantidade) {
        peso -= quantidade;
    }

    public void calcularIMC(double altura) {
        double imc = peso / (altura * altura);
        System.out.printf("O IMC é de: %.1f", imc);
    }

    public void imprimirTudo() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(timeFavorito);
        System.out.println(ocupacao);
    }

    public void adicionarAmigo(Pessoa amigo) {
        amigos.add(amigo);
    }

    public void dizerOi() {
        System.out.println("Oi!");
    }
}
