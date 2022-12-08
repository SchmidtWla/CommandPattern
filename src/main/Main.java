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
        fernbedienung.setAnKnopf(0, new GarageHochCommand(garage));
        fernbedienung.setAusKnopf(1, new GarageRunterCommand(garage));
        fernbedienung.setAnKnopf(2, new LichtAnCommand(licht));
        fernbedienung.setAusKnopf(3, new LichtAusCommand(licht));
        fernbedienung.setAnKnopf(4, new StereoanlageAnCommand(anlage));
        fernbedienung.setAusKnopf(5, new StereoanlageAusCommand(anlage));
        fernbedienung.setAnKnopf(6, new StereoanlageCDAbspielenCommand(anlage));
        fernbedienung.setAusKnopf(7, new StereoanlageCDStoppenCommand(anlage));
        fernbedienung.setAnKnopf(8, new StereoanlageLautstaerkeHochCommand(anlage));
        fernbedienung.setAusKnopf(9, new StereoanlageLautstaerkeRunterCommand(anlage));

    }
}
