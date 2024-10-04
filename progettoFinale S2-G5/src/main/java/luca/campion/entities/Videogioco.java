package luca.campion.entities;

import luca.campion.GenereVideogiochi;

public class Videogioco extends Giochi {

    public String piattaforma;
    public int durata;
    public GenereVideogiochi genereVideogiochi;


    // costruttore
    public Videogioco(int annoPubblicazione, int idGioco, double prezzo, String titolo, int durata, GenereVideogiochi genereVideogiochi, String piattaforma) {
        super(annoPubblicazione, idGioco, prezzo, titolo);
        this.durata = durata;
        this.genereVideogiochi = genereVideogiochi;
        this.piattaforma = piattaforma;
    }


    // getter & setter
    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public GenereVideogiochi getGenereVideogiochi() {
        return genereVideogiochi;
    }

    public void setGenereVideogiochi(GenereVideogiochi genereVideogiochi) {
        this.genereVideogiochi = genereVideogiochi;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    @Override
    public String toString() {
        return "Videogiochi posseduti {" +
                "durata=" + durata +
                ", piattaforma='" + piattaforma + '\'' +
                ", genereVideogiochi=" + genereVideogiochi +
                ", annoPubblicazione=" + annoPubblicazione +
                ", idGioco=" + idGioco +
                ", prezzo=" + prezzo +
                ", titolo='" + titolo + '\'' +
                '}';
    }
}
