import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n= in.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        System.out.println(Arrays.toString(arr));
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        System.out.println("MIN: "+min+"\nMAX: "+max);
        
    }
}
