package comercio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* MEMBROS DO GRUPO:
- Adnan Medeiros Bezerra
- Natália Galdino Bronzeado
- Gisele Gabrielle Vidal de Sousa
- Caio Henrique Ramos Medeiros
- Adeval Neto Cordeiro de Albuquerque
- Layla Kethlen Ramos Apolinario
*/

public class Main {
    public static final String TRAVESSAO = "--------------------------";

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caderno", 10, 1));
        produtos.add(new Produto("Caneta", 20, 2));

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Comério!");
        String comando;

        while(true) {
            System.out.println(TRAVESSAO);
            listarComandos();
            System.out.println("Digite o próximo comando: ");
            comando = sc.nextLine();

            if(comando.equals("Sair")) {
                System.out.println("Até mais ver!");
                break;

            } else if (comando.equals("Listar")) {
                listar(produtos);
                System.out.println("Aperte Enter para continuar");
                sc.nextLine();

            } else if (comando.equals("Cadastrar")) {
                cadastrar(produtos);
                System.out.println("Aperte Enter para continuar");
                sc.nextLine();

            } else if (comando.equals("Adicionar")) {
                // TODO
                // Pede o código do produto e quantidade a adicionar e adiciona usando a função aumentarEstoque do objeto Produto

            } else if (comando.equals("Remover")) {
                // TODO
                // Pede o código do produto e remove do ArrayList

            } else if (comando.equals("Vender")) {
                // TODO
                // Pede o código do produto e usa a funcao reduzirEstoque do objeto. Talvez seja preciso modificar a função que está no objeto 
            } 

        }

        sc.close();
    }

    public static void cadastrar(List<Produto> produtos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        String nomeProduto = sc.nextLine();
        //cadastrando código
        System.out.println("Digite o código do produto");
        int codigoProduto = Integer.parseInt(sc.nextLine());

        //verificar se existe código igual
        boolean codigoJaExistente = false;
        for (Produto produtoExistente : produtos) {
            if (produtoExistente.getCodigo() == codigoProduto) {
                codigoJaExistente = true;
            }
            
        }

        if (codigoJaExistente) {
            System.out.println("Código de produto já cadastrado. Não é possível cadastrar novamente.");
            cadastrar(produtos);

        } else {
            //adicionando o produto
            Produto novoProduto = new Produto(nomeProduto, 0, codigoProduto);
            produtos.add(novoProduto);
                    
            //adicionando estoque
            System.out.println("Deseja adicionar estoque a esse produto? Digite sim ou não");
            String adicionarEstoque = sc.nextLine();

            if (adicionarEstoque.equals("sim")){
                System.out.println("Digite a quantidade de produtos");
                int quantidadeProduto = sc.nextInt();
                sc.nextLine(); 
                novoProduto.alterarEstoque(quantidadeProduto);

                System.out.println(TRAVESSAO);
                System.out.printf("O produto %s foi cadastrado com sucesso! Codigo = %d, Estoque = %d %n", nomeProduto, codigoProduto, quantidadeProduto);
                System.out.println(TRAVESSAO);

            } else if (adicionarEstoque.equals("não")) { 
                System.out.println(TRAVESSAO);
                System.out.printf("O produto %s foi cadastrado com sucesso! Codigo = %d, Estoque = 0 %n",nomeProduto,codigoProduto);
                System.out.println(TRAVESSAO);
            }   
        }    
    }

    public static void listar(List<Produto> produtos) {
        System.out.println(TRAVESSAO);
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getInfo());
        }
        System.out.println(TRAVESSAO);
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
