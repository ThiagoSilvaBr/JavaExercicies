public class Main{
    public static void main(String[] args) {

        Carro carro1 = new Carro("Audi", "R8", 80);

        System.out.println("O seu carro da marca "+ carro1.getMarca()+" com o modelo "+carro1.getModelo()+
                " está andando na velocidade de "+carro1.getVelocidadeAtual()+"km/h");

        carro1.setAcelerar(50);
        System.out.println("===========================");
        carro1.setFrear(40);
    }
}