package pl.exercise.ferry.screen;

import java.util.Scanner;

public class TicketScreen implements Screen {

    public final Scanner in = new Scanner(System.in);


    @Override
    public ScreenName interact() {
        System.out.println("Wybierz typ biletu:");
        System.out.println("1. Dla osoby");
        System.out.println("2. Oplata za transport ");
        System.out.println("3. Opłata bagażu");
        System.out.println("4. Powrót do głownego menu");
        int typBiletu = in.nextInt();
        switch (typBiletu) {
            case 1: {
                System.out.println("Cena biletu wynosi: " + personTicket() + " PLN");
                break;
            }
            case 2: {
                System.out.println("Opłata za transport wynosi:  " + transportTicket() + " PLN");
                break;
            }
            case 3: {
                System.out.println("Opłata za bagaż wynosi:  " + baggageTicket() + " PLN");
                break;
            }
            case 4:
                return ScreenName.MainScreen;
        }

        return ScreenName.Exit;
    }

    private int personTicket() {
        System.out.println("Ile Masz lat?");
        int age = in.nextInt();
        int cena = chooseTicket(age);
        //System.out.println("Dziękujemy! \n Miłej podróży!");
        return cena;
    }


    private double baggageTicket() {
        System.out.println("Podaj wagę bagażu");
        float baggage = in.nextFloat();
        return Math.round(baggage * 0.5);


    }

    private int transportTicket() {
        System.out.println("Wybierz typ transportu:");
        System.out.println("1. Osobowy ");
        System.out.println("2. Motor ");
        System.out.println("3. Ciężarówka ");
        System.out.println("4. Autobus ");
        int typeTransport = in.nextInt();
        switch (typeTransport) {
            case 1:
                return 20;
            case 2:
                return 10;
            case 3: {
                System.out.println("Podaj ilość ton");
                int amountTons = in.nextInt();
                return amountTons * 10;
            }
            case 4:
                System.out.println("Podaj długość autobusu w ");
                int amountMeters = in.nextInt();
                return amountMeters * 5;
        }
        return 0;
    }


    private int chooseTicket(int age) {
        int przedzial = obliczPrzedzial(age);
        switch (przedzial) {
            case 1:
                return 0;
            case 2:
                return 5;
            case 3:
                return 10;
            case 4:
                return 5;
        }
        return 0;
    }

    private int obliczPrzedzial(int age) {

        if (age < 3) {
            return 1;
        }
        if (age > 3 && age < 18) {
            return 2;
        }
        if (age > 18 && age < 60) {
            return 3;
        }
        return 4;
    }

}