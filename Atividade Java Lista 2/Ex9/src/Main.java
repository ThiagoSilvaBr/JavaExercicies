public class Main {
    public static void main(String[] args) {
            Processador proc = new Processador("AMD Ryzen 7 5700x3d", 3.6);
            MemoriaRAM ram = new MemoriaRAM(16);

            Computador pc = new Computador(proc, ram);

            Perifericos mouse = new Perifericos("Mouse", "Logitech");
            Perifericos teclado = new Perifericos("Teclado", "Razer");
            Perifericos monitor = new Perifericos("Monitor", "Benq");

            pc.adicionarPeriferico(mouse);
            pc.adicionarPeriferico(teclado);
            pc.adicionarPeriferico(monitor);

            pc.mostrarDetalhes();
    }
}