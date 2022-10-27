package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ML implements MouseListener {
    JPanel panel = new JPanel();
    JButton button1 = new JButton("Tryck här");
    JLabel label1 = new JLabel("Hej");

    public ML() {


        button1.addMouseListener(this);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.setSize(200, 200);
        frame.setVisible(true);

        frame.add(panel);
        panel.add(button1);
        panel.add(label1);
        panel.setSize(200, 200);
        frame.pack();

    }

    public static void main(String[] args) {
        ML ml = new ML();

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        button1.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        button1.setBackground(null);
    }
}
