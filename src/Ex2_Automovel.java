public class Ex2_Automovel {
    private float distancia;
    private float combustivelgasto;

    public Ex2_Automovel (float distancia, float combustivelgasto){
        this.distancia = distancia;
        this.combustivelgasto = combustivelgasto;
    }
    public float calcularMedia(){
        return distancia / combustivelgasto;
    }
    
}
