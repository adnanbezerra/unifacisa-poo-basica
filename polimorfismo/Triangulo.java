package polimorfismo;

public class Triangulo extends Figura2D {
  public Triangulo(int largura, int altura) {
    super(largura, altura);
  }

  public int calculaArea() {
    return (largura * altura) / 2;
  }
}
