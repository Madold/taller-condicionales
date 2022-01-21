/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

/**
 *
 * @author mi pc
 */
public class Parisidad {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void EvaluarNumero(){
        if (numero%2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
