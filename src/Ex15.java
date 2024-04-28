import java.util.Scanner;

public class Ex15 {
    public static void exRun(){
        // 15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.
        // Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
        // O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível 
        // (álcool – 25%, gasolina – 21% ou diesel –14%). 
        // Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes.
        Scanner scanner = new Scanner(System.in);
        int combustivel = 0;
        float valor = 0;

        Ex15_Carros carros = new Ex15_Carros(combustivel, valor);
        System.out.println("\n==========CONCESSIONÁRIA CARANGO==========");
        do{
            System.out.print("\nDigite o valor do carro ou para encerrar digite 0: ");
            carros.setValor(scanner.nextFloat());

            if (carros.getValor() != 0) {
                do{
                    System.out.print("\n==TIPOS DE COMBUSTIVEL==\n1 - Álcool\n2 - Gasolina\n3 - Diesel\n\nDigite o tipo de combustivel do carro: ");
                    combustivel = scanner.nextInt();
                    
                    if(!(combustivel > 0 && combustivel <= 3)){
                        System.out.println("Tipo invalido! Digite novamente.");
                    }else{
                        carros.setCombustivel(combustivel);
                        carros.desconto(combustivel);
                    }
                } while (!(combustivel > 0 && combustivel <= 3));
            }else{
                System.out.println("Operação encerrada pelo usuário");
            }
        }while(!(carros.getValor() == 0));
        
        scanner.close();
    }
    
}
