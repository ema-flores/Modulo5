package Clase2.PracticaTM;

public class Fraccion {

    private int num;
    private int den;

    // Constructores
    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
    }

    // Fracciones
    public void sumar(Fraccion f) {
        num = num * f.den + den * f.num;
        den = den * f.den;
    }

    public void restar(Fraccion f) {
        num = num * f.den - den * f.num;
        den = den * f.den;
    }

    public void multiplicar(Fraccion f) {
        num = num * f.num;
        den = den * f.den;
    }

    public void dividir(Fraccion f) {
        num = num * f.den;
        den = den * f.num;

    }

    // Enteros
    public void sumar(int f) {
        num += den * f;
    }
    public void restar(int f) {
        num -= den * f;
    }
    public void multiplicar(int f) {
        num *= f;
    }
    public void dividir(int f) { den *= f; }

    public void imprimir(){
        String msj = den == 1 ?
                num+"" :
                num+"/"+den;
        System.out.println(msj);
    }

    public void simplificar(){
        int i = 2;
        while (i <= num && i <= den){
            if (num%i==0 && den%i ==0){
                num = num/i;
                den = den/i;
            } else {
                i++;
            }
        }
    }

    // Getters y Setters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
}
