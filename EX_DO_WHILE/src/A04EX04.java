package EX_DOWHILE;

// WHILE, DO WHILE

// EXERCÍCIO: Leia um número indeterminadas vezes. 
// Porém, o código irá parar quando o número lido for negativo.


import java.util.Scanner;

public class A04EX04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num = 0;

        while(num >= 0){
            System.out.print("Digite um número: ");
            num = scan.nextInt();
        }

        scan.close();
    }
}
