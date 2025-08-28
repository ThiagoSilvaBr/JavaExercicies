public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("brasileiro", "Matheus");

        Livro amigos = new Livro("Amigos primeiros, campeões depois", autor);

        amigos.exibirDetalhes();
    }
}