import java.util.Scanner;

public class Questao12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira a sua primeira nota");
    float i = sc.nextFloat();

    System.out.println("Insira a sua segunda nota");
    float j = sc.nextFloat();

    float media = (i + j) / 2;

    if (media == 10) {
      System.out.println("Aprovadíssimo");
    } else if (media < 4) {
      System.out.println("Reprovado");
    } else if (media > 7) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Final");
      System.out.println("Insira a nota da final:");
      float notaFinal = sc.nextFloat();
      if (notaFinal >= 5) {
        System.out.println("Aprovado na final");
      } else {
        System.out.println("Reprovado na final");
      }
    }

    sc.close();
  }
}
