package Clase1.PracticaTT;

import java.util.*;

public class RadixSortEjerc {
    public static void radixSort(int[] arr)
    {
        // paso 1: convertir el arreglo de int en arreglo de strings
        String[] sArr = StringUtil.toStringArray(arr);

        // paso 2: todos deben tener la misma longitud
        StringUtil.lNormalize(sArr, '0');

        // paso 3: crear 10 listas vacias Li, donde i es el ultimo digito
        List<List<String>> l = new ArrayList<>();
        for(int i=0;i<10;i++)
            l.add(new ArrayList<>());

        // paso 6 - 7: en cada iteracion ir desde el ultimo al primer digito
        int inicio = 1, fin = 0;
        int longitud = sArr[0].length();
        while(longitud>0) {

            // paso 4: recorremos sArr, verificamos ultimo digito, removemos de sArr y agregamos a l
            for (int i = 0; i < sArr.length; i++) {
                l.get(Integer.parseInt(sArr[i].substring(sArr[i].length()-inicio, sArr[i].length()-fin))).add(sArr[i]);
                sArr[i] = "0";
            }

            // paso 5: regenerar sArr con los elementos de las listas
            int j, jj = 0;
            for (int i = 0; i < 10; i++) {
                j = 0;
                while(j<l.get(i).size()) {
                    sArr[jj] = l.get(i).get(j);
                    l.get(i).set(j, "");
                    j++;
                    jj++;
                }
                l.get(i).clear();
            }
            inicio++;
            fin++;
            longitud--;
        }
        int[] nuevo = StringUtil.toIntArray(sArr);

        System.arraycopy(nuevo, 0, arr, 0, arr.length);
    }

}
