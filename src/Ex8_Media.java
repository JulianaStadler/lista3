
public class Ex8_Media {
    private float med;
    private String nome;
    private String resp;

    public Ex8_Media(float med, String nome){
        this.med = med;
        this.nome = nome;
    }

    public String media(){
        if (med >= 7) {
            resp = "aprovado";
        } else if (med <= 5) {
            resp = "reprovado";
        } else if (med >= 5.1 && med <= 6.9) {
            resp = "em recuperação";
        }
        return resp;
    }

    public String getNome(){
        return nome;
    }

}
