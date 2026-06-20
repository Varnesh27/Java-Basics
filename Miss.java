// Program to find the missing number form 1 to nth longest number

import java.util.Scanner;
public class Miss{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int max=0;
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
            max=Math.max(max,arr[i]);
        }
        int total = (max*(max+1))/2;
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println(total-sum);
    }
}