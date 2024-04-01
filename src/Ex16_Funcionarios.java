
public class Ex16_Funcionarios {
    private float salario;
    private float salariominimo = 1412f;

    public Ex16_Funcionarios(float salario){
        this.salario = salario;
    }
    public void reajuste(int nfuncionario){
        float res = salario/salariominimo;
        float reas = 0;
        if(res <= 3)             { reas = 50; } else
        if(res > 03 && res <= 10){ reas = 20; } else
        if(res > 10 && res <= 20){ reas = 15; } else
        { reas = 10; }
        salario = salario + (reas/100 * salario);
        System.out.print(nfuncionario+"º FUNCIONARIO terá um reajuste de "+reas+"%\n"+nfuncionario+"º FUNCIONARIO seu novo salario será de R$"+salario+"\n");
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
