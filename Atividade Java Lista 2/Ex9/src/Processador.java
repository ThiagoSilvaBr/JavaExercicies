public class Processador {
        private String modelo;
        private double capacidade;

        public Processador(String modelo, double capacidade) {
            this.modelo = modelo;
            this.capacidade = capacidade;
        }

        public String getModelo() {
            return modelo;
        }

        public double getCapacidade() {
            return capacidade;
        }
    }

