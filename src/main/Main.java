package main;

import commands.Command;
import commands.garageCommands.GarageHochCommand;
import commands.garageCommands.GarageRunterCommand;
import commands.lichtCommands.LichtAnCommand;
import commands.lichtCommands.LichtAusCommand;
import commands.stereoanlageCommands.*;
import receiver.Fernbedienung;
import receiver.Garage;
import receiver.Licht;
import receiver.Stereoanlage;

public class Main {

    public static void main(String[] args) {

        Licht licht = new Licht();
        Garage garage = new Garage();
        Stereoanlage anlage = new Stereoanlage();

        Fernbedienung fernbedienung = new Fernbedienung(10);
        fernbedienung.setKnopf(0, new GarageHochCommand(garage));
        fernbedienung.setKnopf(1, new GarageRunterCommand(garage));
        fernbedienung.setKnopf(2, new LichtAnCommand(licht));
        fernbedienung.setKnopf(3, new LichtAusCommand(licht));
        fernbedienung.setKnopf(4, new StereoanlageAnCommand(anlage));
        fernbedienung.setKnopf(5, new StereoanlageAusCommand(anlage));
        fernbedienung.setKnopf(6, new StereoanlageCDAbspielenCommand(anlage));
        fernbedienung.setKnopf(7, new StereoanlageCDStoppenCommand(anlage));
        fernbedienung.setKnopf(8, new StereoanlageLautstaerkeHochCommand(anlage));
        fernbedienung.setKnopf(9, new StereoanlageLautstaerkeRunterCommand(anlage));

        for (int i = 0; i < fernbedienung.getCommands().length; i++) {
            fernbedienung.getCommands()[i].execute();
        }
    }
}
