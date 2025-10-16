public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        boolean resultado1 = usuario.setEmail("login123@gmail.com");
        System.out.println("Resultado 1: " + resultado1);

        boolean resultado2 = usuario.setEmail("emailInvalido");
        System.out.println("Resultado 2: " + resultado2);
    }
}