package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.*;

public class BildVisare extends JFrame implements ActionListener {

    Path p = Paths.get("ObjectOrienteradKurs/Sprint3/Övningsuppgifter/Övningsuppgift1/Bilder");

    ImageIcon unicorn = new ImageIcon("src/ObjectOrienteradKurs/Sprint3/Övningsuppgifter/Övningsuppgift1/Bilder/unicorn.jpg");
    ImageIcon puppy = new ImageIcon("src/ObjectOrienteradKurs/Sprint3/Övningsuppgifter/Övningsuppgift1/Bilder/Leroys valp.jpg");

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
