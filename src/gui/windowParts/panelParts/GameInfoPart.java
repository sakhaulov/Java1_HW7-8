package gui.windowParts.panelParts;

import gui.windowParts.panelModels.PanelPart;

import javax.swing.*;
import java.awt.*;

public class GameInfoPart extends PanelPart {

    protected JLabel title_label;
    protected JLabel difficulty_label;
    protected JLabel level_label;
    protected JLabel enemies_alive_label;
    protected JLabel score_label;

    protected int difficulty_value = 1;
    protected int level_value = 100;
    protected int enemies_alive_value = 100;
    protected int score_value = 100;

    public GameInfoPart() {

        setLayout(new GridLayout(5, 1));

        title_label = new JLabel("=GAME INFO=", SwingConstants.CENTER);
        difficulty_label = new JLabel("Difficulty:   "+difficulty_value);
        level_label = new JLabel("Level:   "+level_value);
        score_label = new JLabel("Score:   "+score_value);
        enemies_alive_label = new JLabel("Enemies Left: "+enemies_alive_value);

        add(title_label);
        add(difficulty_label);
        add(level_label);
        add(score_label);
        add(enemies_alive_label);

    }


}
