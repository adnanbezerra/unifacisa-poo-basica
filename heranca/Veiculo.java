package heranca;

public class Veiculo {
  protected String chassis;
  protected int peso;
  protected int quantidadeDeLugares;
  protected double velocidadeMaxima;
  protected double velocidadeInstantanea = 0;

  public Veiculo(String chassis, int peso, int quantidadeDeLugares, double velocidadeMaxima) {
    this.chassis = chassis;
    this.peso = peso;
    this.quantidadeDeLugares = quantidadeDeLugares;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public double getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public String getChassis() {
    return chassis;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public int getQuantidadeDeLugares() {
    return quantidadeDeLugares;
  }

  public void acelerar(double quantidade) {
    velocidadeInstantanea += quantidade;
  }

  public void frear(double quantidade) {
    velocidadeInstantanea -= quantidade;
  }

}
