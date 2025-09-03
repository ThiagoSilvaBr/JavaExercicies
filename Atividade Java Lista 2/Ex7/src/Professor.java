import java.util.ArrayList;
public class Professor {
    private String nome;
    private String graduacao;
    private ArrayList<Disciplina> disciplinas;

    Professor(String nome, String graduacao) {
        this.nome = nome;
        this.graduacao = graduacao;
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
        System.out.printf("O professor %s foi escolhido para lecionar a disciplina %s.\n", nome, disciplina.getNome());
    }

    public void listarDisciplinas(){
        System.out.println("O professor "+ nome +" leciona essas disciplinas:");
        for(Disciplina disciplina: disciplinas){
            System.out.println("-"+ disciplina.getNome());
        }
    }
}
