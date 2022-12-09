package main;

import commands.Command;
import commands.MakroCommand;
import commands.garageCommands.GarageHochCommand;
import commands.garageCommands.GarageRunterCommand;
import commands.lichtCommands.LichtAnCommand;
import commands.lichtCommands.LichtAusCommand;
import commands.stereoanlageCommands.*;
import gui.FernbedienungGUI;
import receiver.Fernbedienung;
import receiver.Garage;
import receiver.Licht;
import receiver.Stereoanlage;

public class Main {

    public static void main(String[] args) {

        Licht licht = new Licht();
        Garage garage = new Garage();
        Stereoanlage anlage = new Stereoanlage();

        Command command1 = new GarageHochCommand(garage);
        Command command2 = new StereoanlageAnCommand(anlage);
        Command command3 = new StereoanlageCDAbspielenCommand(anlage);
        Command command4 = new GarageRunterCommand(garage);
        Command command5 = new StereoanlageCDStoppenCommand(anlage);
        Command command6 = new StereoanlageAusCommand(anlage);
        Command[] commands = new Command[6];
        commands[0] = command1;
        commands[1] = command2;
        commands[2] = command3;
        commands[3] = command4;
        commands[4] = command5;
        commands[5] = command6;

        MakroCommand makroCommands = new MakroCommand(commands);

        Fernbedienung fernbedienung = new Fernbedienung(5, makroCommands);
        fernbedienung.setAnKnopf(0, new GarageHochCommand(garage));
        fernbedienung.setAusKnopf(0, new GarageRunterCommand(garage));
        fernbedienung.setAnKnopf(1, new LichtAnCommand(licht));
        fernbedienung.setAusKnopf(1, new LichtAusCommand(licht));
        fernbedienung.setAnKnopf(2, new StereoanlageAnCommand(anlage));
        fernbedienung.setAusKnopf(2, new StereoanlageAusCommand(anlage));
        fernbedienung.setAnKnopf(3, new StereoanlageCDAbspielenCommand(anlage));
        fernbedienung.setAusKnopf(3, new StereoanlageCDStoppenCommand(anlage));
        fernbedienung.setAnKnopf(4, new StereoanlageLautstaerkeHochCommand(anlage));
        fernbedienung.setAusKnopf(4, new StereoanlageLautstaerkeRunterCommand(anlage));


        FernbedienungGUI gui = new FernbedienungGUI(fernbedienung);
    }
}
