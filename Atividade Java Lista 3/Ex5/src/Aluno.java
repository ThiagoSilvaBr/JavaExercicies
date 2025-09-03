public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return this.nome;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota1(double nota1){
        if(nota1>0){
            this.nota1 = nota1;
        }else{
            System.out.println("O valor deve ser positivo");
        }
    }

    public void setNota2(double nota2){
        if(nota2>0){
            this.nota2 = nota2;
        }else{
            System.out.println("O valor deve ser positivo");
        }
    }

    public double getNotaX(){
        if((this.nota1+this.nota2)/2>0 && (this.nota1+this.nota2)/2<10){
            return (this.nota1+this.nota2)/2;
        }else{
            return 0;
        }
    }
}
