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

    /*Para a criação de um metodo "remover" seria preciso utilizar um metodo padrão do Arraylist
    * que é o remove(obj), caso esteja utilizando uma lista dinamica com ArrayList. Para a criação
    * do metodo seria necessário passar por parametro o ra do aluno, seria feito uma busca utilizando
    * for(Aluno aluno: alunos) até que seja encontrado o aluno com o ra informado, removendo assim
    * com o metodo remove. Caso fosse utilizado uma lista padrao, um problema razoavelmente complexo
    * seria o fato de listas padroes serem de tamanho fixo, o que pode ser alocado muitas outras posiçoes,
    * mesmo sem possuir nenhum ra dentro, para remover todos os elementos de uma determinada posição
    * seria necessario remover todos os elementos da direita a esquerda para manter uma estrutura correta
    * sendo feito de forma manual e propensa a erros.*/
}