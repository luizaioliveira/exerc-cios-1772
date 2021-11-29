import java.util.Scanner;

public class A06EX01 {
    static int plus(int x, int y){
        int result = x + y; 
        return(result);
    }
    static int minus(int x, int y){
        int result = x - y; 
        return(result);
    }
    static int dividedBy(int x, int y){
        int result = x / y;
        return(result);
    }
    static int times(int x, int y){
        int result = x * y;
        return(result);
    }
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String operation = "a";

        while(operation != "e"){
            System.out.print("Choose the operation (+, -, /, * or \"e\" to exit): ");
            operation = scan.next();           
            if(operation.equals("e")){
                break;
            }
            System.out.print("Type the first number: ");
            int num1 = scan.nextInt();

            System.out.print("Type the second number: ");
            int num2 = scan.nextInt();

            if(operation.equals("+")){
                System.out.println(num1 + " + " + num2 + " = " + plus(num1, num2));
            } if(operation.equals("-")){
                System.out.println(num1 + " - " + num2 + " = " + minus(num1, num2));                
            } if(operation.equals("/")){
                System.out.println(num1 + " / " + num2 + " = " + dividedBy(num1, num2));                
            } if(operation.equals("*")){
                System.out.println(num1 + " * " + num2 + " = " + times(num1, num2));
            }
        }
        scan.close();
    }
}
