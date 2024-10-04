package luca.campion.entities;

public class GiocoDaTavolo extends Giochi {

    public int numeroGiocatori;
    public int durataMediaPartita;


    // costruttore
    public GiocoDaTavolo(int annoPubblicazione, int idGioco, double prezzo, String titolo, int durataMediaPartita, int numeroGiocatori) {

        super(annoPubblicazione, idGioco, prezzo, titolo);
        // controllo per il range di numero di giocatori così da non farlo più avanti
        if(numeroGiocatori < 2 || numeroGiocatori > 10) {
            throw new IllegalArgumentException("Il numero di giocatori deve essere compreso tra 2 e 10");
        }
        this.durataMediaPartita = durataMediaPartita;
        this.numeroGiocatori = numeroGiocatori;
    }


    // getter & setter
    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }

    public void setDurataMediaPartita(int durataMediaPartita) {
        this.durataMediaPartita = durataMediaPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void setNumeroGiocatori(int numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }

    @Override
    public String toString() {
        return "Giochi Da Tavolo posseduti {" +
                "durataMediaPartita=" + durataMediaPartita +
                ", numeroGiocatori=" + numeroGiocatori +
                ", annoPubblicazione=" + annoPubblicazione +
                ", idGioco=" + idGioco +
                ", prezzo=" + prezzo +
                ", titolo='" + titolo + '\'' +
                '}';
    }
}

