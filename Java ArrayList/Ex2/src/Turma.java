import java.util.ArrayList;
public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();


    public void matricularAlunos() {
        alunos.add(new Aluno("Thiago", 240193492));
        alunos.add(new Aluno("Cami", 24001082));
        alunos.add(new Aluno("Joao", 12345672));
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.printf("Aluno:%s/Ra:%d\n", aluno.getNome(), aluno.getRa());
        }
    }

    public Aluno buscarAlunoPorRa(int ra){
        for (Aluno aluno : alunos){
            if (aluno.getRa() == ra){
                return aluno;
            }
        }
        return null;
    }
}



