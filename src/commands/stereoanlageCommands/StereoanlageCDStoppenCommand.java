package commands.stereoanlageCommands;

import commands.Command;
import receiver.Stereoanlage;

public class StereoanlageCDStoppenCommand implements Command {
    Stereoanlage anlage;

    public StereoanlageCDStoppenCommand(Stereoanlage anlage) {
        this.anlage = anlage;
    }

    @Override
    public void execute() {
        this.anlage.stoppePlayback();
    }

    @Override
    public void undo() {
        this.anlage.spieleAb();
    }
}
