import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LancheTest {
    @Test
    void deveCalcularExpressaoComFormulaSomando2Item() {
        ItemPedido iten = new ItemPedido();
        iten.setValor(2.0);
        iten.calcularPedido();
        iten.setValor(8.0);
        assertEquals(10.0, iten.calcularPedido());
    }

    @Test
    void deveCalcularExpressaoComFormulaSomando1Item() {
        ItemPedido iten = new ItemPedido();
        iten.setValor(2.0);

        assertEquals(2.0, iten.calcularPedido());
    }

}