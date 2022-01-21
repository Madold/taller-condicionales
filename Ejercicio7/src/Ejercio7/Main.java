/*

    EJERCICIO 7 ENUNCIADO:
    Dado 3 numero, deducir si se han introducido en orden creciente

*/



package Ejercio7;
//Importamos la clase scanner
import java.util.Scanner;



public class Main {
    //Inicializo el metodo main
    public static void main(String[] args) {
        //Instancio la clase escaner dandole el nombre de input
        Scanner input = new Scanner(System.in); //input == entrada
        
        //Pedimos los datos y los guardamos en variables
        System.out.print("Introduce el primer numero: ");
        int num1 = input.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = input.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        int num3 = input.nextInt();
        
        //Instanciamos la clase order
        Order obj = new Order(num1, num2, num3);
        
        //Llamamos el metodo areOrdered() para verificar si estan ordenados los numeros crecientemente
        System.out.println(obj.areOrdered()); 
    }
}
