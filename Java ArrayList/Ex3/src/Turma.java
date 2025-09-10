import java.util.ArrayList;
public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();




    public void matricularAlunos(){
        alunos.add(new Aluno("Thiago", 0));
        alunos.add(new Aluno("Cami", 1));
        alunos.add(new Aluno("Gui", 2));
    }
    public void listarAlunos(){
        for(Aluno aluno:alunos){
            System.out.printf("Aluno:%s\n", aluno.getNome());
        }
    }

    public Aluno getAlunoNaPosicao(int posicao){

        return alunos.get(posicao);
    }

}
