import java.util.Scanner;

public class Ex4 {
    public static void exRun(){
        // 4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um
        // valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a
        // quantidade de dólares disponíveis com o usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do dólar em relação ao real atualmente: ");
        float val_dolar = scanner.nextFloat();

        System.out.println("Digite a quantidade de dólars em sua carteira: ");
        float qtd_dolar = scanner.nextFloat();

        Ex4_Dolar dolar = new Ex4_Dolar(val_dolar, qtd_dolar);

        System.out.println("Você tem R$"+dolar.valorReal()+" referente ao dinheiro em sua carteira.");

        scanner.close();
    }
}
