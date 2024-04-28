import java.util.Scanner;

public class Ex2 {
    public static void exRun(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a distancia percorrida: ");
        float distancia = scanner.nextFloat();

        System.out.println("Insira o total de combustivel gasto: ");
        float combustivelgasto = scanner.nextFloat();

        Ex2_Automovel automovel = new Ex2_Automovel(distancia, combustivelgasto);

        System.out.println("O consumo medio do carro é: "+ automovel.calcularMedia());

        scanner.close();


    }
}
