/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        int dato;
        Scanner Entrada = new Scanner(System.in);
        Calendario Obj = new Calendario();
        
        System.out.println("Dame un numero del 1 al 12 y te dire el mes");
        
        System.out.println("Digite el numero: ");
        dato = Integer.parseInt(Entrada.nextLine());
        Obj.setNumMes(dato);
        Obj.EvaluarNumMes();
    }
    
}
