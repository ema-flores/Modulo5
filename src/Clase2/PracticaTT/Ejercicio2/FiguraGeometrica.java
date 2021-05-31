package Clase2.PracticaTT.Ejercicio2;

public abstract class FiguraGeometrica {
    public abstract double area();

    @Override
    public String toString() {
        return String.format("Soy una Figura Geometrica, mi area es: %.1f",area());
    }

}
