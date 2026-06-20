// Two Sum program

import java.util.Scanner;
import java.util.HashMap;

public class TwoSum {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int [size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int target = scan.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                System.out.println(map.get(comp)+" "+i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}
