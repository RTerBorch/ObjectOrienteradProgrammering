package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift4;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DatagramSender {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);



        System.out.println("Vilken stad befinner du dig i?");
        String stad = input.nextLine();
        System.out.println("Ange temperatur ");
        String temp = input.nextLine();

        String txt = stad + " : " + temp + "C";

        InetAddress toAdr = InetAddress.getByName("172.20.200.204");


        int toPort = 32334;


        DatagramSocket socket = new DatagramSocket();


            byte[] data = txt.getBytes();

            DatagramPacket packet = new DatagramPacket(data,
                    data.length, toAdr, toPort);

            socket.send(packet);



    }





}
