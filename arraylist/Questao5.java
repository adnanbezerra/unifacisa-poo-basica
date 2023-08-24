package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
        ArrayList<String> pesoIdeal = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Digite o nome do indivíduo: ");
            String nome = sc.nextLine();

            if(nome.equals("FIM")) break;
            else pessoas.add(nome);

            System.out.println("Digite o peso do indivíduo: ");
            double peso = Double.parseDouble(sc.nextLine());

            System.out.println("Digite a altura do indivíduo: ");
            double altura = Double.parseDouble(sc.nextLine());

            double imc = peso / Math.pow(altura, 2);

            if (imc >= 18.5 && imc <= 24.9) pesoIdeal.add(nome);
        }

        for (String nome : pesoIdeal) {
            System.out.println(nome);
        }

        sc.close();
    }
}
