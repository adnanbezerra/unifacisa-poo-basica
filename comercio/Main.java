package comercio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* MEMBROS DO GRUPO:
- Adnan Medeiros Bezerra
- Natália Galdino Bronzeado
- Gizele Gabriele Vidal de Sousa
- Caio Henrique Ramos Medeiros
- Adeval Neto Cordeiro de Albuquerque
- Layla Kethlen Ramos Apolinario
*/

public class Main {
    public static final String TRAVESSAO = "--------------------------";
    public static final String APERTE_ENTER = "Aperte Enter para continuar";
    public static final String DIGITE_CODIGO="Digite o código do produto.";
    public static final String NAO_ENCONTRADO="Produto não encontrado.";

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caderno", 10, 1));
        produtos.add(new Produto("Caneta", 20, 2));
        produtos.add(new Produto("Borracha", 5, 3));

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Comério!");
        String comando;

        while(true) {
            System.out.println(TRAVESSAO);
            listarComandos();
            System.out.println("Digite o código do comando: ");
            comando = sc.nextLine();

            if(comando.equals("6")) {
                System.out.println("Até mais ver!");
                break;

            } else if (comando.equals("1")) {
                listar(produtos);
                System.out.println(APERTE_ENTER);
                sc.nextLine();

            } else if (comando.equals("2")) {
                cadastrar(produtos);
                System.out.println(APERTE_ENTER);
                sc.nextLine();

            } else if (comando.equals("3")) {
            	adicionar(produtos);
                System.out.println(APERTE_ENTER);
                sc.nextLine();

            } else if (comando.equals("4")) {
            	remover(produtos);
                System.out.println(APERTE_ENTER);
                sc.nextLine();

            } else if (comando.equals("5")) {
            	vender(produtos);
                System.out.println(APERTE_ENTER);
                sc.nextLine();
            } 

        }

        sc.close();
    }
    
    public static void remover(List<Produto> produtos) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println(DIGITE_CODIGO);
    	int codigoProduto = Integer.parseInt(sc.nextLine());

    	// Procurar o produto pelo código na lista produtos
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
    		}

    	} else {
    		imprimeEntreTravessao(NAO_ENCONTRADO);
    	}
    	
    }
    
    public static void removeProduto(List<Produto> produtos, Produto produtoEncontrado) {
    	int indice = produtos.indexOf(produtoEncontrado);
	    produtos.remove(indice);
	    
	    imprimeEntreTravessao("Produto removido!");
    }
    
    
    public static void vender(List<Produto> produtos) {
    	Scanner sc = new Scanner(System.in);
	
    	System.out.println(DIGITE_CODIGO);
    	int codigoProduto = Integer.parseInt(sc.nextLine());

    	// Procurar o produto pelo código na lista produtos
    	Produto produtoEncontrado = procuraProdutoPeloCodigo(produtos, codigoProduto);

    	if (produtoEncontrado != null) {
    		System.out.println("Digite a quantidade a ser vendida");
    		int quantidadeVendida = Integer.parseInt(sc.nextLine());

    		String response = produtoEncontrado.reduzirEstoque(quantidadeVendida);

    		imprimeEntreTravessao(response);
    	} else {
    		imprimeEntreTravessao(NAO_ENCONTRADO);
    	}
    }


    public static void cadastrar(List<Produto> produtos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomeProduto = sc.nextLine();
        
        //cadastrando código
        System.out.println(DIGITE_CODIGO);
        int codigoProduto = Integer.parseInt(sc.nextLine());

        //verificar se existe código igual
        Produto produtoJaExistente = procuraProdutoPeloCodigo(produtos, codigoProduto);

        if (produtoJaExistente != null) {
            System.out.println("Código de produto já cadastrado. Não é possível cadastrar novamente.");   

        } else {
            //adicionando o produto
            Produto novoProduto = new Produto(nomeProduto, 0, codigoProduto);
            produtos.add(novoProduto);
                    
            //adicionando estoque
            System.out.println("Deseja adicionar estoque a esse produto? Digite 'sim' ou 'não'.");
            String adicionarEstoque = sc.nextLine();

            if (adicionarEstoque.equals("sim")){
                System.out.println("Digite a quantidade de produtos:");
                int quantidadeProduto = Integer.parseInt(sc.nextLine());
                novoProduto.aumentarEstoque(quantidadeProduto);

                System.out.println(TRAVESSAO);
                System.out.printf("O produto %s foi cadastrado com sucesso! Codigo = %d, Estoque = %d %n", nomeProduto, codigoProduto, quantidadeProduto);
                System.out.println(TRAVESSAO);

            } else if (adicionarEstoque.equals("não")) { 
                System.out.println(TRAVESSAO);
                System.out.printf("O produto %s foi cadastrado com sucesso! Codigo = %d, Estoque = 0 %n", nomeProduto, codigoProduto);
                System.out.println(TRAVESSAO);
            }   
        }    
    }
    
    public static void adicionar(List<Produto> produtos) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println(DIGITE_CODIGO);
    	int codigoProduto = Integer.parseInt(sc.nextLine());

    	// Procurar o produto pelo código na lista produtos
    	Produto produtoEncontrado = procuraProdutoPeloCodigo(produtos, codigoProduto);

    	if (produtoEncontrado != null) {
    	    System.out.println("Digite a quantidade a ser adicionada ao estoque:");
    	    int quantidadeAdicionada = Integer.parseInt(sc.nextLine());

    	    produtoEncontrado.aumentarEstoque(quantidadeAdicionada);
    	    
    	    imprimeEntreTravessao("Estoque do produto atualizado com sucesso!");
    	} else {
    		imprimeEntreTravessao(NAO_ENCONTRADO);
    	}
    }

    public static void listar(List<Produto> produtos) {
        System.out.println(TRAVESSAO);
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getInfo());
        }
        System.out.println(TRAVESSAO);
        
        if (produtos.size()==0) {
        	System.out.println("Não há produtos cadastrados!");
        }
    }

    public static void imprimeEntreTravessao(String imprimir) {
        System.out.println(TRAVESSAO);
        System.out.println(imprimir);
        System.out.println(TRAVESSAO);
    }

    public static Produto procuraProdutoPeloCodigo(List<Produto> produtos, int codigoProduto) {
        for (Produto produto : produtos) {
    	    if (produto.getCodigo() == codigoProduto) {
    	        return produto;
    	    }
    	}

        return null;
    }

    public static void listarComandos() {
        System.out.println("Lista dos comandos: ");
        System.out.println("1. Listar;");
        System.out.println("2. Cadastrar;");
        System.out.println("3. Adicionar;");
        System.out.println("4. Remover;");
        System.out.println("5. Vender");
        System.out.println("6. Sair.");
        System.out.println(TRAVESSAO);
    }
}