package GeoMath2D.Shapes.BasicShapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/3/2021 in 10:54 PM
 */
public class Circle extends JPanel {
    // CircleFrameWork Circle = new CircleFrameWork();

    public void paintComponent(Graphics g) {
        g.fillOval(100, 100, 10, 10);
    }


    public void changeTheColor() {
        //  Circle.setCircleBlue();
        //repaint();
    }


}
class DrawingCircle implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

