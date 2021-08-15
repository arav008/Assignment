import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[25];
        int max=arr[0];
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Maximum number in array is "+max);
    }
}
