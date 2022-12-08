package commands.stereoanlageCommands;

import commands.Command;
import receiver.Stereoanlage;

public class StereoanlageCDAbspielenCommand implements Command {
    Stereoanlage anlage;

    public StereoanlageCDAbspielenCommand(Stereoanlage anlage) {

        this.anlage = anlage;
    }

    @Override
    public void execute() {
        this.anlage.spieleAb();
    }

    @Override
    public void undo() {
        this.anlage.stoppePlayback();
    }

    @Override
    public void redo() {

    }

    @Override
    public int timeNeededInSek() {
        return 0;
    }
}
