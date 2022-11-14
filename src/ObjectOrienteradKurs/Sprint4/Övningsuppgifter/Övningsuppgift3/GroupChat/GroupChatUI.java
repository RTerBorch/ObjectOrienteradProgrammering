package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift3.GroupChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GroupChatUI extends JFrame implements Action {



    String user = "User1:";

    JTextArea txt = new JTextArea();

    JPanel panel = new JPanel();
    JPanel chatPanel = new JPanel();
    JScrollPane scroll = new JScrollPane(txt);
    JTextField write = new JTextField();
    JButton stop = new JButton("Disconnect");
    JButton send = new JButton("Send");


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    GroupChatUI(Client client){
    // JFrame -> JPanel -> the rest

        panel.setLayout(new BorderLayout());
        panel.add(stop, BorderLayout.NORTH);
        panel.add(scroll, BorderLayout.CENTER);
        panel.add(chatPanel, BorderLayout.SOUTH);
        add(panel);

        chatPanel.setLayout(new BorderLayout());
        chatPanel.add(send, BorderLayout.WEST);
        chatPanel.add(write);

        send.addActionListener(this);
        write.addActionListener(this);
        stop.addActionListener(this);


        this.setTitle("Chat-window");
        this.setVisible(true);
        this.setSize(300,450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == send){

            String temp = txt.getText();
            txt.setText(temp+"\n"+user+" "+write.getText());
            write.setText("");

        }

        if ( e.getSource() == write){

            String temp = txt.getText();
            txt.setText(temp+"\n"+user+" "+write.getText());
            write.setText("");

        }
        if ( e.getSource() == stop){
            String temp = txt.getText();
            txt.setText(temp+"\n"+user + " left the chat");

        }
    }

    @Override
    public Object getValue(String key) {
        return null;
    }

    @Override
    public void putValue(String key, Object value) {

    }

    @Override
    public boolean accept(Object sender) {
        return Action.super.accept(sender);
    }




}
