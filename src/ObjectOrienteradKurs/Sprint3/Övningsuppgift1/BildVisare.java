package ObjectOrienteradKurs.Sprint3.Övningsuppgift1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class BildVisare extends JFrame implements ActionListener {

    Path p = Paths.get("ObjectOrienteradKurs/Sprint3/Övningsuppgift1/Bilder");

    ImageIcon unicorn = new ImageIcon("ObjectOrienteradKurs/Sprint3/Övningsuppgift1/Bilder/unicorn.jpg");
    ImageIcon puppy = new ImageIcon("ObjectOrienteradKurs/Sprint3/Övningsuppgift1/Bilder/Leroys valp.jpg");

    JLabel text1 = new JLabel("Leroys bildspel");
    JLabel bildNu = new JLabel(unicorn);




    JButton changePic = new JButton("Byt bild");
    JPanel panel = new JPanel();



    public BildVisare(){

        this.add(panel);
        panel.setLayout(new BorderLayout());

        panel.add(text1, BorderLayout.NORTH);
        panel.add(bildNu);
      //  panel.add(unicorn, BorderLayout.EAST);
        changePic.addActionListener(this);
        panel.add(changePic, BorderLayout.SOUTH);


        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(500,500);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (changePic.getText().equals("Byt bild") && bildNu.getIcon().equals(unicorn)){
            bildNu.setIcon(puppy);

        } else if (changePic.getText().equals("Byt bild") && bildNu.getIcon().equals(puppy)){
            bildNu.setIcon(unicorn);
        }
}



    public static void main(String[] args){
    BildVisare bv = new BildVisare();


    }
}
