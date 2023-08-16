import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o limite superior: ");
        int limite = sc.nextInt();

        for (int i = 0; i < limite; i++) {
            if(i % 2 != 0) System.out.println(i);
        }

        sc.close();
    }
}
