
import java.util.Scanner;
/**
 *
 * @author Divyanshu
 */
public class sum_of_digit {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. - ");
        int n=in.nextInt();
        int sum=0,res;
        while(n>0){
            res=n%10;
            sum=sum+res;
            n=n/10;            
        }
        System.out.println("Sum of digits: "+sum);
        in.close();
    }
    
}
