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
public class GenerateTest2Rohosho {
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
        songPathList = new ArrayList(Arrays.asList(new String[] { "http://www.mediafire.com/file/852mt4n7tb78b63/Abhabito-%28By-Dr.-Arun-Kumar-Dutta%29%2C-2-Dragon-Mukhosh-%28By-Himadri-Kishore-Dasgupta%29.mp3", "http://www.mediafire.com/file/a4tlb0w6zkenwsm/Abhisapto_Haat_by_Ananda_Bagchi.mp3", "http://www.mediafire.com/file/k1vtsuibptqtlu7/Aj-Komondoler-Fashi.mp3", "http://www.mediafire.com/file/q177r4yabaavs77/Alfas-Bertino_-_Narayan-Chakraborty-And-A-Scandal-In-Bohemia_-_Sherlock-Homes.mp3", "http://www.mediafire.com/file/nqxpfer50c63fjj/Alobabu-O-Hirer-Tukro-Bonoful.mp3", "http://www.mediafire.com/file/abnvh82ge3bxakn/Amala_By_Bimal_Kar_and_Ekti_Haspatale_Jonmo_Ebong_Mrityu_By_Ramapada.mp3", "http://www.mediafire.com/file/4s3hua62pe6etpe/Amanushik-Haat.mp3", "http://www.mediafire.com/file/il0vhh5ckdihbwe/Amar-Kanna-O-Adhare-Sap-Chole.mp3", "http://www.mediafire.com/file/b5wbwjkedmoqadz/Amar-Pratham-Mokkel-%28By-Partha-Chattapadhyay%29%2C-2-Blood-%28By-LCS-Apson%29.mp3", "http://www.mediafire.com/file/a2hc57jkurru1vv/Antoral.mp3", "http://www.mediafire.com/file/6nkli2tlm71sci8/Arokto-Rajanir-Por.mp3", "http://www.mediafire.com/file/umksxyfwxxxnvhz/Asbe-Ki-Ar-Phire.mp3", "http://www.mediafire.com/file/iv0p0vw3v7km4a6/Asruto-Shabdo-%28The-Sound-Machine-By-Roald-Dahl%29.mp3", "http://www.mediafire.com/file/s99mr2ad4oa94ya/Belun-Pahar.mp3", "http://www.mediafire.com/file/bfmb0dbkdf0a5eb/Bhogobaner-Hath.mp3", "http://www.mediafire.com/file/j2zjy8mp74d3skw/Bijoya_Doshomi_By_Sumitra_Ghatak.mp3", "http://www.mediafire.com/file/zvjj78x9pb1e044/Biloy-Bindu.mp3", "http://www.mediafire.com/file/893vawfv1rj19l6/Chabi-Ebong-Badla.mp3", "http://www.mediafire.com/file/34qbkm7k5vt7fkj/Chadyobeshi-Phool.mp3", "http://www.mediafire.com/file/jh28d92v21n550s/Chhader-Bagan-%26-Trimatrik.mp3", "http://www.mediafire.com/file/i8adtd8wq9hcadn/Chhoto-Daan-Haat_-_Abhijnan-Roychowdhury.mp3", "http://www.mediafire.com/file/5xfy0ma5rfvn56g/Chithi.mp3", "http://www.mediafire.com/file/rakakda29aa416z/Chokhi_-_Tilottama-Majumder.mp3", "http://www.mediafire.com/file/mqddi2e1e10gql0/Cycle.mp3", "http://www.mediafire.com/file/uh21wwup1s5x542/Daityer-Bagane-Sishu.mp3", "http://www.mediafire.com/file/s3n6hrdescjup1x/Dansagar-%28By-Bani-Basu%29.mp3", "http://www.mediafire.com/file/0pni1ptf846ccfy/Dhar.mp3", "http://www.mediafire.com/file/wk738iverlde3s4/Dhongsho-Beej-%28By-Ajay-Holmes%29-And-Tokhon-Bikel-%28By-Rituparno%29.mp3", "http://www.mediafire.com/file/df03f98rs8hb0fq/Dolonkumar.mp3", "http://www.mediafire.com/file/1yw5eyo28i2rsx3/Durghotona_-_Sudipta-Bhoumik.mp3", "http://www.mediafire.com/file/9i25tt739nj955l/Ebar-Shunyo-%28By-J.G.-Ballard%29.mp3", "http://www.mediafire.com/file/d9mtwovsguc7dwd/Ek_Ekta_Din_Onyorokom_By_Sunil_Ganguly.mp3", "http://www.mediafire.com/file/zcu7z6wqt8hvhvc/Ekti-Premer-Golpo.mp3", "http://www.mediafire.com/file/ok452s3zgjf693v/Golito-Sukh-%28By-Moti-Nandi%29.mp3", "http://www.mediafire.com/file/5cqdgu5uv3wq8kn/Goyenda-Oporadhi.mp3", "http://www.mediafire.com/file/9b4ec0dpq9jq44l/Hashi_By_Dr._Amitava_and_Suicide_Note_By_Prasanta.mp3", "http://www.mediafire.com/file/o5wneajq3a9bn6v/Herculis_By_Sukumar_Ray.mp3", "http://www.mediafire.com/file/6px627ectax5avc/Inbox-Empty.mp3", "http://www.mediafire.com/file/l63d2yzmf2744co/Jabonikar_Arale_By_Kajali_Basu.mp3", "http://www.mediafire.com/file/5w9hkc7h46ibg5y/Jonmodiner_Raat_By_Nachiketa.mp3", "http://www.mediafire.com/file/eowhvhjdhjec0a8/Kalo-Bagh.mp3", "http://www.mediafire.com/file/8ux1d0dg3a0pfmh/Kalo-Beral_-_Bibhutibhushan-Chakraborty.mp3", "http://www.mediafire.com/file/82s4pcz3w9awdar/Kanden_Hotya_Mamla_By_R._Austin_Freeman.mp3", "http://www.mediafire.com/file/rp9u0rycja458c9/Khonj_By_Sukanta_Gangapadhay_and_Obyakto_By_Amitabha.mp3", "http://www.mediafire.com/file/z0p3oa91do1l3uc/Khudito-Pashan.mp3", "http://www.mediafire.com/file/h2me27pys91o8x9/Khun-Khun-Khela.mp3", "http://www.mediafire.com/file/i95s6i1gp2yl8hb/Knacher-Chhobi.mp3", "http://www.mediafire.com/file/0fhga98482q6ahu/Last-Traine-Raat-11tay_-_Sourav-Mukhapadhyay.mp3", "http://www.mediafire.com/file/xya1d7ba2nvkj4d/Monihara.mp3", "http://www.mediafire.com/file/bi2spgrw92uew1z/Mrityu-Shital-Bandhu-%28Saikat-Mukhapadhay%29.mp3", "http://www.mediafire.com/file/eb5i4nwm2b8l4ft/Namti-Tar-Chaya-%28By-Manjil-Sen%29%2C-2-Dwitio-Bibor-%28By-James-Holding%29.mp3", "http://www.mediafire.com/file/bncg99tptb4f9yu/Nil-Rumal.mp3", "http://www.mediafire.com/file/lsqb9va2lj2aw5k/Nonigopaler-Biye_-_Prosenjit-Banerjee-%2813.01.2013%29.mp3", "http://www.mediafire.com/file/ecoypcbun11gf1i/Onek-Durer-Bandhu-%28By-Tridib-Chattapadhyay%29%2C-2-Nonigopaler-Golpo-%28By-Prosenjit-Bandapadhyay%29.mp3", "http://www.mediafire.com/file/ut2i5sj7925fqtt/Ordhek-Kalpona.mp3", "http://www.mediafire.com/file/wpwiyog0axi6c1o/Palatak-Tufan-And-Choto-Rajar-Poshhu.mp3", "http://www.mediafire.com/file/2i874b92uo4aa7h/Parasar-Burma-O-Kabitar-Ghanta.mp3", "http://www.mediafire.com/file/vlg44xli074cac1/Pesha_By_Bhabani_Mukhapadhay_and_Ronokhetre_Subal_By_Pradip_Acharjee.mp3", "http://www.mediafire.com/file/c8350odxc7c8vn9/Philomel_Cottage_By_Agatha_Christie.mp3", "http://www.mediafire.com/file/8ighttct6cbsxc8/Phooler-Modhe-Sanp.mp3", "http://www.mediafire.com/file/pvi3ba3p8cfdk11/Potkan-Paloyan-O-Kalo-Hath.mp3", "http://www.mediafire.com/file/50xgshzdhxq6z5e/Pragoitihashik.mp3", "http://www.mediafire.com/file/3r6k10qnp1i12wy/Premer_Trikone_Porasor_Borma_By_Premendra_Mitra.mp3", "http://www.mediafire.com/file/7od31cji66m1p4z/Raater-Traine-Eka-And-Jonmodiner-Upohar.mp3", "http://www.mediafire.com/file/umwydajwaaa0kb4/Rahu-Mukti_Rohoshyo-Romancho%2825.08.2013%29.mp3", "http://www.mediafire.com/file/6r2ap9jb6ac9pu6/Raktomukhi-Neela.mp3", "http://www.mediafire.com/file/td28dslmictq1d9/Ranur-Bhanudada.mp3", "http://www.mediafire.com/file/7lg36hj9ruz3i6x/Rohoshyo-Er-Arale-Sumitra-Gangopadhyay.mp3", "http://www.mediafire.com/file/maifrl6mla9a6m8/Rosayone-Kabbo_-_Moni-Barma.mp3", "http://www.mediafire.com/file/1tvvinl281cmdnv/Rupoli-Rokto.mp3", "http://www.mediafire.com/file/8qbiiwicmcr96e2/Sachokhye-Dekha_-_Pranab-Ray.mp3", "http://www.mediafire.com/file/sbsastmm17n682a/Sakkhi-%28By-Helen-Nelson%29.mp3", "http://www.mediafire.com/file/652xcyk64sbj9ve/Sanaktokaran-By-Seema-Bol.mp3", "http://www.mediafire.com/file/8ngw4hz83d6zmq8/Sanket-%28By-Santosh-Chattapadhyay%29%2C-2-Diary-%28By-Swapan-Bandapadhyay%29.mp3", "http://www.mediafire.com/file/246a8f238f9219g/Sanp-Prothom-Golpo.mp3", "http://www.mediafire.com/file/55hwht41m14dcwu/Saper-Hachi.mp3", "http://www.mediafire.com/file/rj967fc0ky36iz7/Sati_Sobhona_By_Pachkori_De.mp3", "http://www.mediafire.com/file/1g9a6tnzr2adpol/Satyameva-2nd-Part.mp3", "http://www.mediafire.com/file/08828uuk0ps613x/Satyameva-Jayate-1.mp3", "http://www.mediafire.com/file/88e6dm4u1a0dk75/Sei_Ratey_By_Trideb_Chattapadhay_and_Ansidar_By_Sanjib_Chattapadhay.mp3", "http://www.mediafire.com/file/o63c7kbx6pxp5dg/Shasti.mp3", "http://www.mediafire.com/file/9x0x4qsumubhzx6/Shimana_Periye-Rupali_Gangopadyay.mp3", "http://www.mediafire.com/file/wqed72rupr5s2pk/Shunyo-%28By-Humayun-Ahmed%29-Part-1.mp3", "http://www.mediafire.com/file/6yz3i24171i72d8/Shunyo-%28By-Humayun-Ahmed%29-Part-2.mp3", "http://www.mediafire.com/file/dfdle29hqgxy535/Shunyo-%28By-Humayun-Ahmed%29-Part-3-%28End%29.mp3", "http://www.mediafire.com/file/d2y8nbcrar39dxc/Subho-Drishti-O-Nila.mp3", "http://www.mediafire.com/file/1m322p4836a3b1k/Sulekha-Krondon%2C2-CheleMeye%2C3-Chandrayaan-And-4-Ghotona-%28By-Bonoful%29.mp3", "http://www.mediafire.com/file/1h56vy41xsw443b/The_Sound_Machine_by_Roald_Dahl.mp3", "http://www.mediafire.com/file/8c39d445h5bppvj/The-Final-Problem_-_%28Sherlock-Homes%29.mp3", "http://www.mediafire.com/file/uaw22mzb2v32k9e/Top.mp3", "http://www.mediafire.com/file/9dkcinmvx57nu0n/Trimatrik-Sonali_Mukhopadhyay.mp3", "http://www.mediafire.com/file/lzg6l1fsb32cs3x/Tumi_Jano_Na_By_Amalendu_Samui.mp3", "http://www.mediafire.com/file/il9inm21f0oxcuq/Tumi_Ki_Keboli_Chobi_By_Ranjan_Bandhapadhay.mp3" }));
  
        
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

            artist = "Rohosho Romanch";
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

            File file = new File("filename_rohosho_romanch.json");

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
