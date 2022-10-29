public class Dvds extends Midia{

    private ListaIdiomas idioma;

    private boolean legenda;

    private ListaIdiomas legendaIdioma;

    public Dvds(String codigo, Double preco, String titulo, ListaIdiomas idioma, boolean legenda, ListaIdiomas legendaIdioma) {
        super(codigo, preco, titulo,CDouDVD.DVD);
        this.idioma = idioma;
        this.legenda = legenda;
        this.legendaIdioma = legendaIdioma;
    }

    public ListaIdiomas getIdioma() {
        return idioma;
    }

    public void setIdioma(ListaIdiomas idioma) {
        this.idioma = idioma;
    }

    public boolean isLegenda() {
        return legenda;
    }

    public void setLegenda(boolean legenda) {
        this.legenda = legenda;
    }

    public ListaIdiomas getLegendaIdioma() {
        return legendaIdioma;
    }

    public void setLegendaIdioma(ListaIdiomas legendaIdioma) {
        this.legendaIdioma = legendaIdioma;
    }

    @Override
    public void legenda (boolean ligar, ListaIdiomas legendaIdioma){
        this.legenda = true;
        this.legendaIdioma = legendaIdioma;
        System.out.println(" O filme esta com a legenda ligada no idioma: "+ legendaIdioma);
    }


    @Override
    public void legenda (boolean legenda){
        this.legenda = legenda;
        if (legenda){
            System.out.println("O Filme possui legenda.");
        } else {
            System.out.println("O Filme não tem legenda.");
        }
    }

    @Override
    public void darplay() {
        System.out.println("Filme iniciado");
    }


    @Override
    public String toString() {
        return super.toString() + "Descrição do DVD |" +
                "idioma: " + idioma +
                ", possui legenda: " + legenda +
                ", Idioma da legenda: " + legendaIdioma +
                '|';
    }
}
