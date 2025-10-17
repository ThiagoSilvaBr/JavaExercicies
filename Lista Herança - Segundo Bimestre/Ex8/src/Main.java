public class Main {
    public static void main(String[] args) {

        /*
            O código apresentado apresenta um erro na criação do construtor da segunda classe, que por ser uma SubClasse, precisa
            utilizar o super() para chamar os atributos passados anteriormente pela classe pai. Além de possuir uma má pratica, que
            é a falta de atributos privados.

        // CÓDIGO Correto
            class Pai {
             private String nome;
             public Pai(String nome) {
             this.nome = nome;
             }
            }
            class Filha extends Pai {
            private int idade;
             public Filha(String nome, int idade) {
             super(nome);
             this.idade = idade;
             }
            }





        */

    }
}