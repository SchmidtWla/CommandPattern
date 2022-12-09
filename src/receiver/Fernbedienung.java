package receiver;

import commands.Command;
import commands.KeinCommand;
import commands.MakroCommand;

public class Fernbedienung {

    private Command[] anCommands;
    private Command[] ausCommands;

    MakroCommand makroCommand;

    public Command[] getAnCommands() {
        return anCommands;
    }

    public Command[] getAusCommands() {
        return ausCommands;
    }

    public Fernbedienung(int anzahl, MakroCommand makroCommand){
        this.anCommands = new Command[anzahl];
        this.ausCommands = new Command[anzahl];
        for(int i = 0; i < anzahl; i++) {
            ausCommands[i] = new KeinCommand();
            anCommands[i] = new KeinCommand();
        }
        this.makroCommand = makroCommand;
    }

    public void setAnKnopf(int pos, Command command) {
        this.anCommands[pos] = command;
    }

    public void setAusKnopf(int pos, Command command) {
        this.ausCommands[pos] = command;
    }

}
