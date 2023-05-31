public class ItemPedido {
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
        ItemPedido.somaPedido = somaPedido;
    }

    public double calcularPedido() {
        this.somaPedido= Comanda.calcularComanda(this.somaPedido, this.valor);
        return getSomaPedido();
    }
}
