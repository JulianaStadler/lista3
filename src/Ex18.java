import java.util.Scanner;

public class Ex18 {
    public static void exRun(){
        // 18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre
        // o nome e o salário líquido acrescido do abono conforme o sexo e a idade.
        Scanner scanner = new Scanner(System.in);
        String sexo;

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();

        do{
            System.out.println("Digite o sexo do funcionário (f - feminino / m - masculino): ");
            sexo = scanner.next();
            
            if(!sexo.equals("m") && !sexo.equals("f")){
                System.out.println("Sexo invalido! Digite novamente.");
            }
        } while (!sexo.equals("m") && !sexo.equals("f"));

        System.out.print("Digite o salário fixo do funcionário: ");
        float salario = scanner.nextFloat();

        Ex18_Funcionario funcionario = new Ex18_Funcionario(nome, idade, sexo, salario);
        funcionario.calcAbono();
        
        
        return;
    }
    
}
