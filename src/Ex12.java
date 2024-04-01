import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // 12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
        // desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo
        // cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000
        // - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto
        // até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral.
        Scanner scanner = new Scanner(System.in);
        String continuar = "";
        int ano = 0;
        float valor = 0;

        Ex12_Carros carros = new Ex12_Carros(ano, valor);
        do{
            System.out.println("Digite o ano do carro: ");
            carros.setAno(scanner.nextInt());

            System.out.println("Digite o valor do carro: ");
            carros.setValor(scanner.nextFloat());
            
            carros.desconto();

            System.out.println("\nGostaria de repetir a operação?\nDigite 'N' para parar e qualquer outra coisa para repetir.");
            continuar = scanner.next();
        }while(!continuar.equals("N"));


        scanner.close();
    }
    
}