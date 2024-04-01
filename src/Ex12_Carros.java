
public class Ex12_Carros {
    private int ano;
    private float valor;

    public Ex12_Carros(int ano, float valor){
        this.ano = ano;
        this.valor = valor;
    }

    public void desconto(){
        float desconto = (ano <= 2000) ? 12 : 7 ;
        valor = valor - ( desconto/100 * valor) ;
        System.out.println("O valor do desconto é de "+desconto+"%\nO valor a ser pago pelo cliente é de R$"+valor);
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

}
