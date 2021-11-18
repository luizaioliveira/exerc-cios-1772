// IF, IF ELSE, ELSE

// EXERCÍCIO: Escreva um programa que receba três números e retorne eles em ordem crescente

import java.util.Scanner;

public class A02EX02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
            float n1 = scan.nextFloat();

        System.out.print("Digite um número: ");
            float n2 = scan.nextFloat();

        System.out.print("Digite um número: ");
            float n3 = scan.nextFloat();

        if(n1 < n2 && n1 < n3 && n2 < n3){
            System.out.print(n1 + " " + n2 + " " + n3);
        } else if(n1 < n2 && n1 < n3 && n2 > n3){
            System.out.print(n1 + " " + n2 + " " + n3);
        } else if(n1 > n2 && n1 < n3 && n2 < n3){
            System.out.print(n2 + " " + n1 + " " + n3);
        } else if(n1 < n2 && n1 > n3 && n2 > n3) {
            System.out.print(n3 + " " + n1 + " " + n2);
        } else if(n1 > n2 && n1 > n3 && n2 < n3){
            System.out.print(n2 + " " + n3 + " " + n1);
        } else {
            System.out.print(n3 + " " + n2 + " " + n1);
        }
        scan.close();
    }
}
