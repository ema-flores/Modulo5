package Clase2.PracticaTT.Ejercicio2;

public class Circulo extends FiguraGeometrica{
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " y mi radio es: " + radio;
    }


}
