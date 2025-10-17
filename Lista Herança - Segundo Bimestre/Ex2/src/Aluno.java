public class Aluno extends Pessoa{
    private String ra;
    private String curso;

    public Aluno(String nome, String cpf, String ra, String curso) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    @Override
    public String toString(){
        return String.format("%s - Ra:%s - Curso:%s", super.toString(), ra, curso);
    }
}
