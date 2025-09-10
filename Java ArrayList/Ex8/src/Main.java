public class Main{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thiago", 1);
        Aluno aluno2 = new Aluno("Cami", 2);
        Aluno aluno3 = new Aluno("Gui", 3);
        Aluno aluno4 = new Aluno("Marcelo", 4);
        Aluno aluno5 = new Aluno("Matheus", 5);

        Turma esoftc = new Turma();

        esoftc.matricularAluno(aluno1);
        esoftc.matricularAluno(aluno2);
        esoftc.matricularAluno(aluno3);
        esoftc.matricularAluno(aluno4);
        esoftc.matricularAluno(aluno5);

        esoftc.listarAlunos();

        System.out.println("-----------------------------");

        System.out.printf("Número de alunos na turma:%d\n", esoftc.getNumeroAlunos());

        Aluno alunoEncontrado = esoftc.getAlunoNaChamada(2);

        if(alunoEncontrado!=null){
            System.out.println("O aluno encontrado foi "+ alunoEncontrado.getNome());
        }else{
            System.out.println("Aluno não encontrado");
        }
    }
}