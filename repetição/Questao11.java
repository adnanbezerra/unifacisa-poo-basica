import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entry;
        
        while(true) {
            System.out.println("Digite a próxima entrada:");
            entry = sc.nextInt();

            if(entry == 0) break;

            System.out.println(Math.pow(entry, 2));
        }

        sc.close();
    }
}
