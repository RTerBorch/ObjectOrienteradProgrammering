package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift14;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Properties  extends JFrame {

    public Properties(){
        java.util.Properties p = new java.util.Properties();

        try {
            p.load(new FileInputStream("src/ObjectOrienteradKurs/Sprint4/Övningsuppgifter/Övningsuppgift14/Properties.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String msg = p.getProperty("Message","Champ");
        JLabel l = new JLabel(msg,JLabel.CENTER);
        add(l);

     //   l.setOpaque(true); // why?

        String fName = p.getProperty("fontName", "Serif"); // ändras detta värde sen?
        String fStyle = p.getProperty("fontStyle","PLAIN");
        int ifStyle; // what is this?

        if ( fStyle.equals("BOLD")){
            ifStyle = Font.BOLD;
        }
        else if(fStyle.equals("ITALIC")){
            ifStyle = Font.ITALIC;
        }
        else ifStyle = Font.PLAIN;

        int fSize = Integer.parseInt(p.getProperty("fontSize","24")); // what happens? parse what

        l.setFont(new Font(fName,ifStyle, fSize));
        setSize(400,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




    public static void main(String[] args) {

        Properties runProp = new Properties();





    }
}
