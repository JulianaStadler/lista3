import java.util.Scanner;

public class Ex5 {
    public static void exRun(){
        // 5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
        // Faça um programa que receba um valor de uma compra e mostre o valor das prestações.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        float val_compra = scanner.nextFloat();

        Ex5_Compra compra = new Ex5_Compra(val_compra);

        System.out.println("Cada prestação terá um valor de: R$"+ compra.prestacao());

        
        return;
    }
    
}