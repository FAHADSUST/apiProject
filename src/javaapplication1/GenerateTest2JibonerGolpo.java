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
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 *
 * @author Fahad-PC
 */
public class GenerateTest2JibonerGolpo {
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
        ArrayList<String> songList = new ArrayList<>();
        static ArrayList<String> songPath = new ArrayList<>();
        
    //http://dl.bhoot-fm.com/Bhoot-FM_2016-10-28_(Bhoot-FM.com).mp3
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffreader = null;
        try {
            // open the file for reading
            InputStream fis = new FileInputStream("api_jibon/Jiboner_Golpo.txt");
            
            

            // if file the available for reading
            if (fis != null) {

              // prepare the file for reading
              InputStreamReader chapterReader = new InputStreamReader(fis);
              buffreader = new BufferedReader(chapterReader);
              
              String line = null;
              while(true)
              {     try{
                    line = buffreader.readLine();
                    
                    }catch(Exception e)
                    {

                    }

                    if(line == null) break;
                    songPath.add(line);
            
              }

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

        String[] monthStr2 = {"Jan",      
            "Feb",
            "Mar",        
            "Apr",        
            "May",          
            "Jun",         
            "Jul",         
            "Aug",       
            "Sep",    
            "Oct",      
            "Nove",     
            "Dec"};
        
        String[] monthStr = {"January",      
            "February",
            "March",        
            "April",        
            "May",          
            "June",         
            "July",         
            "August",       
            "September",    
            "October",      
            "November",     
            "December"};
        
        String[] urlImage = {
            "https://i.imgur.com/VAwVL2V.jpg",
            "https://i.imgur.com/bvWyY1t.jpg",
            "https://i.imgur.com/VAwVL2V.jpg",
            "https://i.imgur.com/bvWyY1t.jpg",
            "https://i.imgur.com/VAwVL2V.jpg",
            "https://i.imgur.com/bvWyY1t.jpg",
                "https://i.imgur.com/VAwVL2V.jpg"
                
        };
        
        List<DateTime> fridays = new ArrayList<>();
        boolean reachedAFriday = false;
        
        String start = "12/08/2010";
        String end = "01/02/2011";
        DateTimeFormatter pattern = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime startDate = new DateTime(2018, 03, 16, 0, 0, 0, 0);//pattern.parseDateTime(start); // year-month-day
        DateTime endDate = new DateTime(2010, 1, 1, 0, 0, 0, 0);//pattern.parseDateTime(end);

        

        int startRange = 0;
        int yearID = 0;
        int albumID = 0;
        int songID = 0;
        int episodeNumber = 303;
        String url = "{\"albumList\":[";
        String prevYear = "";
        
        Random r = new Random();
        int i1 = (r.nextInt(80) + 65);
        while (startDate.isAfter(endDate)){
            if(songID >= episodeNumber) break;
            String dayOfYaer = ""+startDate.getYear();
            
            if(!prevYear.equals(dayOfYaer))
            {
                url += "{\"yearID\":\""+yearID+"\", \"yearName\":\"" +"YEAR-"+dayOfYaer +"\", \"monthList\":[";
                prevYear = ""+startDate.getYear();
                yearID++;
            }
            
                String dayOfMonth = ""+monthStr[startDate.getMonthOfYear()-1];
                url += "{\"albumID\":\""+albumID+"\", \"albumName\":\"" +""+dayOfMonth +"\", \"songList\":["; //+"Month-"+startDate.dayOfMonth() +"\"},";
                //System.out.println("fahad -- "+ (startDate.getDayOfMonth()-1));
                if(startRange == 0) startRange = songID;
                while((monthStr[startDate.getMonthOfYear()-1]).equals(dayOfMonth))
                {
                    if(songID >= episodeNumber) break;
                    if ( startDate.getDayOfWeek() == DateTimeConstants.WEDNESDAY ){
                        fridays.add(startDate);
                        reachedAFriday = true;
                        
                        
                        
                        String MothWithTwoDigit = String.format("%02d", startDate.getMonthOfYear());
                        String dateWithTwoDigit = String.format("%02d", startDate.getDayOfMonth());
                        
                        String date = startDate.getYear()+"-" + MothWithTwoDigit+ "-" + dateWithTwoDigit;
                        String EpisodesName = "Ep-" + dateWithTwoDigit + " " + monthStr2[startDate.getMonthOfYear()-1] + "," + startDate.getYear();
                        if(songID == 0) EpisodesName = "(New)"+EpisodesName;
                        
                        path = songPath.get(episodeNumber-songID-1);//"http://dl.bhoot-fm.com/Bhoot-FM_"+date+"_(Bhoot-FM.com).mp3";
                        
                        String performaerName = "";
                        if(path!=null)
                        {
                            System.out.println("" + path);
                    
                            String splitedName[] = path.split("-");

                            performaerName = splitedName[splitedName.length-1].substring(0, splitedName[splitedName.length-1].length()-17);
                             EpisodesName = EpisodesName+ "-" + performaerName;
                        }
                        
                        artist = "Jiboner Golpo";
                        composer = "ABC-Radio";
                        imageUrl = urlImage[r.nextInt(7)];//"http://3.bp.blogspot.com/-nd09lbpK1Mk/U7hkntBHF4I/AAAAAAAAAM8/FFsAfjT9tW8/s1600/bhoot.jpg";

                        url += "{\"songID\":\""+songID+"\", \"title\":\""+EpisodesName +"\", \"artist\":\""+artist+ "\", \"path\":\""+path+ "\", \"albumId\":\""+albumID+ "\", \"composer\":\""+composer+ "\", \"imageUrl\":\""+imageUrl +"\"},";
                        
                        songID++;
                    }
                    if ( reachedAFriday ){
                        startDate = startDate.minusWeeks(1);
                    } else 
                    {
                        startDate = startDate.minusDays(1);
                    }
                  
                    System.out.println("fahad -- "+ (startDate.getDayOfMonth()-1));
                }
                
                
                
                albumID++;
                url = url.substring(0, url.length() - 1) +"], \"songListRange\":\""+startRange +"-"+ (songID-1) +"\"},";
                
                startRange = 0;
                
                if(!prevYear.equals(""+startDate.getYear()))
                {
                    url = url.substring(0, url.length() - 1) +"]},";
                    //prevYear = dayOfYaer;
                }
        }
        
        url = url.substring(0, url.length() - 1) +"]}]}";//]}
        System.out.println(url);
        
        File file = new File("api_jibon/filename_jiboner_golpo.json");

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
