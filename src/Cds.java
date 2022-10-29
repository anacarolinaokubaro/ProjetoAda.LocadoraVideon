public class Cds extends Midia{

    private String artista;

    private int qtdFaixas;

    public Cds(String codigo, Double preco, String titulo, String artista, int qtdFaixas) {
        super(codigo, preco, titulo, CDouDVD.CD);
        this.artista = artista;
        this.qtdFaixas = qtdFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQtdFaixas() {
        return qtdFaixas;
    }

    public void setQtdFaixas(int qtdFaixas) {
        this.qtdFaixas = qtdFaixas;
    }


    @Override
    public void darplay() {
        System.out.println("Primeira faixa tocando.");
    }

    @Override
    public String toString() {
        return super.toString() + "Descrição do CD |" +
                "artista: '" + artista + '\'' +
                ", qtdFaixas " + qtdFaixas +
                '|';
    }
}