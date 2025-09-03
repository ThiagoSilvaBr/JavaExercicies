import java.util.ArrayList;
public class Casa {
    private String endereco;
    private ArrayList<Comodo> comodos;

    Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
    }

    public void addComodo(Comodo comodo) {
        comodos.add(comodo);
    }

    public void listarComodos() {
        System.out.printf("Comodos da casa do endereço %s:\n", endereco);
        for(Comodo comodo: comodos){
            System.out.println("-"+comodo.getNome());
        }
    }
}
