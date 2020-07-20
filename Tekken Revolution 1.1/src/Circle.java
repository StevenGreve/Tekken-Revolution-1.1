import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Circle extends JPanel
{
	private Color color = Color.GRAY;
	
	public void setColor(Color color)
	{
	    this.color = color;
	}
	
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
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLACK);
		g2d.drawOval(10, 20, 12, 12);
		g2d.setColor(color);
		g2d.fillOval(10, 20, 12, 12);
	}
}
