public class ConfirmarCorrida implements Acao{
    private Corrida corrida;


    public ConfirmarCorrida(Corrida corrida) {
        this.corrida = corrida;
    }

    public void executar(){

        this.corrida.executarCorrida();
    }
    public void cancelar(){
        this.corrida.cancelarCorrida();
    }
}
