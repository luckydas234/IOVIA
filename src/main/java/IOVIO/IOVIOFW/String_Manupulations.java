package IOVIO.IOVIOFW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class String_Manupulations 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputtext=sc.nextLine();
		reverseString(inputtext);
		string_pallindrom(inputtext);
		string_separate_num_alphabet(inputtext);
		string_separate_count_duplicate(inputtext);
		bubble_sort(inputtext);
		count_words(inputtext);
		count_vowels(inputtext);
		count_spaces(inputtext);
		swap_Variable();
		
	}
	
	public static void reverseString(String inputtext)
	{
		String rev="";
		for(int i=inputtext.length()-1;i>=0;i--)
		{
			rev=rev+inputtext.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	
	public static void string_pallindrom(String pallindrom)
	{
		String rev="";
		char[] ch=pallindrom.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{rev=rev+ch[i];}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(pallindrom))
		{System.out.println("\n"+"Pallindrom");}
		else
		{System.out.println("\n"+"Not a pallindrom");}
	}
	
	public static void string_separate_num_alphabet(String inputtext)
	{
		char[] ch=inputtext.toCharArray();
		String digit="";
		String alphabet="";
		String specialchar="";
		for(int i=ch.length-1;i>=0;i--)
		{
			if(Character.isDigit(ch[i]))
			{digit=ch[i]+digit;}
			
			else if(Character.isAlphabetic(ch[i]))
			{alphabet=ch[i]+alphabet;}
			
			else
			{specialchar=ch[i]+specialchar;}
			
		}
		
		System.out.println("alphabet is "+alphabet);
		System.out.println("Digit is "+digit);
		System.out.println("Special char "+specialchar);
	}
	
	public static void string_separate_count_duplicate(String inputtext)
	{
		Map<String,Integer> map=new HashMap();
		String[] input=inputtext.split("\\ ");
		for(String input1:input)
		{
			if(map.containsKey(input1))
			{
				map.put(input1,map.get(input1).intValue()+1);
				}
			else
			{map.put(input1, 1);}
		}
		System.out.println(map);
	}
	
	public static void bubble_sort(String sInputText)
	{
		char ch[]=sInputText.toCharArray();
		char temp;
		String sOutput="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
			if(ch[i]>ch[j])
			{
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
			}}
		for(int k=0;k<ch.length;k++)	
		{
			sOutput=sOutput+ ch[k];
		}
		
		
	System.out.println(sOutput);
	}
	
	public static void count_words(String sInputText)
	{
		Map<String,Integer> map=new HashMap();
		String[] sWords=sInputText.split("\\ ");
		int count=1;
		for(String sWord:sWords)
		{
			map.put(sWord, count);
			count++;
		}
		
		System.out.println(map);
	}
	
	public static void count_vowels(String sInputText)
	{
		char[] ch=sInputText.toCharArray();
		char[] chVowels= {'A','E','I','O','U','a','e','i','o','u'};
		String sVowels="";
		int count=0;
		
		for(char ch1: ch)
		{
			for(char chvowel:chVowels)
			{if(ch1==chvowel)
				{sVowels=sVowels+ch1;
				count++;}}
				
		}
		System.out.println(sVowels+"--"+count);
		
		
	}
public static void count_spaces(String sInputText)
{
	char[] ch=sInputText.toCharArray();
	int count=0;
	for(char ch1:ch)
		if(ch1==' ')
		{
			
		count++;	
		}
	System.out.println(count);
	
}

public static void swap_Variable()
{
	String a="LUCKY";
	String b="Silu";
	a=a+b;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	
	System.out.println(a);
	System.out.println(b);
}
}
