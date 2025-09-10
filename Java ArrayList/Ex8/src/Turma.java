import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.printf("Aluno:%s/NumeroChamada:%d\n", aluno.getNome(), aluno.getNumeroChamada());
        }
    }

    public int getNumeroAlunos(){
        return this.alunos.size();
    }

    public Aluno getAlunoNaChamada(int numeroChamada){
        for(Aluno aluno : alunos){
            if(aluno.getNumeroChamada() == numeroChamada){
                return aluno;
            }
        }
        return null;
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
}
