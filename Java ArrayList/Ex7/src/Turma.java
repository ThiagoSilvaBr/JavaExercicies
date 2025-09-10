import java.util.ArrayList;
public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void matricularAlunos(Aluno aluno){
       alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno:alunos){
            System.out.printf("Aluno:%s/NumeroDaChamada:%d\n", aluno.getNome(), aluno.getNumeroChamada());
        }
    }

    public Aluno alunoNumeroChamada(int numeroChamada){
        for(Aluno aluno: alunos){
            if(aluno.getNumeroChamada() == numeroChamada){
                return aluno;
            }
        }
        return null;
    }


}
