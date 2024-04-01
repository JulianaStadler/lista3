
public class Ex13_Militar {
    private boolean qualificado;
    private String motivo;
    private String nome;
    private String sexo;
    private int idade;
    private int saude;

    public Ex13_Militar(boolean qualificado, String nome, String sexo, int idade, int saude){
        this.qualificado = qualificado;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    // DEFINIR UM MOTIVO PARA A DESQUALIFICAÇÃO DO MENINE
    public void validacao(String operacao){
        switch (operacao) {
            case "sexo":
                if(sexo.equals("f")){
                    motivo = "A "+nome+" não foi qualificada por ser do sexo feminino";
                    qualificado = false;
                }
                break;
            case "idade":
                if(idade < 18){
                    motivo = "O "+nome+" não foi qualificado por ser menor de 18 anos";
                    qualificado = false;
                }
                break;
            case "saude":
                if(saude >= 3){
                    motivo = "O "+nome+" não foi qualificado por ter sua saúde comprometida";
                    qualificado = false;
                }
                break;
            default:
                break;
        }
    }

    public void resultadoMilitar(){
        String txt = (qualificado) ? "O "+nome+" foi qualificado" : motivo ;
        System.out.println(txt);
    }

    public void setQualificadoTrue() {
        qualificado = true;
    }
    public boolean getQualificado() {
        return qualificado;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }

}
