package comercio;

public class Produto {
    private int codigo;
    private String nome;
    private int estoque;

    public int getCodigo() {
        return this.codigo;
    }

    public int getEstoque() {
    	return this.estoque;
    }
    
    public String getInfo() {
        return "Nome: " + this.nome + ", código: " + this.codigo + ", estoque: " + this.estoque;
    }
    
     public String reduzirEstoque(int quantidade) {
    	if(quantidade > this.estoque) {
    		return "Não há estoque o bastante para esta venda.";
    	} else {
            this.estoque = estoque - quantidade;
    		
    		return "Estoque do produto atualizado com sucesso!";
    	}
    }

    public void aumentarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    public Produto(String nome, int estoque, int codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
    }
}
 