package ObjectOrienteradKurs.Sprint3.Labb.trest;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class pussel implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();


    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");

    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");

    private JButton button9 = new JButton("9");
    private JButton button10 = new JButton("10");
    private JButton button11 = new JButton("11");
    private JButton button12 = new JButton("12");

    private JButton button13 = new JButton("13");
    private JButton button14 = new JButton("14");
    private JButton button15 = new JButton("15");
    private JButton button16 = new JButton("");

    private List<JButton> buttonList = Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
            button11, button12, button13, button14, button15, button16);

    public List<JButton> getButtonList() {
        return buttonList;
    }

    public void setButtonList(List<JButton> buttonList) {
        this.buttonList = buttonList;
    }

    public pussel() {


        label.setLayout(new GridLayout(4, 4));
        for (JButton jButton : buttonList) {
            label.add(jButton);
            jButton.addActionListener(this);
        }


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setSize(500, 500);

    }


    public boolean canWeMove(JButton button, List<JButton> buttonList){
       int thisPosition = Integer.parseInt(button.getText());

           for (JButton element : buttonList) {
               int tempInt = Integer.parseInt(element.getText());

               if (thisPosition-1 == 0){
                   System.out.println("awdawdw");
               }


           }
           return true;
       }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button15) {

            // 15 + 4 , 15 - 4, 15 +1, 15 - 1 (om någon av dessa är noll)
          //  canWeMove(button15);
                System.out.println("11");
                button15.setText("");
                button16.setText("15");

        }

    }
        public static void main (String[]args){
            pussel pussel = new pussel();
        }
    }
