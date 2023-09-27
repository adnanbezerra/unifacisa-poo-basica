package avaliacao2;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Guerreiro guerreiro = new Guerreiro("Sviatoslav", 1, 10, 2, 2, 10, 5);
    Arqueiro arqueiro = new Arqueiro("Mujahidin", 1, 2, 7, 7, 7, 3, 10);
    Mago mago = new Mago("Gandalf", 10, 100, 1345, 10, 134512, 3);
    Inimigo balrog = new Inimigo("Balrog", 10, 200, 10, 10, 10000, 10, 1000, 1000, "Espada da Perdição");

    ArrayList<Personagem> personagens = new ArrayList<>();
    personagens.add(guerreiro);
    personagens.add(arqueiro);
    personagens.add(mago);

    System.out.println("Bem-vindo à batalha dos daora");
    System.out.println("Rodada 1");
    balrog.receberDano(guerreiro.causarDano());
    balrog.receberDano(arqueiro.causarDano());
    balrog.receberDano(mago.causarDano());

    balrog.causarDano(guerreiro);
    System.out.println("Guerreiro is falecido");

    System.out.println("Rodada 2");
    balrog.receberDano(arqueiro.causarDano());
    balrog.receberDano(mago.causarDano());

    balrog.causarDano(arqueiro);
    System.out.println("Arqueiro is falecido");
    System.out.println("O mago foge!");
    System.out.println("Você acabou de presenciar a Queda de Durin.");

    System.out.println("Vou matar o Balrog só para testar o método");
    balrog.morrer();
  }
}
