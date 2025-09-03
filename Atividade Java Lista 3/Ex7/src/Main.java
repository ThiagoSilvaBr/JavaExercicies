public class Main{
    public static void main(String[] args) {

        Livro livro1 = new Livro("Os tres porquinhos", "Alguém");
        Livro livro2 = new Livro("Sítio do pica-pau amarelo", "Monteiro Lobato");

        System.out.println("Livro "+ livro1.getTitulo() + " do autor "+ livro1.getAutor());
        System.out.println("Livro "+ livro2.getTitulo() + " do autor "+ livro2.getAutor());

        System.out.println("=======================================");
        livro1.getDisponivel();
        livro2.getDisponivel();

        livro2.setEmprestar();
        System.out.println("=======================================");
        livro2.getDisponivel();
    }
}