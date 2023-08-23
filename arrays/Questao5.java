package arrays;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto = 1;

        System.out.println("Diga o tamanho do array.");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Diga lá o próximo int: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            produto *= numeros[i];
        }

        System.out.println(produto);

        sc.close();
    }
}
