import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class g extends JPanel {

    private List shapes = new ArrayList<>();
    private Random random = new Random();

    public g() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(500, 500));


        Random r1 = new Random();
        int c = random.nextInt(3) + 1;
        int r = random.nextInt(3) + 1;
        int t = random.nextInt(3) + 1;

                for (int j = 0; j < c; j++) {
                    addCircle(random.nextInt(500) + 1, random.nextInt(500) + 1);
                }
        for (int j = 0; j < r; j++) {
            addRectangle(random.nextInt(500) + 1, random.nextInt(500) + 1);
        }

        for (int j = 0; j < t; j++) {
            addTriangle(random.nextInt(500) + 1, random.nextInt(500) + 1);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object s : shapes) {
            if (s instanceof Circle) {
                ((Circle) s).draw(g);
            }
            else if (s instanceof Rectangle) {
                ((Rectangle) s).draw(g);
            }

            else if (s instanceof Triangle) {
                ((Triangle) s).draw(g);
            }
        }
    }

    public void addCircle(int maxX, int maxY) {
        shapes.add(new Circle(random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    public void addTriangle(int maxX, int maxY) {
        shapes.add(new Triangle(random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    public void addRectangle(int maxX, int maxY) {
        shapes.add(new Rectangle(random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }


    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.add(new g());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}