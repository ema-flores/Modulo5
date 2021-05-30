package Clase2.PracticaTM;

public class CuentaCorriente {
    // Atributos
    private double saldo;
    private int numero;
    private String titular;

    // Constructores
    public CuentaCorriente(){}
    public CuentaCorriente(CuentaCorriente c ) {
        this(c.saldo, c.numero, c.titular);
    }
    public CuentaCorriente(double saldo, int numero, String titular) {
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
    }

    // Metodos
    public void ingreso(double s) {
        saldo += s;
    }
    public void egreso(double s) {
        if (saldo>0 && saldo>=s) saldo -= s;
    }
    public void reintegro(double s) {
        saldo += s;
    }
    public void transferencia(CuentaCorriente c, double s) {
        if (saldo>0 && saldo>=s) {
            saldo -= s;
            c.saldo += s;
        }
    }

    // Getters y Setters
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
