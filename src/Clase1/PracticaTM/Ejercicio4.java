package Clase1.PracticaTM;

import java.util.Scanner;

public class Ejercicio4 {
    public static void primerosNPrimos(){
        System.out.println("Ingresa un n: ");
        Scanner sc = new Scanner(System.in);
        try{
            int n=sc.nextInt();
            int cont=0;
            int i=2;
            while( cont<n )
            {
                if( esPrimo(i) )
                {
                    cont++;
                    System.out.print(i+" ");
                }
                i++;
            }
            System.out.println("");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Debes ingresar un numero. Intenta de nuevo");
        }
    }

    private static boolean esPrimo(int n)
    {
        boolean div=false;
        for(int i=2; i<n && !div;i++)
        {
            if (n % i == 0) {
                div = true;
                break;
            }
        }
        return !div;
    }
}
