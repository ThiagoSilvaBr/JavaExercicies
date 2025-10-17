public class Main{
    public static void main(String[] args) {
        Eletronico eletronico1 = new Eletronico(1, "AspiradorDePó", 129.90, 220, 12);
        Movel movel1 = new Movel(1, "Estante", 79.90, "Madeira", "Marrom");

        System.out.println(eletronico1);
        System.out.println(movel1);
    }
}