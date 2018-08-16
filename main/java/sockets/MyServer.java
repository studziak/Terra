/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author studzins
 */
public class MyServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        /// SERVER
        ServerSocket ss = new ServerSocket(5432);
           System.out.println(InetAddress.getLocalHost());
        System.out.println("utworzono serwer");
        Socket s = ss.accept();
        System.out.println("ktos sie ze mna polaczyl");
        DataInputStream ois = new DataInputStream(s.getInputStream());
        String output = ois.readUTF();
        System.out.println(output);
        ss.close();
        
        
       
        
    }
    
}
