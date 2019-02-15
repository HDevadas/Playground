import java.util.Scanner;
public class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
         int n1 = in.nextInt();
         int n2 = in.nextInt();
         int n3 = in.nextInt();
      System.out.print(grt_of_3_numbers(n1,n2,n3));
	}
  public static int grt_of_3_numbers(int n1,int n2,int n3)
  {
    int temp, greatest;
    if(n1>n2)
    {
      greatest=n1;
    }
    else
    {
      greatest=n2;
    }
    temp=greatest;
    if(temp>n3)
    {
      greatest=temp;
    }
    else
      {
      greatest=n3;
    }
    return temp;
  }
      
}