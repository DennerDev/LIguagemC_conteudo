public class Lutador extends Atleta {
    private double estiloLutador;

    public double getEstiloLutador() {
        return estiloLutador;
    }
    public void setEstiloLutador(double estiloLutador) {
        this.estiloLutador = estiloLutador;
    }

    @Override
    public void setValorPatrocinio(double valorPatrocinio) {
        // TODO Auto-generated method stub
        super.setValorPatrocinio(valorPatrocinio + 500);
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    
}
