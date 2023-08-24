package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Digite o próximo nome: ");
            String nome = sc.nextLine();

            if(nome.equals("FIM")) break;
            else strings.add(nome);
        }

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() >= 8) System.out.println(strings.get(i));
        }

        sc.close();
    }
}
