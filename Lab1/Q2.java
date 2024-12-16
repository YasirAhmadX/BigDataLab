import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    
	    int sum=0;
	    
		for(int i=1;i<=n;i++){
		    if(i%2==1){
		        sum=sum+i;
		    }
		}
		
		System.out.println(sum);
	}
}
