public class ValidacaoUtil{

    private ValidacaoUtil() {}

    public static boolean isEmailValido(String email){
        if(email  == null){
            return false;
        }

        if (!email.contains("@") || !email.contains(".")){
            return false;
        }

        return true;
    }
}