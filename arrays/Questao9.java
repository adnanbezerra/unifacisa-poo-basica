package arrays;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        String[] strings = {"Dena", "Lele", "Nata", "Narla", "Main"};
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;

        System.out.println("Diga lá o nome do cabra");
        String procurar = sc.nextLine();

        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals(procurar)) encontrado = true;
        }

        if(encontrado == true) System.out.println("Encontrado");
        else System.out.println("Desconhecido");

        sc.close();
    }
}
