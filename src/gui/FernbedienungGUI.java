package gui;

import commands.Command;
import receiver.Fernbedienung;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FernbedienungGUI {

    Fernbedienung fernbedienung;
    JFrame frame;
    JPanel buttonPanel;
    JPanel fortschrittsAnzeigePanel;
    JPanel buttonPanelRight;
    JPanel buttonPanelLeft;
    JPanel redoPanel;

    public FernbedienungGUI(Fernbedienung fernbedienung) {
        this.fernbedienung = fernbedienung;
        init();
    }
    public void init() {
        frame = new JFrame("Fernbedienung");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        setLayouts();
        frame.setVisible(true);
    }

    private void setLayouts() {
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        fortschrittsAnzeigePanel = new JPanel();
        buttonPanel = new JPanel();
        redoPanel = new JPanel();
        createProgressBar();
        createButtonPanel();
        frame.add(redoPanel);

    }
    private void createButtonPanel() {
         buttonPanel = new JPanel(new BorderLayout(5,5));

        buttonPanelLeft = new JPanel(new GridLayout(fernbedienung.getAnCommands().length, 1));
        buttonPanel.add(buttonPanelLeft, BorderLayout.WEST);
        buttonPanelRight = new JPanel( new GridLayout(fernbedienung.getAusCommands().length,1));
        buttonPanel.add(buttonPanelRight, BorderLayout.EAST);
        for(Command command : fernbedienung.getAnCommands()) {
            JButton buttonAn = new JButton(command.getClass().getSimpleName());
            buttonAn.addActionListener(e -> {
                command.execute();
            });
            buttonPanelLeft.add(buttonAn);
        }
        for(Command command : fernbedienung.getAusCommands()) {
            JButton buttonAus = new JButton(command.getClass().getSimpleName());
            buttonAus.addActionListener(e-> {
                command.execute();
            });
            buttonPanelRight.add(buttonAus);
        }
        frame.add(buttonPanel);
    }

    private void createProgressBar() {
        JProgressBar progressBar = new JProgressBar(0,100);
        progressBar.setValue(15);
        progressBar.setStringPainted(true);
        frame.add(progressBar);

    }

    private void createMakroCommandButton() {
        JButton markoButton = new JButton("Makro Command");
        markoButton.addActionListener(e -> {

        });
    }
}
