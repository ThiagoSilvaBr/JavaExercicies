public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSenha(String senha){
        if(senha.length()>=8){
            this.senha = senha;
            System.out.println("O usuário "+ nome+" definiu sua senha com sucesso!");
        }else{
            System.out.println("Não foi possivel adicionar senha do usuário "+ nome +
                    ", pois é menor do que 8 caracteres");
        }
    }
}
