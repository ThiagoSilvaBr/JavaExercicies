public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Cami", 500.00, 222);

        System.out.println("O titular "+conta1.getTitular()+ " possui "+conta1.getSaldo()+
                " reais com sua agencia do número da conta "+conta1.getnumeroConta());

        conta1.setDepositar(50.00);

        System.out.println("O titular "+conta1.getTitular()+ " possui "+conta1.getSaldo()+
                " reais");

        conta1.setSacar(20.00);

        System.out.println("O titular "+conta1.getTitular()+ " possui "+conta1.getSaldo()+
                " reais");
    }

}