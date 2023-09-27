package avaliacao2;

public class Personagem {
    protected String nome;
    protected int nivel;
    protected int forca;
    protected int inteligencia;
    protected int agilidade; 
    protected int vida;
    protected int defesa;

    public Personagem(String nome, int nivel, int forca, int inteligencia, int agilidade, int vida, int defesa) {
      this.nome = nome;
      this.nivel = nivel;
      this.forca = forca;
      this.inteligencia = inteligencia;
      this.agilidade = agilidade;
      this.vida = vida;
      this.defesa = defesa;
    }

    public int causarDano() {
      return this.forca;
    }

    public void receberDano(int dano) {
      if (dano - defesa > 0) { 
        this.vida -= (dano - defesa);
      }
    }

    @Override
    public String toString() {
      return "Nome do personagem: " + this.nome + ", nível: " + this.nivel + ", vida restante: " + this.vida + 
              "%nInteligência: " + this.inteligencia + ", agilidade: " + this.agilidade + ", defesa: " + this.defesa;
    }
}
