package GeoMath2D.GUI.Manager;

import GeoMath2D.GUI.Base.SystemSetup.BottomGUI;
import GeoMath2D.GUI.Base.SystemSetup.ColorPalettePanel;
import GeoMath2D.GUI.Base.SystemSetup.FrameSystem;
import GeoMath2D.GUI.Base.SystemSetup.SideGUI;
import GeoMath2D.Shapes.BasicShapes.Circle;
import GeoMath2D.Shapes.ShapeManager.ShapePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:46 AM
 */
public class Application extends JComponent {

    public JFrame Window = new FrameSystem();
    public JPanel bottomPanel = new BottomGUI();
    public JPanel sidePanel = new SideGUI();
    public JPanel shapePanel = new ShapePanel();
    public JPanel colorPalettePanel = new ColorPalettePanel();
    Circle c = new Circle();

    public Application() {
        attributes();
    }

    public void attributes() {
        Window.add(bottomPanel, BorderLayout.SOUTH);
        Window.add(sidePanel, BorderLayout.WEST);
        Window.add(shapePanel, BorderLayout.CENTER);
        bottomPanel.add(colorPalettePanel, BorderLayout.WEST);
        shapePanel.add(c);
        Window.setVisible(true);
    }
}
