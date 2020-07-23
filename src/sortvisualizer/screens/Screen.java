package sortvisualizer.screens;

import static sortvisualizer.mainapp.WIN_HEIGHT;
import static sortvisualizer.mainapp.WIN_WIDTH;

import javax.swing.*;
import java.awt.*;
import sortvisualizer.mainapp;

public abstract class Screen extends JPanel {
    protected mainapp app;

    public Screen(mainapp app)
    {
        this.app = app;
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(WIN_WIDTH,WIN_HEIGHT);
    }

    public abstract void onOpen();
}
