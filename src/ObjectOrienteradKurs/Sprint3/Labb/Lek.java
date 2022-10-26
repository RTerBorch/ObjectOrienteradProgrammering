package ObjectOrienteradKurs.Sprint3.Labb;

import javax.swing.*;
import java.awt.*;

public class Lek {



    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("ObjectOrienteradKurs/Sprint3/Labb/Bilder/unicorn.jpg");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);


        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);




    }
}
