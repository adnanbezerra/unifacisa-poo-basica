package metodos;

public class Questao4 {
    public static int potencia(int potencia, int potencial) {
        int resultado = 1;

        for (int i = 0; i < potencial; i++) {
            resultado *= potencia;
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(potencia(7, 2));
    }
}
