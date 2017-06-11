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
            
            //File file = new File("filename_sunday_sus.txt");
            File file = new File("filename_sunday_sus_name.txt");

            if (!file.exists()) {
                    file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            //InputStream fis = new FileInputStream("sunday_suspense.txt");     
            InputStream fis = new FileInputStream("filename_sunday_sus.txt");  
            // if file the available for reading
            if (fis != null) {

              // prepare the file for reading
              InputStreamReader chapterReader = new InputStreamReader(fis);
              buffreader = new BufferedReader(chapterReader);
              
              String line = null;
              while(true)
              {     try{
                    line = buffreader.readLine();
                    String segment = line.substring(46);//33
                    String fin = segment.substring(0,segment.length()-4);
                    fin = fin.replace("_", " ");
                    fin = fin.replace("-", " ");
                    fin = fin.replace("%28", "");
                    fin = fin.replace("%27", "");
                    fin = fin.replace("%29", "");
                    bw.write( fin+"\n");
                    
                    }catch(Exception e)
                    {

                    }

                    if(line == null) break;
                    
                    songPath.add(line);
            
              }
              
              bw.close();
              

              /*String line;

              // read every line of the file into the line-variable, on line at the time
              do {
                 line = buffreader.readLine();
                // do something with the line 
                 System.out.println(line);
              } while (line != null);
                      */

            }
        } catch (Exception e) {
            
        } finally {
            
        }
        boolean abc = true;
        if(abc)
        {
            return ;
        }
    }
        ArrayList<String> songList = new ArrayList<>();
        static ArrayList<String> songPath = new ArrayList<>();
        
    //http://dl.bhoot-fm.com/Bhoot-FM_2016-10-28_(Bhoot-FM.com).mp3
    public static void main(String[] args) throws IOException
    {
        
        //readFile();
        
        
        String[] urlImage = {
            "http://i.imgur.com/DMmPf5f.jpg",
            "http://i.imgur.com/8C3N9lN.jpg",
            "http://i.imgur.com/MGQSXb1.jpg",
            "http://i.imgur.com/nyv8gOD.jpg",
            "http://i.imgur.com/kzr9p5M.jpg",
            "http://i.imgur.com/nBTPbty.jpg",
                "http://i.imgur.com/VvLI4sY.jpg"
                
        };
        
        BufferedReader buffreader;
        BufferedReader buffreader2;
        try {
            
            //File file = new File("filename_sunday_sus.txt");
            
            //InputStream fis = new FileInputStream("sunday_suspense.txt");     
            InputStream fis = new FileInputStream("filename_sunday_sus.txt");  
            InputStream fis2 = new FileInputStream("filename_sunday_sus_name.txt");  
            // if file the available for reading
            if (fis != null) {

                // prepare the file for reading
                InputStreamReader chapterReader = new InputStreamReader(fis);
                buffreader = new BufferedReader(chapterReader);

                InputStreamReader chapterReader2 = new InputStreamReader(fis2);
                buffreader2 = new BufferedReader(chapterReader2);

                String songPath = null;
                String songName = null;

                String url = "{\"songList\":[";

                songID = 0;

                artist = "Sunday Suspense";
                composer = "Radio Misri";

                Random r = new Random();

                while(true)
                {     

                      songPath = buffreader.readLine();
                      songName = buffreader2.readLine();

                      if(songPath == null) break;

                      imageUrl = urlImage[r.nextInt(7)];

                      url += "{\"songID\":\""+songID+"\", \"title\":\""+(songID+1)+"-"+songName +"\", \"artist\":\""+artist+ "\", \"path\":\""+songPath+ "\", \"albumId\":\""+albumID+ "\", \"composer\":\""+composer+ "\", \"imageUrl\":\""+imageUrl +"\"},";

                      songID++;

                }
                url = url.substring(0, url.length()-1) + "]}";
              
                System.out.println(""+url);
              
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
        } catch (Exception e) {
            
        } finally {
            
        }

    }

    
}
