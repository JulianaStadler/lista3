
public class Ex24_Ponderada {
    private float mediaC = 0;
    private float mediaB = 0;
        
    public void calcMediaPond(float notaAtual, float pesoAtual){
        mediaC = mediaC + (notaAtual * pesoAtual);
        mediaB = mediaB + pesoAtual;
    }
    public void imprimeMediaPond(){
        System.out.println("A media é "+(mediaC / mediaB));
    }        

}
