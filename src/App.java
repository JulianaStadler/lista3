import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir;

        do{
            System.out.println("============Menu============\n"+
                            "01. Média;\n" +
                            "02. Automovel;\n" +
                            "03. Vendedor;\n" +
                            "04. Dolar;\n" +
                            "05. Compra;\n" +
                            "06. Desconto;\n" +
                            "07. Impostos;\n" +
                            "08. Media;\n" +
                            "09. Intervalo;\n" +
                            "10. Idade;\n" +
                            "11. Total;\n" +
                            "12. Carros;\n" +
                            "13. Militar;\n" +
                            "14. Produto;\n" +
                            "15. Carros;\n" +
                            "16. Funcionario reajuste;\n" +
                            "17. Salario;\n" +
                            "18. Funcionario liquido;\n" +
                            "19. Triangulo;\n" +
                            "20. Professor;\n" +
                            "21. Nadador;\n" +
                            "22. Energia;\n" +
                            "23. Peso;\n" +
                            "24. Media ponderada;\n" +
                            "25. Media final;\n" +
                            "26. Risco.");

            System.out.print("Digite qual item do menu você quer executar: ");
            int exe = scanner.nextInt();

            switch (exe) {
                case 1:
                    Ex1.exRun();
                    break;
                case 2:
                    Ex2.exRun();
                    break;
                case 3:
                    Ex3.exRun();
                    break;
                case 4:
                    Ex4.exRun();
                    break;
                case 5:
                    Ex5.exRun();
                    break;
                case 6:
                    Ex6.exRun();
                    break;
                case 7:
                    Ex7.exRun();
                    break;
                case 8:
                    Ex8.exRun();
                    break;
                case 9:
                    Ex9.exRun();
                    break;
                case 10:
                    Ex10.exRun();
                    break;
                case 11:
                    Ex11.exRun();
                    break;
                case 12:
                    Ex12.exRun();
                    break;
                case 13:
                    Ex13.exRun();
                    break;
                case 14:
                    Ex14.exRun();
                    break;
                case 15:
                    Ex15.exRun();
                    break;
                case 16:
                    Ex16.exRun();
                    break;        
                case 17:
                    Ex17.exRun();
                    break;  
                case 18:
                    Ex18.exRun();
                    break;  
                case 19:
                    Ex19.exRun();
                    break;  
                case 20:
                    Ex20.exRun();
                    break;  
                case 21:
                    Ex21.exRun();
                    break;
                case 22:
                    Ex22.exRun();
                    break;
                case 23:
                    Ex23.exRun();
                    break;
                case 24:
                    Ex24.exRun();
                    break;
                case 25:
                    Ex25.exRun();
                    break;
                case 26:
                    Ex26.exRun();
                    break;
                default:
                    System.out.println("Número inválido!");
                    break;
            }

            do{
                System.out.print("Gostaria de repetir? (s - sim / n - não): ");
                repetir = scanner.next();
                
                if(!repetir.equals("s") && !repetir.equals("n")){
                    System.out.println("Letra invalida! Digite novamente.");
                }
            } while (!repetir.equals("s") && !repetir.equals("n"));

        } while (!repetir.equals("n"));
        
        System.out.println("Programa encerrado.");

        scanner.close();
        
    }

}