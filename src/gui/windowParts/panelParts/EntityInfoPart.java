package gui.windowParts.panelParts;

import gui.windowParts.panelModels.PanelPart;

import javax.swing.*;
import java.awt.*;

public class EntityInfoPart extends PanelPart {

    protected JLabel title_label;
    protected JLabel name_label;
    protected JLabel level_label;
    protected JLabel hp_label;
    protected JLabel attack_label;

    protected String name_value = "NAME";
    protected int level_value = 100;
    protected int hp_value = 100;
    protected int attack_value = 100;

    public EntityInfoPart() {

        setLayout(new GridLayout(5, 1));

        title_label = new JLabel("=ENTITY INFO=", SwingConstants.CENTER);
        name_label = new JLabel("Name:    "+name_value);
        level_label = new JLabel("Level:  "+level_value);
        hp_label = new JLabel("HP:    "+hp_value);
        attack_label = new JLabel("Attack:    "+attack_value);

        add(title_label);
        add(name_label);
        add(level_label);
        add(hp_label);
        add(attack_label);

    }

}



