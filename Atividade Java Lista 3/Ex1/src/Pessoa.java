public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Deve ser maior que zero");
        } else {
            this.idade = idade;
        }
    }


}
