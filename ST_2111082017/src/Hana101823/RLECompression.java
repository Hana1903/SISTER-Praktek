/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hana101823;

import javax.print.DocFlavor;

/**
 *
 * @author Lenovo
 */
public class RLECompression {
    public static String compressRLE(String input){
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for(int i=0; i<input.length(); i++){
            if(i + 1< input.length() && input.charAt(i) == input.charAt(i+1)){
                count++;
            }else{
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        return compressed.toString();
    }
    
    public static String decompressRLE(String input){
        StringBuilder decompreseed = new StringBuilder();
        for(int i=0;i<input.length();i+=2){
            char character = input.charAt(i);
            int count = Integer.parseInt(String.valueOf(input.charAt(i+1)));
            for(int j =0;j < count;j++){
                decompreseed.append(character);
            }
        }
        return decompreseed.toString();
    }
    
    public static void main(String[] args) {
        String data = "AAAAAABBBBBCCCC";
        String compressedData = compressRLE(data);
        System.out.println("Panjang Data     :"+data.length());
        System.out.println("Data             :"+data);
        System.out.println("Compres Data     :"+compressedData);
        System.out.println("Panjang Selisih  :"+compressedData.length());
    }
    
}