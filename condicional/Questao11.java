import java.util.Scanner;

public class Questao11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira um número inteiro");
    int i = sc.nextInt();

    if (i > 0) {
      System.out.println(Math.sqrt(i));
    } else {
      System.out.println(Math.pow(i, 3));
    }

    sc.close();
  }
}
