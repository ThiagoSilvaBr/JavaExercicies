public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Cami", 8.5, 8.5 );

        System.out.println("O aluno "+aluno1.getNome()+" teve a primeira nota de "+aluno1.getNota1()+
                " a segunda nota de "+aluno1.getNota2());

        System.out.println("Resultando em "+ aluno1.getNotaX());

        aluno1.setNota1(5);
        aluno1.setNota2(5);

        System.out.println("O aluno "+aluno1.getNome()+" teve a primeira nota de "+aluno1.getNota1()+
                " a segunda nota de "+aluno1.getNota2());

        System.out.println("Resultando em "+ aluno1.getNotaX());
    }

}