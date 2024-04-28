import java.util.Scanner;

public class Ex16 {
    public static void exRun(){
        // 16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários
        // de acordo com os seguintes critérios:
        // a) 50% para aqueles que ganham menos do que três salários mínimos;
        // b) 20% para aqueles que ganham entre três até dez salários mínimos;
        // c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        // d) 10% para os demais funcionários.
        Scanner scanner = new Scanner(System.in);
        float salario = 0;

        Ex16_Funcionarios funcionarios = new Ex16_Funcionarios(salario);
        for(int i = 0; i < 584; i++){
            System.out.print("\n"+(i+1)+"º FUNCIONARIO - Digite o salário: ");
            funcionarios.setSalario(scanner.nextFloat());

            funcionarios.reajuste(i+1);
        }
        scanner.close();
    }
    
}
