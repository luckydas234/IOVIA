package IOVIO.IOVIOFW;

import java.util.Scanner;

public class Number_Manipulations
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the desired number - ");
		int inputnum=sc.nextInt();
		reverse(inputnum);
		checkPalindrom(inputnum);
		checkArmstrong(inputnum);
		checkSum(inputnum);
		checkStrong(inputnum);
		checkPerfect(inputnum);
		convertBinary(inputnum);
		convertDecimal(inputnum);
		swap(10, 20);
		
		
	}
	
	public static void reverse(int inputNumber)
	{
		int rem;
		int sum=0;
		while(inputNumber!=0)
		{
			rem=inputNumber%10;
			inputNumber=inputNumber/10;
			sum=sum*10+rem;
			
		}
		System.out.println("Reversed Number is "+sum);
	}
	
	public static void checkPalindrom(int inputNumber)
	{
		int rem;
		int sum=0;
		int temp=inputNumber;
		while(inputNumber!=0)
		{
			rem=inputNumber%10;
			inputNumber=inputNumber/10;
			sum=sum*10+rem;
			}
		if(temp==sum)
		{System.out.println("\n"+"This is pallindrom "+temp);}
		else
		{
			System.out.println("\n"+"Not a pallindrom "+temp);
		}
		}
	
	public static void checkArmstrong(int inputNumber)
	{
		int rem;
		int sum=0;
		int temp= inputNumber;
		while(inputNumber!=0)
		{
			rem=inputNumber%10;
			inputNumber=inputNumber/10;
			sum=sum+rem*rem*rem;
		}
		if(temp==sum)
		{System.out.println("\n"+"This is armstrong "+temp);}
		else
		{
			System.out.println("\n"+"Not a armstrong "+temp);
		}
		}
		
	public static void checkSum(int inputNumber)
	{int rem;
	int sum=0;
	
	while(inputNumber!=0)
		{rem=inputNumber%10;
		inputNumber=inputNumber/10;
		sum=sum+rem;}
	System.out.println("\n"+"Sum of digit is "+sum);
	}
	
	public static void checkStrong(int inputNumber)
	{
		int rem;
		int sum=0;
		int temp=inputNumber;
		while(inputNumber!=0)
		{
			rem=inputNumber%10;
			inputNumber=inputNumber/10;
			sum=sum+rem;
		}
		if(temp==sum)
		{
			System.out.println("\n"+"Strong number is "+sum);
		}
		else
		{
			System.out.println("\n"+"Not a Strong number "+sum);
		}
	}
	
	public static void checkPerfect(int inputNumber)
	{int rem;
	int temp=inputNumber;
	int sum=0;
	
	for(int i=1;i<inputNumber;i++) 
	{
		if(inputNumber%i==0)
		{
			sum=sum+i;
		}
	}
	if(temp==sum)
	{
		System.out.println("\n"+"Perfect number is "+sum);
	}
	else
	{
		System.out.println("\n"+"Not a Perfect number "+sum);
	}
}
	
	public static void convertBinary(int inputNumber)
	{int rem;
	int temp=inputNumber;
	String sum="";
	
	
	while(inputNumber!=0) 
	{
		rem=inputNumber%2;
		inputNumber=inputNumber/2;
		sum=rem+sum;
	}
	System.out.println("\n"+"Binary Number is "+sum);
	
}
	
	public static void convertDecimal(int inputNumber)
	{int rem;
	int temp=inputNumber;
	int sum=0;
	int p=0;
	
	while(inputNumber!=0) 
	{
		rem=inputNumber%10;
		inputNumber=inputNumber/10;
		sum=(int) (sum+ rem*Math.pow(2, p));
		p++;
	}
	System.out.println("\n"+"decimal Number is "+sum);
	
}
	
	public static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
	}

}
