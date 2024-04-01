
public class Ex19_Triangulo {
    private float lado1;
    private float lado2;
    private float lado3;

    public Ex19_Triangulo(float lado1, float lado2, float lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void qualTriangulo(){
        String triangulo;
        if (
            ((lado1 + lado2) > lado3) &&
            ((lado2 + lado3) > lado1) &&
            ((lado3 + lado1) > lado2)
        ){
            if ((lado1 == lado2)&&(lado2 == lado3)){
                triangulo = "equilatero";
            } else if ((lado1 != lado2)&&(lado2 != lado3)&&(lado3 != lado1)) {
                triangulo = "escaleno";
            }else {
                triangulo = "isoceles";
            }
    
            System.out.println("Este é um triângulo "+triangulo);
        } else {
            System.out.println("Estes lados não representam um triângulo");
        }
    }

}
