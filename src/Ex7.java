import java.util.Scanner;

public class Ex7 {
    public static void exRun(){
        // 7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
        // distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a
        // percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja
        // de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe
        // o custo ao consumidor do mesmo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de fábrica de um carro: ");
        float preco_fabrica = scanner.nextFloat();

        Ex7_Impostos impostos = new Ex7_Impostos(preco_fabrica);

        System.out.println("O valor que o consumidor deverá pagar: "+ impostos.valorFinal());

        
        return;
    }
    
}
