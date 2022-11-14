package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift2;

import ObjectOrienteradKurs.Sprint4.Labb.Lektion1.DatagramReceiver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class DatagramSender {

    public static void main(String[] args) throws IOException, InterruptedException {

        String[] fraser = {"Hello there champ... ", "Goood mooorning to youuuu....", "eeeyyyyyy!..."};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            InetAddress toAdr = InetAddress.getLocalHost();



        int toPort = 32334;



            DatagramSocket socket = new DatagramSocket();


        while(true){
            for(int i = 0; i < fraser.length; i++){

                byte[] data = fraser[i].getBytes();

                DatagramPacket packet = new DatagramPacket(data,
                        data.length, toAdr, toPort);

                socket.send(packet);

                Thread.sleep(5000);

            }
        }



    }




}
