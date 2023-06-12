package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Jogador jogador = new Jogador();
        jogador.setGol(6.0);
        jogador.setAssistencia(7.0);

        assertEquals(6.5, jogador.calcularNota());
    }

}