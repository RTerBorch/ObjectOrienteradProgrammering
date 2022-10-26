package ObjectOrienteradKurs.Sprint3.Labb;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class JFrameDemo2 {

    public JFrameDemo2(){
        JFrameDemo jfd = new JFrameDemo();
        jfd.setSize(1000,100);
        //pack();
        jfd.setVisible(true);
        jfd.setLocationRelativeTo(null);
        jfd.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        JFrameDemo2 jfd2 = new JFrameDemo2();

    }



}


