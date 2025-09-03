import java.util.ArrayList;
class Computador {
    private Processador processador;
    private MemoriaRAM memoria;
    private ArrayList<Perifericos> perifericos;

    public Computador(Processador processador, MemoriaRAM memoria) {
        this.processador = processador;
        this.memoria = memoria;
        this.perifericos = new ArrayList<>();
    }

    public void adicionarPeriferico(Perifericos periferico) {
        perifericos.add(periferico);
    }

    public void removerPeriferico(Perifericos periferico) {
        perifericos.remove(periferico);
    }

    public void mostrarDetalhes() {
        System.out.println("===== DETALHES DO COMPUTADOR =====");
        System.out.println("Processador: " + processador.getModelo());
        System.out.println("Memória RAM: " + memoria.getCapacidadeGB());
        System.out.println("Periféricos conectados:");


            for (Perifericos perifericos : perifericos) {
                System.out.println("- " + perifericos.getTipo());
            }
        System.out.println("==============");
    }
}
