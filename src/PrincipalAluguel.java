import java.util.Random;

public class PrincipalAluguel {
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+" _________________________________________________\n" +
                "|                  LOCADORA VIDEON                |\n" +
                "|              DOAÇÃO DE CD´S E DVD´S             |\n" +
                "|_________________________________________________|\n"+ANSI_RESET);

        Midia dvd1 = new Dvds("001", 30.0, "Titanic", ListaIdiomas.INGLES, true, ListaIdiomas.PORTUGUES);
        Midia dvd2 = new Dvds("002",55.90,"007", ListaIdiomas.INGLES, false, ListaIdiomas.PORTUGUES);
        Midia dvd3 = new Dvds("003", 70.9,"Todo mundo em Pânico", ListaIdiomas.PORTUGUES, false, ListaIdiomas.INGLES);
        Midia cd4 = new Cds("004" , 15.00, "Mamonas Assassinas", "Dinho", 5);
        Midia cd5 = new Cds("005", 100.0,"Renaissance", "Beyonce", 7);

        Midia midia1 = pegarMidiaAleatoria(dvd1, dvd2, dvd3, cd4, cd5);
        System.out.println(midia1);
        midia1.darplay();

        CDouDVD tipo = midia1.getTipo();
        if (tipo == CDouDVD.DVD){
            midia1.assistirDVD((Dvds)midia1);
        }


    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[44m"+"\u001B[30m";

    public static Midia pegarMidiaAleatoria(Midia midia1, Midia midia2, Midia midia3, Midia midia4, Midia midia5){

        Random sorteio = new Random();
        int ordemSorteio = sorteio.nextInt(5);

        switch (ordemSorteio) {
            case 0: return midia1;
            case 1: return midia2;
            case 2: return midia3;
            case 3: return midia4;
            case 4: return midia5;
            default: throw new IllegalStateException("Midia inválida!");
        }
    }
}
