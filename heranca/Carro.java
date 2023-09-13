package heranca;

public class Carro extends Veiculo {
  protected String tipoTracao;

  public Carro(String chassis, int peso, int lugares, double velocidadeMaxima, String tipoTracao) {
    super(chassis, peso, lugares, velocidadeMaxima);
    this.tipoTracao = tipoTracao;
  }

  public String getTipoTracao() {
    return tipoTracao;
  }
}
