import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve
        // no semestre. No final informar o nome do aluno e a sua média (aritmética).
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        float[] notas = new float[3];
        float media = 0;

        Ex1_Media exmedia = new Ex1_Media(nome, media);

        System.out.println("Digite o nome do aluno: ");
        exmedia.setNome(scanner.next());

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextFloat();
            
            exmedia.media(notas[i]);
        }

        System.out.println("O(a) aluno(a) " + exmedia.getNome() + " obteve a media " + exmedia.mostraMedia(notas.length));

        scanner.close();
    }

}