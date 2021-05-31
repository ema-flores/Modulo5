package Clase3.PracticaTM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("juan", 3);
        Persona p2 = new Persona("lucas", 2);
        Persona p3 = new Persona("maria", 1);
        Persona[] arrP = {p1,p2,p3};

        // Ordenar
        //SortUtil.ordenar(arrP);
        //for (Persona persona : arrP) System.out.println(persona);

        Celular c1 = new Celular(1,"c");
        Celular c2 = new Celular(2,"b");
        Celular c3 = new Celular(3,"a");
        Celular[] arrC = {c1,c2,c3};

        // Ordenar
        SortUtil.ordenar(arrC);
        for (Celular c: arrC) System.out.println(c);

        // Ejercicio 2 -> cambiar criterio de precedencia extensible
        // o desacoplado del main
        // Ordenar usando Factory Method
        List<Persona> personas = Arrays.asList(p1,p2,p3);
        personas.sort(ComparatorFactory.getInstance());

        for (Persona p: personas) System.out.println(p);






    }
}
