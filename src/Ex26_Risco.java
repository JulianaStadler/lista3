
public class Ex26_Risco {
    private String nome;
    private int idade;
    private int grupoRisco;

    public Ex26_Risco(String nome, int idade, int grupoRisco){
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;  
    }

    public int qualificarRisco(){
        int categoria = 0;

        if (idade >= 17 && idade <= 20) {
            if (grupoRisco == 1) {
                categoria = 1;
            } else if (grupoRisco == 2) {
                categoria = 2;
            } else if (grupoRisco == 3) {
                categoria = 3;
            }
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco == 1) {
                categoria = 2;
            } else if (grupoRisco == 2) {
                categoria = 3;
            } else if (grupoRisco == 3) {
                categoria = 4;
            }
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco == 1) {
                categoria = 3;
            } else if (grupoRisco == 2) {
                categoria = 4;
            } else if (grupoRisco == 3) {
                categoria = 5;
            }
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco == 1) {
                categoria = 4;
            } else if (grupoRisco == 2) {
                categoria = 5;
            } else if (grupoRisco == 3) {
                categoria = 6;
            }
        } else if (idade >= 65 && idade <= 70) {
            if (grupoRisco == 1) {
                categoria = 7;
            } else if (grupoRisco == 2) {
                categoria = 8;
            } else if (grupoRisco == 3) {
                categoria = 9;
            }
        }
        
        return categoria;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getGrupoRisco() {
        switch (grupoRisco) {
            case 1:
                return "baixo";
            case 2:
                return "medio";
            case 3:
                return "alto";
            default:
                return "NDA";
        }
    }

}
