import java.util.Scanner;

public class Questao10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira aqui o primeiro número inteiro");
    int i = Integer.parseInt(sc.nextLine());

    System.out.println("Insira aqui a operação matemática (+ para soma, - para subtração, * para multiplicação e / para divisão).");
    String operacao = sc.nextLine();

    System.out.println("Insira aqui o segundo número inteiro");
    int j = Integer.parseInt(sc.nextLine());

    System.out.println("Resultado:");
    switch (operacao) {
      case "+":
        System.out.println(i + j);
        break;
      case "-":
        System.out.println(i - j);
        break;
      case "/": 
        System.out.println(i / j);
        break;
      case "*":
        System.out.println(i * j);
        break;
      default:
        System.out.println("OPERAÇÃO INVÁLIDA!");
        break;
    }

    sc.close();
  }
}
