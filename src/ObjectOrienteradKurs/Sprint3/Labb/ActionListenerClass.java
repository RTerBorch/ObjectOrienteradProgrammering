package ObjectOrienteradKurs.Sprint3.Labb;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class ActionListenerClass extends JFrame implements java.awt.event.ActionListener {

    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Knapp1");


    public ActionListenerClass(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        button.addActionListener(this);

        this.add(panel);
        panel.add(label);
        panel.add(button);

        this.pack();
        this.setLocation(1000,500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (label.getText().equalsIgnoreCase("Hej")){
            label.setText("HEJ!");
        } else{
            label.setText("Hej");
        }

    }

    public static void main(String[] args){
        ActionListenerClass aL = new ActionListenerClass();
    }


}
