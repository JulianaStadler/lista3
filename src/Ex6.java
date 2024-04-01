import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
        // Sabese que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo
        // usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        float produto = scanner.nextFloat();
        
        System.out.println("Digite o percentual de desconto: ");
        float desconto = scanner.nextFloat();

        Ex6_Desconto exdesconto = new Ex6_Desconto(produto, desconto);

        System.out.println("Valor depois do desconto é de: "+ exdesconto.desconto() );



        scanner.close();
    }
    
}
