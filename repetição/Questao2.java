import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo:");
        int entry = sc.nextInt();

        if(entry < 1) System.out.println("Número inválido");

        for (int i = 0; i < entry; i++) {
            System.out.println(i + 1);
        }

        sc.close();
    }
}
