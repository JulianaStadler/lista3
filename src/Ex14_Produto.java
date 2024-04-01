
public class Ex14_Produto {
    private float pcusto;
    private float pvenda;
    private float mediaCusto = 0;
    private float mediaVenda = 0;

    public Ex14_Produto(float pcusto, float pvenda){
        this.pcusto = pcusto;
        this.pvenda = pvenda;
    }
    
    public void rusultOperacao(){
        String txt = "";
        mediaCusto = mediaCusto + pcusto;
        mediaVenda = mediaVenda + pvenda;
        if ((pvenda - pcusto) >= 0.1){
            txt = "Esta venda obteve lucro";
        } else if((pvenda - pcusto) < 0){
            txt = "Esta venda obteve prejuízo";
        }else{
            txt = "Esta venda deu empate";
        }
        System.out.println(txt);
    }

    public void mostrarMedias(int qtd){
        System.out.println("Media de custo: "+(mediaCusto/qtd)+"\nMedia de venda: "+(mediaVenda/qtd));
    }
    
    public void setPcusto(float pcusto) {
        this.pcusto = pcusto;
    }
    public void setPvenda(float pvenda) {
        this.pvenda = pvenda;
    }

}
