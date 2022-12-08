package commands.stereoanlageCommands;

import commands.Command;
import receiver.Stereoanlage;

public class StereoanlageAusCommand implements Command {
    Stereoanlage anlage;

    public StereoanlageAusCommand(Stereoanlage anlage) {
        this.anlage = anlage;
    }

    @Override
    public void execute() {
        this.anlage.ausschalten();
    }

    @Override
    public void undo() {
        this.anlage.anschalten();
    }

    @Override
    public void redo() {

    }

    @Override
    public int timeNeededInSek() {
        return 0;
    }
}
