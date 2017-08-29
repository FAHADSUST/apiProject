/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import static javaapplication1.GenerateTest2DK.artist;
import static javaapplication1.GenerateTest2DK.imageUrl;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONArray;
import org.json.JSONObject;

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
            File file = new File("radio_sunday_sus/filename_sunday_sus_name_rep.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            //InputStream fis = new FileInputStream("sunday_suspense.txt");     
            InputStream fis = new FileInputStream("radio_sunday_sus/filename_sunday_sus_rep.txt");
            // if file the available for reading
            if (fis != null) {

                // prepare the file for reading
                InputStreamReader chapterReader = new InputStreamReader(fis);
                buffreader = new BufferedReader(chapterReader);

                String line = null;
                while (true) {
                    try {
                        line = buffreader.readLine();
                        String segment = line.substring(46);//33
                        String fin = segment.substring(0, segment.length() - 4);
                        fin = fin.replace("_", " ");
                        fin = fin.replace("-", " ");
                        fin = fin.replace("%28", "");
                        fin = fin.replace("%27", "");
                        fin = fin.replace("%29", "");
                        bw.write(fin + "\n");

                    } catch (Exception e) {

                    }

                    if (line == null) {
                        break;
                    }

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
        if (abc) {
            return;
        }
    }

    private static void encryptAndWriteToFile() {

        String[] urlImage = {
            "http://i.imgur.com/38j0K51.png",
            "http://i.imgur.com/NPUTTlR.png",
            "http://i.imgur.com/dO9BzMU.png",
            "http://i.imgur.com/i2Z2Kdx.png",
            "http://i.imgur.com/Y42hBNW.jpg",
            "http://i.imgur.com/l8aYI2s.png",
            "http://i.imgur.com/GxiKKME.png"

        };

        String[] urlAppName = {
            "Jiboner Golpo Collection",
            "Bhoot FM Collection",
            "Rohosyo Romancho Ghost Story",
            "Aloukik Robbar",
            "Kuasha Collection",
            "Dor Collection",
            "Sunday Suspense Collection"
        };

        String[] urlAppPackageName = {
            "com.studio71.jiboner_golpo_collection",
            "com.crossappers.bhootfm_collection",
            "com.studio71.rohosyo_romancho_ghost",
            "com.studio71.aloukik_robbar",
            "com.studio71.kuasha_collection",
            "com.studio71.dor_collection",
            "com.studio71.sunday_suspense"
        };

        ArrayList<AppData> appList = new ArrayList<>();
        for (int i = 0; i < urlAppName.length; i++) {
            appList.add(new AppData(i, urlAppName[i], urlAppPackageName[i], urlImage[i]));
        }

        InputStream fis = null;
        try {
            fis = new FileInputStream("filename_sunday_sus_main.txt");

            if (fis != null) {
                
                

                InputStreamReader chapterReader = new InputStreamReader(fis);
                BufferedReader buffreader = new BufferedReader(chapterReader);
                String fullData = "";

                while (true) {
                    String tempData = buffreader.readLine();
                    if (tempData == null) {
                        break;
                    }
                    
                    fullData += tempData;
                }
                
                JSONObject jsonObject = new JSONObject(fullData);
                JSONArray jsonArraySong = jsonObject.getJSONArray("songList");
               
                String songJson = jsonArraySong.toString();
                byte[] compressedByte = compress(jsonArraySong.toString());
                String compressedFullData = Base64.getEncoder().encodeToString(compressedByte);

                compressedByte = compress(new Gson().toJson(appList));
                String appListCompressedFullDta = Base64.getEncoder().encodeToString(compressedByte);

                Data data = new Data("118", compressedFullData, appListCompressedFullDta);

                
                File file = new File("radio_sunday_sus/filename_sunday_sus_main_2.json");

                
                
                if (!file.exists()) {
                    file.createNewFile();
                   
                }
                
                

                FileWriter fw = new FileWriter(file.getPath());
                System.out.println("write 6" );
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(new Gson().toJson(data));
                bw.close();
                
                System.out.println("write " + new Gson().toJson(data));
            }

        } catch (FileNotFoundException ex) {
            System.out.println("write 3");
        } catch (IOException ex) {
            System.out.println("write 2");
        }
        
        System.out.println("write 1");

    }

    private static void findTheOriginalUrl() {
        try{
        File file = new File("radio_sunday_sus/filename_sunday_sus_orig_url.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            //InputStream fis = new FileInputStream("sunday_suspense.txt");     
            InputStream fis = new FileInputStream("sunday_outputfileName64.txt");
            // if file the available for reading
            if (fis != null) {

                // prepare the file for reading
                InputStreamReader chapterReader = new InputStreamReader(fis);
                BufferedReader buffreader = new BufferedReader(chapterReader);

                String line = null;
                while (true) {
                    try {
                        line = buffreader.readLine();
                    } catch (Exception e) {

                    }

                    if (line == null) {
                        break;
                    }
                    
                    
                    System.out.println("fake: " + line);
                    String url = getFinalURL(line);
                    System.out.println("url " + url);
                    bw.write(url + "\n");

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
               System.out.println("" + e.toString());
        } finally {

        }
    }
    
    public static String getFinalURL(String url) throws IOException {
    HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
    con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

    con.setInstanceFollowRedirects(false);
    con.connect();
    con.getInputStream();

    if (con.getResponseCode() == HttpURLConnection.HTTP_MOVED_PERM || con.getResponseCode() == HttpURLConnection.HTTP_MOVED_TEMP) {
        String redirectUrl = con.getHeaderField("Location");
        return getFinalURL(redirectUrl);
    }
    return url;
}

    ArrayList<String> songList = new ArrayList<>();
    static ArrayList<String> songPath = new ArrayList<>();

    //http://dl.bhoot-fm.com/Bhoot-FM_2016-10-28_(Bhoot-FM.com).mp3
    public static void main(String[] args) throws IOException {

        //readFile();
        encryptAndWriteToFile();
        //findTheOriginalUrl();
        
        if(true) return;

        String[] urlImage = {
            "http://i.imgur.com/DMmPf5f.jpg",
            "http://i.imgur.com/8C3N9lN.jpg",
            "http://i.imgur.com/LGsUamV.jpg",
            "http://i.imgur.com/DrWxBD3.jpg",
            "http://i.imgur.com/kzr9p5M.jpg",
            "http://i.imgur.com/X4pn6lX.jpg",
            "http://i.imgur.com/VvLI4sY.jpg"

        };

        BufferedReader buffreader;
        BufferedReader buffreader2;
        try {

            //File file = new File("filename_sunday_sus.txt");
            //InputStream fis = new FileInputStream("sunday_suspense.txt");     
            InputStream fis = new FileInputStream("sunday_outputfileName_url_bangla.txt");
            InputStream fis2 = new FileInputStream("sunday_outputfileName_name_bangla.txt");
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

                while (true) {

                    songPath = buffreader.readLine();
                    songName = buffreader2.readLine();
                    
                    if (songPath == null) {
                        break;
                    }
                    
                    songName = songName.replace("SS", "");
                    songName = songName.replace("64ks", "");
                    songName = songName.replace(".mp3", "");


                    imageUrl = urlImage[r.nextInt(7)];

                    url += "{\"songID\":\"" + songID + "\", \"title\":\"" + (songID + 1) + "-" + songName + "\", \"artist\":\"" + artist + "\", \"path\":\"" + songPath + "\", \"albumId\":\"" + albumID + "\", \"composer\":\"" + composer + "\", \"imageUrl\":\"" + imageUrl + "\"},";

                    songID++;

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
        } catch (Exception e) {
                System.out.println("exception " +e.toString());
        } finally {

        }

    }

    public static byte[] compress(String data) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length());
        GZIPOutputStream gzip = new GZIPOutputStream(bos);
        gzip.write(data.getBytes());
        gzip.close();
        byte[] compressed = bos.toByteArray();
        bos.close();
        return compressed;
    }

}
