
public class Ex11_Total {
    private String nome;
    private String sexo;
    private int qtd_mulher;
    private int qtd_homem;

    public Ex11_Total(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
        if (sexo.equals("f")){
            qtd_mulher++;
        } else {
            qtd_homem++;
        }
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }

    public String quantidade(){
        return "Quantidade de mulheres: "+qtd_mulher+"\nQuantidade de homens: "+qtd_homem;
    }
    

    

}
