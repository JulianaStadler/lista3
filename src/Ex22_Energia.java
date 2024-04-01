
public class Ex22_Energia {
    private int cliente;
    private float consumo;

    public Ex22_Energia(int cliente, float consumo){
        this.cliente = cliente;
        this.consumo = consumo;
    }

    public float valor(){
        float valorKWh = 0;
        switch (cliente) {
            case 1:
                valorKWh = 0.60f;
                break;
            case 2:
                valorKWh = 0.48f;
                break;
            case 3:
                valorKWh = 1.29f;
                break;
            default:
                break;
        }
        float valor = consumo * valorKWh;
        return valor;
    }

}
