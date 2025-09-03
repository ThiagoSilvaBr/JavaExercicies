public class Main{
    public static void main(String[] args) {

        Casa casa = new Casa("Bairro do Limoeiro");

        Comodo cozinha = new Comodo("Cozinha");
        Comodo banheiro = new Comodo("Banheiro");
        Comodo jantar = new Comodo("Sala de Jantar");
        Comodo quarto = new Comodo("Quarto");
        Comodo cinema = new Comodo("Cinema");

        casa.addComodo(cozinha);
        casa.addComodo(banheiro);
        casa.addComodo(jantar);
        casa.addComodo(quarto);
        casa.addComodo(cinema);

        casa.listarComodos();
    }
}