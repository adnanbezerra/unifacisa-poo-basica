import java.util.Scanner;

public class Questao2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o primeiro número: ");
    int i = sc.nextInt();
    System.out.print("Insira o segundo número: ");
    int j = sc.nextInt();

    if (i > j) {
      System.out.println("primeiro");
    } else {
      System.out.println("segundo");
    }

    sc.close();
  }
}
