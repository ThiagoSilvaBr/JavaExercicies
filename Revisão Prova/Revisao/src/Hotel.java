import java.util.ArrayList;
public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos = new ArrayList<>();

    public Hotel(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarQuarto(int numeroQuarto, String tipoQuarto, double precoPorNoiteQuarto){
        this.quartos.add(new Quarto(numeroQuarto, tipoQuarto, precoPorNoiteQuarto));
    }

    public void hospedar(Hospede hospede, int numeroQuarto){
        for(Quarto quarto : quartos){
            if (quarto.getNumero() == numeroQuarto){
                if (quarto.isOcupado() == true){
                    System.out.println("Não foi possivel hospedar quarto, pois já está ocupado.");
                }else{
                    quarto.ocupar(hospede);
                }
            }
        }
    }

    public void realizarCheckout(int numeroQuarto){
        for(Quarto quarto : quartos){
            if (quarto.getNumero() == numeroQuarto){
                if (quarto.isOcupado() == true){
                    quarto.liberar();
                    System.out.println("O quarto foi liberado.");
                }else{
                    System.out.println("O quarto já esta vazio.");
                }
            }
        }
    }

    public void exibirRelatorioOcupacao(){
        for(Quarto quarto : quartos){
            if(quarto.isOcupado() == true){
                System.out.printf("Numero do quarto:%d/Tipo do quarto:%s/Preço por Noite:%.2f\n", quarto.getNumero(),
                        quarto.getTipo(), quarto.getprecoPorNoite());

                System.out.printf("Hospede ocupante:%s/Cpf hospede:%s\n", quarto.getHospedeAtual().getNome(),
                        quarto.getHospedeAtual().getCpf());
                System.out.println("-----------------------------------");
            }else{
                System.out.println("Quarto não ocupado.");
                System.out.printf("Numero do quarto:%d/Tipo do quarto:%s/Preço por Noite:%.2f\n", quarto.getNumero(),
                        quarto.getTipo(), quarto.getprecoPorNoite());
                System.out.println("-----------------------------------");
            }
        }
    }
}
