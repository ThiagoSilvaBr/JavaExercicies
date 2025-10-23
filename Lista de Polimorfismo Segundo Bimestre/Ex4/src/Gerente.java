public class Gerente extends Colaborador{
    public Gerente() {
    }

    @Override
    public int  calcularFerias(){
        return 30 + 7;
    }
}
