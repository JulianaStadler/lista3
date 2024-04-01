import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas
        // efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
        // suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = scanner.next();
        System.out.println("Digite o salario do vendedor: ");
        float salario = scanner.nextFloat();
        System.out.println("Digite o total de vendas dele: ");
        float vendas = scanner.nextFloat();

        Ex3_Vendedor vendedor = new Ex3_Vendedor(nome, salario, vendas);

        System.out.println("O vendedor "+ vendedor.getNome() +"\nTerá um salário no fim do mês de "+vendedor.fimMes());

        scanner.close();
    }
    
}
