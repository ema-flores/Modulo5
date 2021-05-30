package Clase1.PracticaTM;

import java.util.Scanner;

public class Ejercicio5 {
    public static void primerosNNaturales(){
        System.out.println("Ingresa n, m y d: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            // ir contando los dados al usuario
            int nn = 1;

            // numero que puede complir la condicion
            int k = 1;
            while(nn <= n){
                if(contarOcurrencias(Integer.toString(k), (char)(d+'0'))==m) {
                    System.out.print(k+" ");
                    nn++;
                }
                k++;
            }
            System.out.println("");

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Debes ingresar solo numeros. Intenta de nuevo");
        }
    }

    private static int contarOcurrencias(String str, char someChar){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar) {
                count++;
            }
        }
        return count;
    }
}
