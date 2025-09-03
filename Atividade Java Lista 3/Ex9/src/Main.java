public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Cami");
        Usuario usuario2 = new Usuario("Thi");

        System.out.println("O usuario "+ usuario1.getNome()+" foi adicionado com sucesso!");
        System.out.println("O usuario "+ usuario2.getNome()+" foi adicionado com sucesso!");
        System.out.println("=========================================");
        usuario1.setSenha("Batatafrita123");
        usuario2.setSenha("123");

    }
}