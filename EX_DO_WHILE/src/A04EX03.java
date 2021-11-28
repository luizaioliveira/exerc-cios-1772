package EX_DOWHILE;

// WHILE, DO WHILE

// EXERCÍCIO: Leia um número inteiro n. 
// Escreva a soma de todos os números de 1 até n.

import java.util.Scanner;

public class A04EX03 {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();
        int soma = 0;  
        int i = 0;  
         
        while(i<=n){ 
            soma+=i; 
            i++; 
             
        } 
        System.out.print(soma); 
        scan.close();
    } 
        
}
