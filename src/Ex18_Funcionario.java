
public class Ex18_Funcionario {
    private String nome;
    private int idade;
    private String sexo;
    private float salario;

    public Ex18_Funcionario(String nome, int idade, String sexo, float salario){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public void calcAbono(){
        float abono = 0;
        if (sexo.equals("m")) {
            if (idade >= 30) {
                abono = 100.00f;
            } else {
                abono = 50.00f;
            }
        } else if (sexo.equals("f")) {
            if (idade >= 30) {
                abono = 200.00f;
            } else {
                abono = 80.00f;
            }
        }

        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Salário líquido: " + (salario + abono));
    }

}
