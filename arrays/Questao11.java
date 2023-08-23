package arrays;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("Insira o elemento [%d][%d]", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}
