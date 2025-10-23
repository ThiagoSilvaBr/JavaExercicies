public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String emitirSom(){
        return String.format("O animal emite o som");
    }
}
