package Clase2.PracticaTT.Ejercicio2;

public class Triangulo extends FiguraGeometrica{

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return super.toString() + " , mi base es: " + base + " y mi altura: " + altura;
    }
}
