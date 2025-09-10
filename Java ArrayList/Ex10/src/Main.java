public class Main{
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu", "Lateral Direito");
        Jogador jogador2 = new Jogador("Ronaldinho", "Atacante");
        Jogador jogador3 = new Jogador("Ronaldo Fenomeno", "Atacante");
        Jogador jogador4 = new Jogador("Rivaldo", "Meio Campista");
        Jogador jogador5 = new Jogador("Vampeta", "Volante");
        Jogador jogador6 = new Jogador("Juninho Pernambucano", "Meio Campista");
        Jogador jogador7 = new Jogador("Roberto Carlos", "Lateral Esquerdo");

        Time selecao = new Time();

        selecao.contratarJogador(jogador1);
        selecao.contratarJogador(jogador2);
        selecao.contratarJogador(jogador3);
        selecao.contratarJogador(jogador4);
        selecao.contratarJogador(jogador5);
        selecao.contratarJogador(jogador6);
        selecao.contratarJogador(jogador7);

        selecao.exibirEscalacao();
        System.out.println("-------------------------");
        selecao.demitirJogador(jogador5);
        selecao.exibirEscalacao();
    }
}