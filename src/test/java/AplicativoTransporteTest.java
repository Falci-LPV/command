import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AplicativoTransporteTest {


    AplicativoTransporte aplicativoTransporte;
    Corrida corrida;

    @BeforeEach
    void setUp() {
        aplicativoTransporte = new AplicativoTransporte();
        corrida = new Corrida ("Tonho", 10);
    }

    @Test
    void deveConfirmarCorrida() {
        Acao executarCorrida = new ConfirmarCorrida(corrida);
        aplicativoTransporte.executarCorrida(executarCorrida);

        assertEquals("-R$10.0 - Corrida com o Motorista Tonho confirmada", corrida.executarCorrida());
    }

    @Test
    void deveCancelarCorrida() {
        Acao cancelarCorrida = new CancelarCorrida(corrida);
        aplicativoTransporte.cancelarCorrida(cancelarCorrida);

        assertEquals("Corrida Cancelada - Seu dinheiro foi estornado +R$10.0", corrida.cancelarCorrida());
    }

    @Test
    void confirmarCorridaAtiva() {
        Acao executarCorrida = new CancelarCorrida(corrida);
        aplicativoTransporte.executarCorrida(executarCorrida);
        corrida.executarCorrida();

        assertTrue(corrida.isCorridaAtiva());
    }

    @Test
    void confirmarCorridaNaoAtiva() {
        Acao cancelarCorrida = new CancelarCorrida(corrida);
        aplicativoTransporte.executarCorrida(cancelarCorrida);
        corrida.cancelarCorrida();

        assertTrue(!corrida.isCorridaAtiva());
    }


}