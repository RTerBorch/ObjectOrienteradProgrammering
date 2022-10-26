package ObjectOrienteradKurs.Sprint3.Labb;

import javax.swing.*;

public class GridLayout {


    public static void main(String[] args) {


        JFrame f = new JFrame("The Frame");
        JPanel p = new JPanel();
        p.setLayout(new java.awt.GridLayout(3, 2));

        f.add(p);
        p.add(new JLabel("Label1"));
        p.add(new JButton("knapp1"));

        p.add(new JLabel("Label2"));
        p.add(new JButton("knapp2"));

        p.add(new JLabel("Label2"));
        p.add(new JButton("knapp2"));

        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}





