import java.util.ArrayList;

public class Playlist {
    private ArrayList<Musica> musicas = new ArrayList<>();

    public void addMusica(){
        musicas.add(new Musica("Breathin", "Ariana Grande"));
        musicas.add(new Musica("Azizam", "Ed Sheeran"));
        musicas.add(new Musica("Under Pressure", "Queen"));
        musicas.add(new Musica("Billie Jean", "Michael Jackson"));
        musicas.add(new Musica("Not like Us", "Kendrick Lamar"));
    }

    public void listarMusicas(){
        for(Musica musica : musicas){
            System.out.printf("Música:%s/Compositor:%s\n", musica.getNome(), musica.getCompisitor());
        }
    }
}
