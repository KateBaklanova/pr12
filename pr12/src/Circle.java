import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {

        public Circle(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void draw(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            Random random = new Random();
            int r = random.nextInt(100) + 1;
            Ellipse2D.Double circle = new Ellipse2D.Double(x, y, r, r);

            Color myColor = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            g2d.setColor(myColor);
            g2d.fill(circle);
        }

    }
