package biblio;

import java.util.ArrayList;
import java.util.List;

public class Piano {

    private int numero;
    private List<Scaffale> scaffali = new ArrayList<>();

    public Piano(int numero) {
        this.numero = numero;
        for (int i = 0; i < 30; i++) {
            Scaffale scaffale = new Scaffale("SC" + (i+1));
            scaffali.add(scaffale);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Scaffale> getScaffali() {
        return scaffali;
    }

    public Scaffale getScaffale(String codice) {
        Scaffale scaffaleTrovato = null;
        for (Scaffale scaffale : scaffali) {
            if (scaffale.getCodice().equalsIgnoreCase(codice)) {
                scaffaleTrovato = scaffale;
            }
        }
        return scaffaleTrovato;
    }
    public void setScaffali(List<Scaffale> scaffali) {
        this.scaffali = scaffali;
    }

    @Override
    public String toString() {
        return "Piano numero= " + numero +
                ", scaffali=" + scaffali;
    }
}
