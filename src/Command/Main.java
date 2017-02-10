package Command;

public class Main {
    public static void main(final String[] arguments){

        final Light lamp = new Light();

        final Command switchUp = new FlipUpCommand(lamp);
        final Command switchDown = new FlipDownCommand(lamp);

        final Switch mySwitch = new Switch();

        mySwitch.storeAndExecute(switchDown);

        mySwitch.storeAndExecute(switchUp);

    }
}
