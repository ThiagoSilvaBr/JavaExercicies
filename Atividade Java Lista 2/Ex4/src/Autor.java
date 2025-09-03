public class Autor {
    private String nome;
    private String nacionalidade;

    Autor(String nacionalidade, String nome){
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

}