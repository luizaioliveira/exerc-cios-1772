// SWITCH CASE

// EXERCÍCIO: Escreva um programa utilizando o comando switch que imprima um 
// mês de acordo com o número digitado pelo usuário. Se o número de mês não 
// existir, imprima “Mês invalido”.

import java.util.Scanner;

public class A03EX01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = 0;
        String mes;

        System.out.println("Digite um número inteiro: ");
        num = scan.nextInt();

        switch(num){
            case 1: mes = "Janeiro";
            break;
            
            case 2: mes = "Fevereiro";
            break;
            
            case 3: mes = "Março";
            break;
           
            case 4: mes = "Abril";
            break;
            
            case 5: mes = "Maio";
            break;
           
            case 6: mes = "Junho";
            break;
           
            case 7: mes = "Julho";
            break;
           
            case 8: mes = "Agosto";
            break;
           
            case 9: mes = "Setembro";
            break;
           
            case 10: mes = "Outubro";
            break;
           
            case 11: mes = "Novembro";
            break;
           
            case 12: mes = "Dezembro";
            break;
          
            default: mes = "Mês inválido";
        }

        System.out.println(mes);

        scan.close();
    }
}