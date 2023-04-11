import java.io.*;
import java.util.*;
 class Array
{
    int a[],n=5,i;
    int sum=0;
     Array(){
         a=new int[n];
        for(i=0;i<=n-1;i++){
        System.out.println("Enter the elements" +i);
         Scanner sc= new Scanner(System.in);
         a[i]=sc.nextInt();
        
        }
     }
        int sumArray()
        {
            for(i=0;i<5;i++)
            {
                sum=sum+a[i];
            }
            System.out.println("Sum="+sum);
            return sum;
        }
        
    }



public class Arrays
{
	public static void main(String[] args) {
		Array a=new Array();
		
	    a.sumArray();
		
	}
}
