package receiver;

import commands.Command;
import commands.KeinCommand;

public class Fernbedienung {

    private Command[] commands;

    public Command[] getCommands() {
        return commands;
    }

    public Fernbedienung(int anzahl){
        this.commands = new Command[anzahl];
        for(int i = 0; i > this.commands.length; i++) {
            commands[i] = new KeinCommand();
        }
    }

    public void setKnopf(int pos, Command command) {
        this.commands[pos] = command;
    }

}
