import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame
{
    public Picture(String title)
    {
        super(title);

    }

    public static void main(String[] args)
    {
        JPanel[] pnl = new JPanel[2];
        // получаем текущую рабочую папку откуда запущена программа
        String cwd = System.getProperty("C:/Users/bakla/OneDrive/Изображения/");

        Picture frame = new Picture("Показываем картинку");
        frame.setLayout(new GridLayout(3,4));

        // относительно текущей папки загружаем изображение
        // папка с изображением должна находиться в текущей папке программы
        ImageIcon icon = new ImageIcon("C:/Users/bakla/OneDrive/Изображения/fcdccedvfcfcdfc.jpg");

        // создаем панель, в панель добавляем заголовок с картинкой
        // JPanel panel = new JPanel();
        pnl[0] = new JPanel();
        pnl[0].add(new JLabel(icon), BorderLayout.SOUTH);




        // JPanel panel1 = new JPanel();

        pnl[1] = new JPanel();
        // Image image = Toolkit.getDefaultToolkit().createImage("C:/Users/bakla/OneDrive/Изображения/SRnCIP.gif");
        ImageIcon imageIcon = new ImageIcon("C:/Users/bakla/OneDrive/Изображения/SRnCIP.gif");
       // imageIcon.setImageObserver(pnl[1]);
        pnl[1].add(new JLabel(imageIcon), BorderLayout.CENTER);

        // добавляем панель в главный фрейм (окно)
        frame.add(pnl[0]);
        frame.add(pnl[1]);

        // устанавливаем размер окна
        frame.setSize(700, 700);

        // при закрытии окна - выходим из приложения (важно всегда правильно закрывать окна)
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // помещаем окно в центре экрана
        frame.setLocationRelativeTo(null);

        // делаем окно видимым
        frame.setVisible(true);
    }
}
