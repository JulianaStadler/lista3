import java.util.Scanner;

public class Ex11 {
    public static void exRun(){
        // 11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é
        // homem ou mulher. No final informe total de homens e de mulheres.
        Scanner scanner = new Scanner(System.in);
        String nome = "", sexo = "";
        Ex11_Total total = new Ex11_Total(nome, sexo);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite o nome da "+(i + 1)+" pessoa: ");
            total.setNome(scanner.next());

            do{
                System.out.print("Digite o sexo da pessoa (f - feminino / m - masculino): ");
                sexo = scanner.next();

                if(!sexo.equals("m") && !sexo.equals("f")){
                    System.out.println("Sexo invalido! Digite novamente.");
                }else{
                    total.setSexo(sexo);
                }

            } while (!sexo.equals("m") && !sexo.equals("f"));
            
        }
        System.out.println(total.quantidade());

        scanner.close();
    }
    
}
