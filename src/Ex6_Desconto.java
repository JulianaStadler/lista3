
public class Ex6_Desconto {
    private float produto;
    private float desconto;

    public Ex6_Desconto(float produto, float desconto){
        this.produto = produto;
        this.desconto = desconto;
    }

    public float desconto(){
        return produto - (desconto/100 * produto);
    }
}
