package Clase2.PracticaTT.Ejercicio2;

public class Rectangulo extends FiguraGeometrica{

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public String toString() {
        return super.toString() + " , mi base es: " + base + " y mi altura: " + altura;
    }
}
