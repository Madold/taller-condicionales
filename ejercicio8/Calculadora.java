/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author mi pc
 */
public class Calculadora {
    private float primerNum;
    private float segundoNum;
    private char signo;

    public float getPrimerNum() {
        return primerNum;
    }

    public void setPrimerNum(float primerNum) {
        this.primerNum = primerNum;
    }

    public float getSegundoNum() {
        return segundoNum;
    }

    public void setSegundoNum(float segundoNum) {
        this.segundoNum = segundoNum;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }
    
    public float Calculadora(){
        if(signo == '+'){
            System.out.print("Tu sumas es: ");
            return primerNum + segundoNum;
        }
        else if(signo == '-'){
            System.out.print("Tu resta es: ");
            return primerNum - segundoNum;
        }
        else if (signo == '*'){
            System.out.print("Tu multiplicacion es: ");
            return primerNum * segundoNum;
        }
        else if(signo == '/'){
            System.out.print("Tu division es: ");
            return primerNum / segundoNum;
        }
        else{
            System.out.println("este signo no existe");
        }
        return 0;
    }
    
}
