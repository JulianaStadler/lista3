
public class Ex15_Carros {
    private int combustivel;
    private float valor;

    public Ex15_Carros(int combustivel, float valor){
        this.combustivel = combustivel;
        this.valor = valor;
    }

    public void desconto(int tipo){
        float desconto = 0;
        switch (tipo) {
            case 1: 
                desconto = 25;
                break;
            case 2: 
                desconto = 21;
                break;
            case 3: 
                desconto = 14;
                break;
            default:
                break;
        }
        valor = valor - ( desconto/100 * valor) ;
        System.out.println("O valor do desconto é de "+desconto+"%\nO valor a ser pago pelo cliente é de R$"+valor);
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor(){
        return valor;
    }
    public int getCombustivel() {
        return combustivel;
    }

}