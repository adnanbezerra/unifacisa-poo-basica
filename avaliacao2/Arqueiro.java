package avaliacao2;

public class Arqueiro extends Personagem {
  private int destreza;

  public Arqueiro(String nome, int nivel, int forca, int inteligencia, int agilidade, int vida, int defesa, int destreza) {
    super(nome, nivel, forca, inteligencia, agilidade, vida, defesa);
    this.destreza = destreza;
  }

  @Override
  public int causarDano() {
    return this.agilidade + this.destreza;
  }

  @Override
  public String toString() {
    return "Nome do personagem: " + this.nome + ", nível: " + this.nivel + ", vida restante: " + this.vida + 
            "\n Inteligência: " + this.inteligencia + ", agilidade: " + this.agilidade + ", defesa: " + this.defesa +
            "\n Classe: Arqueiro";
  }
}
