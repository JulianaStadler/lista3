
public class Ex17_Salario {
    private String nome;
    private float salario;
    private float salariominimo;
    private float reajuste;

    public Ex17_Salario(String nome, float salario, float salariominimo, float reajuste){
        this.nome = nome;
        this.salario = salario;
        this.salariominimo = salariominimo;
        this.reajuste = reajuste;
    }
    
    public void reajuste(){
        float novosalario = salario + (reajuste/100 * salario);
        float aumento = novosalario - salario;
        
        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Salário reajustado "+reajuste+"%: " + novosalario);
        System.out.println("Aumento na folha de pagamento: " + aumento);
    }
    public float getSalariominimo() {
        return salariominimo;
    }
}