import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        // 24. Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas
        // atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame
        // final. As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas mencionadas.
        // A lista abaixo fornece os pesos:
        // a. Laboratório: peso 2
        // b. Avaliação semestral: peso 3
        // c. Exame final: peso 5

        Scanner scanner = new Scanner(System.in);
        float[] nota = new float[3];
        float[] peso = {2, 3, 5};

        Ex24_Ponderada ponderada = new Ex24_Ponderada();
        for(int i = 0; i < nota.length; i++){
            System.out.println("Digite a "+(i + 1)+"ª nota: ");
            nota[i] = scanner.nextFloat();

            ponderada.calcMediaPond(nota[i], peso[i]);
        }

        ponderada.imprimeMediaPond();

        scanner.close();
    }
    
}
