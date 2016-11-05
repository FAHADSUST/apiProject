/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 *
 * @author Fahad-PC
 */
public class GenerateTest {
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
        ArrayList<String> songList = new ArrayList<>();
        
    //http://dl.bhoot-fm.com/Bhoot-FM_2016-10-28_(Bhoot-FM.com).mp3
    public static void main(String[] args) throws IOException
    {
        String start = "08/06/2011";
        String end = "12/09/2012";
        DateTimeFormatter pattern = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime startDate = pattern.parseDateTime(start);
        DateTime endDate = pattern.parseDateTime(end);

        List<DateTime> fridays = new ArrayList<>();
        boolean reachedAFriday = false;
        
        /*String url = "{\"episodeList\":[";
        
        while (startDate.isBefore(endDate)){
            if ( startDate.getDayOfWeek() == DateTimeConstants.FRIDAY ){
                fridays.add(startDate);
                reachedAFriday = true;
                
                String date = startDate.getYear()+"-" + startDate.getMonthOfYear()+ "-" + startDate.getDayOfMonth();
                String urlTemp = "http://dl.bhoot-fm.com/Bhoot-FM_"+date+"_(Bhoot-FM.com).mp3";
                
                url += "{\"fileName\":\""+"Episode-"+date+"\", \"url\":\""+urlTemp +"\"},";
                
            }
            if ( reachedAFriday ){
                startDate = startDate.plusWeeks(1);
            } else {
                startDate = startDate.plusDays(1);
                
                
            }
            
        }*/
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
        
        int startRange = 0;
        int albumID = 0;
        int songID = 0;
        String url = "{\"albumList\":[";
        
        while (startDate.isBefore(endDate)){
                String dayOfMonth = ""+monthStr[startDate.getMonthOfYear()-1];
                url += "{\"albumID\":\""+albumID+"\", \"albumName\":\"" +"Month-"+dayOfMonth +"\", \"songList\":["; //+"Month-"+startDate.dayOfMonth() +"\"},";
                //System.out.println("fahad -- "+ (startDate.getDayOfMonth()-1));
                if(startRange == 0) startRange = songID;
                while((monthStr[startDate.getMonthOfYear()-1]).equals(dayOfMonth))
                {
                    if ( startDate.getDayOfWeek() == DateTimeConstants.FRIDAY ){
                        fridays.add(startDate);
                        reachedAFriday = true;

                        String date = startDate.getYear()+"-" + startDate.getMonthOfYear()+ "-" + startDate.getDayOfMonth();
                        path = "http://Bhoot-FM_"+date+"_(Bhoot-FM.com).mp3";
                        artist = "";
                        composer = "";
                        imageUrl = "http://i.dailymail.co";
                        

    //                    String path;
    //	long duration;
    //	long albumId;
    //	String composer;
    //        String imageUrl;

                        url += "{\"songID\":\""+songID+"\", \"title\":\"Episode-"+date +"\", \"artist\":\""+artist+ "\", \"path\":\""+path+ "\", \"albumId\":\""+albumID+ "\", \"composer\":\""+composer+ "\", \"imageUrl\":\""+imageUrl +"\"},";
                        
                        songID++;
                    }
                    if ( reachedAFriday ){
                        startDate = startDate.plusWeeks(1);
                    } else {
                        startDate = startDate.plusDays(1);
                    }
                  
                    System.out.println("fahad -- "+ (startDate.getDayOfMonth()-1));
                }
                
                
                
                albumID++;
                url = url.substring(0, url.length() - 1) +"], \"songListRange\":\""+startRange +"-"+ (songID-1) +"\"},";
                
                startRange = 0;
            
        }
        
        url = url.substring(0, url.length() - 1) +"]}";
        System.out.println(url);
        
        File file = new File("C:\\Users\\Fahad-PC\\Documents\\NetBeansProjects\\JavaApplication1\\filename.txt");

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
