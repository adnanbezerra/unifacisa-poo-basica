import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeAtual;
        int media = 0;

        System.out.println("Insira quantas pessoas serão: ");
        int pessoas = sc.nextInt();

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Insira a próxima idade: ");
            idadeAtual = sc.nextInt();
            if (i == 0) media = idadeAtual;
            else media = (media + idadeAtual) / 2;
        }

        if (media <= 25) System.out.println("A turma é jovem");
        else if (media > 25 && media <= 60) System.out.println("A turma é adulta");
        else System.out.println("A turma é idosa");

        sc.close();
    }
}
