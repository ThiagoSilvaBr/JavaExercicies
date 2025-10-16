public class ArrayUtil {

    public ArrayUtil(){}

    public static int encontrarMaiorNumero(int [] numeros){
     if(numeros == null || numeros.length == 0){
         return 0;
     }

     int maior = numeros[0];

     for(int i = 1;i<numeros.length;i++){
         if(numeros[i]>maior){
             maior = numeros[i];
         }
     }

     return maior;
    }
}
