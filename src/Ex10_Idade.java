
public class Ex10_Idade {
    private int idade;

    public Ex10_Idade (int idade){
        this.idade = idade;
    }

    public String maiorOuMenor(){
        String txt = (idade >= 18) ? "Essa pessoa é maior de idade" : "Essa pessoa é menor de idade";
        return txt;
    }

}
