package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        while (true) {
            System.out.println("Insira o próximo número: ");
            int numero = sc.nextInt();

            if(numero < 0) break;
            else ints.add(numero);
        }

        for (int i = 0; i < ints.size(); i++) {
            if(ints.get(i) % 2 == 0) pares ++;
            else impares ++;
        }

        System.out.printf("Número de pares: %d; Número de ímpares: %d", pares, impares);

        sc.close();
    }
}
