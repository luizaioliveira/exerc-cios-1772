import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
            String operation = "a";

        while(operation != "e"){
            System.out.print("Choose the operation (+, -, /, * or \"e\" to exit): ");
            operation = sc.next(); 
            if(operation.equals("e")){
                break;
            }

            double result;
            
            System.out.print("Type the first number: ");
                double num1 = sc.nextDouble();

            System.out.print("Type the second number: ");
                double num2 = sc.nextDouble();

            Calculator cal = new Calculator(num1, num2);


            if(operation.equals("+")){
                result = cal.plus();
                System.out.println(num1 + " + " +  num2 + " = " + result); 
            } else if(operation.equals("-")){
                result = cal.minus();
                System.out.println(num1 + " - " + num2 + " = " + result);
            } else if(operation.equals("/")){
                result = cal.dividedBy();
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else if(operation.equals("*")){
                result = cal.times();
                System.out.println(num1 + " * " + num2 + " = " + result);
            }

        }

    sc.close();
    }
}
