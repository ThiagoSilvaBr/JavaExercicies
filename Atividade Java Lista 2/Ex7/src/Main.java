public class Main{
    public static void main(String[] args) {

        Professor joao = new Professor("João Paulo", "ESOFT");//perdao professor não lembro sua formaçao
        Professor cidao = new Professor("Aparecido Vilela", "Ciencia da computação");

        Disciplina objeto = new Disciplina("PROGRAMAÇÃO ORIENTADA A OBJETOS");
        Disciplina dados = new Disciplina("BANCO DE DADOS");

        joao.addDisciplina(objeto);
        joao.addDisciplina(dados);
        System.out.println("------------------");
        cidao.addDisciplina(dados);
        System.out.println("------------------");

        joao.listarDisciplinas();
        System.out.println("------------------");
        cidao.listarDisciplinas();
    }
}