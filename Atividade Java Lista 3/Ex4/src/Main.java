public class Main{
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Thi","gerente", 20000.00);

        System.out.println("O funcionário "+funcionario1.getNome()+" com o cargo "+funcionario1.getCargo()+
                " tem o salário de "+funcionario1.getSalario());

        funcionario1.setSalario(50000000.00);

        System.out.println("O funcionário "+funcionario1.getNome()+" com o cargo"+funcionario1.getCargo()+
                " tem o salário de "+funcionario1.getSalario());
    }
}