package EX_IF_ELSE.src;

// IF, ELSE IF, ELSE

// EXERCÍCIO: Construa uma calculadora utilizando a linguagem JAVA que receba 2 valores e execute as operações:
// soma, subtração, divisão, multiplicação
// No final deve ser apresentado no console o resultado
// Caso seja uma operação de divisão, deve ser apresentado também o resto da divisão(mod) 

import java.util.Scanner;

public class A02EX03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float n1 = scan.nextFloat();

        System.out.print("Digite outro número: ");
        float n2 = scan.nextFloat();

        System.out.print("Informe a operação (+, -, /, *): ");
        String operacao = scan.next();

        if(operacao.equals("+")){
            float soma = (n1 + n2);
            System.out.print(soma);
        } else if(operacao.equals ("-")){
            float sub = (n1 - n2);
            System.out.print(sub);
        } else if(operacao.equals ("/")){
            float div = (n1 / n2);
            float resto = (n1 % n2);
            System.out.print("Divisão: " + div + " Resto: " + resto);
        } else if(operacao.equals ("*")){
            float multi = (n1 * n2);
            System.out.print(multi);
        }
        scan.close();
    }
}
