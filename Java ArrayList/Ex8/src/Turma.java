import java.util.ArrayList;
public class Turma {
    private ArrayList<String> alunos = new ArrayList<>();


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

    public int getNumeroDeAlunos(){
        return alunos.size();
    }
}
