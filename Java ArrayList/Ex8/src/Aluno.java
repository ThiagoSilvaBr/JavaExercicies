public class Aluno {
    private String nome;
    private int numeroChamada;

    public Aluno(String nome, int numeroChamada) {
        this.nome = nome;
        this.numeroChamada = numeroChamada;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumeroChamada(){
        return this.numeroChamada;
    }
}
