import java.util.ArrayList;
public class Turma {
    private ArrayList<String> alunos = new ArrayList<>();
    private int posicao;
    private String aluno;




    public void matricularAlunos(){
        alunos.add("Pedro");
        alunos.add("João");
        alunos.add("Lucas");
    }
    public void listarAlunos(){
        for(String x:alunos){
            System.out.printf("Aluno:%s\n", x);
        }
    }

    public void getAlunoNaPosicao(int posicao){
        System.out.printf("O aluno da posição escolhida é:%s\n",alunos.get(posicao));
    }

    public void removerAluno(String aluno){
        alunos.remove(aluno);
    }
}
