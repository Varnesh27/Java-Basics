// Program to find count of vowels

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class Vowel {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int vow=0;
        String input = scan.nextLine();
        HashSet<Character> set = new HashSet<>(
            Arrays.asList('a','e','i','o','u')
        );
        for(char x:input.toCharArray()){
            if(set.contains(x)){
                vow++;
            }
        }
        System.out.println(vow);
    }
}
