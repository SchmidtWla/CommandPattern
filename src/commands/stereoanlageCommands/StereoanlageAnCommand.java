package commands.stereoanlageCommands;

import commands.Command;
import receiver.Stereoanlage;

public class StereoanlageAnCommand implements Command {
    Stereoanlage anlage;

    public StereoanlageAnCommand(Stereoanlage anlage) {
        this.anlage = anlage;
    }

    @Override
    public void execute() {
        this.anlage.anschalten();
    }

    @Override
    public void undo() {
        this.anlage.ausschalten();
    }
}
