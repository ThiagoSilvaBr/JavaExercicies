public class Main{
    public static void main(String[] args) {
        Guerreiro guerreiro1 = new Guerreiro();
        Mago mago1 = new Mago();

        System.out.printf("%s\n",guerreiro1.atacar());
        System.out.printf("%s",mago1.atacar());
    }
}