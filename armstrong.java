import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int t=n; int cube=0;int sum=0;
        while(t!=0){
            int rem=t%10;
            cube= rem*rem*rem;
            sum=sum+cube;
            t=t/10;
        }
        
            if(sum==n){
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not a armstrong number");
            }
    }
    
}