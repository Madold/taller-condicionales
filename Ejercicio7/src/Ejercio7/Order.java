package Ejercio7;

public class Order {
    //Atributos
    private int num1, num2, num3;
    
    //Constructor
    public Order(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    //Métodos
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    
    //Metodo para verificar si estan ordenados los numeros de forma creciente
    public boolean areOrdered() {
        //Si es verdad que los numeros estan ordenados de forma creciente, el metodo retorna true,
        //de lo contrario retorna false.
        if(num1 < num2 && num2 < num3) {
            return true;
        }
        return false;
    }
}
