public class Main{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thiago", 1);
        Aluno aluno2 = new Aluno("Cami", 2);
        Aluno aluno3 = new Aluno("Gui", 3);
        Aluno aluno4 = new Aluno("Marcelo", 4);
        Aluno aluno5 = new Aluno("Matheus", 5);

        Turma turma1 = new Turma();

        turma1.matricularAlunos(aluno1);
        turma1.matricularAlunos(aluno2);
        turma1.matricularAlunos(aluno3);
        turma1.matricularAlunos(aluno4);
        turma1.matricularAlunos(aluno5);

        turma1.listarAlunos();

        System.out.println("-------------------------------");

        Aluno alunoEncontrado = turma1.alunoNumeroChamada(1);

        if(alunoEncontrado != null){
            System.out.println("Aluno encontrado: "+alunoEncontrado.getNome());
        }else{
            System.out.println("Aluno não encontrado");
        }

    }
}