import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

import java.awt.geom.Path2D;

public class Triangle extends Shape {

    public Triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {


        Random random = new Random();
        int x = random.nextInt(10)+1;
        int xPoints[] = {9*x, 15*x, 0*x, 18*x, 3*x};
        int yPoints[] = {0, 18*x, 6*x, 6*x, 18*x};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();

        star.moveTo(xPoints[0] + x, yPoints[0] + y);
        for (int i = 1; i < xPoints.length; i++) {
            star.lineTo(xPoints[i] + x, yPoints[i] + y);
        }
        star.closePath();
        Color myColor = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        g2d.setColor(myColor);
        g2d.fill(star);
    }

}
