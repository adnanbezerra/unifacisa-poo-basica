import java.util.Scanner;

public class Questao6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o primeiro número inteiro:");
    int i = sc.nextInt();

    System.out.println("Insira o segundo número inteiro:");
    int j = sc.nextInt();

    int k = i + j;

    if(k >= 100) {
      System.out.printf("O resultado é: %d %n", k);
    }

    System.out.println("Fim do código");

    sc.close();
  }
}
