import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor X: ");
        int x = sc.nextInt();
        System.out.println("Insira o valor Y: ");
        int y = sc.nextInt();
        System.out.println("Insira o valor Z: ");
        int z = sc.nextInt();

        for (int i = x; i < y + 1; i += z) {
            System.out.println(i);
        }

        sc.close();
    }
}
