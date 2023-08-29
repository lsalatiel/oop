import java.util.HashSet;

public class Departamento {
    private String nome;
    private HashSet<Funcionario> funcionarios = new HashSet<Funcionario>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario d) {
        funcionarios.add(d);
    }
    public void removeFuncionario(Funcionario d) {
        funcionarios.remove(d);
    }
    public boolean containsFuncionario(Funcionario d) {
        return funcionarios.contains(d);
    }
    public void clearFuncionarios(Funcionario d) {
        funcionarios.clear();
    }
    public HashSet<Funcionario> getFuncionarios() {
        return new HashSet<Funcionario>(funcionarios);
    }
    public double sizeFuncionarios() {
        return funcionarios.size();
    }

    public double calculaMediaSalarial() {
        double sum = 0;

        HashSet<Funcionario> funcionarios = getFuncionarios();
        for(Funcionario f : funcionarios)
            sum += f.getSalario();

        return sum / sizeFuncionarios();
    }
}
