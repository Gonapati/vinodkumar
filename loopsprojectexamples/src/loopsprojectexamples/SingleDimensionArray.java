package loopsprojectexamples;

import java.util.Scanner;

public class SingleDimensionArray 
{
	public  int m1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size:");
		int aSize =sc.nextInt();
		
		int[] a= new int[aSize];
		int sum=0;
		System.out.println("Enter the Array element:");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("Enter the sum of array:"+sum);
	}
	public static void main(String[] args) 
	{
		/*
		 * int []a= {10,20,30,40}; for (int i=0; i<a.length;i++) {
		 * System.out.println("a["+i+"]=" + a[i]); }
		 */
			
		SingleDimensionArray obj=new SingleDimensionArray();
		int count = obj.m1();
		
	}

}
