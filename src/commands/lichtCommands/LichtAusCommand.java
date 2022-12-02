package commands.lichtCommands;

import commands.Command;
import receiver.Licht;

public class LichtAusCommand implements Command {

    Licht licht;

    public LichtAusCommand(Licht licht) {
      this.licht = licht;
    }

    @Override
    public void execute() {
        licht.setLichtAus();
    }

    @Override
    public void undo() {
        licht.setLichtAn();
    }
}
