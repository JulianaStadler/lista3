import java.util.Scanner;

public class Ex22 {
    public static void exRun(){
        // 22. Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo
        // da conta de luz segue a tabela abaixo:
        // Tipo de Cliente Valor do KW/h
        // 1 (Residência) 0,60
        // 2 (Comércio) 0,48
        // 3 (Indústria) 1,29
        Scanner scanner = new Scanner(System.in);
        int cliente;
        
        do{
            System.out.println("===TIPO CLIENTE===\n1 - Residencia\n2 - Comercio\n3 - Industria");
            System.out.print("\nDigite o tipo de cliente: ");
            cliente = scanner.nextInt();

            if(!(cliente > 0 && cliente <= 3)){
                System.out.println("Cliente invalido! Digite novamente.\n");
            }
        }while(!(cliente > 0 && cliente <= 3));

        System.out.print("Digite o consumo de energia em KW/h: ");
        float consumo = scanner.nextFloat();

        Ex22_Energia energia = new Ex22_Energia(cliente, consumo);
        System.out.println("\nValor da conta de luz: R$ " + energia.valor());

        
        return;
    }
    
}
