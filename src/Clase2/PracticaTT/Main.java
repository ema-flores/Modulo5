package Clase2.PracticaTT;

import Clase2.PracticaTT.Ejercicio1.*;
import Clase2.PracticaTT.Ejercicio2.*;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1

//        PasswordSimple ps = new PasswordSimple();
//        ps.setValue("casa1234");
//        System.out.println(ps.getValue());
//
//        PasswordIntermedia pi = new PasswordIntermedia();
//        pi.setValue("Casa1234");
//        System.out.println(pi.getValue());
//
//        PasswordFuerte pf = new PasswordFuerte();
//        pf.setValue("Casa.1234");
//        System.out.println(pf.getValue());

        // Ejercicio 2
        Circulo c = new Circulo(5);
        System.out.println(c);

        Triangulo t = new Triangulo(5, 3);
        System.out.println(t);

        Rectangulo r = new Rectangulo(5, 3);
        System.out.println(r);

        FiguraGeometrica[] arr = new FiguraGeometrica[3];
        arr[0] = c;
        arr[1] = t;
        arr[2] = r;

        System.out.printf("El area promedio es: %.2f\n",FiguraUtil.areaPromedio(arr));
    }
}
