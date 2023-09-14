package heranca02;

public class Main {
    public static void main(String[] args) {
        Pessoa adnan = new Pessoa("Adnan", 21, 1);
        Pessoa natalia = new Pessoa("Natalia", 21, 2);
        Pessoa lele = new Pessoa("Lele", 24, 3);

        adnan.adicionarAmigo(natalia);
        adnan.adicionarAmigo(lele);

        System.out.println(adnan.getListaDeAmigosComoString());

        Vendedor vendedor1 = new Vendedor("Dena", "cria", 1000, 1000);
        System.out.println(vendedor1.getSalario());

        Gerente gerente1 = new Gerente("LL", "crias", 10000);
        System.out.println(gerente1.getSalario());

        gerente1.addSubordinado(vendedor1);

        System.out.println(gerente1.getSalario());
    }
}
