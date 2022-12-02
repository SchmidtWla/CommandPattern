package commands.stereoanlageCommands;

import commands.Command;
import receiver.Stereoanlage;

public class StereoanlageLautstaerkeRunterCommand implements Command {
    Stereoanlage anlage;

    public StereoanlageLautstaerkeRunterCommand(Stereoanlage anlage) {
        this.anlage = anlage;
    }

    @Override
    public void execute() {
        this.anlage.setLautstaerke(this.anlage.getLautstaerke() - 1);
    }

    @Override
    public void undo() {
        this.anlage.setLautstaerke(this.anlage.getLautstaerke() + 1);
    }
}
