public class Main {
    public static void main(String[] args) {
        String email  = "Carambolas123@gmail.com";


        if(ValidacaoUtil.isEmailValido(email)){
            System.out.println("Email Valido");
        }else{
            System.out.println("Email invalido");
        }
    }
}