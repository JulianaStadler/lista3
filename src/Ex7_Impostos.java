
public class Ex7_Impostos {
    private float preco_fabrica;

    public Ex7_Impostos(float preco_fabrica){
        this.preco_fabrica = preco_fabrica;
    }
    public float valorFinal(){
        float percem_distribuidor = 28;
        float percem_impostos = 45;
        preco_fabrica = preco_fabrica + (percem_impostos/100 * preco_fabrica);
        preco_fabrica = preco_fabrica + (percem_distribuidor/100 * preco_fabrica);
        return preco_fabrica;
    }
}
