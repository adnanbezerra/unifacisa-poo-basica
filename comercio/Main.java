package comercio;

import java.util.ArrayList;
import java.util.Scanner;

/* MEMBROS DO GRUPO:
- Adnan Medeiros Bezerra
- Natália Galdino Bronzeado
- Gizele
- Caio Henrique
- Aderval
- Layla
*/

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caderno", 10));
        produtos.add(new Produto("Caneta", 20));

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Comério!");
        String comando;

        while(true) {
            listarComandos();
            System.out.println("Digite o próximo comando: ");
            comando = sc.nextLine();

            if(comando.equals("Sair")) {
                System.out.println("Até mais ver!");
                break;
            } else if (comando.equals("Listar")) {
                listar(produtos);
                System.out.println("Aperte qualquer botão para continuar");
                comando = sc.nextLine();
            } else if (comando.equals("Cadastrar")) {
                // TODO
            } else if (comando.equals("Adicionar")) {
                // TODO
            } else if (comando.equals("Remover")) {
                // TODO
            } else if (comando.equals("Vender")) {
                // TODO
            } 

        }

        sc.close();
    }

    public static void listar(ArrayList<Produto> produtos) {
        System.out.println("--------------------------");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getInfo());
        }
        System.out.println("--------------------------");
    }

    public static void listarComandos() {
        System.out.println("Lista dos comandos: ");
        System.out.println("1. Listar;");
        System.out.println("2. Cadastrar;");
        System.out.println("3. Adicionar;");
        System.out.println("4. Remover;");
        System.out.println("5. Vender");
        System.out.println("6. Sair.");
        System.out.println("--------------------------");
    }
}
