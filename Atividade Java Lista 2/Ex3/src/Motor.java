public class Motor {
    private String potencia;
    private String tipoCombustivel;

    Motor(String potencia, String tipoCombustivel){
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getPotencia(){
        return potencia;
    }

    public String gettipoCombustivel(){
        return tipoCombustivel;
    }



}
