
public class Ex4_Dolar {
    private float val_dolar;
    private float qtd_dolar;

    public Ex4_Dolar(float val_dolar, float qtd_dolar){
        this.val_dolar = val_dolar;
        this.qtd_dolar = qtd_dolar;
    }

    public float valorReal(){
        return qtd_dolar*val_dolar;
    }

}
