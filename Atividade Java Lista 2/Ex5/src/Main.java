public class Main{
    public static void main(String[] args) {




        Time brasil = new Time("Seleção Brasileira", "BR");

        Jogador Romario = new Jogador("Romário", "Atacante");
        Jogador Bebeto = new Jogador("Bebeto", "Atacante");
        Jogador Zico = new Jogador("Zico", "Meia Campista");

        brasil.contratarJogador(Romario);
        brasil.contratarJogador(Bebeto);
        brasil.contratarJogador(Zico);

        brasil.listarJogadores();
    }
}