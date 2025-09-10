import java.util.ArrayList;
public class Time {
    private ArrayList<Jogador> jogadores = new ArrayList<>();

    public void contratarJogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public void exibirEscalacao(){
        for(Jogador jogador : jogadores){
            System.out.printf("Jogador:%s/Posição:%s\n", jogador.getNome(), jogador.getPosicao());
        }
    }

    public void demitirJogador(Jogador jogador){
        jogadores.remove(jogador);
    }

}
