package luca.campion.entities;

import java.util.*;
import java.util.stream.Collectors;


public class Collezione {
    public List<Giochi> listGiochi;



    // costruttore
    public Collezione() {
        this.listGiochi = new ArrayList<>();
    }


    // to string per la stampa
    @Override
    public String toString() {
        return "Vetrina di giochi | " +
                "listGiochi=" + listGiochi +
                '|';
    }

    // METODI ESERCIZIO --------------------------------------------------------------------------------------------------------------------
    // aggiunta di un elemento
    public void aggiuntaGioco (Giochi giochi) {
            for (Giochi g : listGiochi) {

                if(g.getIdGioco() == giochi.getIdGioco()){
                  throw new IllegalArgumentException("ID già presente !!");
                }
            }
        listGiochi.add(giochi);
        }


    // ricerca tramite ID
    public void ricercaId (int idGioco) {
        System.out.println(listGiochi.stream()
                .filter(giochi -> giochi.getIdGioco() == idGioco)
                .findFirst()); // terminale, collect non funzia
    }


    // ricerca tramite prezzo, con filtro
    public void ricercaPrezzo(double prezzo) {
        listGiochi.stream()
                .filter(giochi -> giochi.getPrezzo() < prezzo)
                .forEach(System.out::println);
    }


    // ricerca x numero giocatori
    public void ricercaNumGiocatori(int numeroGiocatori) {
        listGiochi.stream()
                .filter(giochi -> giochi instanceof GiocoDaTavolo)
                .map(giochi -> (GiocoDaTavolo) giochi)
                .filter(giocoDaTavolo -> giocoDaTavolo.getNumeroGiocatori() == numeroGiocatori)
                .forEach(System.out::println); // sostituita da intellij
        // formula originale .forEach(giochi -> System.out.println(giochi)) ;
    }


    // rimozione dato un codice ID
    public void rimuoviId(int idGioco) {
        listGiochi.removeIf(giochi -> giochi.getIdGioco() == idGioco);
        System.out.println("Elemento rimosso con successo!");
    }


    // statistiche varie

    // media prezzo
    public void stampaStats() {
        OptionalDouble mediaPrezzi = listGiochi.stream()
                .mapToDouble(Giochi::getPrezzo) // sostituito da intelli, prima era giochi -> giochi.getPrezzo()
                .average();

        if (mediaPrezzi.isPresent())  System.out.println("La media dei prezzi è: " + mediaPrezzi);
        else System.out.println("Non è stato possibile calcolare la media dei prezzi");

        // prezzo + alto
        OptionalDouble prezzoAlto = listGiochi.stream().mapToDouble(Giochi::getPrezzo).max();
        System.out.println("Il prezzo più alto trovato è: " + prezzoAlto);


        //numero di videogiochi e numero di giochi da tavolo
        int[] c = {0};
        listGiochi.stream()
                .filter(giochi-> giochi instanceof GiocoDaTavolo)
                .forEach(giochi -> c[0]++);

        System.out.println("Il numero di Giochi da tavolo è: " + c);

        
        //numero di videogiochi e numero di videogiochi
        int[] v = {0};
        listGiochi.stream()
                .filter(giochi-> giochi instanceof Videogioco)
                .forEach(giochi -> v[0]++);

        System.out.println("Il numero di videogiochi è: " + v);
    }



    } // end
