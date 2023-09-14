package heranca02;

public class Funcionario {
    protected String nome;
    protected String identificacao;
    protected double salario;
    
    public Funcionario(String nome, String identificacao, double salario) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
