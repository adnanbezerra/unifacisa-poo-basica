import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entry;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o próximo número: ");
            entry = sc.nextInt();

            System.out.println(Math.pow(entry, 2));
        }

        sc.close();
    }
}
