import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n= in.nextInt();
        int n_copy = n;
        
        int m = 0;
        
        
        while(n>0){
            m = 10*m + n%10;
            n = n/10;
        }
        System.out.println("N:"+n_copy+"\nM:"+m);
        if(n_copy==n){
            System.out.println("Palindrome!!!");
        }
        else{
            System.out.println("Not a palindrome!");
        }
    }
}
