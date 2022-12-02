package commands.garageCommands;

import commands.Command;
import receiver.Garage;

public class GarageHochCommand implements Command {

    private Garage befehlsZiel;

    public GarageHochCommand(Garage garage) {
        this.befehlsZiel = garage;
    }
    @Override
    public void execute() {
        befehlsZiel.hoch();
    }

    @Override
    public void undo() {
        befehlsZiel.runter();
    }

}
