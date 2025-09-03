public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerAniversario(){
        idade++;
        System.out.println("Feliz aniversário.");
    }

    public void exibirIdade(){
        System.out.printf("A idade atual é: %d\n", idade);
    }
}
