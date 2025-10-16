public class Usuario {

    public String email;

    public boolean setEmail(String email){
        if(ValidacaoUtil.isEmailValido(email)){
            this.email = email;
            return true;
        }else{
            System.out.println("Email invalido");
            return false;
        }
    }


    public String getEmail() {
        return email;
    }
}
