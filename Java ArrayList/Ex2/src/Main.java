import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Turma turma1 = new Turma();

        turma1.matricularAlunos();
        turma1.listarAlunos();

        int raBuscado = 240193492;
        Aluno alunoEncontrado = turma1.buscarAlunoPorRa(raBuscado);

        if(alunoEncontrado != null){
            System.out.printf("O aluno encontrado foi: %s\n", alunoEncontrado.getNome());
        }else{
            System.out.printf("O aluno com o ra %d não foi encontrado\n", raBuscado);
        }

    }
}