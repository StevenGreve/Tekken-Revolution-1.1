import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Rectangle extends JPanel 
{
    @Override
    public boolean isOpaque() 
    {
        return false;
    }

    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(51, 204, 255)); //new Color(51, 54, 133) 
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 * 0.1f));
        g2d.draw(new RoundRectangle2D.Double(30, 30, 300, 300, 5, 5));
        g2d.fillRoundRect(30, 30, 300, 300, 5, 5);
    }   
}

