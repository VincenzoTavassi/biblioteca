package biblio;

public class Libro {

    private String autore;
    private String titolo;
    private Piano piano;
    private Scaffale scaffale;
    private Ripiano ripiano;

    public Libro(String autore, String titolo) {
        this.autore = autore;
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Piano getPiano() {
        return piano;
    }

    public void setPiano(Piano piano) {
        this.piano = piano;
    }

    public Scaffale getScaffale() {
        return scaffale;
    }

    public void setScaffale(Scaffale scaffale) {
        this.scaffale = scaffale;
    }

    public Ripiano getRipiano() {
        return ripiano;
    }

    public void setRipiano(Ripiano ripiano) {
        this.ripiano = ripiano;
    }

    @Override
    public String toString() {
        return "Libro{" + autore + ',' + " " + titolo + "\n"
                + " piano: " + this.getPiano().getNumero()
                + " scaffale: " + this.getScaffale().getCodice()
                + " ripiano: " + this.getRipiano().getNumero() +
        '}';
    }
}
