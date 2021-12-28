package gui.windowParts;

import javax.swing.*;
import java.awt.*;

public class StartMenuPanel extends JPanel {

    private JButton game_start;
    private JButton game_exit;
    private JLabel game_title;

    private final int elem_width = 200;
    private final int elem_height = 80;

    public StartMenuPanel() {
        setupStartMenu();
    }

    private void setupStartMenu() {

        setLayout(null);

        game_title = new JLabel("GAME TITLE", SwingConstants.CENTER);
        game_start = new JButton("START GAME");
        game_exit = new JButton("EXIT GAME");

        game_title.setFont(new Font("Arial", Font.BOLD, 30));

        game_title.setBounds(290, 250, elem_width, elem_height);
        game_start.setBounds(290, 350, elem_width, elem_height);
        game_exit.setBounds(290, 450, elem_width, elem_height);

        add(game_title);
        add(game_start);
        add(game_exit);

    }

}
