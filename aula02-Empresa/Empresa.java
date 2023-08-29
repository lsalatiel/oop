import java.util.HashSet;

public class Empresa {
    private String nome;

    public Empresa(String nome) {
        this.nome = nome;
    }

    private HashSet<Departamento> departamentos = new HashSet<Departamento>();

    public String getNome() {
        return nome;
    }

    public void addDepartamento(Departamento d) {
        departamentos.add(d);
    }
    public void removeDepartamento(Departamento d) {
        departamentos.remove(d);
    }
    public boolean containsDepartamento(Departamento d) {
        return departamentos.contains(d);
    }
    public void clearDepartamentos(Departamento d) {
        departamentos.clear();
    }
    public HashSet<Departamento> getDepartamentos() {
        return new HashSet<Departamento>(departamentos);
    }

    public double calculaMediaSalarial() {
        double sum = 0;
        double qtd = 0;

        HashSet<Departamento> departamentos = getDepartamentos();
        for(Departamento d : departamentos) {
            sum += d.calculaMediaSalarial();
            qtd += d.sizeFuncionarios();
        }

        return sum / qtd;
    }

}