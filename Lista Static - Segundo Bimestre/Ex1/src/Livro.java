public class Livro {
    private String titulo;
    private String autor;
    private static int contadorDeLivros;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        contadorDeLivros++;
    }

    public static int getContadorDeLivros() {
        return contadorDeLivros;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
