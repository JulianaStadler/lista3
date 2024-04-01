
public class Ex9_Intervalo {
    private float[] numeros;
    private int resp = 0;

    public Ex9_Intervalo(float[] numeros){
        this.numeros = numeros;
    }
    public int intervalo(){
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] >= 10 && numeros[i] <= 150){
                resp++;
            }
        }
        return resp;
    }

}
