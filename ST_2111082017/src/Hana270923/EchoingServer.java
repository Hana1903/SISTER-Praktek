/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hana270923;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.*; 
import java.io.*;
/**
 *
 * @author sryfe
 */
public class EchoingServer {
    public static void main (String [] args){
        ServerSocket server = null;
        Socket client;
        String coba;
        
        try {
            server = new ServerSocket(1235);
        } catch (IOException ie) {
            System.out.println("Cannot open socket.");
            System.exit(1);
        }
        while(true) { 
            try {
                System.out.println("Listening......");
                client = server.accept();
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
                coba = br.readLine();
                System.out.println(coba);
                pw.println(coba);
            } catch (IOException ie) { 
        } 
    }
  }
}