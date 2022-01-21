/*

    EJERCICIO 9 ENUNCIADO:
    Leer el dia y el mes y escribir a que estación pertenece (VERANO, OTOÑO, INVIERNO O
    PROMAVERA)

 */
package Ejercicio9;
//Importamos la clase scanner


import java.util.Scanner;

public class Main {

    //Iniciamos el método main
    public static void main(String[] args) {
        //Instanciamos la clase escaner
        Scanner input = new Scanner(System.in);
        //pedimos los datos
        System.out.print("Introduce el numero del dia de hoy: ");
        int day = Integer.parseInt(input.nextLine().trim());

        System.out.print("Introduce el mes actual: ");
        String month = input.nextLine().trim().toLowerCase();
        
        //instanciamos la clase year station y le pasamos el dia y el mes
        YearStation obj = new YearStation(day, month);
        
        //mostramos el resultado por la consola
        System.out.println("La estación es: " + obj.whatStationIs());

    }
}
 

