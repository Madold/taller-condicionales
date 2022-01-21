/*
    PUNTO 3 ENUNCIADO:
    Determinar si un número es divisible por 3 y 5   
*/
package Ejercicio3;

import java.util.Scanner; //importamos la clase scanner 

public class Main {
    //Inicializamos el método Main
    public static void main(String[] args) {
        
        //La instanciamos
        Scanner input = new Scanner(System.in); 
        
        //Pedimos los datos por la consola
        System.out.print("Introduzca el numero, le dire si es divisible por 3 y por 5");
        
        //Creamos la variable num para capturar los datos que introduzca el usuario
        int num = Integer.parseInt(input.nextLine()); 
        
        //Instanciamos la clase divisible y le pasamos la variable num para manipularla en ella
        Divisible obj = new Divisible(num);
        
        //Imprimimos por pantalla el resultado que retorne el metodo
        System.out.println(obj.isDivisibleBy3And5());     
    }
}
