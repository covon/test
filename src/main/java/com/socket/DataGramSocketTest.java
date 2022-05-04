package com.socket;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * 功能描述:
 * Author: zgdz.xf
 * Date: 2022/04/27/上午 8:33
 **/
public class DataGramSocketTest {
    @Test
    public void sendUDP() throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String line="";
        try {
            while ((line = bufferedReader.readLine()) != null) {
                if("end".equals(line)){
                    break;
                }
                byte[] bytes = line.getBytes();

                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 8080);

                datagramSocket.send(datagramPacket);
            }
        }finally {
            datagramSocket.close();
        }
    }

    @Test
    public void receUdp() throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket(8080);

        while (true){
            byte []bytes=new byte[1024];
            DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(datagramPacket);
            System.out.println("----"+new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        }
    }

}
