public class Main{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thiago", 240193492);
        Aluno aluno2 = new Aluno("Cami", 240010812);
        Aluno aluno3 = new Aluno("Gui", 123456789);

        Turma turma1 = new Turma();

        turma1.matricularAluno(aluno1);
        turma1.matricularAluno(aluno2);
        turma1.matricularAluno(aluno3);

        turma1.listarAlunos();

        Aluno RaEncontrado = turma1.procurarRa(240010812);

        System.out.println("-------------------------------");
        if(RaEncontrado != null){
            System.out.printf("O ra %d pertence ao aluno %s", RaEncontrado.getRa(), RaEncontrado.getNome());
        }else{
            System.out.println("Não foi possivel encontrar o Ra");
        }
    }
}