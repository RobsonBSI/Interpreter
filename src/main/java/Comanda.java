public class Comanda {
    public static String formula = "valor1 + valor2";

    public static double calcularComanda(double nota1, double nota2) {
        String expressao;
        expressao = formula.replace("valor1", Double.toString(nota1));
        expressao = expressao.replace("valor2", Double.toString(nota2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
