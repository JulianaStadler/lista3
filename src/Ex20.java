import java.util.Scanner;

public class Ex20 {
    public static void exRun(){
        // 20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa
        // que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela
        // abaixo:
        // Professor Nível 1 R$12,00 por hora/aula
        // Professor Nível 2 R$17,00 por hora/aula
        // Professor Nível 3 R$25,00 por hora/aula

        Scanner scanner = new Scanner(System.in);
        int nivel, horas;

        System.out.println("======ESCOLA APRENDER======\n");

        do{
            System.out.println("======NIVEL PROFESSOR======");
            System.out.print("1 - Professor nível 1; \n2 - Professor nível 2; \n3 - Professor nível 3;\n\nDigite o nível do professor: ");
            nivel = scanner.nextInt();

            if(!(nivel > 0 && nivel <= 3)){
                System.out.println("Nível invalido! Digite novamente.\n");
            }
        }while(!(nivel > 0 && nivel <= 3));

        System.out.print("Digite as horas completas trabalhadas deste professor: ");
        horas = scanner.nextInt();

        Ex20_Professor professor = new Ex20_Professor(nivel, horas);
        professor.calcSalario();

        scanner.close();
    }
    
}
