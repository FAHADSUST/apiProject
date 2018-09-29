/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 *
 * @author Fahad-PC
 */
public class Data {
    String dataVersion;
    String songList;
    String appList;

    public Data(String dataVersion, String radioItems, String cityItems) {
        this.dataVersion = dataVersion;
        this.songList = radioItems;
        this.appList = cityItems;
       
    }

    

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getRadioItems() {
        return songList;
    }

    public void setRadioItems(String radioItems) {
        this.songList = radioItems;
    }
    
    
    public static void main(String arg[])
    {
        //Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        Scanner stdin = new Scanner(System.in);
        String name = stdin.nextLine();
        String phone = stdin.nextLine();

        System.out.println("name: " + name + ", phone: " + phone);
        /*while (stdin.hasNext()) {
            System.out.println(Math.abs(stdin.nextLong() - stdin.nextLong()));
        }*/
    }
    
}
