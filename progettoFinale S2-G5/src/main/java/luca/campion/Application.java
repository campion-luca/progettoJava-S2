package luca.campion;

import luca.campion.entities.Collezione;
import luca.campion.entities.GiocoDaTavolo;
import luca.campion.entities.Videogioco;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("GAME STEPICODE");

        Collezione collezione = new Collezione();

        // vetrina giochi dello shop
        Videogioco v1 = new Videogioco(1997, 1245, 63.45, "Zelda Ocarina of Time", 60, GenereVideogiochi.AVVENTURA, "switch");
        Videogioco v2 = new Videogioco(2023, 2222, 70.00, "Call of Duty mf", 30, GenereVideogiochi.FPS, "ps5");
        GiocoDaTavolo t1 = new GiocoDaTavolo(2000, 7670, 40.00, "Exploding kitty", 30, 2);
        GiocoDaTavolo t2 = new GiocoDaTavolo(1900, 2222, 34.00, "monopoly", 2, 4);
        Videogioco v3 = new Videogioco(2020, 2727, 20.00, "Smash Bros Brawl", 2, GenereVideogiochi.ARCADE, "switch");


                System.out.println("Sscegli l'esercizio da valutare: ");
                System.out.println("1) Aggiunta di gioco alla lista");
                System.out.println("2) Ricerca tramite Id");
                System.out.println("3) Ricerca tramite prezzo, inferiore all'input");
                System.out.println("4) Ricerca per numero di giocatori");
                System.out.println("5) Eliminazione tramite ID");
                System.out.println("6) Aggiornamento elemento ID");
                System.out.println("7) Stampa statistiche");
                System.out.println("0) Esci");


                // l'app parte già con dei giochi inseriti
        collezione.aggiuntaGioco(v2);
        collezione.aggiuntaGioco(t1);
        collezione.aggiuntaGioco(v3);
//        collezione.aggiuntaGioco(t2); // id uguale al v2 già inserito, scommentare per verificare

            int x = scanner.nextInt();

            switch (x) {
                case 1:
                    // troppo tardi per implementare anche l'aggiunta dinamica
                    System.out.println(" ");
                    System.out.println(" 1) Aggiunta di gioco alla lista");
                    collezione.aggiuntaGioco(v1);
                    System.out.println(collezione);
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println(" 2) Ricerca tramite Id");
                    System.out.println("Digitare di seguito l'ID desiderato da cercare ( 4 cifre max )");
                    int id = scanner.nextInt();
                    collezione.ricercaId(id);
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println(" 3) Ricerca tramite prezzo, inferiore all'input");
                    System.out.println("Che prezzo vogliamo controllare?");
                    double price = scanner.nextDouble();
                    collezione.ricercaPrezzo(price);
                    break;

                case 4:
                    System.out.println(" ");
                    System.out.println(" 4) Ricerca per numero di giocatori");
                    System.out.println("Quanti giocatori ti interesserebbe avere? ( da 2 a 10 )");
                    int players = scanner.nextInt();
                    collezione.ricercaNumGiocatori(players);
                    break;

                case 5:
                    System.out.println(" ");
                    System.out.println(" 5) Eliminazione tramite ID");
                    System.out.println("Digitare di seguito l'ID da eliminare");
                    int delet = scanner.nextInt();
                    collezione.rimuoviId(delet);
                    System.out.println(collezione); // test per verifica
                    break;

                case 6:
                    System.out.println("Non eseguito per mancanza di tempo e comprensione..");
                    break;

                case 7:
                    System.out.println(" ");
                    System.out.println(" 7) Stampa statistiche generali");
                    collezione.stampaStats();
                    break;


                case 0:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opzione non valida, ritentare");
            }
        }
    }
