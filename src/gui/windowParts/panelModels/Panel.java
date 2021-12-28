package gui.windowParts.panelModels;

import javax.swing.*;
import java.awt.*;

public abstract class Panel extends JPanel {

    protected final int panel_width;
    protected final int panel_height;

    public Panel(int panel_width, int panel_height){

        this.panel_width = panel_width;
        this.panel_height = panel_height;

        setPreferredSize(new Dimension(panel_width, panel_height));

    }
}

