package commands.lichtCommands;

import commands.Command;
import receiver.Licht;

public class LichtAnCommand implements Command {

    Licht licht;

    public LichtAnCommand(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void execute() {
        licht.setLichtAn();
    }

    @Override
    public void undo() {
        licht.setLichtAus();
    }

    @Override
    public void redo() {

    }

    @Override
    public int timeNeededInSek() {
        return 0;
    }

}
