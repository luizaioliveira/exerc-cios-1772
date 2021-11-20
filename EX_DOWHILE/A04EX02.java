// WHILE, DO WHILE

// EXERCÍCIO: Escreva um programa para encontrar todos os números pares entre 1 e 100.

public class A04EX02 {
    public static void main(String[] args){

        int numPar = 0;

        while(numPar < 101){
            if(numPar % 2 == 0){
                System.out.println(numPar);                
            }
            numPar++;
        }

    }
}
