// Program to remove duplicate characters

import java.util.Scanner;
public class Duprem {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder res = new StringBuilder();
        int [] arr = new int[26];
        for(char x:input.toCharArray()){
            arr[x-'a']++;
            if(arr[x-'a']==1){
                res.append(x);
            }
            else{
                continue;
            }
        }
        System.out.println(res.toString());
    }
}
