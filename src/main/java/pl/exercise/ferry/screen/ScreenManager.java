package pl.exercise.ferry.screen;

public class ScreenManager {

    private final TicketScreen ticketScreen = new TicketScreen();
    private final MainScreen mainScreen = new MainScreen();
    private final ExitScreen exitScreen = new ExitScreen();

    ScreenName chosenScreen;


    public void manage(){
        chosenScreen = ScreenName.MainScreen;
        while(true) {
            chosenScreen =  chooseScreen(chosenScreen);
        }
    }

     private ScreenName chooseScreen(ScreenName choosenScreen) {
         if (choosenScreen == ScreenName.MainScreen)
             return mainScreen.interact();
         if (choosenScreen == ScreenName.TicketScreen)
             return ticketScreen.interact();
         if (choosenScreen == ScreenName.Exit)
             return exitScreen.interact();
         return ScreenName.MainScreen;

     }
}
