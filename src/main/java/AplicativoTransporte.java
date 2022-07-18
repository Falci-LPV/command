import java.util.ArrayList;
import java.util.List;

public class AplicativoTransporte {

    public void executarCorrida(Acao acao){
        acao.executar();
    }

    public void cancelarCorrida(Acao acao){
        acao.cancelar();
    }
}
