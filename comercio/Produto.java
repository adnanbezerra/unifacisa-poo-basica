package comercio;

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

    public void alterarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    public Produto(String nome, int estoque, int codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
    }
}
 