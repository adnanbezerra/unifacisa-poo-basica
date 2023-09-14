package heranca02;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    private ArrayList<Pessoa> listaDeAmigos = new ArrayList<>();

    public Pessoa(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void adicionarAmigo(Pessoa amigo) {
        if(!listaDeAmigos.contains(amigo)) {
            listaDeAmigos.add(amigo);
        }
    }

    public void envelhecer(int quantidade) {
        if(quantidade > 0) {
            idade += quantidade;
        }
    }

    public boolean ehAmigoDe(Pessoa amigo) {
        return listaDeAmigos.contains(amigo);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }

    public ArrayList<Pessoa> getListaDeAmigos() {
        return listaDeAmigos;
    }
    
    public String getListaDeAmigosComoString() {
        if(listaDeAmigos.isEmpty()) return "vazio";
        else return listaDeAmigos.toString();
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "; idade: " + idade + "; cpf: " + cpf + " |";
    }
}
