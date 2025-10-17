import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Nissan", "Skyline r34", 2015, 4);
        Moto moto1 = new Moto("Kawasaki", "r8", 2018, 180);

        System.out.println(carro1);
        System.out.println(moto1);

        ArrayList<Veiculo> minhaFrota = new ArrayList<>();
        minhaFrota.add(carro1);
        minhaFrota.add(moto1);

        for(Veiculo veiculo : minhaFrota){
            System.out.println(veiculo);
        }

             /*
                Sim. Pois eles são SubClasses de Veiculo, portanto possuem ao mesmo tipo de classe Pai, logo
                o Java permite que vários tipos de SubClasses de uma mesma Herança possam estar em uma lista.

             */
    }
}