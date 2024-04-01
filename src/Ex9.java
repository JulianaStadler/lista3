import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // 9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)
        // e 150 (inclusive).
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[80];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o "+(i + 1)+"º numero: ");
            numeros[i] = scanner.nextFloat();
        }
        Ex9_Intervalo intervalo = new Ex9_Intervalo(numeros);

        System.out.println(intervalo.intervalo()+" número(s) est(á)ão no intervalo");
        scanner.close();
    }
    
}
