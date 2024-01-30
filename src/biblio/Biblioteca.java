package biblio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Biblioteca {

    private List<Piano> piani = new ArrayList<>();
    private List<Libro> libri = new ArrayList<>();

    private HashMap<Libro, Ripiano> mappaLibriRipiani = new HashMap<>();
    private HashMap<Ripiano, Scaffale> mappaRipianiScaffali = new HashMap<>();
    private HashMap<Piano, Scaffale> mappaPianiScaffali = new HashMap<>();

    public Biblioteca(int numeroPiani) {
        for (int i = 0; i < numeroPiani; i++) {
            Piano piano = new Piano(i);
            piani.add(piano);
        }
    }

    public void addLibro(String titolo, String autore, int numeroPiano, String codiceScaffale, int numeroRipiano) {
        Libro libro = new Libro(autore, titolo);
        Piano piano = piani.get(numeroPiano);
        Scaffale scaffaleSpecifico = piano.getScaffale(codiceScaffale);
        Ripiano ripianoSpecifico = scaffaleSpecifico.getRipiani().get(numeroRipiano);
        libro.setPiano(piano);
        libro.setScaffale(scaffaleSpecifico);
        libro.setRipiano(ripianoSpecifico);
        ripianoSpecifico.addLibro(libro);
        libri.add(libro);
    }

    public Libro cerca(String autore, String titolo) {
        Libro libroTrovato = null;
        for (Libro libro : libri) {
            if (libro.getTitolo().equalsIgnoreCase(titolo) || libro.getAutore().equalsIgnoreCase(autore)) {
                libroTrovato = libro;
            }
        }
            return libroTrovato;
        }

        public String getLibri(int numeroPiano, String codiceScaffale ) {
        Piano piano = piani.get(numeroPiano);
        Scaffale scaffale = piano.getScaffale(codiceScaffale);
        List<Ripiano> ripiani = scaffale.getRipiani();
        String risultato = "";
        for (Ripiano ripiano : ripiani) {
            risultato += "Ripiano " + ripiano.getNumero() + "{";
            List<Libro> libri = ripiano.getLibri();
            for (Libro libro : libri) {
                risultato += "\nLibro: " + libro.getAutore() + ", " + libro.getTitolo() + "\n";
            }
            risultato += "}\n";
        }
            return risultato;

        }
}

