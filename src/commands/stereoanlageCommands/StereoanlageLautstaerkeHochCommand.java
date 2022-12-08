package commands.stereoanlageCommands;

import commands.Command;
import receiver.Stereoanlage;

public class StereoanlageLautstaerkeHochCommand implements Command {

    Stereoanlage anlage;

    public StereoanlageLautstaerkeHochCommand(Stereoanlage anlage) {
        this.anlage = anlage;
    }

    @Override
    public void execute() {
        this.anlage.setLautstaerke(this.anlage.getLautstaerke() + 1);
    }

    @Override
    public void undo() {
        this.anlage.setLautstaerke(this.anlage.getLautstaerke() - 1);
    }

    @Override
    public void redo() {

    }

    @Override
    public int timeNeededInSek() {
        return 0;
    }
}
