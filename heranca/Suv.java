package heranca;

public class Suv extends Carro {
  private boolean ehSUVDeVerdade;

  public Suv(String chassis, int peso, int lugares, double velocidadeMaxima, String tipoTracao, boolean ehSUVDeVerdade) {
    super(chassis, peso, lugares, velocidadeMaxima, tipoTracao);
    this.ehSUVDeVerdade = ehSUVDeVerdade;
  }

  public boolean getEhSUVDeVerdade() {
    return ehSUVDeVerdade;
  }

  @Override
  public void acelerar(double quantidade) {
    if(ehSUVDeVerdade) {
      this.velocidadeInstantanea += quantidade * 10;
    } else {
      this.velocidadeInstantanea += quantidade;
    }
  }
}
