package avaliacao2;

public class Inimigo extends Personagem {
  private int moedas;
  private int experiencia;
  private String itens;

  public Inimigo(String nome, int nivel, int forca, int inteligencia, int agilidade, int vida, int defesa, int moedas, int experiencia, String itens) {
    super(nome, nivel, forca, inteligencia, agilidade, vida, defesa);
    this.moedas = moedas;
    this.experiencia = experiencia;
    this.itens = itens;
  }

  public void causarDano(Personagem personagem) {
    personagem.receberDano(this.forca);
  }

  public void morrer() {
    System.out.println("Moedas: " + this.moedas);
    System.out.println("Experiencia: " + this.experiencia);
    System.out.println("Itens: " + itens);
  }
}
