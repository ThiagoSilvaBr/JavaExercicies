public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Revolução dos bichos", "George Owen" );
        Livro livro2 = new Livro("O pequeno principe", "Alguem" );


        System.out.printf("Livro: %s - Autor:%s\n", livro1.getTitulo(), livro1.getAutor() );
        System.out.printf("Livro: %s - Autor:%s\n", livro2.getTitulo(), livro2.getAutor() );

        System.out.printf("Quantidade total de livros:%d", Livro.getContadorDeLivros());
    }
}