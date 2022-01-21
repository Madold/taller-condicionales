package Ejercicio5;

public class Determinar {

    //Atributos
    private char charac; //charac es la abreviación de "character" "caracter" del inglés

    //constructor
    public Determinar(char charac) {
        this.charac = charac;
    }

    //Métodos
    public char getCharacter() {
        return charac;
    }

    public void setCharacter(char charac) {
        this.charac = charac;
    }

    public String verifyCharacter() {
        if ('a' == charac) {
            return "vocal";
        } else if ('e' == charac) {
            return "vocal";
        } else if ('i' == charac) {
            return "vocal";
        } else if ('o' == charac) {
            return "vocal";
        } else if ('u' == charac) {
            return "vocal";
        } else if ('1' == charac) {
            return "digito";
        } else if ('2' == charac) {
            return "digito";
        } else if ('3' == charac) {
            return "digito";
        } else if ('4' == charac) {
            return "digito";
        } else if ('5' == charac) {
            return "digito";
        } else if ('6' == charac) {
            return "digito";
        } else if ('7' == charac) {
            return "digito";
        } else if ('8' == charac) {
            return "digito";
        } else if ('9' == charac) {
            return "digito";
        } else if ('0' == charac) {
            return "digito";
        }

        return "consonante";
    }
}
