package gui.windowParts;

import gui.windowParts.panelModels.Panel;

import javax.swing.*;
import java.awt.*;


public class LogPanel extends Panel {

    private JTextArea log;
    private JScrollPane scroll;

    public LogPanel(int panel_width, int panel_height) {

        super(panel_width, panel_height);

        log = new JTextArea("TEXT", 10,1);
        log.setEditable(false);
        log.setLineWrap(true);

        scroll = new JScrollPane(log);
        scroll.setPreferredSize(new Dimension(1250, 190));

        add(scroll);

    }
}
