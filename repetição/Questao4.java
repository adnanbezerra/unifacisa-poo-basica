import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro");
        int entry = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(entry * i);
        }

        sc.close();
    }
}
