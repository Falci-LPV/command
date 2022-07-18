public class Corrida {

    private String motorista;
    private float valorCorrida;
    private boolean corridaAtiva;

    public Corrida(String motorista, float valorCorrida) {
        this.motorista = motorista;
        this.valorCorrida = valorCorrida;
    }

    public boolean isCorridaAtiva() {
        return corridaAtiva;
    }

    public void setCorridaAtiva(boolean corridaAtiva) {
        this.corridaAtiva = corridaAtiva;
    }

    public String executarCorrida(){
        setCorridaAtiva(true);
        return "-R$"+ this.valorCorrida +" - Corrida com o Motorista "+ this.motorista + " confirmada";
    }
    public String cancelarCorrida(){
        setCorridaAtiva(false);
        return "Corrida Cancelada - Seu dinheiro foi estornado +R$"+ this.valorCorrida;
    }
}
