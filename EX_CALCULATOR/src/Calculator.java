public class Calculator {
    //atributos
    private double num1, num2;

    //construtor
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //metodos

    public double getNum1(){
        return this.num1;
    }

    public double getNum2(){
        return this.num2;
    }

    public void setNum1(){
        this.num1 = num1;
    }

    public void setNum2(){
        this.num2 = num2;
    }

    public double plus(){
        return num1 + num2;
    }
    
    public double minus(){
        return num1 - num2;
    }

    public double times(){
        return num1 * num2;
    }

    public double dividedBy(){
        return num1 / num2;
    }

}
