public class Gato extends Animal{
    private String corDoPelo;

    public Gato(String nome, int idade, String corDoPelo) {
        super(nome, idade);
        this.corDoPelo = corDoPelo;
    }

    @Override
    public String toString(){
        return String.format("%s - CorDoPelo:%s", super.toString(), corDoPelo);
    }
}
