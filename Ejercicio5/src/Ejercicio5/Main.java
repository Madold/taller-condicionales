
/*

    EJERCICIO 5 ENUNCIADO:
    Dada un carácter, determinar si es vocal, consonante o digito numérico

 */
package Ejercicio5;
//Importamos la clase Scanner
import java.util.Scanner;

public class Main {

    //Inicializamos el metodo Main
    public static void main(String[] args) {
        //Instanciamos la clase escaner 
        Scanner input = new Scanner(System.in);
        
        //Pedimos los datos al usuario
        System.out.print("Introduzca el caracter le dire si es un digito o vocal o consonante: ");
        
        //capturamos el dato en una variable de tipo char
        char dato = input.nextLine().trim().charAt(0);
        
        //instanciamos la clase determinar y le pasamos el dato
        Determinar obj = new Determinar(dato);
        
        System.out.println("El dato introducido es de tipo: " + obj.verifyCharacter());

    }
}
