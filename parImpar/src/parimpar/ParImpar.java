/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;
import java.util.Scanner;

/**
 *
 * @author mi pc
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int dato;
        Scanner Entrada = new Scanner(System.in);
        Parisidad Obj = new Parisidad();
        
        System.out.println("En este programa podra ver si un numero es par o impar");
        
        System.out.println("Dijite un numero");
        dato = Integer.parseInt(Entrada.nextLine());
        Obj.setNumero(dato);
        Obj.EvaluarNumero();
    }
    
}
