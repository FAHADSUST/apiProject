/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static javaapplication1.GenerateTest2DK.artist;
import static javaapplication1.GenerateTest2DK.imageUrl;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Fahad-PC
 */
public class GenerateTest2Suspense {
//
//    {"employees":[
//    {"firstName":"John", "lastName":"Doe"},
//    {"firstName":"Anna", "lastName":"Smith"},
//    {"firstName":"Peter", "lastName":"Jones"}
//]}
//    

    static int songID;
    static String title;
    static String artist;
    //String album;
    static String path;
    static long duration;
    static long albumId;
    static String composer;
    static String imageUrl;

    static int albumID;
    static String albumName;
    private static Object fis;

    private static void readFile() {
        BufferedReader buffreader = null;
        try {

            InputStream fis = new FileInputStream("sunday_outputfileName2.txt");
            if (fis != null) {

                // prepare the file for reading
                InputStreamReader chapterReader = new InputStreamReader(fis);
                buffreader = new BufferedReader(chapterReader);

                String line = null;
                while (true) {
                    try {
                        line = buffreader.readLine();
                        if (line == null) {
                            break;
                        }
                        String segment = line.substring(43);//33
                        String fin = segment.substring(0, segment.length() - 4);
                        fin = fin.replace("_", " ");
                        fin = fin.replace("-", " ");
                        fin = fin.replace("%28", "");
                        fin = fin.replace("%27", "");
                        fin = fin.replace("%29", "");

                        

                        songPathList.add(line);
                        songNameList.add(fin);
                        

                    } catch (Exception e) {

                    }
                }


            }
        } catch (Exception e) {

        } finally {

        }
        
        System.out.println("line: 1" );
    }
    ArrayList<String> songList = new ArrayList<>();
    static ArrayList<String> songPathList = new ArrayList<>();
    static ArrayList<String> songNameList = new ArrayList<>();

    //http://dl.bhoot-fm.com/Bhoot-FM_2016-10-28_(Bhoot-FM.com).mp3
    public static void main(String[] args) throws IOException {

        readFile();
        System.out.println("line: " );

        String[] urlImage = {
            "http://i.imgur.com/DMmPf5f.jpg",
            "http://i.imgur.com/8C3N9lN.jpg",
            "http://i.imgur.com/MGQSXb1.jpg",
            "http://i.imgur.com/nyv8gOD.jpg",
            "http://i.imgur.com/kzr9p5M.jpg",
            "http://i.imgur.com/nBTPbty.jpg",
            "http://i.imgur.com/VvLI4sY.jpg"

        };

        String songPath = null;
        String songName = null;

        String url = "{\"songList\":[";

        songID = 0;

        artist = "Sunday Suspense";
        composer = "Radio Misri";

        Random r = new Random();

        int i = 0;
        
        
        while (i < songPathList.size()) {

            songPath = songPathList.get(i);
            songName = songNameList.get(i);

            imageUrl = urlImage[r.nextInt(7)];

            url += "{\"songID\":\"" + songID + "\", \"title\":\"" + (songID + 1) + "-" + songName + "\", \"artist\":\"" + artist + "\", \"path\":\"" + songPath + "\", \"albumId\":\"" + albumID + "\", \"composer\":\"" + composer + "\", \"imageUrl\":\"" + imageUrl + "\"},";

            songID++;
            i++;

        }
        url = url.substring(0, url.length() - 1) + "]}";

        System.out.println("" + url);

        File file = new File("filename_sunday_sus_main.txt");

        // if file doesnt exists, then create it
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(url);
        bw.close();

        System.out.println("Done");

    }

}
