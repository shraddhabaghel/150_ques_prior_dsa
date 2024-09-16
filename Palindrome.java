import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int t= n;
        int rev=0,rem;
        while(t!=0){
            rem=t%10;
            rev=rev*10+rem;
            t=t/10;


        }
        if(n==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("No");
        }
    }
}
