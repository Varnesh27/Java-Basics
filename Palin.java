import java.util.Scanner;
public class Palin{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String inp = String.valueOf(input);
        int left=0;
        int right=inp.length()-1;
        while(left<right){
            if(inp.charAt(left)==inp.charAt(right)){
                left++;
                right--;
            }
            else{
                break;
            }
        }
        if(right<=left){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}