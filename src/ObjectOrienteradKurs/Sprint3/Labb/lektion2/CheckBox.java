package ObjectOrienteradKurs.Sprint3.Labb.lektion2;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame implements ActionListener {

    private final JPanel p = new JPanel();
    private JCheckBox red = new JCheckBox("RÖD", false);
    private JCheckBox blue = new JCheckBox("BLUE", false);
    private JCheckBox yellow = new JCheckBox("YELLOW", false);
    private JLabel DisplayArea = new JLabel("");

    public CheckBox() {
        p.setLayout(new GridLayout(4, 1));
        p.add(red);p.add(blue);p.add(yellow);
        p.add(DisplayArea);
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
    if (red.isEnabled() && blue.isEnabled()){
        DisplayArea.setText("WDDWAD");

    }



    }

    public static void main(String[] args) {
        CheckBox CB = new CheckBox();

    }
}
