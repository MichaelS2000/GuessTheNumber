package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean game = true;
        int number;

        while (game) {

            int randomnumber = (int) (Math.random() * 10);
            System.out.println("Willkommen beim Spiel Zahlenraten!");
            System.out.println("_____________________________________________");
            System.out.println("Gebe deine Nummer ein!");

            while (true) {

                number = input.nextInt();

                if (number < 0 || number > 10) {
                    System.out.println("Die von dir angegebene Zahl liegt nicht im Wertebereich, gebe eine andere ein!");
                } else if (number < randomnumber) {
                    System.out.println("Die gesuchte Zahl ist größer!");
                } else if (number > randomnumber) {
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                } else {
                    System.out.println("Glückwunsch! Du hast die Zahl erraten!");
                    break;
                }

            }

            System.out.println("Möchtest du eine weitere Runde spielen? Ja oder Nein?");

            while (true) {

                String jon = input.nextLine();

                if (jon.equalsIgnoreCase("Ja")) {
                    System.out.println("Viel Spaß in der nächsten Runde!");
                    System.out.println("_____________________________________________");
                    game = true;
                    break;
                } else if (jon.equalsIgnoreCase("Nein")) {
                    System.out.println("Danke fürs spielen!");
                    game = false;
                    break;
                } else {
                    System.out.println("Ja oder Nein?");
                }
            }
        }
    }
}
