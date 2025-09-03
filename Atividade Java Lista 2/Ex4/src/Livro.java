public class Livro {
    private String titulo;
    public Autor autorx;

    Livro(String titulo, Autor autor){
        this.titulo = titulo;
        this.autorx = autor;
    }

    public void exibirDetalhes(){
        System.out.printf("Titulo: %s \n", titulo);
        System.out.printf("Nome do autor: %s \n", autorx.getNome());
        System.out.printf("Nome do autor: %s \n", autorx.getNacionalidade());
    }


}