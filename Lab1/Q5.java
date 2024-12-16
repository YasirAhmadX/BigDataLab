import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n= 5;//in.nextInt();
        
        for(int i=0;i<2*n;i+=2){
            int a = 0;
            
            //System.out.println("i"+i);
            
            for(int j=1;j<=i+1;j++){
                if(j>(i+1)/2){
                    System.out.print(j-a);
                    a=a+2;
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
}
