package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift4.Grafisk;

import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramReceiverGrafisk extends JFrame {

    JPanel panel = new JPanel();
    JTextArea text = new JTextArea(30, 20);

    public DatagramReceiverGrafisk() throws IOException {

        this.add(panel);
        panel.add(text);

        this.pack();
        this.setLocation(500, 300);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        int minPort = 32334;
        DatagramSocket socket = new DatagramSocket(minPort);

        byte[] data = new byte[256];
        DatagramPacket packet = new DatagramPacket(data, data.length);

        while (true) {
            socket.receive(packet);
            String message = new String(packet.getData(), 0,
                    packet.getLength());

            text.setText(text.getText() + " " + message + "\n");
        }

    }

    public static void main(String[] args) throws SocketException, IOException {

    DatagramReceiverGrafisk DRG = new DatagramReceiverGrafisk();

    }

}
