// IF, IF ELSE, ELSE

// EXERCÍCIO: Escreva um programa que receba dois números e retorne o maior deles

import java.util.Scanner;

public class A02EX01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
            float n1 = scan.nextFloat();

        System.out.print("Digite outro número: ");
            float n2 = scan.nextFloat();
        
        if(n1 > n2){
            System.out.print(n1 + " é o maior.");
        }   else if(n1 == n2){
            System.out.print("Os números são iguais");
        }   else{
            System.out.print(n2 + " é o maior.");
        }
        scan.close();
    }
}