package pl.exercise.ferry.screen;

public class ExitScreen implements Screen {

    @Override
    public ScreenName interact() {
        System.exit(0);
        return ScreenName.Exit;
    }
}
