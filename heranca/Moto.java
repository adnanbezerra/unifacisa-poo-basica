package heranca;

public class Moto extends Veiculo {
  private int cilindradas;

  public Moto(String chassis, int peso, int lugares, double velocidadeMaxima, int cilindradas) {
    super(chassis, peso, lugares, velocidadeMaxima);
    this.cilindradas = cilindradas;
  }

  public int getCilindradas() {
    return cilindradas;
  }

  @Override
  public void frear(double quantidde) {
    System.out.println("Seu comando foi IGNORADO.");
  }
}
