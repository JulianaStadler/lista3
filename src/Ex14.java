import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // 14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre
        // como resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de
        // custo e do preço de venda.
        Scanner scanner = new Scanner(System.in);
        float pcusto = 0, pvenda = 0;
        int nProdutos = 40;

        Ex14_Produto produto = new Ex14_Produto(pcusto, pvenda);
        for(int i = 0; i < nProdutos; i++){
            System.out.print((i+1)+"º PRODUTO: Digite o preço de custo: ");
            produto.setPcusto(scanner.nextFloat());

            System.out.print((i+1)+"º PRODUTO: Digite o preço de venda: ");
            produto.setPvenda(scanner.nextFloat());

            produto.rusultOperacao();
        }

        produto.mostrarMedias(nProdutos);

        scanner.close();
    }
}
