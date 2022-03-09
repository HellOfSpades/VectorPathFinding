package Graphics;

import PathFinding.Map;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JFrame {
    Map map;
    public Canvas(String s, Map map){
        super(s);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
    }
}
