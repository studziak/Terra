/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author studzins
 */
public class MyClient {


    public static void main(String[] args) throws IOException{
        
        //Client
        Socket s = new Socket(InetAddress.getLocalHost(), 5432); //czemu nie dziala ip, tylko localhost - czyzby firewall?
        System.out.println(InetAddress.getLocalHost());
        
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("dupa");
        dos.flush();
        dos.close();
        s.close();
        
    }
}
