package Clase2.PracticaTM;

public class Contador {

    private int valor = 0;

    public Contador() {}
    public Contador(int v) {valor = v;}
    public Contador(Contador c) {this(c.valor);}

    public void incrementar() {
        valor++;
    }
    public void decrementar() {
        valor--;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
