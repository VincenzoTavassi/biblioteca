package biblio;

import java.util.ArrayList;
import java.util.List;

public class Scaffale {

    private List<Ripiano> ripiani = new ArrayList<>();
    private String codice;

    public Scaffale() {

    }

    public Scaffale(String codice) {
        this.codice = codice;
        for (int i = 0; i < 6; i++) {
            Ripiano ripiano = new Ripiano(this.codice, i);
            ripiani.add(ripiano);
        }
    }

    public List<Ripiano> getRipiani() {
        return ripiani;
    }

    public void setRipiani(List<Ripiano> ripiani) {
        this.ripiani = ripiani;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    @Override
    public String toString() {
        return "Scaffale " + codice + "{" +
                "ripiani=" + ripiani +
                '}';
    }
}
