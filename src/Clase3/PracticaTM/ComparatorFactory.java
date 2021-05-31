package Clase3.PracticaTM;

import java.util.Comparator;

public class ComparatorFactory {
    public static Comparator getInstance(){
        return new SortByDni();
    }
}
