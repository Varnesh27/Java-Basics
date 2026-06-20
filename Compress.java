// Program to compress the string

import java.util.Scanner;
public class Compress{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        StringBuilder res=new StringBuilder();
        int count=1;
        for(int i=1;i<input.length();i++){
            char c=input.charAt(i-1);
            char d=input.charAt(i);
            if(c==d){
                count++;
            }
            else{
                res.append(c);
                res.append(String.valueOf(count));
                count=1;
            }
        }
        res.append(input.charAt(input.length()-1));
        res.append(count);
        System.out.println(res.toString());
    }
}