package de.dbh;

import java.util.Scanner;

/**
 * Hello world!
 */
public class SchiffsPlanung {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        zeigeWillkommensMenue();
    }

    private static void zeigeWillkommensMenue() {
        while (true) {

            System.out
                    .println("Willkommen in der Schiffsplanung. Was wollen Sie tun (S (Schiffsanlage), H (Hafenanlage),B (Besuch planen)):");
            String antwort = scan.next();

            switch (antwort) {
                case "S":
                    starteSchiffsanlage();
                    break;
                case "H":
                    starteHafenanlage();
                    break;
                case "B":
                    starteBesuchsplanung();
                    break;
                default:
                    System.out.println("Die gewählte Funktion ist nicht verfügbar.");
            }
        }
    }

    private static void starteBesuchsplanung() {
        System.out.println("Besuchsplanung wurde gestartet");
    }

    private static void starteHafenanlage() {
        System.out.println("Hafenanlage wurde gestartet");
    }

    private static void starteSchiffsanlage() {
        System.out.println("Schiffsanlage wurde gestartet");
    }
}
