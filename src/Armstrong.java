import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum= (int) (sum+Math.pow(digit,3));
            temp/=10;
        }
        System.out.println(sum);
        if(n==sum){
            System.out.println("Given int is Armstrong.");
        }
        else{
            System.out.println("Given int is not Armstrong.");
        }

    }
}