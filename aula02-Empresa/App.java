import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Departamento dep1 = new Departamento("Departamento1");
        Departamento dep2 = new Departamento("Departamento2");
        Departamento dep3 = new Departamento("Departamento3");

        Empresa e = new Empresa("Empresa");

        Funcionario fun1 = new Funcionario("Funcionario1");
        Funcionario fun2 = new Funcionario("Funcionario2");
        Funcionario fun3 = new Funcionario("Funcionario3");
        Funcionario fun4 = new Funcionario("Funcionario4");
        Funcionario fun5 = new Funcionario("Funcionario5");

        fun1.setSalario(100);
        fun2.setSalario(24);
        fun3.setSalario(250);
        fun4.setSalario(400);
        fun5.setSalario(69);

        dep1.addFuncionario(fun1);
        dep2.addFuncionario(fun2);
        dep2.addFuncionario(fun3);
        dep3.addFuncionario(fun4);
        dep1.addFuncionario(fun5);

        e.addDepartamento(dep1);
        e.addDepartamento(dep2);
        e.addDepartamento(dep3);

        System.out.println("Empresa: " + e.getNome());
        System.out.println("Departamentos:");

        HashSet<Departamento> departamentos = e.getDepartamentos();
        for(Departamento d : departamentos) {
            System.out.println(d.getNome());
            System.out.println(d.calculaMediaSalarial());
        }

        System.out.println(e.calculaMediaSalarial());
    }
}
