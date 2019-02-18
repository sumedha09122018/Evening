package package1;
import java.util.*;
public class QuestionNo3 {
     static int k=0;
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int temp;
	int[] arr=new int[n];
	int[] p=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		int flag=0,sum=0,r=0;
	   for(int j=2;j<=arr[i]/2;j++)
	   {
		   if(arr[i]%j==0)
		   {
			  flag=1; 
		   }
	   }
	   temp=arr[i];
	   if(flag!=1)
	   {
		   
		  while(temp>0)
		  {
			  r=temp%10;
			  sum=(sum*10)+r;
			  temp=temp/10;
		  }
		 
		  for(int j=2;j<=sum/2;j++)
		   {
			   if(sum%j==0)
			   {
				  flag=1; 
			   }
		   }
		  if(flag!=1)
		  {
			p[k]=arr[i]; 
			k++;
		  }
	   }
	}
	for(int i=0;i<k;i++)
	{
		for(int j=i+1;j<k;j++)
		{
			if(p[i]>p[j])
			{
				int t=p[i];
				p[i]=p[j];
				p[j]=t;
			}
		}
	}
	for(int i=0;i<k;i++)
	{
		System.out.println(p[i]);
	}
	}
}
