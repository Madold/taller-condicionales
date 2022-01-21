package Ejercicio3;

public class Divisible {
    
    /*
        Añadimos el atributo de "num" como shorthand de "numero"
        que es el dato que posteriormente trataremos en el programa
    */   
    private int num; 

    //Constructor para darle valor a los atributos de la clase
    public Divisible(int num) {
        this.num = num;
    }
   
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isDivisibleBy3And5() {
        if (num % 3 == 0 && num % 5 == 0) { //Verifica si el numero es divisible por 3 y 5
            return true; //si la condicion es verdadera, el metodo retorna "true" y el metodo finaliza su función
        }
        return false; //si la condicion no es verdadera, el metodo retorna "false"
    }
}
