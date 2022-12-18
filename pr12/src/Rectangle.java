import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class Rectangle extends Shape {

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Random random = new Random();
        Rectangle2D.Double Rectangle = new Rectangle2D.Double(x, y, random.nextInt(100) + 1, random.nextInt(100) + 1);

        Color myColor = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        g2d.setColor(myColor);
        g2d.fill(Rectangle);
    }

}
