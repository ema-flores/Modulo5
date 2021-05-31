package Clase2.PracticaTT.Ejercicio2;

public class FiguraUtil {
    public static double areaPromedio(FiguraGeometrica[] arr){
        int n = arr.length, i=0, areas = 0;
        while(i<n){
            areas += arr[i].area();
            i++;
        }
        return (double)areas/n;
    }
}
