package heranca;

public class Veiculo {
  private String chassis;
  private int peso;
  private int lugares;
  private double velocidadeMaxima;
  private double velocidadeInstantanea = 0;

  public Veiculo(String chassis, int peso, int lugares, double velocidadeMaxima) {
    this.chassis = chassis;
    this.peso = peso;
    this.lugares = lugares;
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

  public int getLugares() {
    return lugares;
  }

  public void setLugares(int lugares) {
    this.lugares = lugares;
  }

  public void acelerar(double quantidade) {
    velocidadeInstantanea += quantidade;
  }

  public void frear(double quantidade) {
    velocidadeInstantanea -= quantidade;
  }

}
