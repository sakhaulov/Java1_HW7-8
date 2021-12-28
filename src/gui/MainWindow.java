package gui;

import gui.windowParts.*;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    private final int window_width = 1280;
    private final int window_height = 960;
    private final int window_pos_x = 300;
    private final int window_pos_y = 200;
    private final String window_title = "Game";

    private PlayerPanel playerPanel;
    private EnemyPanel enemyPanel;
    private LogPanel logPanel;


    public MainWindow(){

        setupWindow();

        //Создание панелей с информацией
        playerPanel = new PlayerPanel(250, 960);
        enemyPanel = new EnemyPanel(250, 960);
        logPanel = new LogPanel(1280, 200);

        //Добавление панелей с информацией
        add(playerPanel, BorderLayout.WEST);
        add(enemyPanel, BorderLayout.EAST);
        add(logPanel, BorderLayout.SOUTH);

        add(new StartMenuPanel(), BorderLayout.CENTER);

        setVisible(true);

        //Удаление всех элементов окна
        //removeWindowElements();

    }

    private void setupWindow() {
        setSize(window_width, window_height);
        setLocation(window_pos_x, window_pos_y);
        setResizable(false);
        setTitle(window_title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
