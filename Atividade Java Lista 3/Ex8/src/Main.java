public class Main{
    public static void main(String[] args) {
        Termostato temperatura1 = new Termostato(30,20);

        System.out.println("Temperatura atual é:"+ temperatura1.getTemperaturaAtual());
        System.out.println("Temperatua desejada é:"+temperatura1.getTemperaturaDesejada());

        temperatura1.setTemperaturaDesejada(25);
    }
}