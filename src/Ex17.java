import java.util.Scanner;

public class Ex17 {
    public static void exRun(){
        // 17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
        // reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à
        // empresa vai aumentar sua folha de pagamento.
        Scanner scanner = new Scanner(System.in);
        float reajuste = 15;

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        float salario = scanner.nextFloat();

        System.out.print("Digite o valor do salário mínimo: ");
        float salariominimo = scanner.nextFloat();

        Ex17_Salario exsalario = new Ex17_Salario(nome, salario, salariominimo, reajuste);
        exsalario.reajuste();
        
        
        return;
    }
    
}
