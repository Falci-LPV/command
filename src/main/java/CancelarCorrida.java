public class CancelarCorrida implements Acao{
    private Corrida corrida;

    public CancelarCorrida(Corrida corrida) {
        this.corrida = corrida;
    }

    public void executar(){
        this.corrida.cancelarCorrida();
    }
    public void cancelar(){
        this.corrida.executarCorrida();
    }

}
