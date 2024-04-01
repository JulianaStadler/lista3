
public class Ex1_Media {
    private String nome;
    private float media;

    public Ex1_Media(String nome, float media){
        this.nome = nome;
        this.media = media;
    }

    public void media(float notaatual){
        media = notaatual + media;
    }
    public float mostraMedia(int tam){
        return media / tam;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
