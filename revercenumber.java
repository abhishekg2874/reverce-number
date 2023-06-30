import java.util.Scanner;

public class revercenumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int rev=0,mod=0;
        while(n!=0){
            mod=n%10;
            rev=mod+rev*10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
