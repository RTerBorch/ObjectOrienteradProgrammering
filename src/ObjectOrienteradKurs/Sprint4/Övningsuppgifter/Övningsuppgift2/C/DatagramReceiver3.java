package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift2.C;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramReceiver3 {

    public static void main(String[] args) throws SocketException, IOException {

        int minPort = 32334;
        int sendPort = 32334;
        DatagramSocket recSocket = new DatagramSocket(minPort);
        DatagramSocket sendSocket = new DatagramSocket(minPort);

        byte[] data = new byte[256];

        while(true){

            DatagramPacket packet = new DatagramPacket(data, data.length);
            recSocket.receive(packet);
/*
            System.out.println("Meddelande från "+
                    packet.getAddress().getHostAddress()
                    + " " + LocalDateTime.now());

*/
            String message = new String(packet.getData(), 0,
                    packet.getLength());
            System.out.println(message);


            //TODO skicka kvittens
            String msg = "Mottaget";


        }
    }
}
