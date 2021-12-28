package gui.windowParts;

import gui.windowParts.panelModels.Panel;
import gui.windowParts.panelParts.EntityInfoPart;
import gui.windowParts.panelParts.GameInfoPart;
import gui.windowParts.panelParts.PlayerControlPart;
import java.awt.*;


public class PlayerPanel extends Panel {

    private GameInfoPart game_info;
    private EntityInfoPart player_info;
    private PlayerControlPart player_control;

    public PlayerPanel(int panel_width, int panel_height) {

        super(panel_width, panel_height);

        setLayout(new GridLayout(3, 1));

        game_info = new GameInfoPart();
        add(game_info);

        player_info = new EntityInfoPart();
        add(player_info);

        player_control = new PlayerControlPart();
        add(player_control);

    }
}
