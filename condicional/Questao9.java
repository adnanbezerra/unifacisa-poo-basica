import java.util.Scanner;

public class Questao9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira aqui algum número inteiro");
    int i = sc.nextInt();

    if(i % 2 == 0) {
      System.out.println("Ele é par");
    } else {
      System.out.println("É ímpar");
    }

    sc.close();
  }
}
