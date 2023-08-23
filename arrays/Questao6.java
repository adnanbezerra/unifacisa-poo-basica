package arrays;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Diga lá o próximo int");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < menor) menor = numeros[i];
            if(numeros[i] > maior) maior = numeros[i];
        }

        System.out.printf("Maior: %d; menor: %d", maior, menor);

        sc.close();
    }
}
