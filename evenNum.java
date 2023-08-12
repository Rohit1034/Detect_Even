import java.util.*;
public class evenNum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no.: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even no.");
        }else{
            System.out.println(num + " is not a even no.");
        }
        sc.close();
        }
    }
        
        

