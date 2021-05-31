package Clase3.PracticaTT;

import java.util.Comparator;

public interface Sorter<T>{
    public void sort(T[] arr, Comparator<T> c);
}
