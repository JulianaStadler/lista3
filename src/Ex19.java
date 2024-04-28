import java.util.Scanner;

public class Ex19 {
    public static void exRun(){
        // 19. Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de
        // um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou
        // escaleno.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o lado 1: ");
        float lado1 = scanner.nextFloat();
        System.out.println("Digite o lado 2: ");
        float lado2 = scanner.nextFloat();
        System.out.println("Digite o lado 3: ");
        float lado3 = scanner.nextFloat();
    
        Ex19_Triangulo triangulo = new Ex19_Triangulo(lado1, lado2, lado3);
        triangulo.qualTriangulo();

        scanner.close();
    }
    
}
