package Punto11;

public class Selection {

    private float height, weight;

    public Selection(float height, float weight) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //Verifica si la persona es mayor a 1.80 metros y pesa menos de 100kg
    public void canApply() {
        if (height > 1.80 && weight < 100) {
            System.out.println("Felicidades, puedes aplicar");
        } else {
            System.out.println("Lo siento, no eres apto");
        }

    }

}
