package ObjectOrienteradKurs.Sprint3.Labb;

import javax.swing.*;

public class FlowLayout {

    public static void main(String[] args){

        JFrame f = new JFrame("The Frame");

        JPanel p = new JPanel();
        p.setLayout(new java.awt.FlowLayout());
        // lägg till panel i frame
        f.add(p);

        p.add(new JLabel("Hej!"));
        p.add(new JButton("Tryck här"));
        p.add(new JLabel("Hej2"));
        p.add(new JButton("Och här"));
        p.add(new JButton("Här med"));
        p.add(new JButton("Massa knappar"));

        f.pack();
        f.setLocation(900,500);
        f.setVisible(true);



    }
}
