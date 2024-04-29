import java.util.Scanner;

public class Ex23 {
    public static void exRun(){
        // 23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre
        // nome e o seu peso ideal de acordo com as seguintes características da pessoa
        Scanner scanner = new Scanner(System.in);
        String sexo;

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        do{
            System.out.print("Digite o sexo da pessoa (f - feminino / m - masculino): ");
            sexo = scanner.next();
            
            if(!sexo.equals("m") && !sexo.equals("f")){
                System.out.println("Sexo invalido! Digite novamente.");
            }
        } while (!sexo.equals("m") && !sexo.equals("f"));

        System.out.print("Digite a altura da pessoa: ");
        float altura = scanner.nextFloat();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        Ex23_Peso peso = new Ex23_Peso(nome, sexo, altura, idade);

        System.out.println(peso.getNome()+" seu peso ideal é: " + peso.contaPeso());


        
        return;
    }
    
}
