package ObjectOrienteradKurs.Sprint3.Labb.lektion2;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo extends JFrame {

    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Knapp1");
    JPanel panel = new JPanel();


    public ButtonDemo(){

        this.add(panel);
        this.panel.setBackground(Color.pink);
        button.setBackground(Color.red);
        this.panel.add(label);
        this.panel.add(button);

       //this.pack();
        setSize(200,200);
        this.setLocation(1000,500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
       ButtonDemo JM = new ButtonDemo();



    }
}
