public class Main{
    public static void main(String[] args) {



        /*
            5. O Teste do "É-UM" (Análise de Design)
            Como arquiteto de software, você precisa decidir se a relação entre os conceitos abaixo deve ser modelada
            com Herança ("é-um-tipo-de") ou se seria melhor usar Composição ("tem-um"). Em um comentário no seu
            código, justifique sua escolha para cada par:
            • a) NotaFiscal e ItemDaNotaFiscal
            • b) Funcionario e Endereco
            • c) IngressoVIP e Ingresso
            • d) Pedido e Cliente
            • e) Carro e Pneu

            a)O melhor seria usar composição, pois uma nota fiscal necessariamente deve ter seus itens nela, criando uma dependencia.

            b)O melhor seria usar composição, tendo em vista que um funcionario possui endereço obrigatoriamente, e não possuem
            atributos similares.

            c) O melhor seria usar herança, pois um ingressovip possui todas as mesmas peculiaridades de um ingresso comum, porém
            possui um algo a mais que é sua exclusividade, sendo assim ingresso normal seria a super classe.

            d) O melhor seria composição, sendo que um pedido só existiria com a existencia de um cliente, logo um é dependente
            do outro.

            e) O melhor seria composição, pois um carro pode existir sem pneus, mas não pode andar sem ele, logo, fazendo uma
            dependencia.



        */
    }
}
