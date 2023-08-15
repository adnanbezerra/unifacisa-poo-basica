import java.util.Scanner;

public class Questao7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira aqui o seu número inteiro:");
    int i = sc.nextInt();

    if (i > 0) {
      System.out.println("É maior que zero");
    } else if (i < 0) {
      System.out.println("É menor que zero");
    } else {
      System.out.println("É zero");
    }

    sc.close();
  }
}
