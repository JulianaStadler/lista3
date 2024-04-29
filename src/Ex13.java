import java.util.Scanner;

public class Ex13 {
    public static void exRun(){
        // 13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe
        // se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais.
        Scanner scanner = new Scanner(System.in);
        boolean qualificado = true;
        String nome = "";
        String sexo = "";
        int idade = 0;
        int saude = 0;
        
        Ex13_Militar militar = new Ex13_Militar(qualificado, nome, sexo, idade, saude);
        for(int i = 0; i < 5; i++){
            militar.setQualificadoTrue();

            System.out.println((i+1)+"º CANDIDATO: Digite o nome: ");
            militar.setNome(scanner.next());
            
            do{
                System.out.println((i+1)+"º CANDIDATO: Digite o sexo (f - feminino / m - masculino): ");
                sexo = scanner.next();
                
                if(!sexo.equals("m") && !sexo.equals("f")){
                    System.out.println("Sexo invalido! Digite novamente.");
                }else{
                    militar.setSexo(sexo);
                    militar.validacao("sexo");
                }
            } while (!sexo.equals("m") && !sexo.equals("f"));

            if(militar.getQualificado()){
                System.out.println((i+1)+"º CANDIDATO: Digite a idade: ");
                militar.setIdade(scanner.nextInt());
                militar.validacao("idade");
            }

            if(militar.getQualificado()){
                do{
                    System.out.println((i+1)+"º CANDIDATO: Digite a saúde:\n1 - O candidato esta completamente apto fisicamente\n2 - O candidato possui pouca dificuldade física\n3 - O candidato possui muita dificuldade física\n4 - O candidato não esta apto físicamente");
                    saude = scanner.nextInt();
                    
                    if(!(saude>0 && saude < 5)){
                        System.out.println("Saude invalida! Digite novamente.");
                    }else{
                        militar.setSaude(saude);
                        militar.validacao("saude");
                    }
                } while (!(saude>0 && saude < 5));
            }

            militar.resultadoMilitar();
        }

        
        return;
    }
    
}