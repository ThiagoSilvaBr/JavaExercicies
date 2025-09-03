public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
        }else {
            System.out.println("Não se pode atribuir salario negativo");
        }
    }
}
