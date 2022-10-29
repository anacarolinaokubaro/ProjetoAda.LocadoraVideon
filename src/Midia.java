public class Midia {

    private String codigo;

    private Double preco;

    private String titulo;

    private CDouDVD tipo;

    public Midia(String codigo, Double preco, String titulo, CDouDVD tipo) {
        this.codigo = codigo;
        this.preco = preco;
        this.titulo = titulo;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public CDouDVD getTipo() {
        return tipo;
    }

    public void setTipo(CDouDVD tipo) {
        this.tipo = tipo;
    }

    public static void assistirDVD (Dvds dvd){
        boolean legenda = dvd.isLegenda();
        dvd.legenda(legenda);
        ListaIdiomas idiomaLegenda = dvd.getLegendaIdioma();
        dvd.legenda(legenda,idiomaLegenda);
    }

    public void darplay(){
        System.out.println("A mídia esta vai iniciar reprodução.");

    }

    public void legenda (boolean ligar, ListaIdiomas legendaIdioma){

    }

    public void legenda (boolean ligar){

    }

    @Override
    public String toString() {
        return "Descrição Mídia | " +
                "codigo número: " + codigo + '\'' +
                ", o preço : " + preco +
                ", o título : '" + titulo + '\'' +
                '|';
    }
}