import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.
        // Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),
        // Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[3];
        float med = 0;

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a "+(i + 1)+"ª nota: ");
            notas[i] = scanner.nextFloat();
            med = med + notas[i];
        }
        med = med / notas.length;
        Ex8_Media media = new Ex8_Media(med, nome);

        System.out.println("O(a) aluno(a) "+media.getNome()+" foi "+media.media());

        scanner.close();
    }
    
}
