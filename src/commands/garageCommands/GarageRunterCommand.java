package commands.garageCommands;

import commands.Command;
import receiver.Garage;

public class GarageRunterCommand implements Command {

    private Garage befehlsZiel;

    public GarageRunterCommand(Garage garage) {
        this.befehlsZiel = garage;
    }
    @Override
    public void execute() {
        befehlsZiel.runter();
    }

    @Override
    public void undo() {
        befehlsZiel.hoch();
    }

    @Override
    public void redo() {

    }

    @Override
    public int timeNeededInSek() {
        return 0;
    }
}
