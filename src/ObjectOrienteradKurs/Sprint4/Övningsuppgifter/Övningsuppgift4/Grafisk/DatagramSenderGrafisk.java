package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift4.Grafisk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

public class DatagramSenderGrafisk extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JTextField text = new JTextField(10);
    JButton button = new JButton("Sänd in");

    String stad = "";
    String temp = "";

    String txt = "";

    InetAddress toAdr = InetAddress.getByName("172.20.200.204");
    int toPort = 32334;
    DatagramSocket socket = new DatagramSocket();

    public DatagramSenderGrafisk() throws UnknownHostException, SocketException {
        stad = JOptionPane.showInputDialog(null, "Vilken stad?");
        if (stad == null || stad.length() == 0) {
            System.exit(0);
        }

        this.setTitle(stad);
        this.add(panel);

        // Panel
        panel.setSize(50,300);
        panel.add(text);
        panel.add(button);

        // Button
        button.addActionListener(this);

        // Txt
        text.addActionListener(this);

        // Panel
        this.pack();
        this.setLocation(800,300);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        temp = text.getText();
        txt = stad + ": " + temp + "C";
        byte[] data = txt.getBytes();
        DatagramPacket packet = new DatagramPacket(data,
                data.length, toAdr, toPort);

        try {
            socket.send(packet);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        text.setText("");


    }

    public static void main(String[] args) throws IOException, InterruptedException {
    DatagramSenderGrafisk DSG = new DatagramSenderGrafisk();




    }



}
