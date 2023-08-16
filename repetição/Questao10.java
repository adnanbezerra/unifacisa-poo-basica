import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entry = 0;
        int digitados = 0;

        while(entry >= 0) {
            System.out.println("Digite o próximo");
            entry = sc.nextInt();
            digitados++;
        }

        System.out.println(digitados);

        sc.close();
    }
}
