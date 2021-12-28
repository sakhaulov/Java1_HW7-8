package gui.windowParts.panelModels;

import javax.swing.*;
import java.awt.*;

public abstract class PanelPart extends JPanel {

    public PanelPart(){
        setBackground(Color.lightGray);
        setBorder(BorderFactory.createEmptyBorder(40, 20, 40, 20));
    }

}
