/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Stream;

/**
 *
 * @author Fahad-PC
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public JavaApplication1(){
        Solution sl = new Solution();
        int j=0;
        for(int i=j+1; i<5 ; i++)
        {
            
            sl.subset(j, i);
            System.out.println("");
            j++;
        }
        
        
        /*Scanner sc  = new Scanner(System.in);
        
        int[] nums = {1,2,3,4,5,6,7}; //9534330
        int i = 0;
        
        /*
        [824,938,1399,5607,6973,5703,9609,4398,8247]
        Output:
        "9609938824782469735703560743981399"
        Expected:
        "9609938824824769735703560743981399"
        "9609938824782469735703560743981399"
        */
//        while(i<5){
//            int n = sc.nextInt();
//            
//            
//            //else System.out.println("Not happy");
//            nums[i++] = n;
////            if(sl.isUgly(n))
////                System.out.println("ugly: ");
////            else System.out.println("NOT ugly: ");
//            
//        }
        //sl.rotate(nums, 3);
        //System.out.println("mid: "+ (sl.rotate(nums, 3)));
        //System.out.println("answer: " + sl.singleNumber(nums));
        
        
        /*LRUCache l = new LRUCache(2);
        //2,[set(2,1),set(2,2),get(2),set(1,1),set(4,1),get(2)]
//        l.set(2,1);
//        l.set(2,2);
//        System.out.println(" "+ l.get(2));
//        l.set(1,1);
//        l.set(4,1);
//        System.out.println(" "+ l.get(2));
//        
        
        l.set(2,1);
        l.set(1,1);
        System.out.println(" "+ l.get(2));
        l.set(4,1);
        System.out.println(" "+ l.get(1));
        System.out.println(" "+ l.get(2));
        */
        
        result("((a,b)o(m,n)p,b)");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here     
        //JavaApplication1 jv = new JavaApplication1();

        String nhMessage = "\"PushInformationID\":107,\"UserID\":3168,\"PakID\":7842,\"SessionDefID\":13254,\"PromptID\":21322,\"Response\":\"3\",\"ResponseTime\":1509562392,\"ResponseTimeOffset\":21600*#Silent:1";
        String[] splitByHash = nhMessage.replace("\"", "").split("[*#]");


        if(splitByHash.length > 1)
        {
            String silent = splitByHash[2];
            String[] splitByColon = silent.split("[:]");
            if(splitByColon.length > 1)
            {
                int isSilent = Integer.parseInt(splitByColon[1]);

                if(isSilent == 1)
                {
                    HashMap<String, Object> userInfo = new HashMap<>();

                    String userInfoStr = splitByHash[0];
                    String[] splitByCommaUserInfo = userInfoStr.split(",");
                    if(splitByCommaUserInfo.length>1)
                    {

                        for(int i = 0; i< splitByCommaUserInfo.length; i++) {
                            String[] splitByColonUserInfo = splitByCommaUserInfo[i].split("[:]");
                            userInfo.put(splitByColonUserInfo[0], splitByColonUserInfo[1]);
                            System.out.println("fahad -> " + splitByColonUserInfo[0]+" - "+ splitByColonUserInfo[1]);
                        }
                    }

                }
            }
        }
    }
    
    public ArrayList<String> result(String str)
    {
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> innerBraket = new ArrayList<>();
        Queue<Character> queue = new LinkedList<>();
        String pullString = "";
        for(int i=0; i<str.length(); i++)
        {
            if(i==0 && str.charAt(i) == '(') continue;
            else if(i==str.length()-1 && str.charAt(i) == '(') continue;
            
            if(str.charAt(i) == '(')
            {
                if(pullString.length()> 0)
                {
                    innerBraket.add(pullString);
                }
                pullString = "" ;
                
            }
            else if(str.charAt(i) == ')')
            {
                innerBraket.add(pullString);
                pullString = "" ;
                
                while(queue.size() > 0 && queue.peek() != '(')
                {
                    queue.poll();
                }
                queue.poll();
            }
            else
            {
                pullString = pullString +  str.charAt(i);
                queue.add(str.charAt(i));
            }
        }
        String resStr = "";
        permutation(innerBraket, 0, 0); 
        return res;
    }

    private void permutation(ArrayList<String> innerBraket, int i, int j) {
        
    }
    
    public class LRUCache {
        int capacity;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        
        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            if(map.containsKey(key))
            {
                int value;
                value = map.get(key);
                
                if(queue.contains(key)) {
                    queue.remove(key);
                }
                queue.add(key);
                return value;
            }
            else return -1;
        }

        public void set(int key, int value) {
            if(map.size()< capacity) 
            {
              
                map.put(key, value);   
            }else{
                int res = queue.poll();
                map.remove(res);
                map.put(key, value);   
                
            }
        }        
    }
    //[1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
    public class Solution {
        
        public void subset(int n, int m)
            {
                if(m<=n){
                    return;
                }
                for(int i=n; i<m ; i++)
                {
                    System.out.print(" "+ i);
                }
//                System.out.println("");
//                for(int i=0; i<n-1 ; i++)
//                {
//                    System.out.print(" "+ i);
//                }
                System.out.println("");
                //for(int i=n+1; i<m ; i++)
                {
                    subset(n+1, m);
                }
                
                //subset(n, m-1);
               
            }
        
        public void rotate(int[] nums, int k) {
            int front = 0, back = nums.length-1;
            //for(int )
        }
        
        public int hammingWeight(int n) {
            int countOne = 0;
            while(n >= 1)
            {
                if(n%2!=0) countOne++;
                n=n/2;
            }
            return countOne;
        }
        
        public int singleNumber(int[] nums) {
            int n = nums[0];
            for(int i = 1; i < nums.length; i++)
            {
                 n = n ^ nums[i] ;
            }
            return n;
        }
        
        public String largestNumber(int[] nums) {
            String stNumber[] = new String[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                stNumber[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(stNumber, FruitNameComparator);
            String fullNum = "";
            int countZero = 0;
            for(int i=0; i< nums.length; i++)
            {
                fullNum = fullNum + stNumber[i];
                if(stNumber[i].equals("0")) countZero++;
                System.out.println("ouyt:: "+ stNumber[i]);
            }
            if(countZero==nums.length) return "0";
            return fullNum;
            
        }
        
        public  Comparator<String> FruitNameComparator  = new Comparator<String>() {

	    public int compare(String st1, String st2) {
                String temp1 =  st1 + st2;
                String temp2 =  st2 + st1;
                return temp2.compareTo(temp1);
                
	    }

	};
        
        
        public int searchInsert(int[] nums, int target) {
            int front = 0;
            int back = nums.length-1;
            int mid = (front + back) /2 ;
            while(true){
                
                if(front > back) {
                    if(target < nums[mid]) return front;
                    else if(target > nums[mid]) return back+1;
                    return mid;
                }
                System.out.println("front: "+front+ " back-->"+back+ " mid-->>"+ mid);
                if( target == nums[mid] ) return mid;
                else if(target < nums[mid]) back = mid-1;
                else if(target > nums[mid]) front = mid+1;
                
                mid = (front + back) /2 ;
                
            }
        }
        
        
        public int countPrimes(int n) {
            if(n==0) return 0;
            int bol[] = new int[n+1];
            bol[0] = 1;
            bol[1] = 1;
            
            for(int i = 2; i<= n ; i++){
                for(int j = i+1; j<= n ;j++)
                {
                    if(j%i==0) bol[j] = 1;
                }
            }
            int count = 0;
            for(int i=0;i<bol.length;i++)
            {
                if(bol[i]==0) count++;
            }
            return count;
        }
        
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            for(int i=0 ; i< s.length() ;i++)
            {
                if(s.charAt(i)== '{' || s.charAt(i)== '(' || s.charAt(i)== '[')
                    st.push(s.charAt(i));
                else{
                    if(st.isEmpty()) return false;
                    if( (s.charAt(i)=='}' && st.peek() == '{') ||(s.charAt(i)==']' && st.peek() == '[') || (s.charAt(i)==')' && st.peek() == '(') )
                        st.pop();
                    else return false;
                }
            }
            if(st.isEmpty()) return true;
            else return false;
        }
        
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> listString = new ArrayList<List<String>>();
            Set<String> sString = new HashSet<String>();
            
            for(int i=0; i < strs.length ;i++)
            {
                
            }
            return listString;
        }
        
        Set<Integer> ss = new HashSet<Integer>();
        public boolean isHappy(int n) {
            while(true)
            {
                if(n==1) return true;
                int m = n;
                int res = 0;
                int modres = 0;
                while(m>=1)
                {
                    modres = m%10;
                    res += modres * modres;
                    m = m/10;
                }
                n=res;
                if(ss.contains(n)) return false;               
                ss.add(res);
                    
            }
        }
        
        public ArrayList<Integer> digitConversion(int n)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            while(n>=10)
            {
                temp.add(n%10);
                n = n /10;
            }
            
            return temp;
        }
        public boolean isUgly(int num) {
            while(num > 1){
                if(num % 2 == 0 && num > 2)
                {
                    num = num/2;
                }else if(num % 3 == 0 && num > 3)
                {
                    num = num / 3;
                }else if(num % 5 == 0 && num > 5)
                {
                    num = num / 5;
                }else if(num == 2 || num == 5 || num == 3){
                    return true;
                }else return false;
            }
            if(num == 1) return true;
            else return false;
        }
        
    }
}


