import java.util.Scanner;

public class Ex26 {
    public static void exRun(){
        // 26. Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.
        // Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de
        // seguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.
        // A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome,
        // idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso a
        // idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra
        // em nenhuma das categorias ofertadas.
        Scanner scanner = new Scanner(System.in);
        int grupoRisco;

        System.out.print("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("Você não se enquadra em nenhuma das categorias ofertadas.");
            System.exit(0);
        }

        do{
            System.out.print("\n===GRUPO RISCO===\n1 - Baixo\n2 - Medio\n3 - Alto\nDigite o grupo de risco do pretendente: ");
            grupoRisco = scanner.nextInt();
            if(!(grupoRisco > 0 && grupoRisco <= 3)){
                System.out.println("Grupo de risco invalido! Digite novamente.\n");
            }
        }while(!(grupoRisco > 0 && grupoRisco <= 3));

        Ex26_Risco risco = new Ex26_Risco(nome, idade, grupoRisco);
        System.out.println(risco.getNome()+" de "+risco.getIdade()+" anos com risco "+risco.getGrupoRisco()+" esta classificada na categoria "+risco.qualificarRisco());
        scanner.close();
    }
    
}
