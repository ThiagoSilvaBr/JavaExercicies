public class Main{
    public static void main(String[] args) {
        Turma turma1 = new Turma();

        turma1.matricularAlunos();
        turma1.listarAlunos();
        Aluno alunoNaPosicao = turma1.getAlunoNaPosicao(2);

        if(alunoNaPosicao != null){
            System.out.println("Aluno na posição 2 é:"+ alunoNaPosicao.getNome());
        }

        turma1.listarAlunos();
    }
}