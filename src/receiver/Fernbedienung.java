package receiver;

import commands.Command;
import commands.KeinCommand;

public class Fernbedienung {

    private Command[] anCommands;
    private Command[] ausCommands;

    public Fernbedienung(int anzahl){
        this.anCommands = new Command[anzahl];
        this.ausCommands = new Command[anzahl];
        for(int i = 0; i > anzahl; i++) {
            ausCommands[i] = new KeinCommand();
            anCommands[i] = new KeinCommand();
        }
    }

    public void setAnKnopf(int pos, Command command) {
        this.anCommands[pos] = command;
    }

    public void setAusKnopf(int pos, Command command) {
        this.ausCommands[pos] = command;
    }

}
