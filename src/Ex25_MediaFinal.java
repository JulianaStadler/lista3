
public class Ex25_MediaFinal {
    private float mediaC = 0;
    private float mediaB = 0;
    private String nome;
    private int matricula;

    public Ex25_MediaFinal(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
        
    public void calcMediaPond(float notaAtual, float pesoAtual){
        mediaC = mediaC + (notaAtual * pesoAtual);
        mediaB = mediaB + pesoAtual;
    }
    public void imprimeMediaPond(){
        float mediaFinal = (mediaC / mediaB);
        char classificacao;

        if(mediaFinal >= 8){
            classificacao = 'A';
        }else if(mediaFinal < 8 && mediaFinal >= 7){
            classificacao = 'B';
        }else if (mediaFinal < 7 && mediaFinal >= 6) {
            classificacao = 'C';     
        }else if (mediaFinal < 6 && mediaFinal >= 5) {
            classificacao = 'D';
        }else{
            classificacao = 'R';
        }

        System.out.println("O(a) aluno(a) "+nome+" com matricula Nº"+matricula+"\nFicou com a media "+mediaFinal+" e com a classificação "+classificacao);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
