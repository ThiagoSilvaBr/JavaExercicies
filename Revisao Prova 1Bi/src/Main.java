public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Golden", "Maringá", 199, "Suíte", 700.00);
        hotel1.adicionarQuarto(203, "Deluxe", 500.00);
        hotel1.adicionarQuarto(200, "Standard", 200.00);
        hotel1.adicionarQuarto(202, "Suíte", 700.00);
        hotel1.adicionarQuarto(201, "Standard", 200.00);

        Hospede hospede1 = new Hospede("Thiago", "123.123.123-12");
        Hospede hospede2 = new Hospede("Cami", "123.123.123-12");

        hotel1.exibirRelatorioOcupacao();
        hotel1.hospedar(hospede1, 203);
        hotel1.hospedar(hospede2, 203);


        hotel1.hospedar(hospede2, 202);
        hotel1.exibirRelatorioOcupacao();

        hotel1.realizarCheckout(203);
        hotel1.exibirRelatorioOcupacao();
    }
}