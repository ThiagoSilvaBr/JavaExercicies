public class Produto {
    private String nome;
    private double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        if(preco>0){
            this.preco = preco;
        }else{
            System.out.println("Não é possivel um preço negativo nem grátis");
        }
    }

}
