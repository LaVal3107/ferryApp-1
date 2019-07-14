package pl.exercise.ferry.screen;

import java.util.Scanner;

public class MainScreen implements Screen {

    public final Scanner in = new Scanner(System.in);

    @Override
    public ScreenName interact() {
        System.out.println("-------------------------------");
        System.out.println("Witamy w systemie \"Twój rejs\", wybierz akcję:");
        System.out.println("1.Chcę kupić bilet");
        System.out.println("2.Odczyt zapisanych danych rejsu");
        System.out.println("3.Zamknąć system");
        System.out.println("-------------------------------");

        int s = in.nextInt();
        if (s == 1) {
            return ScreenName.TicketScreen;
        } else if (s == 3) {
            return ScreenName.Exit;
        }
        return ScreenName.Exit;

    }
}
