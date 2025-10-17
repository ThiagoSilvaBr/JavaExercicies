public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public String toString(){
        return String.format("%s - Raça:%s", super.toString(), raca);
    }
}
