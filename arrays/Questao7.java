package arrays;

public class Questao7 {
    public static void main(String[] args) {
        String[] strings = {"Adnan", "está", "com", "muito", "sono"};
        String maiorString = "";

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maiorString.length()) maiorString = strings[i];
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i].length());
        }
        System.out.println("A maior string é " + maiorString);
    }
}
