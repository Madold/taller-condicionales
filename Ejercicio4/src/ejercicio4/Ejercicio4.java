/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       char dato;
       Scanner Entrada = new Scanner(System.in);
       vocal Obj = new vocal();
       
       System.out.println("Digite una letra:");
       dato = Entrada.nextLine().charAt(0);
        
       Obj.setLetra(dato);
       Obj.EvaluarLetra();
   
    }
    
}
