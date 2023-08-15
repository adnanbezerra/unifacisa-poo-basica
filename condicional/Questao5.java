import java.util.Scanner;

public class Questao5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o número");
    float i = sc.nextFloat();

    if(i > 100) {
      System.out.printf("%.2f %n", i/2);
    }

    sc.close();
  }
}
