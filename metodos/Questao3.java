package metodos;

public class Questao3 {
    public void testaSeStringEhLonga(String longa) {
        if (longa.length() >= 8) {
            System.out.println("É longa sim");
        } else {
            System.out.println("É curta");
        }
    }
}
