import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        int nota1;
        int nota2;
        float media = -1;
        float mediaGeral = 0;

        while(true) {
            System.out.println("Insira o nome do aluno");
            nome = sc.nextLine();

            System.out.println(nome.equals("FIM"));

            if (nome.equals("FIM")) {
                System.out.printf("A média geral é: %.1f", mediaGeral);
                break;
            }

            System.out.println("Insira a nota da prova 1");
            nota1 = Integer.parseInt(sc.nextLine());

            System.out.println("Insira a nota da prova 2");
            nota2 = Integer.parseInt(sc.nextLine());

            media = (nota1 + nota2) / 2;

            if(media == -1) {
                mediaGeral = media;
            } else {
                mediaGeral = (mediaGeral + media) / 2;
            }
        }

        sc.close();
    }
}
