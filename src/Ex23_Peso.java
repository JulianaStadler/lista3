
public class Ex23_Peso {
    private String nome;
    private String sexo;
    private float altura;
    private int idade;

    public Ex23_Peso(String nome, String sexo, float altura, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }
    public double contaPeso(){
        double pesoIdeal = 0;

        if (sexo.equals("m")) {
            if (altura > 1.70 && idade <= 20) {
                pesoIdeal = (72.7 * altura) - 58;
            } else if (altura > 1.70 && idade >= 21 && idade <= 39) {
                pesoIdeal = (72.7 * altura) - 53;
            } else if (altura > 1.70 && idade >= 40) {
                pesoIdeal = (72.7 * altura) - 45;
            } else if (altura <= 1.70 && idade <= 40) {
                pesoIdeal = (72.7 * altura) - 50;
            } else if (altura <= 1.70 && idade > 40) {
                pesoIdeal = (72.7 * altura) - 58;
            }
        } 
        else if (sexo.equals("f")) {
            if (altura > 1.50 && idade >= 35) {
                pesoIdeal = (62.1 * altura) - 45;
            } else if (altura > 1.50 && idade < 35) {
                pesoIdeal = (62.1 * altura) - 49;
            } else if (altura <= 1.50) {
                pesoIdeal = (62.1 * altura) - 44.7;
            }
        }
        return pesoIdeal;
    }

    public String getNome() {
        return nome;
    }

}
