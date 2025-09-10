public class Aluno {
    private String nome;
    private int posicao;

    public Aluno(String nome, int posicao){
        this.nome= nome;
        this.posicao = posicao;
    }

    public String getNome(){
        return this.nome;
    }

    public int getPosicao(){
        return this.posicao;
    }
}
