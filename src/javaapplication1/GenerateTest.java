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
import java.util.Random;
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
        String end = "12/09/2017";
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
        
        String[] urlImage = {
            "http://4.bp.blogspot.com/-JDDjeX6ztiI/U6mn3-Of7wI/AAAAAAAAAMY/km3eACuT75E/s1600/10353101_10152170733466198_3664008163153667484_n.jpg",
            "http://1.bp.blogspot.com/-mOoVlytvSO4/U5R6WUqPyyI/AAAAAAAAAME/w86DL6W-5U8/s1600/bhoor.png",
            "http://4.bp.blogspot.com/-ApR82yhT6eo/U4oZs3VcMDI/AAAAAAAAAL0/l4eQemQ26rk/s1600/10402652_10152125506826198_7227367506852786682_n.png",
            "http://1.bp.blogspot.com/-jzvDBPis4dY/U4C53NEbfEI/AAAAAAAAALg/cIxl6SsBmro/s1600/10294396_10152110699576198_368137538809996710_n.png",
            "http://1.bp.blogspot.com/-nSyx3AJjll4/U90uefa7v1I/AAAAAAAAAR0/lFwzByGARbc/s1600/10570336_10152239132836198_457328953715149642_n.png",
            "http://4.bp.blogspot.com/-dRn5FYub6aI/U-Xetj4LqII/AAAAAAAAAS8/-7CrGGGUxbU/s1600/10600476_10152259517716198_5193933554537289877_n.png",
                "https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.tellychakkar.com%2Fsites%2Fwww.tellychakkar.com%2Ffiles%2Fstyles%2Fdisplay_665x429%2Fpublic%2Fimages%2Fstory%2F2013%2F11%2F02%2Fbhoot.jpg%3Fitok%3DQpOlzrls&imgrefurl=http%3A%2F%2Fwww.debate.org%2Fdebates%2FDo-Jinn-Churail-and-Bhoot-exist%2F1%2F&docid=1ZCBOvVU6HhIhM&tbnid=vsOv6cHwoyhy8M%3A&vet=1&w=650&h=429&bih=950&biw=1920&q=bhoot%20image&ved=0ahUKEwjz1N60poDSAhVGuY8KHSAyBqgQMwgtKAEwAQ&iact=mrc&uact=8#h=429&imgdii=wv3huFtM7muXYM:&imgrc=vsOv6cHwoyhy8M:&vet=1&w=650"
                
        };
        
        int startRange = 0;
        int yearID = 0;
        int albumID = 0;
        int songID = 0;
        String url = "{\"albumList\":[";
        String prevYear = "";
        
        Random r = new Random();
        int i1 = (r.nextInt(80) + 65);
        while (startDate.isBefore(endDate)){
            String dayOfYaer = ""+startDate.getYear();
            
            if(!prevYear.equals(dayOfYaer))
            {
                url += "{\"yearID\":\""+yearID+"\", \"yearName\":\"" +"YEAR-"+dayOfYaer +"\", \"monthList\":[";
                prevYear = ""+startDate.getYear();
                yearID++;
            }
            
                String dayOfMonth = ""+monthStr[startDate.getMonthOfYear()-1];
                url += "{\"albumID\":\""+albumID+"\", \"albumName\":\"" +"Month-"+dayOfMonth +"\", \"songList\":["; //+"Month-"+startDate.dayOfMonth() +"\"},";
                //System.out.println("fahad -- "+ (startDate.getDayOfMonth()-1));
                if(startRange == 0) startRange = songID;
                while((monthStr[startDate.getMonthOfYear()-1]).equals(dayOfMonth))
                {
                    if ( startDate.getDayOfWeek() == DateTimeConstants.FRIDAY ){
                        fridays.add(startDate);
                        reachedAFriday = true;
                        
                        String MothWithTwoDigit = String.format("%02d", startDate.getMonthOfYear());
                        String dateWithTwoDigit = String.format("%02d", startDate.getDayOfMonth());
                        
                        String date = startDate.getYear()+"-" + MothWithTwoDigit+ "-" + dateWithTwoDigit;
                        //http://dl.bhoot-fm.com/Bhoot-FM_2017-01-13_(Bhoot-FM.com).mp3
                        path = "http://dl.bhoot-fm.com/Bhoot-FM_"+date+"_(Bhoot-FM.com).mp3";
                        artist = "Bhoot-Fm";
                        composer = "Radio-Foorti";
                        imageUrl = urlImage[r.nextInt(7)];//"http://3.bp.blogspot.com/-nd09lbpK1Mk/U7hkntBHF4I/AAAAAAAAAM8/FFsAfjT9tW8/s1600/bhoot.jpg";

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
                
                if(!prevYear.equals(""+startDate.getYear()))
                {
                    url = url.substring(0, url.length() - 1) +"]},";
                    //prevYear = dayOfYaer;
                }
        }
        
        url = url.substring(0, url.length() - 1) +"]}]}";
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
