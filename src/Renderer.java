import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {
    private static final long serialVerUID = 1L;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        FlappyBird.flapyBird.repaint(g);
    }
}
