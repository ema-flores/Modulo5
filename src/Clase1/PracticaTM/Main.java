package Clase1.PracticaTM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int option = 1;
        while(option != 0){
            System.out.println("Que ejercicio quieres ver?\n" +
                    "1 - Primeros n numeros pares\n" +
                    "2 - Primeros n multiplos de m\n" +
                    "3 - Decidir si n es primo\n" +
                    "4 - Primeros n numeros primos\n" +
                    "5 - Primeros n numeros naturales, con al menos m digitos d\n" +
                    "0 - Salir");
            switch (e.next()){
                case "0":
                    option = 0;
                    System.out.println("Muchas gracias");
                    break;
                case "1": Ejercicio1.primerosNPares();break;
                case "2": Ejercicio2.primerosNMultiplos();break;
                case "3": Ejercicio3.esPrimo();break;
                case "4": Ejercicio4.primerosNPrimos();break;
                case "5": Ejercicio5.primerosNNaturales();break;
                default:
                    System.out.println("No conozco esa opcion. Para salir presiona 0");
                    break;
            }
        }
    }
}
