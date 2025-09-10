import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.printf("Aluno:%s/Ra:%d\n", aluno.getNome(), aluno.getRa());
        }
    }

    public Aluno procurarRa(int ra){
        for(Aluno aluno : alunos){
            if(aluno.getRa() == ra){
                return aluno;
            }
        }
        return null;
    }
}
