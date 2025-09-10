public class Main {
    /*O Erro Oculto (Conceitual): No metodo listarAlunos da sua classe Turma, por que o loop for deve ir
    até proximaPosicaoLivre e não até alunos.length? O que aconteceria se você usasse alunos.length
    para percorrer e tentasse imprimir alunos[i].getNome()? */

    /*Bom, eu acabei fazendo direto de maneira dinamica assim como voce havia falado que poderia ser feito, porém
    * pensando do modo de uma lista fixa, o maior problema de se usar alunos.lenght seria que por ser uma lista fixa ela ja
    * existe posições fixas, logo se voce estivesse na 1 posição e usasse lenght ela pegaria até a posição n, por já existir um
    * espaço alocado para o tamanho da lista. Utilizando esse metodo existe um erro de acessar posições ainda não preenchidas
    * o que pode retornar o valor null, resultando em NullPointerException.*/
}