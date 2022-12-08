package commands;

public class MakroCommand implements Command{

    private Command[] makroCommand;

    public MakroCommand(Command[] commands) {
        this.makroCommand = commands;
    }

    @Override
    public void execute() {
        System.out.println("Führe Marko Command aus:");
        for(int i = 0; i < makroCommand.length; i++) {
            makroCommand[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
