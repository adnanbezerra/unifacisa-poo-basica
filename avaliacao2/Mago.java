package avaliacao2;

public class Mago extends Personagem {
  public Mago(String nome, int nivel, int forca, int inteligencia, int agilidade, int vida, int defesa) {
    super(nome, nivel, forca, inteligencia, agilidade, vida, defesa);
  }

  @Override
  public int causarDano() {
    return this.inteligencia * 2;
  }

  @Override
  public String toString() {
    return "Nome do personagem: " + this.nome + ", nível: " + this.nivel + ", vida restante: " + this.vida + 
            "\n Inteligência: " + this.inteligencia + ", agilidade: " + this.agilidade + ", defesa: " + this.defesa +
            "\n Classe: Mago";
  }
}
