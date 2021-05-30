package Clase1.PracticaTM;

import java.util.Scanner;

public class Ejercicio2 {
    public static void primerosNMultiplos(){
        System.out.println("Ingresa n y m: ");
        Scanner sc = new Scanner(System.in);
        try{
            int multiplos = sc.nextInt();
            int numero = sc.nextInt();
            for (int i=0; i<multiplos;i++){
                System.out.print(i*numero+" ");
            }
            System.out.println("");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Debes ingresar dos numeros. Intenta de nuevo");
        }
        //sc.close();
    }
}
