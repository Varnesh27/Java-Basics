import java.util.Scanner;
public class Lon{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is biggest");
            }
            else{
                System.out.println(c+" is biggest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is biggest");
            }
            else{
                System.out.println(c+" is biggest");
            }
        }
    }
}