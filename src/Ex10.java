import java.util.Scanner;

public class Ex10 {
    public static void exRun(){
        // 10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem
        // informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18
        // anos como maior de idade.
        Scanner scanner = new Scanner(System.in);
        int idade;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite a idade da pessoa: ");
            idade = scanner.nextInt();
            
            Ex10_Idade exidade = new Ex10_Idade(idade);
            System.out.println(exidade.maiorOuMenor());
        }

        
        return;
    }
    
}
