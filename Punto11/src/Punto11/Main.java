/*

    PUNTO 11 ENUNCIADO:
    Realizar un programa que permita realizar la preselección de los integrante del equipo de
    baloncesto, cuyo requisito es tener mas de 1.80 mts de estatura y pesar menos de 100 Kg 

 */
package Punto11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //instancio la clase scanner con el nombre de input
        Scanner input = new Scanner(System.in);

        //Pido la estatura
        System.out.print("¿Cual es tu estatura?: ");
        float height = Float.parseFloat(input.nextLine().trim());

        //Pido el peso
        System.out.print("¿Cuanto pesas?: ");
        float weight = Float.parseFloat(input.nextLine().trim());
        
        Selection obj = new Selection(height, weight);
        
        obj.canApply();
    }
}
