import java.util.Scanner;

public class Questao3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o número do dia da semana:");
    int numero = sc.nextInt();

    if(numero > 7 || numero < 1) {
      System.out.println("Entrada inválida!");
    } else if (numero == 1) {
      System.out.println("Hoje é domingo");
    } else if (numero == 2) {
      System.out.println("Hoje é segunda");
    } else if (numero == 3) {
      System.out.println("Hoje é terça");
    } else if (numero == 4) {
      System.out.println("Hoje é quarta");
    } else if (numero == 5) {
      System.out.println("Hoje é quinta");
    } else if (numero == 6) {
      System.out.println("Hoje é sexta");
    } else {
      System.out.println("Hoje é sábado");
    } 

    sc.close();
  }
}
