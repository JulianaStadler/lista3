import java.util.Scanner;

public class Ex25 {
    public static void exRun(){
        // 25. Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acima
        // mencionadas, desenvolva um programa para calcular a nota final e a classificação de cada
        // estudante. A classificação é dada conforme a lista abaixo:
        // Nota Final Classificação
        // [8,10] A
        // [7,8] B
        // [6,7] C
        // [5,6] D
        // [0,5] R
        // Imprima o nome do estudante, com o seu número, nota final e classificação.

        Scanner scanner = new Scanner(System.in);
        float[] nota = new float[3];
        float[] peso = {2, 3, 5};
        String nome = "";
        int matricula = 0;

        Ex25_MediaFinal mediafinal = new Ex25_MediaFinal(nome, matricula);
        System.out.print("Digite o nome do aluno: ");
        mediafinal.setNome(scanner.nextLine());

        System.out.print("Digite a matricula do aluno (EX:123): ");
        mediafinal.setMatricula(scanner.nextInt());

        for(int i = 0; i < nota.length; i++){
            System.out.print("Digite a "+(i + 1)+"ª nota: ");
            nota[i] = scanner.nextFloat();

            mediafinal.calcMediaPond(nota[i], peso[i]);
        }

        mediafinal.imprimeMediaPond();

        scanner.close();
    }
    
}
