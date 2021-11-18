// SWITCH CASE

// DESAFIO: Faça um programa de conversão de moedas.
// O programa deverá apresentar uma tela de entrada com as seguintes opções:
// < Conversão de moedas >
// 1 - Real para Dólar
// 2 - Dólar para Real
// 3 - Real para Euro
// 4 - Sair

import java.util.Scanner;

public class A03EX03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int opcaoConversao = 0;
        double valor = 0;
        double valorConvertido = 0;
        
        System.out.println("< Conversão de moedas > \n1 - Real para Dólar \n2 - Dólar para real \n3 - Real para Euro \n4 - Sair");
        opcaoConversao = scan.nextInt();
  
        do{
            System.out.println("Informe o valor: ");
            valor = scan.nextDouble();
            
            switch(opcaoConversao){
                case 1:                 
                valorConvertido = (valor * 0.18);
                System.out.println("R$" + valor + " equivale a U$" + valorConvertido);
                break;

                case 2: 
                valorConvertido = (valor * 5.65);
                System.out.println("U$" + valor + " equivale a R$" + valorConvertido);
                break;

                case 3: 
                valorConvertido = (valor * 0.15);
                System.out.println("R$" + valor + " equivale a €" + valorConvertido);
                break;

                case 4:
                break;

                default: System.out.println("Opção inválida");
                break;
            }
            
            System.out.println("< Conversão de moedas > \n1 - Real para Dólar \n2 - Dólar para real \n3 - Real para Euro \n4 - Sair");
            opcaoConversao = scan.nextInt();
        } while(opcaoConversao != 4);

        scan.close();
    }
}