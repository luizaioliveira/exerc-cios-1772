// SWITCH CASE

// EXERCÍCIO: Uma loja fornece 10% de desconto para funcionários e 5% de 
// desconto para clientes vips. Faça um programa que calcule o valor total 
// a ser pago por uma pessoa. O programa deverá ler o valor total da compra 
// efetuada e um código que identifique se o comprador é um cliente comum 
// (1), funcionário (2) ou vip (3).

import java.util.Scanner;

public class A03EX02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int valorProduto = 0;
        int desconto = 0;
        int cliente = 0;
        int valorProdutoDesconto = 0;

        System.out.println("Informe o valor: ");
        valorProduto = scan.nextInt();

        System.out.println("Informe o código do cliente (1 - comum; 2 - funcionário; 3 - vip): ");
        cliente = scan.nextInt();

        switch(cliente){
            
            case 1: valorProdutoDesconto = valorProduto;
            break;

            case 2: desconto = (valorProduto * 10) / 100;
                valorProdutoDesconto = valorProduto - desconto;
            break;

            case 3: desconto = (valorProduto * 5) / 100;
                valorProdutoDesconto = valorProduto - desconto;
            break;

        }

        System.out.print("O cliente pagará: " + valorProdutoDesconto);
        scan.close();
    }
}
