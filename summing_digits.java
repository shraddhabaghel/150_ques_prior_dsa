import java.util.*;
public class summing_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n; 
        int sum=0;
        while(t!=0){
            int rem=t%10;
            sum = sum+rem;
            t=t/10;
        }
        System.out.println(sum);
    }
}
