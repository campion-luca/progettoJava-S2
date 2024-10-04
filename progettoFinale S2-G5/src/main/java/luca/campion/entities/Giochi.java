package luca.campion.entities;


// classe astratta che espande le classi in comuni alle 2 sottoclassi di riferimento, videogiochi e giochi da tavolo.
public abstract class Giochi {

    public int idGioco;
    public String titolo;
    public int annoPubblicazione;
    public double prezzo;


    // costruttore
    public Giochi(int annoPubblicazione, int idGioco, double prezzo, String titolo) {
        if(prezzo < 0) throw new IllegalArgumentException("Il prezzo deve essere almeno 0 gratis o maggiore");
        this.annoPubblicazione = annoPubblicazione;
        this.idGioco = idGioco;
        this.prezzo = prezzo;
        this.titolo = titolo;
    }


    // getter & setter


    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getIdGioco() {
        return idGioco;
    }

    public void setIdGioco(int idGioco) {
        this.idGioco = idGioco;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "Giochi{" +
                "annoPubblicazione=" + annoPubblicazione +
                ", idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
