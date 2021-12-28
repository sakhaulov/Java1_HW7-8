package gui.windowParts.panelParts;

import gui.windowParts.panelModels.PanelPart;

import javax.swing.*;
import java.awt.*;

public class PlayerControlPart extends PanelPart {

    private final int button_width = 50;
    private final int button_height = 50;

    private JButton b_up;
    private JButton b_down;
    private JButton b_left;
    private JButton b_right;

    public PlayerControlPart() {

        setLayout(null);

        b_up = new JButton("\uD83E\uDC81");
        b_down = new JButton("\uD83E\uDC83");
        b_left = new JButton("\uD83E\uDC80");
        b_right = new JButton("\uD83E\uDC82");

        b_up.setBounds(100, 100, button_width, button_height);
        b_down.setBounds(100, 151, button_width, button_height);
        b_left.setBounds(49, 151, button_width, button_height);
        b_right.setBounds(151, 151, button_width, button_height);

        add(b_up);
        add(b_down);
        add(b_left);
        add(b_right);

    }


}
