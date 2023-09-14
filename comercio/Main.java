package comercio;
    
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private double dinheiroDisponivel = 1000;
	public static final String TRAVESSAO = "--------------------------";
	public static final String APERTE_ENTER = "Aperte Enter para continuar";
	public static final String DIGITE_CODIGO = "Digite o código do produto.";
	public static final String NAO_ENCONTRADO = "Produto não encontrado.";

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
	  produtos.add(new Produto("Abacaxi", 10, "Hortifruti", 2.5, 3));
	  produtos.add(new Produto("Arroz", 20, "Alimentos", 2, 4));
	  produtos.add(new Produto("Agua Mineral", 5, "Bebidas", 1, 2));

	  Scanner sc = new Scanner(System.in);
	  System.out.println("Bem-vindo ao Comério!");
	  String comando;

	  while (true) {
	    listarComandos();
	    comando = sc.nextLine();

	    if (comando.equals("1")) {        	
				// TODO
	      // Falta listar só pelas categorias

	      listarProdutos(produtos);
	      System.out.println(APERTE_ENTER);
	      sc.nextLine();

	    } else if (comando.equals("2")) {
	      // TODO
				// pensar bem nas categorias 

	    	System.out.println("Digite o nome do produto:");
	    	String nomeProduto = sc.nextLine();

	    	System.out.println("Digite uma das categorias disponíveis: Hortifruti, Alimentos ou Bebida:");
	    	String categoriaNova = sc.nextLine();

	    	double valorCompra = getValorPositivo(sc, "Digite o valor de compra do produto:");
	    	double valorVenda = getValorPositivo(sc, "Digite o valor de venda do produto:");

	    	Produto novoProduto = new Produto(nomeProduto, 0, categoriaNova, valorCompra, valorVenda);
	    	produtos.add(novoProduto);

	    	System.out.println("Deseja adicionar estoque a esse produto? Digite 'sim' ou 'não'.");
	    	String simOUnao = sc.nextLine();

	    	if (simOUnao.equals("sim")) {
	    	  System.out.println("Digite a quantidade de produtos:");
	    	  int quantidadeProduto = Integer.parseInt(sc.nextLine());

	    	  if (quantidadeProduto >= 0) {
	    	    novoProduto.alterarEstoque(quantidadeProduto);
	    	    System.out.println(TRAVESSAO);
	    	    System.out.printf("O produto %s foi cadastrado com sucesso! Código = %d, Estoque = %d%n", nomeProduto, quantidadeProduto);
	    	    System.out.println(TRAVESSAO);
	    	  } else {
	    	    System.out.println("Não é possível cadastrar produto com estoque negativo.");
	    	  }

	    	} else if (simOUnao.equals("não")) {
	    	  System.out.println(TRAVESSAO);
	    	  System.out.printf("O produto %s foi cadastrado com sucesso! Estoque = 0%n", nomeProduto);
	    	  System.out.println(TRAVESSAO);
	    	}

	    	System.out.println(APERTE_ENTER);
	    	sc.nextLine();
	    	    
	    } else if (comando.equals("3")) {
				// TODO
	      // falta checar o asldo

	      System.out.println(DIGITE_CODIGO);
	      int codigoProduto = Integer.parseInt(sc.nextLine());

	      Produto produtoEncontrado = procuraProdutoPeloCodigo(produtos, codigoProduto);

	      if (produtoEncontrado != null) {
	        System.out.println("Digite a quantidade a ser adicionada ao estoque:");
	        int quantidadeAdicionada = Integer.parseInt(sc.nextLine());

	        produtoEncontrado.alterarEstoque(quantidadeAdicionada);

	        imprimeEntreTravessao("Estoque do produto atualizado com sucesso!");
	      } else {
	        imprimeEntreTravessao(NAO_ENCONTRADO);
	      }
	            
	    } else if (comando.equals("4")) {
	      //remover: tá completo

	      System.out.println(DIGITE_CODIGO);
	      int codigoProduto = Integer.parseInt(sc.nextLine());

	      Produto produtoEncontrado = procuraProdutoPeloCodigo(produtos, codigoProduto);

	      if (produtoEncontrado != null) {
	        if (produtoEncontrado.getEstoque() == 0) {
	          removeProduto(produtos, produtoEncontrado);
	        } else {
	          System.out.println("O produto ainda está em estoque. Tem certeza que deseja remover?");
	          System.out.println("Digite 'sim' ou 'não' ");
	          String confirmacao = sc.nextLine();

	          if (confirmacao.equals("sim")) {
	            removeProduto(produtos, produtoEncontrado);

	          } else {
	            imprimeEntreTravessao("Operação cancelada pelo usuário.");
	          }

	          System.out.println(APERTE_ENTER);
	    	    sc.nextLine();        
	        }
				}

	    } else if (comando.equals("5")) {
				// TODO 
	      // falta alterar o saldo

	      System.out.println("Digite o código do produto");
	      int codigodoProduto = Integer.parseInt(sc.nextLine());

	      Produto produtoEncontrar = procuraProdutoPeloCodigo(produtos, codigodoProduto);

	      if (produtoEncontrar != null) {
	        System.out.println("Digite a quantidade a ser vendida");
	        int quantidadeVendida = Integer.parseInt(sc.nextLine());

	        String response = produtoEncontrar.reduzirEstoque(quantidadeVendida);

	        imprimeEntreTravessao(response);
	      } else {
	        imprimeEntreTravessao(NAO_ENCONTRADO);
	      }

	      System.out.println(APERTE_ENTER);
	      sc.nextLine();

		} else if (comando.equals("6")) {
			// TODO 
	    // Falta criar o relatório como um todo
	    System.out.println(APERTE_ENTER);

		} else {
			// TODO
		  // Falta persistência de informações

	    System.out.println("Até mais ver!");
	    break;
	  }
	}
	sc.close();
	}
	
	public static void listarComandos() {
		System.out.println(TRAVESSAO);
	  System.out.println("Lista dos comandos: ");
	  System.out.println("1. Listar;");
	  System.out.println("2. Cadastrar;");
	  System.out.println("3. Adicionar;");
	  System.out.println("4. Remover;");
	  System.out.println("5. Vender;");
	  System.out.println("6. Mostrar relatório;");
	  System.out.println("7. Sair.");
		System.out.println(TRAVESSAO);
		System.out.println("Digite o código do comando: ");        
	}
	
	public static void listarProdutos(List<Produto> produtos) {
		System.out.println(TRAVESSAO);
	  for (int i = 0; i < produtos.size(); i++) {
	    System.out.println(produtos.get(i).getInfo());
	  }
	  System.out.println(TRAVESSAO);

	  if (produtos.isEmpty()) {
	    System.out.println("Não há produtos cadastrados!");
		}	 
	}
	        
	public static Produto procuraProdutoPeloCodigo(List<Produto> produtos, int codigoProduto) {
	  for (Produto produto : produtos) {
	    if (produto.getCodigoProduto() == codigoProduto) {
	    	return produto;
	  	}
	  }

	  return null;
	}

	private static double getValorPositivo(Scanner scanner, String mensagem) {
		double valor = -1;
	  	while (valor < 0) {
	    	System.out.println(mensagem);
	    	valor = Double.parseDouble(scanner.nextLine());

	    	if (valor < 0) {
	      	System.out.println("O valor não pode ser negativo. Tente novamente.");
	    	}
	  	}

	  return valor;
	}

	public static void imprimeEntreTravessao(String imprimir) {
	  System.out.println(TRAVESSAO);
	  System.out.println(imprimir);
		System.out.println(TRAVESSAO);
	}
	
	
	public static void removeProduto(List<Produto> produtos, Produto produtoEncontrado) {
    int indice = produtos.indexOf(produtoEncontrado);
    produtos.remove(indice);

    imprimeEntreTravessao("Produto removido!");
  }
	
}