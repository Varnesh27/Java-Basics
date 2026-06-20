// Program to find the longest word with non repeating characters

import java.util.Scanner;
import java.util.HashMap;
public class Lonchar{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        int left=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<input.length();right++){
            map.put(input.charAt(right),map.getOrDefault(input.charAt(right),0)+1);
            while(map.get(input.charAt(right))>1){
                map.put(input.charAt(left),map.get(input.charAt(left))-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}