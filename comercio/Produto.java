package comercio;

import java.util.Random;

public class Produto {
    private int codigo;
    private String nome;
    private int estoque;

    public int getCodigo() {
        return this.codigo;
    }

    public String getInfo() {
        return "Nome: " + this.nome + ", código: " + this.codigo + ", estoque: " + this.estoque;
    }

    public void reduzirEstoque() {
        this.estoque--;
    }

    public Produto(String nome, int estoque) {
        int max = 999999;
        int min = 100000;
        int codigo = new Random().nextInt(max - min) + min;
        
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
    }
}
 