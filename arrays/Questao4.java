package arrays;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int soma = 0;
        float media = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o próximo número inteiro: ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        for (int i = 0; i < numeros.length; i++) {
            if(i == 0) media = numeros[i];
            else media = (media + numeros[i]) / 2;
        }

        System.out.printf("Média dos números: %.1f; Soma: %d", media, soma);

        sc.close();
    }
}
