import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        // 21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes
        // categorias:
        // Infantil A = 5 - 7 anos
        // Infantil B = 8 - 10 anos
        // juvenil A = 11- 13 anos
        // juvenil B = 14 - 17 anos
        // Sênior = 18 - 25 anos
        // Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        Ex21_Nadador nadador = new Ex21_Nadador(idade);
        System.out.println("Categoria do nadador: " + nadador.categoria());

        scanner.close();
    }
    
}
