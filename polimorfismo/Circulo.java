package polimorfismo;

public class Circulo {
  public double raio; 
  public double comprimento;

  public Circulo(double raio, double comprimento) {
    this.raio = raio;
    this.comprimento = comprimento;
  }

  public double calculaArea() {
    return comprimento * Math.pow(raio, 2);
  }
}
