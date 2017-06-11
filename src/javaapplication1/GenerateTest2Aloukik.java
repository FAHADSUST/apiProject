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
import java.util.Arrays;
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
public class GenerateTest2Aloukik {
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
        
    static List<String> songPathList = null;
    static List<String> songNameList = null;
    private static void readFromStringArray() 
    {
        songNameList = new ArrayList<String>();
        songPathList = new ArrayList(Arrays.asList(new String[] { "http://www.mediafire.com/file/7yq4f37rmq3d89p/Accident-Priyonkar_Roychowdhury.mp3", "http://www.mediafire.com/file/0vacj6mxknups3c/Adbhut_Akorshon-Monorom_Guhothakurota.mp3", "http://www.mediafire.com/file/njf3v0om6yp2p94/Ahalya_Manjil.mp3", "http://www.mediafire.com/file/9mgm158p5uicom7/Ankita.mp3", "http://www.mediafire.com/file/wgnuvm54p0uouk1/Aschorjo_Coin.mp3", "http://www.mediafire.com/file/nzutplt6cb1mq3b/Bahurupi.mp3", "http://www.mediafire.com/file/14qv7dwkmihqnu1/Bhoy-Bamaprasad_Mukhapadhyay.mp3", "http://www.mediafire.com/file/uy7s05ee54lmr60/Bileter_Bhuture_Bari-Lila_Majumdar.mp3", "http://www.mediafire.com/file/606a154erl126zz/Caretaker-Chanda_Guha.mp3", "http://www.mediafire.com/file/9bc45rt8sk4ipa1/Chayamot-Anirudhra_Choudhyry.mp3", "http://www.mediafire.com/file/8nv3o1cayhjzoe2/Chitrakar.mp3", "http://www.mediafire.com/file/mss5x4bqtsfn1ws/Chitrangada.mp3", "http://www.mediafire.com/file/grl0sy3ekr7ae3k/Cycle.mp3", "http://www.mediafire.com/file/30cwfcpc330eocs/Daju.mp3", "http://www.mediafire.com/file/c8hszluv538ly96/Dhurjotibabur_Planchit-Himadrikishore_Dasgupta.mp3", "http://www.mediafire.com/file/22p8ns4qdjjcudc/Dibakar.mp3", "http://www.mediafire.com/file/hvzlk13m468ffbo/Doctor_Pakrashi_O_Nil_Phul.mp3", "http://www.mediafire.com/file/5x5p95yn0pq85i3/Dr._Pakrashi_R_Dragon_Aka_Ayna.mp3", "http://www.mediafire.com/file/dc6vthy64pdqhvh/Dr._Pakrashi-er_Aloukik_Bislashan.mp3", "http://www.mediafire.com/file/viewlm9yppxec9e/Ema.mp3", "http://www.mediafire.com/file/z8cqi8o7lxa5zs2/Gaach_Manobi.mp3", "http://www.mediafire.com/file/6wkcqftfsw51ydt/Ghaar_Beka_Bajna.mp3", "http://www.mediafire.com/file/0dfjnrcoci64o2q/Gogol_R_Baganbarir_Rahoshyomoy_Ghori.mp3", "http://www.mediafire.com/file/j9q99188f225akz/Haranath_er_Mrityu_Sakhi.mp3", "http://www.mediafire.com/file/dhxh2tf53etplr6/Jonmodin.mp3", "http://www.mediafire.com/file/e6j75886y340eic/Kaak.mp3", "http://www.mediafire.com/file/rlg5jvdud5258oq/Majraater_Call-Premendra_Mitra.mp3", "http://www.mediafire.com/file/apfl2c6t703mftc/Mithir_Ma.mp3", "http://www.mediafire.com/file/kvqq004cgnwari4/Mora_Katar_Bhoye.mp3", "http://www.mediafire.com/file/o51v3bmslozb5y6/Nirakarer_Kahini_By_Sasthipada_Chattopadhyay.mp3", "http://www.mediafire.com/file/wgtgac461ulxae0/Noksha.mp3", "http://www.mediafire.com/file/58d59dkah46qfkk/Rakhttaktto_Canvas-Amitava_Roychawdhary.mp3", "http://www.mediafire.com/file/xma3b9ezek0q913/Rater_Ashroy-Monoj_Basu.mp3", "http://www.mediafire.com/file/csot67gpguar159/Rohoshyomoy_Gari_Guli.mp3", "http://www.mediafire.com/file/cdeavgnxgj7uua5/Sada.Ghora.Anil.Bhoumik.mp3", "http://www.mediafire.com/file/7n8gs1wacyaoo8t/Santanu-er_Jonmodin.mp3", "http://www.mediafire.com/file/znf1qqs6c7q74f7/Shopoth-Pamela_Hansford_Johnson.mp3", "http://www.mediafire.com/file/2xg9aba8eiow75a/Swapno_Chikitsa.mp3", "http://www.mediafire.com/file/s166ysnst4t2sdg/Swarup_Babur_Bhul.mp3" }));
        int songID = 0;
        while(songID<songPathList.size())
        {     
            try{
                String line = songPathList.get(songID);
                String segment = line.substring(46);//33
                String fin = segment.substring(0,segment.length()-4);
                fin = fin.replace("_", " ");
                fin = fin.replace("-", " ");
                fin = fin.replace("%28", "");
                fin = fin.replace("%27", "");
                fin = fin.replace("%29", "");
                
                songNameList.add(fin);

              }catch(Exception e)
              {

              }
            
            songID++;

        }    
    }
    
    public static void main(String[] args) throws IOException
    {
        
        //readFile();
        readFromStringArray();
        
        String[] urlImage = {
            "http://i.imgur.com/DMmPf5f.jpg",
            "http://i.imgur.com/8C3N9lN.jpg",
            "http://i.imgur.com/MGQSXb1.jpg",
            "http://i.imgur.com/nyv8gOD.jpg",
            "http://i.imgur.com/kzr9p5M.jpg",
            "http://i.imgur.com/nBTPbty.jpg",
                "http://i.imgur.com/VvLI4sY.jpg"
                
        };
        
        try {

            String songPath = null;
            String songName = null;

            String url = "{\"songList\":[";

            int songID = 0;

            artist = "Aloukik Robbar";
            composer = "friends fm 91.9";

            Random r = new Random();

            while(songID < songPathList.size())
            {     

                  songPath = songPathList.get(songID);
                  songName = songNameList.get(songID);

                  if(songPath == null) break;

                  imageUrl = urlImage[r.nextInt(7)];

                  url += "{\"songID\":\""+songID+"\", \"title\":\""+(songID+1)+"-"+songName +"\", \"artist\":\""+artist+ "\", \"path\":\""+songPath+ "\", \"albumId\":\""+albumID+ "\", \"composer\":\""+composer+ "\", \"imageUrl\":\""+imageUrl +"\"},";

                  System.out.println("fahaad " + url);
                  songID++;

            }
            url = url.substring(0, url.length()-1) + "]}";

            System.out.println(""+url);

            File file = new File("filename_aloukik_robbar.json");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                    file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(url);
            bw.close();

            System.out.println("Done");


            
        } catch (Exception e) {
            
        } finally {
            
        }

    }

    
}
