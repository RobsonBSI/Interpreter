public class Iten {
    private double valor;
    private static double somaPedido=0;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static double getSomaPedido() {
        return somaPedido;
    }

    public static void setSomaPedido(double somaPedido) {
        Iten.somaPedido = somaPedido;
    }

    public double calcularNota() {
        this.somaPedido= Comanda.calcularNota(this.somaPedido, this.valor);
        return getSomaPedido();
    }
}
