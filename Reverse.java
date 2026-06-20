// Program to reverse the number

import java.util.Scanner;
public class Reverse{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number ");
        int a=scan.nextInt();
        int ans=0;
        while(a>0){
            int d = a % 10;
            ans=(ans*10)+d;
            a=a/10;
        }
        System.out.println("Reversed number : "+ans);
    }
}