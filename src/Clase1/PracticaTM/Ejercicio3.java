package Clase1.PracticaTM;

import java.util.Scanner;

public class Ejercicio3 {
    public static void esPrimo(){
        System.out.println("Ingresa n: ");
        Scanner sc = new Scanner(System.in);
        boolean esPrimo = true;
        try{
            int input = sc.nextInt();
            for (int i=2;i<input;i++){
                if(input % i == 0){
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo)
                System.out.println("Es primo");
            else
                System.out.println("No es primo");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Debes ingresar un numero. Intenta de nuevo");
        }
    }
}
