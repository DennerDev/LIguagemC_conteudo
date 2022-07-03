public class Corredor extends Atleta {
    private double valocidadeMedia;

    public double getValocidadeMedia() {
        return valocidadeMedia;
    }
    public void setValocidadeMedia(double valocidadeMedia) {
        this.valocidadeMedia = valocidadeMedia;
    }

    // sobrescrita do metodo acima.
    @Override // anotação, é uma permição de controlode sobrescrição
    public double atualizarValor(double taxa) {
        // TODO Auto-generated method stub
        return super.atualizarValor(taxa * 2);
    }
    
}
