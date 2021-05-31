package Clase3.PracticaTT;

import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void pruebaQuickSort() {
        Timer timer = new Timer();
        QuickSortSorterImple aux = (QuickSortSorterImple) MiFactory.getInstance("QuickSortSorterImple");
        Integer[] arr = generarMegaArray();
        timer.start();
        aux.sort(arr, Comparator.naturalOrder());
        timer.stop();
        System.out.println("QuickSort demora " + timer.elapsedTime() + " milisegundos.");
    }

    public static void pruebaHeapSort() {
        Timer timer = new Timer();
        HeapSortSorterImple aux = (HeapSortSorterImple) MiFactory.getInstance("HeapSortSorterImple");
        Integer[] arr = generarMegaArray();
        timer.start();
        aux.sort(arr, Comparator.naturalOrder());
        timer.stop();
        System.out.println("HeapSort demora " + timer.elapsedTime() + " milisegundos.");
    }

    public static void pruebaBubbleSort() {
        Timer timer = new Timer();
        BubbleSortSorterImple aux = (BubbleSortSorterImple) MiFactory.getInstance("BubbleSortSorterImple");
        Integer[] arr = generarMegaArray();
        timer.start();
        aux.sort(arr, Comparator.naturalOrder());
        timer.stop();
        System.out.println("BubbleSort demora " + timer.elapsedTime() + " milisegundos.");
    }

    private static Integer[] generarMegaArray() {
        Integer[] arr = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 100000);
        }
        return arr;
    }

    public static void main(String[] args) {
        // Demoró 73
        //pruebaQuickSort();
        // Demoró 161
        //pruebaHeapSort();
        // Demoró 862
        pruebaBubbleSort();
    }
}
