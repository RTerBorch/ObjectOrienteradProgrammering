package ObjectOrienteradKurs.Sprint3.Labb.lektion2;

import javax.swing.*;
import java.awt.*;

public class ComponentDemo extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Hej");
    JButton jb = new JButton("Knapp");


    public ComponentDemo(){

        jp.setBackground(Color.black);
        jb.setBackground(Color.white);
        //jl.setBackground(Color.pink); går ej?

        jl.setText("Hopp");
        jb.setText("Jag är en knapp");
       // jb.add(new JButton("Jag är också en knapp"));
       // jl.add (new JLabel("Hopp2"));



        this.add(jp);
        jp.add(jl);
        jp.add(jb);




        //setSize(200,200);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        ComponentDemo jfd = new ComponentDemo();

    }
}
