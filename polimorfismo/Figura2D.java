package polimorfismo;

public class Figura2D {
  protected int largura;
  protected int altura;
  
  public Figura2D(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
  }

  public int calculaArea() {
    return largura * altura;
  }
}
