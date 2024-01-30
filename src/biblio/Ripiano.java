package biblio;

import java.util.ArrayList;
import java.util.List;

public class Ripiano {

    private int numero;
    private List<Libro> libri = new ArrayList<>();
    private String scaffale;

    public Ripiano(String scaffale, int numero) {
        this.scaffale = scaffale;
        this.numero = numero;
    }

    public String getScaffale() {
        return scaffale;
    }

    public void setScaffale(String scaffale) {
        this.scaffale = scaffale;
    }

    @Override
    public String toString() {
        return "Ripiano " + this.numero + "{" +
                "scaffale=" + scaffale +
                '}';
    }

    public void addLibro(Libro libro) {
        libri.add(libro);
    }

    public void deleteLibro(Libro libro) {
        if (libri.contains(libro)) libri.remove(libro);
        else System.out.println("Lo scaffale non contiene il libro");
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Libro> getLibri() {
        return libri;
    }

    public void setLibri(List<Libro> libri) {
        this.libri = libri;
    }
}
