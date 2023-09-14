package heranca02;

public class Vendedor extends Funcionario {
    private double valorEmVendas;

    public Vendedor(String nome, String identificacao, double salario, double valorEmVendas) {
        super(nome, identificacao, salario);
        this.valorEmVendas = valorEmVendas;
    }

    @Override
    public double getSalario() {
        return this.salario + (this.valorEmVendas * 0.05);
    }

    public double getValorEmVendas() {
        return valorEmVendas;
    }

    public void setValorEmVendas(double valorEmVendas) {
        this.valorEmVendas = valorEmVendas;
    }
}
