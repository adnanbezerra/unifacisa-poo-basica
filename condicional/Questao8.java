import java.util.Scanner;

public class Questao8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual a sua idade?");
    int idade = sc.nextInt();

    if(idade < 18) {
      System.out.println("Você é menoridade");
    } else if (idade > 65) {
      System.out.println("Você é idoso");
    } else {
      System.out.println("Você é adulto");
    }

    sc.close();
  }
}
