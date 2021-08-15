import java.util.*;
public class Main{
  public static void main(string[] args){
    Scanner sc = new Scanner(System.in);
    int numerArray[] = new int[25];
    for(int index=0;index<25;index++){
      numberArray[index]=sc.nextInt();
    }
    int max=numberArray[0];
    for(int index=1;index<25;index++){
      if(numberArray[index]>max){
        max = numberArray[index];
      }
    }
    System.out.println(max);
  }
}
