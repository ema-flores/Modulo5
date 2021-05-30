package Clase1.PracticaTM;

import java.util.Scanner;

public class Ejercicio1 {
    public static void primerosNPares(){
        System.out.println("Ingresa un n: ");
        Scanner sc = new Scanner(System.in);
        try{
            int input = sc.nextInt();
            for (int i=0;i<input+1;i++){
                if(i%2==0) System.out.print(i+" ");
            }
            System.out.println("");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Debes ingresar un numero. Intenta de nuevo");
        }
    }
}
