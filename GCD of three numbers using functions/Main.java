import java.util.Scanner;
public class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
         int n1 = in.nextInt();
         int n2 = in.nextInt();
         int n3 = in.nextInt();
      System.out.print(gcd_of_3_numbers(n1,n2,n3));
	}
  public static int gcd_of_3_numbers(int n1,int n2,int n3)
  {
    int min_elem, gcd,temp;
    if(n1<n2)
    {
      min_elem=n1;
    }
    else
    {
      min_elem=n2;
    }
    while(min_elem>=1)
    {
    if((n1%min_elem==0) && (n2%min_elem==0))
    {
      gcd=min_elem;
      break;
    }
      min_elem--;
    }
    temp=min_elem;
    if(temp<n3)
    {
      min_elem=temp;
    }
    else
    {
      min_elem=n3;
    }
    while(min_elem>=1)
    {
    if((temp%min_elem==0) && (n3%min_elem==0))
    {
      gcd=min_elem;
      break;
    }
      min_elem--;
    }
    return temp;
  }
}
