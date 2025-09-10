import java.util.ArrayList;

public class CarrinhoDeCompra {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarItem(Livro livro){
        livros.add(livro);
    }

    public void listar(){
        for(Livro livro : livros){
            System.out.printf("Livro:%s/autor:%s\n", livro.getNome(), livro.getAutor());
        }
    }

    public void removerItem(Livro livro){
        livros.remove(livro);
    }

    public void calcularTotal(){
        int total = 0;
        for(Livro livro: livros){
            total++;
        }
        System.out.println("O total de itens são "+ total);
    }
}
