package comercio;

public class Produto {
	    
		private String nomeProduto;
		private int codigoProduto;
		private int estoque;
		private String categoria;
		private double valorCompra;
		private double valorVenda;
	        
    public Produto(String nomeProduto, int codigoProduto, int estoque, String categoria, double valorCompra,
				double valorVenda) {
			this.nomeProduto = nomeProduto;
			this.codigoProduto = codigoProduto;
			this.estoque= estoque;
			this.categoria =categoria;
			this.setValorCompra(valorCompra);
			this.valorVenda = valorVenda;
			
		}

	    
    public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public int getCodigoProduto() {
		return codigoProduto;
	}


	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getValorCompra() {
		return valorCompra;
	}


	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}


	public double getValorVenda() {
		return valorVenda;
	}


	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}


	public String getInfo() {
        return "Nome: " + this.nomeProduto  + ", código: " + this.codigoProduto + ", estoque: " + this.estoque + ",categoria: "
        		+ this.categoria + ",custo da compra: " + this.valorCompra + ",valor da venda: " + this.valorVenda;
            }
    
     public String reduzirEstoque(int quantidade) {
    	if(quantidade > this.estoque) {
    		return "Não há estoque o bastante para esta venda.";
    	} else {
            this.estoque = estoque - quantidade;
    		
    		return "Estoque do produto atualizado com sucesso!";
    	}
    }
     public void alterarEstoque(int quantidade) {
         this.estoque += quantidade;
     }
}



