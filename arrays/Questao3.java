package arrays;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira o próximo nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println(nomes);

        sc.close();
    }
}
