
public class Ex3_Vendedor {
    private String nome;
    private float salario;
    private float vendas;

    public Ex3_Vendedor (String nome,float salario,float vendas){
        this.nome = nome;
        this.salario = salario;
        this.vendas = vendas;
    }

    public double fimMes(){
        return salario + (vendas * 0.15);
    }

    public String getNome() {
        return nome;
    }

}
