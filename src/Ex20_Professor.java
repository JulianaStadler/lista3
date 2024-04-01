
public class Ex20_Professor {
    private int nivel;
    private int horas;

    public Ex20_Professor(int nivel, int horas){
        this.nivel = nivel;
        this.horas = horas;
    }

    public void calcSalario(){
        // Professor Nível 1 R$12,00 por hora/aula
        // Professor Nível 2 R$17,00 por hora/aula
        // Professor Nível 3 R$25,00 por hora/aula
        float salario = 0, phora = 0;
        switch (nivel) {
            case 1:
                phora = 12f;
                break;
            case 2:
                phora = 17f;
                break;
            case 3:
                phora = 25f;
                break;
            default:
                break;
        }
        if(horas != 0){
            salario = horas * phora;
            System.out.println("\nEste professor vai receber R$"+salario+" de salario");
        }else{
            System.out.println("\nEste professor não trabalhou, não irá receber este mês");
        }


    }

}
