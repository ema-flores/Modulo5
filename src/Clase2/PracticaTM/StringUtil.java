package Clase2.PracticaTM;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c,int n)
    {
        StringBuilder cadena = new StringBuilder();
        while(n>0){
            cadena.append(c);
            n--;
        }
        return cadena.toString();
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        String cadena = replicate(c, n-s.length());
        cadena += (s);
        return cadena;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int[] arr)
    {
        String[] strArray = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            strArray[i] = String.valueOf(arr[i]);
        }
        return strArray;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String[] arr)
    {
        int[] intArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intArray[i] = Integer.parseInt(arr[i]);
        }
        return intArray;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String[] arr)
    {
        int actual, mayor = arr[0].length();
        for (int i = 1; i<arr.length; i++){
            actual = arr[i].length();
            if (actual>mayor) mayor = actual;
        }
        return mayor;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String[] arr, char c)
    {
        int m = maxLength(arr);
        for (int i=0;i<arr.length;i++)
            arr[i] = lpad(arr[i], m, c);
    }


    ////////////////////////////////////////////////////////////////////
    ////////// Agregado Clase 2 - PracticaTM - Ejercicio 6 /////////////
    ////////////////////////////////////////////////////////////////////

    public static String rpad(String s, int n, char c)
    {
        String cadena = replicate(c, n-s.length());
        return s+cadena;
    }

    public static String ltrim(String s){
        if (s.length() == 0 || s.length() == 1) return s;
        int i = 0;
        char j = ' ';
        while(j == ' ' && i < s.length()){
            j = s.charAt(i);
            i++;
        }
        return s.substring(i-1);
    }

    public static String rtrim(String s){
        if (s.length() == 0 || s.length() == 1) return s;
        int i = s.length()-1;
        char j = ' ';
        while(j == ' ' && i > 0){
            j = s.charAt(i);
            i--;
        }
        return s.substring(0,i+2);
    }

    public static String trim(String s){
        s = ltrim(s);
        s = rtrim(s);
        return s;
    }

    public static int indexOfN(String s, char c, int n){
        int i = 0, cnt=0;
        while(i<s.length()){
            if (s.charAt(i) == c)
                cnt++;
            if (cnt==n) break;
            i++;
        }
        return i;
    }
}
