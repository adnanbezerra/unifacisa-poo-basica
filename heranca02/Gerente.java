package heranca02;

import java.util.ArrayList;

public class Gerente extends Funcionario {
    private ArrayList<Funcionario> subordinados = new ArrayList<>();

    public Gerente(String nome, String identificacao, double salario) {
        super(nome, identificacao, salario);
    }

    public ArrayList<Funcionario> getSubordinados() {
        return subordinados;
    }

    public void addSubordinado(Funcionario subordinado) {
        if (!subordinados.contains(subordinado)) {
            subordinados.add(subordinado);
        }
    }

    @Override
    public double getSalario() {
        return this.salario + (subordinados.size() * 100);
    }

    @Override
    public String getNome() {
        return "* " + this.nome;
    }
}
