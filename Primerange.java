import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = 0;
		 for (int i=a+1;i<b;i++)
		 {
		 	
			for (int j=1;j<=i;j++)
			{
		 	    if ( i % j == 0)
				{
					c =c+1;
				}
			 }
			 if ( c == 2)
				System.out.println(i);
			c = 0;	
		 }
		 
	}
}
