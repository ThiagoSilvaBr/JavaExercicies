import java.util.ArrayList;//biblioteca pra utilizar array(lista)
public class Time {
    private String nome;
    private String cidade;
    private ArrayList<Jogador> listaJogadores;
    private int qntJogadores = 0;
    Jogador jogador;

    Time(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
        this.listaJogadores = new ArrayList<>();//perguntar ao professor como funciona essa criação de lista
    }

    public void contratarJogador(Jogador jogador){
        listaJogadores.add(jogador);
        qntJogadores++;
        System.out.printf("O time %s da cidade %s acaba de contratar " +
                "o jogador %s da posição %s\n", nome, cidade, jogador.getNome(), jogador.getPosicao());
    }

    public void listarJogadores(){
        System.out.println("Jogadores do time "+nome+":");
        for (Jogador jogador : listaJogadores) { //perguntar ao professor como funciona esse for
            System.out.println("- " + jogador.getNome() + " (" + jogador.getPosicao() + ")");
        }
    }

}
