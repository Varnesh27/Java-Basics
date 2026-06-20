// Program to Merge the two sorted array

import java.util.Scanner;
import java.util.Arrays;
public class Merge{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of Array1");
        int size1=scan.nextInt();
        int [] arr1=new int[size1];
        System.out.println("Enter size of Array2");
        int size2=scan.nextInt();
        int [] arr2=new int[size2];
        System.out.println("Enter elements of Array1");
        for(int i=0;i<size1;i++){
            arr1[i]=scan.nextInt();
        }
        System.out.println("Enter elements of Array2");
        for(int i=0;i<size2;i++){
            arr2[i]=scan.nextInt();
        }
        int [] ans=new int[size1+size2];
        int i=0;
        int j=0;
        int ind=0;
        while(i+j!=size1+size2){
            if(i==size1){
                ans[ind]=arr2[j];
                ind++;
                j++;
            }
            else if(j==size2){
                ans[ind]=arr1[i];
                ind++;
                i++;
            }
            else if(arr1[i]<arr2[j]){
                ans[ind]=arr1[i];
                i++;
                ind++;
            }
            else{
                ans[ind]=arr2[j];
                j++;
                ind++;
            }
        }
        System.out.println("The Merged Array is ");
        for(int x=0;x<size1+size2;x++){
            System.out.println(ans[x]);
        }
    }
}