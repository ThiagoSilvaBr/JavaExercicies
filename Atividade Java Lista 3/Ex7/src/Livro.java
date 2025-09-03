public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void setEmprestar(){
        this.disponivel = false;
    }

    public void setDevolver(){
        this.disponivel = true;
    }

    public void getDisponivel(){
        if(isDisponivel()){
            System.out.println("O livro "+titulo+" esta disponivel");
        }else{
            System.out.println("O livro "+titulo+" não esta disponivel");
        }
    }

}
