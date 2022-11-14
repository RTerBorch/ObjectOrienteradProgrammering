package ObjectOrienteradKurs.Sprint3.Labb.lektion2;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton extends JFrame implements ActionListener {

    private final JPanel p = new JPanel();
    private final JRadioButton red = new JRadioButton("RÖD", true);
    private final JRadioButton blue = new JRadioButton("BLUE", true);
    private final JRadioButton yellow = new JRadioButton("YELLOW", true);
    ButtonGroup bg = new ButtonGroup();

    private final JLabel displayArea = new JLabel("Du valde rött");

    public RadioButton() {
        p.setLayout(new GridLayout(4, 1));
        p.add(red);
        p.add(blue);
        p.add(yellow);
        bg.add(red);
        bg.add(blue);
        bg.add(yellow);
        p.add(displayArea);
        p.setBackground(Color.red);
        add(p);

        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            p.setBackground(Color.red);
            displayArea.setText("Du valde rött");
        } else if (e.getSource() == blue) {
            p.setBackground(Color.blue);
            displayArea.setText("Du valde blå");
        } else if (e.getSource() == yellow) {
            p.setBackground(Color.yellow);
            displayArea.setText("Du valde gul");
        }
    }

    public static void main(String[] args) {
        RadioButton CB = new RadioButton();

    }
}
