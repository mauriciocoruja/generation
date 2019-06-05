package funcionario;

public class Gerente extends Pessoa implements Funcionarios {

    @Override
    public void calcularSalario() {

        System.out.println("//printar o salario...");
    }
}
