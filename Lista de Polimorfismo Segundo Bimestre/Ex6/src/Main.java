public class Main{
    public static void main(String[] args) {
        Violao violao1 = new Violao();
        Bateria bateria1 = new Bateria();
        Piano piano1 = new Piano();

        System.out.printf("%s\n", violao1.tocar());
        System.out.printf("%s\n", bateria1.tocar());
        System.out.printf("%s", piano1.tocar());
    }
}