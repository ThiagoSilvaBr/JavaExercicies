public class Musica {
    private String nome;
    private String compositor;

    public Musica(String nome, String compositor){
        this.nome = nome;
        this.compositor = compositor;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCompisitor(){
        return this.compositor;
    }
}
