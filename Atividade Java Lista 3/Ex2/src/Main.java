public class Main{
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Cami", 19);
        Pessoa pessoa2 = new Pessoa("Thi", 19);

        System.out.println(" "+ pessoa1.getNome() + " "+ pessoa1.getIdade());

        System.out.println(" "+ pessoa2.getNome() + " "+ pessoa2.getIdade());

        pessoa2.setIdade(0);

        System.out.println(" "+ pessoa2.getNome() + " "+ pessoa2.getIdade());

        pessoa2.setIdade(5);

        System.out.println(" "+ pessoa2.getNome() + " "+ pessoa2.getIdade());
    }
}