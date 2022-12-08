package commands;

public interface Command {

    public void execute();

    public void undo();

    public void redo();

    public int timeNeededInSek();
}
